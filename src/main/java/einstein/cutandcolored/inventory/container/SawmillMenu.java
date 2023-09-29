package einstein.cutandcolored.inventory.container;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.init.ModSounds;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class SawmillMenu extends AbstractSingleItemRecipeMenu<SawmillingRecipe> {

    public SawmillMenu(int id, Inventory inventory) {
        super(id, inventory);
    }

    public SawmillMenu(int id, Inventory inventory, ContainerLevelAccess levelAccess) {
        super(id, inventory, levelAccess);
    }

    @Override
    public RecipeType<SawmillingRecipe> getRecipeType() {
        return ModRecipeTypes.SAWMILLING_RECIPE;
    }

    @Override
    protected MenuType<? extends AbstractSingleItemRecipeMenu<?>> getMenuType() {
        return ModMenuTypes.SAWMILL.get();
    }

    @Override
    public SoundEvent getCraftSound() {
        return ModSounds.UI_SAWMILL_TAKE_RESULT.get();
    }

    @Override
    public Block getContainerBlock() {
        return ModBlocks.SAWMILL.get();
    }
}