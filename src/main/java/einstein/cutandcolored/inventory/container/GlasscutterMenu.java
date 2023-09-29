package einstein.cutandcolored.inventory.container;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.init.ModSounds;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class GlasscutterMenu extends AbstractSingleItemRecipeMenu<GlasscuttingRecipe> {

    public GlasscutterMenu(int id, Inventory inventory) {
        super(id, inventory);
    }

    public GlasscutterMenu(int id, Inventory inventory, ContainerLevelAccess access) {
        super(id, inventory, access);
    }

    @Override
    public RecipeType<GlasscuttingRecipe> getRecipeType() {
        return ModRecipeTypes.GLASSCUTTING_RECIPE;
    }

    @Override
    protected MenuType<? extends AbstractSingleItemRecipeMenu<?>> getMenuType() {
        return ModMenuTypes.GLASSCUTTER.get();
    }

    @Override
    public SoundEvent getCraftSound() {
        return ModSounds.UI_GLASSCUTTER_TAKE_RESULT.get();
    }

    @Override
    public Block getContainerBlock() {
        return ModBlocks.GLASSCUTTER.get();
    }
}