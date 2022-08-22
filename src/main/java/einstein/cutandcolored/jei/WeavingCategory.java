package einstein.cutandcolored.jei;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class WeavingCategory extends AbstractSingleItemRecipeCategory<WeavingRecipe> {

	public static final ResourceLocation UID = new ResourceLocation(CutAndColored.MOD_ID, "weaving");
	
	public WeavingCategory(IGuiHelper guiHelper) {
		super("gui.jei.cutandcolored.category.weaving", new ItemStack(ModBlocks.WEAVER.get()), guiHelper);
	}
	
	@Override
	public RecipeType<WeavingRecipe> getRecipeType() {
		return ModJEIRecipeTypes.WEAVING;
	}
}
