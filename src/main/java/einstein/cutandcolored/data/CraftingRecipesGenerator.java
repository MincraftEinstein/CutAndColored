package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;

public class CraftingRecipesGenerator extends RecipeResources {

	public CraftingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		stairsRecipe(consumer, ModBlocks.BLACK_STAINED_PLANKS, ModBlocks.BLACK_STAINED_PLANK_STAIRS);
	}
}
