package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class SawmillingRecipesGenerator extends RecipeResources {

	List<String[]> woodTypes = new ArrayList<String[]>();
	
	public SawmillingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		pumpkinRecipes(consumer);
		vanillaColoredWood(consumer);
		flamboyantColoredWood(consumer);
		wood(consumer);
		
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
	
	private void wood(Consumer<IFinishedRecipe> consumer) {
		getWood();
		for (int i = 0; i < woodTypes.size(); i++) {
			String modid = woodTypes.get(i)[0];
			String woodName = woodTypes.get(i)[1];
			String logKind;
			String woodKind;
			
			Item log;
			Item strippedLog;
			Item strippedWood;
			Item wood;
			Item bars;
			Item crossed_bars;
			Item horizontal_bars;
			Item horizontal_crossed_bars;
			Item planks = getItem(new ResourceLocation(modid, woodName + "_planks"));
			Item stairs = getItem(new ResourceLocation(modid, woodName + "_stairs"));
			Item slab = getItem(new ResourceLocation(modid, woodName + "_slab"));
			
			try {
				logKind = "_log";
				log = getItem(new ResourceLocation(modid, woodName + logKind));
				strippedLog = getItem(new ResourceLocation(modid, "stripped_" + woodName + logKind));
			}
			catch (Exception e) {
				logKind = "_stem";
				log = getItem(new ResourceLocation(modid, woodName + logKind)); 
				strippedLog = getItem(new ResourceLocation(modid, "stripped_" + woodName + logKind));
			}
			
			try {
				woodKind = "_wood";
				wood = getItem(new ResourceLocation(modid, woodName + woodKind));
				strippedWood = getItem(new ResourceLocation(modid, "stripped_" + woodName + woodKind));
			}
			catch (Exception e) {
				woodKind = "_hyphae";
				wood = getItem(new ResourceLocation(modid, woodName + woodKind));
				strippedWood = getItem(new ResourceLocation(modid, "stripped_" + woodName + woodKind));
			}
			
			Item[] logTypes = { log, strippedLog, wood, strippedWood }; // Temporary fix, until I figure out how to indirectly reference tags
			String s = logKind + "s";
			sawmillingRecipe(consumer, woodName + "_planks", planks, 4, logTypes);
			sawmillingRecipe(consumer, woodName + "_slab", slab, 2, planks);
			sawmillingRecipe(consumer, woodName + "_stairs", planks, stairs);
			sawmillingRecipe(consumer, "stripped_" + woodName + s, log, strippedLog);
			sawmillingRecipe(consumer, "stripped_" + woodName + woodKind + "s", wood, strippedWood);
			sawmillingRecipe(consumer, woodName + "_door", getItem(new ResourceLocation(modid, woodName + "_door")), 1, logTypes);
			sawmillingRecipe(consumer, woodName + "_fence", getItem(new ResourceLocation(modid, woodName + "_fence")), 1, logTypes);
			sawmillingRecipe(consumer, woodName + "_fence_gate", getItem(new ResourceLocation(modid, woodName + "_fence_gate")), 1, logTypes);
			sawmillingRecipe(consumer, woodName + "_slab_from" + s, slab, 1, logTypes);
			sawmillingRecipe(consumer, woodName + "_stairs_from" + s, stairs, 1, logTypes);
			sawmillingRecipe(consumer, woodName + "_trapdoor", getItem(new ResourceLocation(modid, woodName + "_trapdoor")), 2, logTypes);
			
			try {
				sawmillingRecipe(consumer, woodName + "_boat", getItem(new ResourceLocation(modid, woodName + "_boat")), 1, logTypes);
			}
			catch (Exception e) {
			}
			
			try {
				sawmillingRecipe(consumer, woodName + "_sign", getItem(new ResourceLocation(modid, woodName + "_sign")), 1, logTypes);
			}
			catch (Exception e) {
			}
			
			try {
				bars = getItem(new ResourceLocation("additionalbars", woodName + "_bars"));
				horizontal_bars = getItem(new ResourceLocation("additionalbars", "horizontal_" + woodName + "_bars"));
				horizontal_crossed_bars = getItem(new ResourceLocation("additionalbars", "horizontal_crossed_" + woodName + "_bars"));
				crossed_bars = getItem(new ResourceLocation("additionalbars", "crossed_" + woodName + "_bars"));
			}
			catch (Exception e) {
				bars = getItem(new ResourceLocation("additionalbarsbop", woodName + "_bars"));
				horizontal_bars = getItem(new ResourceLocation("additionalbarsbop", "horizontal_" + woodName + "_bars"));
				horizontal_crossed_bars = getItem(new ResourceLocation("additionalbarsbop", "horizontal_crossed_" + woodName + "_bars"));
				crossed_bars = getItem(new ResourceLocation("additionalbarsbop", "crossed_" + woodName + "_bars"));
			}
			
			try {
				sawmillingRecipe(consumer, woodName + "_bars", bars, 2, logTypes);
				sawmillingRecipe(consumer, woodName + "_bars_from_bars", bars, 1, horizontal_bars, horizontal_crossed_bars, crossed_bars);
				
				sawmillingRecipe(consumer, "crossed_" + woodName + "_bars", crossed_bars, 2, logTypes);
				sawmillingRecipe(consumer, "crossed_" + woodName + "_bars_from_bars", crossed_bars, 1, horizontal_bars, horizontal_crossed_bars, bars);
				
				sawmillingRecipe(consumer, "horizontal_" + woodName + "_bars", horizontal_bars, 2, logTypes);
				sawmillingRecipe(consumer, "horizontal_" + woodName + "_bars_from_bars", horizontal_bars, 1, horizontal_crossed_bars, bars, crossed_bars);
				
				sawmillingRecipe(consumer, "horizontal_crossed_" + woodName + "_bars", horizontal_crossed_bars, 2, logTypes);
				sawmillingRecipe(consumer, "horizontal_crossed_" + woodName + "_bars_from_bars", horizontal_crossed_bars, 1, horizontal_bars, bars, crossed_bars);
			}
			catch (Exception e) {
			}
		}
	}
	
	private void getWood() {
		for (int i = 0; i < ForgeRegistries.BLOCKS.getValues().size(); i++) {
			Block block = ForgeRegistries.BLOCKS.getValues().stream().collect(Collectors.toList()).get(i);
			if (block.getRegistryName().getPath().contains("_log") && !block.getRegistryName().getPath().contains("stripped_")) {
				String[] object = { block.getRegistryName().getNamespace(), block.getRegistryName().getPath().replace("_log", "") };
				woodTypes.add(object);
			}
		}
		
		String[] object = {CutAndColored.MCMODID, "crimson"};
		woodTypes.add(object);
		String[] object2 = {CutAndColored.MCMODID, "warped"};
		woodTypes.add(object2);
		
		CutAndColored.LOGGER.debug("Found " + woodTypes.size() + " wood types");
	}
	
	@Override
	public String getName() {
		return "CutAndColored sawmilling recipes";
	}
}
