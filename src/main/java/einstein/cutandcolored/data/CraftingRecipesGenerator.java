package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;

public class CraftingRecipesGenerator extends RecipeResources {

	public CraftingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		setConsumer(consumer);
		stairsRecipe("test_stairs", Blocks.DIAMOND_BLOCK, ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS);
	}
}
