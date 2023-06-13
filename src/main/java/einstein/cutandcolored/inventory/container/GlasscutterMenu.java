package einstein.cutandcolored.inventory.container;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.init.ModSounds;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class GlasscutterMenu extends AbstractSingleItemRecipeMenu<GlasscuttingRecipe> {

    public GlasscutterMenu(int id, Inventory inventory) {
        super(ModMenuTypes.GLASSCUTTER.get(), id, inventory);
    }

    public GlasscutterMenu(int id, Inventory inventory, ContainerLevelAccess levelAccess) {
        super(ModMenuTypes.GLASSCUTTER.get(), id, inventory, levelAccess);
    }

    @Override
    public Block getBlock() {
        return ModBlocks.GLASSCUTTER.get();
    }

    @Override
    public SoundEvent getCraftSound() {
        return ModSounds.UI_GLASSCUTTER_TAKE_RESULT.get();
    }

    @Override
    public RecipeType<GlasscuttingRecipe> getRecipeType() {
        return ModRecipeTypes.GLASSCUTTING_RECIPE;
    }
}