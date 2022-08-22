package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.util.RecipeResources;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class SawmillingRecipesGenerator extends RecipeResources {

	private List<String[]> woodTypes = new ArrayList<String[]>();
	private String namespace;
	
	public SawmillingRecipesGenerator(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item item = getItem(modRL(color + "_stained_planks"));
			
			sawmillingRecipe(color + "_stained_plank_slab", item, getItem(modRL(color + "_stained_plank_slab")), 2);
			sawmillingRecipe(color + "_stained_plank_stairs", item, getItem(modRL(color + "_stained_plank_stairs")));
		}
		
		woodRecipes();
		
		sawmillingRecipe("bowl_from_logs", ItemTags.LOGS, Items.BOWL, 4);
		sawmillingRecipe("bowl", ItemTags.PLANKS, Items.BOWL);
		sawmillingRecipe("crafting_table", ItemTags.LOGS, Blocks.CRAFTING_TABLE);
		sawmillingRecipe("sticks_from_logs", ItemTags.LOGS, Items.STICK, 16);
		sawmillingRecipe("sticks_from_planks", ItemTags.PLANKS, Items.STICK, 4);
		sawmillingRecipe("carved_pumpkin", Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN);
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
			Item wood;
			Item bars = null;
			Item crossedBars = null;
			Item horizontalBars = null;
			Item horizontalCrossedBars = null;
			Item planks = getItem(RL(woodName + "_planks"));
			Item stairs = getItem(RL(woodName + "_stairs"));
			Item slab = getItem(RL(woodName + "_slab"));
			
			try {
				logKind = "_log";
				log = getItem(RL(woodName + logKind));
			}
			catch (Exception e) {
				logKind = "_stem";
				log = getItem(RL(woodName + logKind));
			}
			
			try {
				woodKind = "_wood";
				wood = getItem(RL(woodName + woodKind));
			}
			catch (Exception e) {
				woodKind = "_hyphae";
				wood = getItem(RL(woodName + woodKind));
			}
			
			Item strippedLog = getItem(RL("stripped_" + woodName + logKind));
			Item strippedWood = getItem(RL("stripped_" + woodName + woodKind));
			String s = logKind + "s";
			TagKey<Item> logTypes = ItemTags.create(new ResourceLocation(modid + ":" + woodName + s));
			
			sawmillingRecipe(woodName + "_planks", logTypes, planks, 4);
			sawmillingRecipe(woodName + "_slab", planks, slab, 2);
			sawmillingRecipe(woodName + "_stairs", planks, stairs);
			sawmillingRecipe("stripped_" + woodName + s, log, strippedLog);
			sawmillingRecipe("stripped_" + woodName + woodKind, wood, strippedWood);
			sawmillingRecipe(woodName + "_door", logTypes, getItem(RL(woodName + "_door")), 1);
			sawmillingRecipe(woodName + "_fence", logTypes, getItem(RL(woodName + "_fence")), 1);
			sawmillingRecipe(woodName + "_fence_gate", logTypes, getItem(RL(woodName + "_fence_gate")), 1);
			sawmillingRecipe(woodName + "_slab_from" + s, logTypes, slab, 8);
			sawmillingRecipe(woodName + "_stairs_from" + s, logTypes, stairs, 4);
			sawmillingRecipe(woodName + "_trapdoor", logTypes, getItem(RL(woodName + "_trapdoor")), 2);
			
			try {
				sawmillingRecipe(woodName + "_boat", logTypes, getItem(RL(woodName + "_boat")), 1);
			}
			catch (Exception e) {
			}
			
			try {
				sawmillingRecipe(woodName + "_sign", logTypes, getItem(RL(woodName + "_sign")), 1);
			}
			catch (Exception e) {}
			
			try {
				Item boards = getItem(modRL(woodName + "_boards"));
				Item boardSlab = getItem(modRL(woodName + "_board_slab"));
				Item boardStairs = getItem(modRL(woodName + "_board_stairs"));
				
				sawmillingRecipe(woodName + "_boards_from" + s, logTypes, boards, 4);
				sawmillingRecipe(woodName + "_boards", planks, boards);
				
				sawmillingRecipe(woodName + "_board_slab_from" + s, logTypes, boardSlab, 8);
				sawmillingRecipe(woodName + "_board_slab_from_planks", planks, boardSlab, 2);
				sawmillingRecipe(woodName + "_board_slab", boards, boardSlab, 2);
				
				sawmillingRecipe(woodName + "_board_stairs_from" + s, logTypes, boardStairs, 4);
				sawmillingRecipe(woodName + "_board_stairs_from_planks", planks, boardStairs);
				sawmillingRecipe(woodName + "_board_stairs", boards, boardStairs);
			}
			catch(Exception e) {}
			
			try {
				bars = getItem(new ResourceLocation("additionalbars", woodName + "_bars"));
				horizontalBars = getItem(new ResourceLocation("additionalbars", "horizontal_" + woodName + "_bars"));
				horizontalCrossedBars = getItem(new ResourceLocation("additionalbars", "horizontal_crossed_" + woodName + "_bars"));
				crossedBars = getItem(new ResourceLocation("additionalbars", "crossed_" + woodName + "_bars"));
			}
			catch (Exception e) {
				try {
					bars = getItem(new ResourceLocation("additionalbarsbop", woodName + "_bars"));
					horizontalBars = getItem(new ResourceLocation("additionalbarsbop", "horizontal_" + woodName + "_bars"));
					horizontalCrossedBars = getItem(new ResourceLocation("additionalbarsbop", "horizontal_crossed_" + woodName + "_bars"));
					crossedBars = getItem(new ResourceLocation("additionalbarsbop", "crossed_" + woodName + "_bars"));
				}
				catch (Exception e2) {}
			}

			try {
				sawmillingRecipe(woodName + "_bars", logTypes, bars, 2);
				sawmillingRecipe(woodName + "_bars_from_bars", bars, 1, horizontalBars, horizontalCrossedBars, crossedBars);
				
				sawmillingRecipe("crossed_" + woodName + "_bars", logTypes, crossedBars, 2);
				sawmillingRecipe("crossed_" + woodName + "_bars_from_bars", crossedBars, 1, horizontalBars, horizontalCrossedBars, bars);
				
				sawmillingRecipe("horizontal_" + woodName + "_bars", logTypes, horizontalBars, 2);
				sawmillingRecipe("horizontal_" + woodName + "_bars_from_bars", horizontalBars, 1, horizontalCrossedBars, bars, crossedBars);
				
				sawmillingRecipe("horizontal_crossed_" + woodName + "_bars", logTypes, horizontalCrossedBars, 2);
				sawmillingRecipe("horizontal_crossed_" + woodName + "_bars_from_bars", horizontalCrossedBars, 1, horizontalBars, bars, crossedBars);
			}
			catch (Exception e) {}
		}
	}
	
	private void getWood() {
		for (int i = 0; i < ForgeRegistries.BLOCKS.getValues().size(); i++) {
			Block block = ForgeRegistries.BLOCKS.getValues().stream().collect(Collectors.toList()).get(i);
			if (Util.getBlockRegistryName(block).getPath().contains("_log") && !Util.getBlockRegistryName(block).getPath().contains("stripped_")) {
				String[] object = { Util.getBlockRegistryName(block).getNamespace(), Util.getBlockRegistryName(block).getPath().replace("_log", "") };
				woodTypes.add(object);
			}
		}
		
		String[] object = {CutAndColored.MC_MOD_ID, "crimson"};
		woodTypes.add(object);
		String[] object2 = {CutAndColored.MC_MOD_ID, "warped"};
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
