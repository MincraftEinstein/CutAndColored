package einstein.cutandcolored.inventory.container;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class WeaverMenu extends AbstractSingleItemRecipeMenu<WeavingRecipe> {

    public WeaverMenu(int id, Inventory inventory) {
        super(ModMenuTypes.WEAVER.get(), id, inventory);
    }

    public WeaverMenu(int id, Inventory inventory, ContainerLevelAccess levelAccess) {
        super(ModMenuTypes.WEAVER.get(), id, inventory, levelAccess);
    }

    @Override
    public Block getBlock() {
        return ModBlocks.WEAVER.get();
    }

    @Override
    public SoundEvent getCraftSound() {
        return SoundEvents.UI_LOOM_TAKE_RESULT;
    }

    @Override
    public RecipeType<WeavingRecipe> getRecipeType() {
        return ModRecipeTypes.WEAVING_RECIPE;
    }
}