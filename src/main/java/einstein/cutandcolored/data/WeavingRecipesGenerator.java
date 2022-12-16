package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.util.RecipeResources;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class WeavingRecipesGenerator extends RecipeResources {

	public WeavingRecipesGenerator(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);

		for (DyeColor dyeColor : DyeColor.values()) {
			String color = dyeColor.getName();
			Item item = getItem(MCRL(color + "_wool"));
			
			Item carpet = getItem(MCRL(color + "_carpet"));
			weavingRecipe(Util.getItemRegistryName(carpet).getPath(), RecipeCategory.BUILDING_BLOCKS, item, carpet, 2);
			
			Item slab = getItem(modRL(color + "_wool_slab"));
			weavingRecipe(Util.getItemRegistryName(slab).getPath(), RecipeCategory.BUILDING_BLOCKS, item, slab, 2);
			
			Item stairs = getItem(modRL(color + "_wool_stairs"));
			weavingRecipe(Util.getItemRegistryName(stairs).getPath(), RecipeCategory.BUILDING_BLOCKS, item, stairs);
		}
	}
}
