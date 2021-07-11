package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class SawmillingRecipesGenerator extends RecipeResources {

	
	public SawmillingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		pumpkinRecipes(consumer);
		vanillaColoredWood(consumer);
		flamboyantColoredWood(consumer);
		
		sawmillingRecipe(consumer, "bowl_from_logs", ItemTags.LOGS, Items.BOWL, 4);
		sawmillingRecipe(consumer, "bowl", ItemTags.PLANKS, Items.BOWL);
		sawmillingRecipe(consumer, "crafting_table", ItemTags.LOGS, Blocks.CRAFTING_TABLE);
		sawmillingRecipe(consumer, "sticks_from_logs", ItemTags.LOGS, Items.STICK, 16);
		sawmillingRecipe(consumer, "sticks_from_planks", ItemTags.PLANKS, Items.STICK, 4);
		sawmillingRecipe(consumer, "carved_pumpkin", Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN);
	}
	
	private void pumpkinRecipes(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < 24; i++) {
			int i1 = i + 1;
			Item item = getItem(new ResourceLocation("omgourd", "carved_pumpkin_" + i1));
			sawmillingRecipe(consumer, "carved_pumpkin_" + i1, Blocks.PUMPKIN, item);
			sawmillingRecipe(consumer, "recarve_pumpkin_" + i1, ItemTagsGenerator.CARVED_PUMPKINS, item, 1, "omgourd");
			
			item = getItem(new ResourceLocation("omgourd", "jack_o_lantern_" + i1));
			sawmillingRecipe(consumer, "recave_jack_o_lantern_" + i1, ItemTagsGenerator.JACK_O_LANTERNS, item, 1, "omgourd");
		}
	}
	
	private void vanillaColoredWood(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getTranslationKey();
			Item item = getItem(ModRL(color + "_stained_planks"));
			
			sawmillingRecipe(consumer, color + "_stained_plank_slab", item, getItem(ModRL(color + "_stained_plank_slab")));
			sawmillingRecipe(consumer, color + "_stained_plank_stairs", item, getItem(ModRL(color + "_stained_plank_stairs")));
		}
	}
	
	private void flamboyantColoredWood(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			String color = FlamboyantDyeColors.byId(i).getTranslationKey();
			Item item = getItem(ModRL(color + "_stained_planks"));
			
			sawmillingRecipe(consumer, color + "_stained_plank_slab", item, getItem(ModRL(color + "_stained_plank_slab")));
			sawmillingRecipe(consumer, color + "_stained_plank_stairs", item, getItem(ModRL(color + "_stained_plank_stairs")));
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored sawmilling recipes";
	}
}
