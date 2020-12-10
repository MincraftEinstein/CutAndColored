package einstein.cutandcolored.jei;

import einstein.cutandcolored.CutAndColored;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.util.ResourceLocation;

public class SawmillCategory implements IRecipeCategory<RecipeWrapper> {
	public static ResourceLocation Uid = new ResourceLocation(CutAndColored.MODID, "sawmillcategory");
	private static final int input1 = 0; // THE NUMBER = SLOTID
	private static final int output1 = 1; // THE NUMBER = SLOTID
	private final String title;
	private final IDrawable background;
	public SawmillCategory(IGuiHelper guiHelper) {
		this.title = "Sawmill";
		this.background = guiHelper.createDrawable(new ResourceLocation(CutAndColored.MODID, "textures/gui/jei_background_gui.png"), 0, 0, 82, 34);
	}

	@Override
	public ResourceLocation getUid() {
		return Uid;
	}

	@Override
	public Class<? extends RecipeWrapper> getRecipeClass() {
		return RecipeWrapper.class;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public IDrawable getIcon() {
		return null;
	}

	@Override
	public void setIngredients(RecipeWrapper recipeWrapper, IIngredients iIngredients) {
        iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
        iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
	}

	@Override
	public void setRecipe(IRecipeLayout iRecipeLayout, RecipeWrapper recipeWrapper, IIngredients iIngredients) {
		IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
		stacks.init(input1, true, 0, 8);
		stacks.init(output1, false, 60, 8);

        stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
		stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
	}
}