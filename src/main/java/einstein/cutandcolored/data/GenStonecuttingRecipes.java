package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;

public class GenStonecuttingRecipes extends RecipeResources {

	public GenStonecuttingRecipes(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
//		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.CAKE.asItem()), Items.DIAMOND.asItem(), 2).addCriterion("has_cake", hasItem(Items.CAKE)).build(consumer, location("test_recipe", "stonecutting/"));
//		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.CAKE.asItem()), Items.EMERALD.asItem(), 2).addCriterion("has_cake", hasItem(Items.CAKE)).build(consumer, location(Items.EMERALD, "stonecutting/"));
		stonecuttingRecipe(consumer, "granite_bricks_from_granite", Blocks.GRANITE, ModBlocks.GRANITE_BRICKS);
	}
}