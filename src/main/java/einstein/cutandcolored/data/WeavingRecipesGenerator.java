package einstein.cutandcolored.data;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;

public class WeavingRecipesGenerator extends RecipeResources {

	public WeavingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		weavingRecipe(consumer, "test_recipe", Items.CHICKEN, Items.COOKED_CHICKEN);
	}
}
