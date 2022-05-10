package einstein.cutandcolored.data;

import java.util.function.Consumer;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class WeavingRecipesGenerator extends RecipeResources {

	public WeavingRecipesGenerator(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item item = getItem(MCRL(color + "_wool"));
			
			Item carpet = getItem(MCRL(color + "_carpet"));
			weavingRecipe(carpet.getRegistryName().getPath(), item, carpet, 2);
			
			Item slab = getItem(modRL(color + "_wool_slab"));
			weavingRecipe(slab.getRegistryName().getPath(), item, slab, 2);
			
			Item stairs = getItem(modRL(color + "_wool_stairs"));
			weavingRecipe(stairs.getRegistryName().getPath(), item, stairs);
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored weaving recipes";
	}
}
