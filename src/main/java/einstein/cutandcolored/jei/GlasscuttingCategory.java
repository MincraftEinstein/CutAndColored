package einstein.cutandcolored.jei;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import net.minecraft.world.item.ItemStack;

public class GlasscuttingCategory extends AbstractSingleItemRecipeCategory<GlasscuttingRecipe> {

	public GlasscuttingCategory(IGuiHelper guiHelper) {
		super("gui.jei.cutandcolored.category.glasscutting", new ItemStack(ModBlocks.GLASSCUTTER.get()), guiHelper);
	}
	
	@Override
	public RecipeType<GlasscuttingRecipe> getRecipeType() {
		return ModJEIRecipeTypes.GLASSCUTTING;
	}
}
