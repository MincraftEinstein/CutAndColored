package einstein.cutandcolored.inventory.container;

import einstein.cutandcolored.item.crafting.AbstractSingleItemRecipe;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSingleItemRecipeMenu<T extends AbstractSingleItemRecipe> extends AbstractContainerMenu {

    private final ContainerLevelAccess access;
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private final Level level;
    private List<RecipeHolder<T>> recipes = new ArrayList<>();
    private ItemStack input = ItemStack.EMPTY;
    private long lastSoundTime;
    private final Slot inputSlot;
    private final Slot resultSlot;
    private Runnable slotUpdateListener = () -> {
    };
    private final Container container = new SimpleContainer(1) {

        @Override
        public void setChanged() {
            super.setChanged();
            slotsChanged(this);
            slotUpdateListener.run();
        }
    };
    private final ResultContainer resultContainer = new ResultContainer();

    public AbstractSingleItemRecipeMenu(int id, Inventory inventory) {
        this(id, inventory, ContainerLevelAccess.NULL);
    }

    public AbstractSingleItemRecipeMenu(int id, Inventory inventory, ContainerLevelAccess access) {
        super(MenuType.STONECUTTER, id);
        this.access = access;
        level = inventory.player.level();
        inputSlot = addSlot(new Slot(container, StonecutterMenu.INPUT_SLOT, 20, 33));
        resultSlot = addSlot(new Slot(resultContainer, StonecutterMenu.RESULT_SLOT, 143, 33) {

            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                stack.onCraftedBy(player.level(), player, stack.getCount());
                resultContainer.awardUsedRecipes(player, List.of(inputSlot.getItem()));
                ItemStack inputStack = inputSlot.remove(1);
                if (!inputStack.isEmpty()) {
                    setupResultSlot();
                }

                access.execute((level, pos) -> {
                    long time = level.getGameTime();
                    if (lastSoundTime != time) {
                        level.playSound(null, pos, getCraftSound(), SoundSource.BLOCKS, 1, 1);
                        lastSoundTime = time;
                    }
                });
                super.onTake(player, stack);
            }
        });

        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                addSlot(new Slot(inventory, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }

        for (int x = 0; x < 9; ++x) {
            addSlot(new Slot(inventory, x, 8 + x * 18, 142));
        }

        addDataSlot(selectedRecipeIndex);
    }

    public int getSelectedRecipeIndex() {
        return selectedRecipeIndex.get();
    }

    public List<RecipeHolder<T>> getRecipes() {
        return recipes;
    }

    public int getNumRecipes() {
        return recipes.size();
    }

    public boolean hasInputItem() {
        return inputSlot.hasItem() && !recipes.isEmpty();
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(access, player, getContainerBlock());
    }

    @Override
    public boolean clickMenuButton(Player player, int button) {
        if (isValidRecipeIndex(button)) {
            selectedRecipeIndex.set(button);
            setupResultSlot();
        }

        return true;
    }

    private boolean isValidRecipeIndex(int index) {
        return index >= 0 && index < recipes.size();
    }

    @Override
    public void slotsChanged(Container container) {
        ItemStack stack = inputSlot.getItem();
        if (!stack.is(input.getItem())) {
            input = stack.copy();
            setupRecipeList(container, stack);
        }
    }

    private void setupRecipeList(Container container, ItemStack stack) {
        recipes.clear();
        selectedRecipeIndex.set(-1);
        resultSlot.set(ItemStack.EMPTY);
        if (!stack.isEmpty()) {
            recipes = level.getRecipeManager().getRecipesFor(getRecipeType(), container, level);
        }
    }

    private void setupResultSlot() {
        if (!recipes.isEmpty() && isValidRecipeIndex(selectedRecipeIndex.get())) {
            RecipeHolder<T> holder = recipes.get(selectedRecipeIndex.get());
            ItemStack stack = holder.value().assemble(container, level.registryAccess());
            if (stack.isItemEnabled(level.enabledFeatures())) {
                resultContainer.setRecipeUsed(holder);
                resultSlot.set(stack);
            }
            else {
                resultSlot.set(ItemStack.EMPTY);
            }
        }
        else {
            resultSlot.set(ItemStack.EMPTY);
        }

        broadcastChanges();
    }

    @Override
    public MenuType<?> getType() {
        return getMenuType();
    }

    public void registerUpdateListener(Runnable listener) {
        slotUpdateListener = listener;
    }

    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
        return slot.container != resultContainer && super.canTakeItemForPickAll(stack, slot);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slotIndex) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = slots.get(slotIndex);

        if (slot != null && slot.hasItem()) {
            ItemStack stack1 = slot.getItem();
            Item item = stack1.getItem();
            stack = stack1.copy();

            if (slotIndex == 1) {
                item.onCraftedBy(stack1, player.level(), player);
                if (!moveItemStackTo(stack1, 2, 38, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(stack1, stack);
            }
            else if (slotIndex == 0) {
                if (!moveItemStackTo(stack1, 2, 38, false)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (level.getRecipeManager().getRecipeFor(getRecipeType(), new SimpleContainer(stack1), level).isPresent()) {
                if (!moveItemStackTo(stack1, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (slotIndex >= 2 && slotIndex < 29) {
                if (!moveItemStackTo(stack1, 29, 38, false)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (slotIndex >= 29 && slotIndex < 38 && !moveItemStackTo(stack1, 2, 29, false)) {
                return ItemStack.EMPTY;
            }

            if (stack1.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            }

            slot.setChanged();
            if (stack1.getCount() == stack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, stack1);
            broadcastChanges();
        }

        return stack;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        resultContainer.removeItemNoUpdate(1);
        access.execute((level, pos) -> clearContainer(player, container));
    }

    protected abstract RecipeType<T> getRecipeType();

    protected abstract MenuType<? extends AbstractSingleItemRecipeMenu<?>> getMenuType();

    protected abstract SoundEvent getCraftSound();

    protected abstract Block getContainerBlock();
}