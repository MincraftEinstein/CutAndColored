package einstein.cutandcolored.inventory.container;

import java.util.List;

import com.google.common.collect.Lists;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModContainerTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.init.ModSounds;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SawmillContainer extends Container
{
   private final IWorldPosCallable worldPosCallable;
   private final IntReferenceHolder selectedRecipe = IntReferenceHolder.single();
   private final World world;
   private List<SawmillingRecipe> recipes = Lists.newArrayList();
   private ItemStack itemStackInput = ItemStack.EMPTY;
   private long lastOnTake;
   final Slot inputInventorySlot;
   final Slot outputInventorySlot;
   private Runnable inventoryUpdateListener = () -> {
   };
   public final IInventory inputInventory = new Inventory(1) {
      public void markDirty() {
         super.markDirty();
         SawmillContainer.this.onCraftMatrixChanged(this);
         SawmillContainer.this.inventoryUpdateListener.run();
      }
   };
   private final CraftResultInventory inventory = new CraftResultInventory();

   public SawmillContainer(int windowIdIn, PlayerInventory playerInventoryIn) {
      this(windowIdIn, playerInventoryIn, IWorldPosCallable.DUMMY);
   }

   public SawmillContainer(int windowIdIn, PlayerInventory playerInventoryIn, final IWorldPosCallable worldPosCallableIn) {
      super(ModContainerTypes.WEAVER, windowIdIn);
      this.worldPosCallable = worldPosCallableIn;
      this.world = playerInventoryIn.player.world;
      this.inputInventorySlot = this.addSlot(new Slot(this.inputInventory, 0, 20, 33));
      this.outputInventorySlot = this.addSlot(new Slot(this.inventory, 1, 143, 33) {
         public boolean isItemValid(ItemStack stack) {
            return false;
         }

         public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack) {
            ItemStack itemstack = SawmillContainer.this.inputInventorySlot.decrStackSize(1);
            if (!itemstack.isEmpty()) {
               SawmillContainer.this.updateRecipeResultSlot();
            }

            stack.getItem().onCreated(stack, thePlayer.world, thePlayer);
            worldPosCallableIn.consume((p_216954_1_, p_216954_2_) -> {
               long l = p_216954_1_.getGameTime();
               if (SawmillContainer.this.lastOnTake != l) {
                  p_216954_1_.playSound((PlayerEntity)null, p_216954_2_, ModSounds.UI_SAWMILL_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                  SawmillContainer.this.lastOnTake = l;
               }

            });
            return super.onTake(thePlayer, stack);
         }
      });

      for(int i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.addSlot(new Slot(playerInventoryIn, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(int k = 0; k < 9; ++k) {
         this.addSlot(new Slot(playerInventoryIn, k, 8 + k * 18, 142));
      }

      this.trackInt(this.selectedRecipe);
   }

   @OnlyIn(Dist.CLIENT)
   public int getSelectedRecipe() {
      return this.selectedRecipe.get();
   }

   @OnlyIn(Dist.CLIENT)
   public List<SawmillingRecipe> getRecipeList() {
      return this.recipes;
   }

   @OnlyIn(Dist.CLIENT)
   public int getRecipeListSize() {
      return this.recipes.size();
   }

   @OnlyIn(Dist.CLIENT)
   public boolean hasItemsinInputSlot() {
      return this.inputInventorySlot.getHasStack() && !this.recipes.isEmpty();
   }

   public boolean canInteractWith(PlayerEntity playerIn) {
      return isWithinUsableDistance(this.worldPosCallable, playerIn, ModBlocks.SAWMILL);
   }

   public boolean enchantItem(PlayerEntity playerIn, int id) {
      if (id >= 0 && id < this.recipes.size()) {
         this.selectedRecipe.set(id);
         this.updateRecipeResultSlot();
      }

      return true;
   }

   public void onCraftMatrixChanged(IInventory inventoryIn) {
      ItemStack itemstack = this.inputInventorySlot.getStack();
      if (itemstack.getItem() != this.itemStackInput.getItem()) {
         this.itemStackInput = itemstack.copy();
         this.updateAvailableRecipes(inventoryIn, itemstack);
      }

   }

   private void updateAvailableRecipes(IInventory inventoryIn, ItemStack stack) {
      this.recipes.clear();
      this.selectedRecipe.set(-1);
      this.outputInventorySlot.putStack(ItemStack.EMPTY);
      if (!stack.isEmpty()) {
         this.recipes = this.world.getRecipeManager().getRecipes(ModRecipeTypes.SAWMILLING, inventoryIn, this.world);
      }

   }

   private void updateRecipeResultSlot() {
      if (!this.recipes.isEmpty()) {
         SawmillingRecipe sawmillingrecipe = this.recipes.get(this.selectedRecipe.get());
         this.outputInventorySlot.putStack(sawmillingrecipe.getCraftingResult(this.inputInventory));
      } else {
         this.outputInventorySlot.putStack(ItemStack.EMPTY);
      }

      this.detectAndSendChanges();
   }

   public ContainerType<?> getType() {
      return ModContainerTypes.SAWMILL;
   }

   @OnlyIn(Dist.CLIENT)
   public void setInventoryUpdateListener(Runnable listenerIn) {
      this.inventoryUpdateListener = listenerIn;
   }

   public boolean canMergeSlot(ItemStack stack, Slot slotIn) {
      return slotIn.inventory != this.inventory && super.canMergeSlot(stack, slotIn);
   }

   public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
      ItemStack itemstack = ItemStack.EMPTY;
      Slot slot = this.inventorySlots.get(index);
      if (slot != null && slot.getHasStack()) {
         ItemStack itemstack1 = slot.getStack();
         Item item = itemstack1.getItem();
         itemstack = itemstack1.copy();
         if (index == 1) {
            item.onCreated(itemstack1, playerIn.world, playerIn);
            if (!this.mergeItemStack(itemstack1, 2, 38, true)) {
               return ItemStack.EMPTY;
            }

            slot.onSlotChange(itemstack1, itemstack);
         } else if (index == 0) {
            if (!this.mergeItemStack(itemstack1, 2, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (this.world.getRecipeManager().getRecipe(ModRecipeTypes.SAWMILLING, new Inventory(itemstack1), this.world).isPresent()) {
            if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
               return ItemStack.EMPTY;
            }
         } else if (index >= 2 && index < 29) {
            if (!this.mergeItemStack(itemstack1, 29, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else if (index >= 29 && index < 38 && !this.mergeItemStack(itemstack1, 2, 29, false)) {
            return ItemStack.EMPTY;
         }

         if (itemstack1.isEmpty()) {
            slot.putStack(ItemStack.EMPTY);
         }

         slot.onSlotChanged();
         if (itemstack1.getCount() == itemstack.getCount()) {
            return ItemStack.EMPTY;
         }

         slot.onTake(playerIn, itemstack1);
         this.detectAndSendChanges();
      }

      return itemstack;
   }

   public void onContainerClosed(PlayerEntity playerIn) {
      super.onContainerClosed(playerIn);
      this.inventory.removeStackFromSlot(1);
      this.worldPosCallable.consume((p_217079_2_, p_217079_3_) -> {
         this.clearContainer(playerIn, playerIn.world, this.inputInventory);
      });
   }
}