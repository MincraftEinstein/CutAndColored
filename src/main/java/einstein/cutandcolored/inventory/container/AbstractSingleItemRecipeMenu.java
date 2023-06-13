package einstein.cutandcolored.inventory.container;

import com.google.common.collect.Lists;
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
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;

public abstract class AbstractSingleItemRecipeMenu<T extends AbstractSingleItemRecipe> extends AbstractContainerMenu {

    private final MenuType<?> menuType;
    private final ContainerLevelAccess access;
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private final Level level;
    private List<T> recipes = Lists.newArrayList();
    private ItemStack input = ItemStack.EMPTY;
    private long lastSoundTime;
    private final Slot inputSlot;
    private final Slot resultSlot;
    private Runnable slotUpdateListener = () -> {
    };
    public final Container container = new SimpleContainer(1) {

        public void setChanged() {
            super.setChanged();
            slotsChanged(this);
            slotUpdateListener.run();
        }
    };
    private final ResultContainer resultContainer = new ResultContainer();

    public AbstractSingleItemRecipeMenu(MenuType<?> menuType, int id, Inventory inventory) {
        this(menuType, id, inventory, ContainerLevelAccess.NULL);
    }

    public AbstractSingleItemRecipeMenu(MenuType<?> menuType, int id, Inventory inventory, final ContainerLevelAccess levelAccess) {
        super(menuType, id);
        this.menuType = menuType;
        this.access = levelAccess;
        level = inventory.player.level();
        inputSlot = addSlot(new Slot(container, 0, 20, 33));
        resultSlot = addSlot(new Slot(resultContainer, 1, 143, 33) {

            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            public void onTake(Player player, ItemStack stack) {
                stack.onCraftedBy(player.level(), player, stack.getCount());
                resultContainer.awardUsedRecipes(player, getRelevantItems());
                ItemStack itemstack = inputSlot.remove(1);
                if (!itemstack.isEmpty()) {
                    setupResultSlot();
                }

                levelAccess.execute((level, pos) -> {
                    long gameTime = level.getGameTime();
                    if (lastSoundTime != gameTime) {
                        level.playSound(null, pos, getCraftSound(), SoundSource.BLOCKS, 1, 1);
                        lastSoundTime = gameTime;
                    }
                });
                super.onTake(player, stack);
            }

            private List<ItemStack> getRelevantItems() {
                return List.of(inputSlot.getItem());
            }
        });

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            addSlot(new Slot(inventory, k, 8 + k * 18, 142));
        }

        addDataSlot(selectedRecipeIndex);
    }

    public abstract Block getBlock();

    public abstract SoundEvent getCraftSound();

    public abstract RecipeType<T> getRecipeType();

    public int getSelectedRecipeIndex() {
        return selectedRecipeIndex.get();
    }

    public List<T> getRecipes() {
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
        return stillValid(access, player, getBlock());
    }

    @Override
    public boolean clickMenuButton(Player player, int id) {
        if (isValidRecipeIndex(id)) {
            selectedRecipeIndex.set(id);
            setupResultSlot();
        }
        return true;
    }

    private boolean isValidRecipeIndex(int id) {
        return id >= 0 && id < recipes.size();
    }

    @Override
    public void slotsChanged(Container container) {
        ItemStack inputStack = inputSlot.getItem();
        if (!inputStack.is(input.getItem())) {
            input = inputStack.copy();
            setupRecipeList(container, inputStack);
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
            T recipe = recipes.get(selectedRecipeIndex.get());
            resultContainer.setRecipeUsed(recipe);
            resultSlot.set(recipe.assemble(container, level.registryAccess()));
        }
        else {
            resultSlot.set(ItemStack.EMPTY);
        }
        broadcastChanges();
    }

    @Override
    public MenuType<?> getType() {
        return menuType;
    }

    public void registerUpdateListener(Runnable listener) {
        slotUpdateListener = listener;
    }

    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
        return slot.container != resultContainer && super.canTakeItemForPickAll(stack, slot);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack stack1 = slot.getItem();
            Item item = stack1.getItem();
            stack = stack1.copy();

            if (index == 1) {
                item.onCraftedBy(stack1, player.level(), player);
                if (!moveItemStackTo(stack1, 2, 38, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(stack1, stack);
            }
            else if (index == 0) {
                if (!moveItemStackTo(stack1, 2, 38, false)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (level.getRecipeManager().getRecipeFor(getRecipeType(), new SimpleContainer(stack1), level).isPresent()) {
                if (!moveItemStackTo(stack1, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 2 && index < 29) {
                if (!moveItemStackTo(stack1, 29, 38, false)) {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 29 && index < 38 && !moveItemStackTo(stack1, 2, 29, false)) {
                return ItemStack.EMPTY;
            }

            if (stack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
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
        access.execute((level, pos) -> {
            clearContainer(player, container);
        });
    }
}
