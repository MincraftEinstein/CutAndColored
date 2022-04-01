package einstein.cutandcolored.inventory.container;

import java.util.List;

import com.google.common.collect.Lists;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.init.ModSounds;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SawmillMenu extends AbstractContainerMenu {
	private final ContainerLevelAccess access;
	private final DataSlot selectedRecipeIndex = DataSlot.standalone();
	private final Level level;
	private List<SawmillingRecipe> recipes = Lists.newArrayList();
	private ItemStack input = ItemStack.EMPTY;
	long lastSoundTime;
	final Slot inputSlot;
	final Slot resultSlot;
	Runnable slotUpdateListener = () -> {
	};
	public final Container container = new SimpleContainer(1) {
		public void setChanged() {
			super.setChanged();
			SawmillMenu.this.slotsChanged(this);
			SawmillMenu.this.slotUpdateListener.run();
		}
	};
	final ResultContainer resultContainer = new ResultContainer();

	public SawmillMenu(int id, Inventory inventory) {
		this(id, inventory, ContainerLevelAccess.NULL);
	}

	public SawmillMenu(int id, Inventory inventory, final ContainerLevelAccess levelAccess) {
		super(ModMenuTypes.SAWMILL.get(), id);
		this.access = levelAccess;
		this.level = inventory.player.level;
		this.inputSlot = this.addSlot(new Slot(this.container, 0, 20, 33));
		this.resultSlot = this.addSlot(new Slot(this.resultContainer, 1, 143, 33) {
			public boolean mayPlace(ItemStack stack) {
				return false;
			}

			public void onTake(Player player, ItemStack stack) {
				stack.onCraftedBy(player.level, player, stack.getCount());
				SawmillMenu.this.resultContainer.awardUsedRecipes(player);
				ItemStack itemstack = SawmillMenu.this.inputSlot.remove(1);
				if (!itemstack.isEmpty()) {
					SawmillMenu.this.setupResultSlot();
				}

				levelAccess.execute((level, pos) -> {
					long l = level.getGameTime();
					if (SawmillMenu.this.lastSoundTime != l) {
						level.playSound((Player) null, pos, ModSounds.UI_SAWMILL_TAKE_RESULT, SoundSource.BLOCKS, 1.0F, 1.0F);
						SawmillMenu.this.lastSoundTime = l;
					}

				});
				super.onTake(player, stack);
			}
		});

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (int k = 0; k < 9; ++k) {
			this.addSlot(new Slot(inventory, k, 8 + k * 18, 142));
		}

		this.addDataSlot(this.selectedRecipeIndex);
	}

	public int getSelectedRecipeIndex() {
		return this.selectedRecipeIndex.get();
	}

	public List<SawmillingRecipe> getRecipes() {
		return this.recipes;
	}

	public int getNumRecipes() {
		return this.recipes.size();
	}

	public boolean hasInputItem() {
		return this.inputSlot.hasItem() && !this.recipes.isEmpty();
	}

	public boolean stillValid(Player player) {
		return stillValid(this.access, player, ModBlocks.SAWMILL.get());
	}

	public boolean clickMenuButton(Player player, int id) {
		if (this.isValidRecipeIndex(id)) {
			this.selectedRecipeIndex.set(id);
			this.setupResultSlot();
		}

		return true;
	}

	private boolean isValidRecipeIndex(int id) {
		return id >= 0 && id < this.recipes.size();
	}

	public void slotsChanged(Container container) {
		ItemStack itemstack = this.inputSlot.getItem();
		if (!itemstack.is(this.input.getItem())) {
			this.input = itemstack.copy();
			this.setupRecipeList(container, itemstack);
		}

	}

	private void setupRecipeList(Container container, ItemStack stack) {
		this.recipes.clear();
		this.selectedRecipeIndex.set(-1);
		this.resultSlot.set(ItemStack.EMPTY);
		if (!stack.isEmpty()) {
			this.recipes = this.level.getRecipeManager().getRecipesFor(ModRecipeTypes.SAWMILLING_RECIPE, container, this.level);
		}

	}

	void setupResultSlot() {
		if (!this.recipes.isEmpty() && this.isValidRecipeIndex(this.selectedRecipeIndex.get())) {
			SawmillingRecipe sawmillingRecipe = this.recipes.get(this.selectedRecipeIndex.get());
			this.resultContainer.setRecipeUsed(sawmillingRecipe);
			this.resultSlot.set(sawmillingRecipe.assemble(this.container));
		} else {
			this.resultSlot.set(ItemStack.EMPTY);
		}

		this.broadcastChanges();
	}

	public MenuType<?> getType() {
		return ModMenuTypes.SAWMILL.get();
	}

	public void registerUpdateListener(Runnable listener) {
		this.slotUpdateListener = listener;
	}

	public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
		return slot.container != this.resultContainer && super.canTakeItemForPickAll(stack, slot);
	}

	public ItemStack quickMoveStack(Player player, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			Item item = itemstack1.getItem();
			itemstack = itemstack1.copy();
			if (index == 1) {
				item.onCraftedBy(itemstack1, player.level, player);
				if (!this.moveItemStackTo(itemstack1, 2, 38, true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (index == 0) {
				if (!this.moveItemStackTo(itemstack1, 2, 38, false)) {
					return ItemStack.EMPTY;
				}
			} else if (this.level.getRecipeManager().getRecipeFor(ModRecipeTypes.SAWMILLING_RECIPE, new SimpleContainer(itemstack1), this.level).isPresent()) {
				if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
					return ItemStack.EMPTY;
				}
			} else if (index >= 2 && index < 29) {
				if (!this.moveItemStackTo(itemstack1, 29, 38, false)) {
					return ItemStack.EMPTY;
				}
			} else if (index >= 29 && index < 38 && !this.moveItemStackTo(itemstack1, 2, 29, false)) {
				return ItemStack.EMPTY;
			}

			if (itemstack1.isEmpty()) {
				slot.set(ItemStack.EMPTY);
			}

			slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}

			slot.onTake(player, itemstack1);
			this.broadcastChanges();
		}

		return itemstack;
	}

	public void removed(Player player) {
		super.removed(player);
		this.resultContainer.removeItemNoUpdate(1);
		this.access.execute((p_40313_, p_40314_) -> {
			this.clearContainer(player, this.container);
		});
	}
}