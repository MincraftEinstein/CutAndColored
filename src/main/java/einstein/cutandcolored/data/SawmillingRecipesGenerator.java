package einstein.cutandcolored.data;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;

public class SawmillingRecipesGenerator extends RecipeResources {

	
	public SawmillingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		sawmillingRecipe(consumer, "test_recipe", Items.PORKCHOP, Items.COOKED_PORKCHOP);
	}
}
