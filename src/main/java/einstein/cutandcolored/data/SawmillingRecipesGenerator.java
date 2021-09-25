package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class SawmillingRecipesGenerator extends RecipeResources {

	private List<String[]> woodTypes = new ArrayList<String[]>();
	private String namespace;
	
	public SawmillingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		pumpkinRecipes();
		vanillaColoredWoodRecipes();
		flamboyantColoredWoodRecipes();
		woodRecipes();
		
		sawmillingRecipe("bowl_from_logs", ItemTags.LOGS, Items.BOWL, 4);
		sawmillingRecipe("bowl", ItemTags.PLANKS, Items.BOWL);
		sawmillingRecipe("crafting_table", ItemTags.LOGS, Blocks.CRAFTING_TABLE);
		sawmillingRecipe("sticks_from_logs", ItemTags.LOGS, Items.STICK, 16);
		sawmillingRecipe("sticks_from_planks", ItemTags.PLANKS, Items.STICK, 4);
		sawmillingRecipe("carved_pumpkin", Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN);
	}
	
	private void pumpkinRecipes() {
//		for (int i = 0; i < 24; i++) {
//			int i1 = i + 1;
//			Item item = getItem(new ResourceLocation("omgourd", "carved_pumpkin_" + i1));
//			sawmillingRecipe("carved_pumpkin_" + i1, Blocks.PUMPKIN, item);
//			sawmillingRecipe("recarve_pumpkin_" + i1, ItemTagsGenerator.CARVED_PUMPKINS, item, 1);
//			
//			item = getItem(new ResourceLocation("omgourd", "jack_o_lantern_" + i1));
//			sawmillingRecipe("recave_jack_o_lantern_" + i1, ItemTagsGenerator.JACK_O_LANTERNS, item, 1);
//		}
	}
	
	private void vanillaColoredWoodRecipes() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item item = getItem(ModRL(color + "_stained_planks"));
			
			sawmillingRecipe(color + "_stained_plank_slab", item, getItem(ModRL(color + "_stained_plank_slab")));
			sawmillingRecipe(color + "_stained_plank_stairs", item, getItem(ModRL(color + "_stained_plank_stairs")));
		}
	}
	
	private void flamboyantColoredWoodRecipes() {
//		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
//			String color = FlamboyantDyeColors.byId(i).getName();
//			Item item = getItem(ModRL(color + "_stained_planks"));
//			
//			sawmillingRecipe(color + "_stained_plank_slab", item, getItem(ModRL(color + "_stained_plank_slab")));
//			sawmillingRecipe(color + "_stained_plank_stairs", item, getItem(ModRL(color + "_stained_plank_stairs")));
//		}
	}
	
	private void woodRecipes() {
		getWood();
		for (int i = 0; i < woodTypes.size(); i++) {
			String modid = woodTypes.get(i)[0];
			namespace = modid;
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
			Item planks = getItem(RL(woodName + "_planks"));
			Item stairs = getItem(RL(woodName + "_stairs"));
			Item slab = getItem(RL(woodName + "_slab"));
			
			try {
				logKind = "_log";
				log = getItem(RL(woodName + logKind));
				strippedLog = getItem(RL("stripped_" + woodName + logKind));
			}
			catch (Exception e) {
				logKind = "_stem";
				log = getItem(RL(woodName + logKind)); 
				strippedLog = getItem(RL("stripped_" + woodName + logKind));
			}
			
			try {
				woodKind = "_wood";
				wood = getItem(RL(woodName + woodKind));
				strippedWood = getItem(RL("stripped_" + woodName + woodKind));
			}
			catch (Exception e) {
				woodKind = "_hyphae";
				wood = getItem(RL(woodName + woodKind));
				strippedWood = getItem(RL("stripped_" + woodName + woodKind));
			}
			
			Item[] logTypes = { log, strippedLog, wood, strippedWood }; // Temporary fix, until I figure out how to indirectly reference tags
			String s = logKind + "s";
			sawmillingRecipe(woodName + "_planks", planks, 4, log, logTypes);
			sawmillingRecipe(woodName + "_slab", planks, slab, 2);
			sawmillingRecipe(woodName + "_stairs", planks, stairs);
			sawmillingRecipe("stripped_" + woodName + s, log, strippedLog);
			sawmillingRecipe("stripped_" + woodName + woodKind + "s", wood, strippedWood);
			sawmillingRecipe(woodName + "_door", getItem(RL(woodName + "_door")), 1, log, logTypes);
			sawmillingRecipe(woodName + "_fence", getItem(RL(woodName + "_fence")), 1, log, logTypes);
			sawmillingRecipe(woodName + "_fence_gate", getItem(RL(woodName + "_fence_gate")), 1, log, logTypes);
			sawmillingRecipe(woodName + "_slab_from" + s, slab, 1, log, logTypes);
			sawmillingRecipe(woodName + "_stairs_from" + s, stairs, 1, log, logTypes);
			sawmillingRecipe(woodName + "_trapdoor", getItem(RL(woodName + "_trapdoor")), 2, log, logTypes);
			
			try {
				sawmillingRecipe(woodName + "_boat", getItem(RL(woodName + "_boat")), 1, log, logTypes);
			}
			catch (Exception e) {
			}
			
			try {
				sawmillingRecipe(woodName + "_sign", getItem(RL(woodName + "_sign")), 1, log, logTypes);
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
//				sawmillingRecipe(woodName + "_bars", bars, 2, logTypes);
				sawmillingRecipe(woodName + "_bars_from_bars", bars, 1, horizontal_bars, horizontal_crossed_bars, crossed_bars);
				
//				sawmillingRecipe("crossed_" + woodName + "_bars", crossed_bars, 2, logTypes);
				sawmillingRecipe("crossed_" + woodName + "_bars_from_bars", crossed_bars, 1, horizontal_bars, horizontal_crossed_bars, bars);
				
//				sawmillingRecipe("horizontal_" + woodName + "_bars", horizontal_bars, 2, logTypes);
				sawmillingRecipe("horizontal_" + woodName + "_bars_from_bars", horizontal_bars, 1, horizontal_crossed_bars, bars, crossed_bars);
				
//				sawmillingRecipe("horizontal_crossed_" + woodName + "_bars", horizontal_crossed_bars, 2, logTypes);
				sawmillingRecipe("horizontal_crossed_" + woodName + "_bars_from_bars", horizontal_crossed_bars, 1, horizontal_bars, bars, crossed_bars);
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
	
	private ResourceLocation RL(String string) {
		return new ResourceLocation(namespace, string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored sawmilling recipes";
	}
}
