package einstein.cutandcolored.inventory.container;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.init.ModSounds;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class WeaverMenu extends AbstractSingleItemRecipeMenu<WeavingRecipe> {

    public WeaverMenu(int id, Inventory inventory) {
        super(id, inventory);
    }

    public WeaverMenu(int id, Inventory inventory, ContainerLevelAccess levelAccess) {
        super(id, inventory, levelAccess);
    }

    @Override
    public RecipeType<WeavingRecipe> getRecipeType() {
        return ModRecipeTypes.WEAVING_RECIPE;
    }

    @Override
    protected MenuType<? extends AbstractSingleItemRecipeMenu<?>> getMenuType() {
        return ModMenuTypes.WEAVER.get();
    }

    @Override
    public SoundEvent getCraftSound() {
        return SoundEvents.UI_LOOM_TAKE_RESULT;
    }

    @Override
    public Block getContainerBlock() {
        return ModBlocks.WEAVER.get();
    }
}