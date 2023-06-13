package einstein.cutandcolored.jei;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class SawmillingCategory extends AbstractSingleItemRecipeCategory<SawmillingRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(CutAndColored.MOD_ID, "sawmilling");

    public SawmillingCategory(IGuiHelper guiHelper) {
        super("gui.jei.cutandcolored.category.sawmilling", new ItemStack(ModBlocks.SAWMILL.get()), guiHelper);
    }

    @Override
    public RecipeType<SawmillingRecipe> getRecipeType() {
        return ModJEIRecipeTypes.SAWMILLING;
    }
}
