package einstein.cutandcolored.jei;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import mezz.jei.api.recipe.RecipeType;
import net.minecraft.world.Container;
import net.minecraft.world.item.crafting.Recipe;

public class ModJEIRecipeTypes {
	
	public static final RecipeType<GlasscuttingRecipe> GLASSCUTTING = create("glasscutting", GlasscuttingRecipe.class);
	public static final RecipeType<SawmillingRecipe> SAWMILLING = create("sawmilling", SawmillingRecipe.class);
	public static final RecipeType<WeavingRecipe> WEAVING = create("weaving", WeavingRecipe.class);

	private static <T extends Recipe<Container>> RecipeType<T> create(String name, Class<T> recipeClass) {
		return RecipeType.create(CutAndColored.MOD_ID, name, recipeClass);
	}
}
