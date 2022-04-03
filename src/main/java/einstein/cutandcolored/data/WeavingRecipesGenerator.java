package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class WeavingRecipesGenerator extends RecipeResources {

	public WeavingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		
		vanillaWool();
		flamboyantWool();
	}
	
	private void vanillaWool() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item item = getItem(MCRL(color + "_wool"));
			
			Item carpet = getItem(MCRL(color + "_carpet"));
			weavingRecipe(carpet.getRegistryName().getPath(), item, carpet, 2);
			
			Item slab = getItem(ModRL(color + "_wool_slab"));
			weavingRecipe(slab.getRegistryName().getPath(), item, slab, 2);
			
			Item stairs = getItem(ModRL(color + "_wool_stairs"));
			weavingRecipe(stairs.getRegistryName().getPath(), item, stairs);
		}
	}
	
	private void flamboyantWool() {
		for(int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			String color = FlamboyantDyeColors.byId(i).getName();
			Item item = getItem(FRL(color + "_wool"));
			
			Item carpet = getItem(FRL(color + "_carpet"));
			weavingRecipe(carpet.getRegistryName().getPath(), item, carpet, 2, CutAndColored.FMODID);
			
			Item slab = getItem(ModRL(color + "_wool_slab"));
			weavingRecipe(slab.getRegistryName().getPath(), item, slab, 2, CutAndColored.FMODID);
			
			Item stairs = getItem(ModRL(color + "_wool_stairs"));
			weavingRecipe(stairs.getRegistryName().getPath(), item, stairs, 1, CutAndColored.FMODID);
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored weaving recipes";
	}
}
