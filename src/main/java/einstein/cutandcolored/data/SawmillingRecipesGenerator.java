package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.util.RecipeResources;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
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

	private final List<String[]> woodTypes = new ArrayList<>();
	private String namespace;
	
	public SawmillingRecipesGenerator(PackOutput output) {
		super(output);
	}
	
	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item item = getItem(modRL(color + "_stained_planks"));
			
			sawmillingRecipe(color + "_stained_plank_slab", RecipeCategory.BUILDING_BLOCKS, item, getItem(modRL(color + "_stained_plank_slab")), 2);
			sawmillingRecipe(color + "_stained_plank_stairs", RecipeCategory.BUILDING_BLOCKS, item, getItem(modRL(color + "_stained_plank_stairs")));
		}
		
		woodRecipes();
		
		sawmillingRecipe("bowl_from_logs", RecipeCategory.BUILDING_BLOCKS, ItemTags.LOGS, Items.BOWL, 4);
		sawmillingRecipe("bowl", RecipeCategory.BUILDING_BLOCKS, ItemTags.PLANKS, Items.BOWL);
		sawmillingRecipe("crafting_table", RecipeCategory.BUILDING_BLOCKS, ItemTags.LOGS, Blocks.CRAFTING_TABLE);
		sawmillingRecipe("sticks_from_logs", RecipeCategory.BUILDING_BLOCKS, ItemTags.LOGS, Items.STICK, 16);
		sawmillingRecipe("sticks_from_planks", RecipeCategory.BUILDING_BLOCKS, ItemTags.PLANKS, Items.STICK, 4);
		sawmillingRecipe("carved_pumpkin", RecipeCategory.BUILDING_BLOCKS, Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN);
	}
	
	private void woodRecipes() {
		getWood();
		for (String[] woodType : woodTypes) {
			String modid = woodType[0];
			namespace = modid;
			String woodName = woodType[1];
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

			sawmillingRecipe(woodName + "_planks", RecipeCategory.BUILDING_BLOCKS, logTypes, planks, 4);
			sawmillingRecipe(woodName + "_slab", RecipeCategory.BUILDING_BLOCKS, planks, slab, 2);
			sawmillingRecipe(woodName + "_stairs", RecipeCategory.BUILDING_BLOCKS, planks, stairs);
			sawmillingRecipe("stripped_" + woodName + s, RecipeCategory.BUILDING_BLOCKS, log, strippedLog);
			sawmillingRecipe("stripped_" + woodName + woodKind, RecipeCategory.BUILDING_BLOCKS, wood, strippedWood);
			sawmillingRecipe(woodName + "_door", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_door")), 1);
			sawmillingRecipe(woodName + "_fence", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_fence")), 1);
			sawmillingRecipe(woodName + "_fence_gate", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_fence_gate")), 1);
			sawmillingRecipe(woodName + "_slab_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, slab, 8);
			sawmillingRecipe(woodName + "_stairs_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, stairs, 4);
			sawmillingRecipe(woodName + "_trapdoor", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_trapdoor")), 2);

			try {
				sawmillingRecipe(woodName + "_boat", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_boat")), 1);
			}
			catch (Exception e) {
			}

			try {
				sawmillingRecipe(woodName + "_sign", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_sign")), 1);
			}
			catch (Exception e) {
			}

			try {
				Item boards = getItem(modRL(woodName + "_boards"));
				Item boardSlab = getItem(modRL(woodName + "_board_slab"));
				Item boardStairs = getItem(modRL(woodName + "_board_stairs"));

				sawmillingRecipe(woodName + "_boards_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, boards, 4);
				sawmillingRecipe(woodName + "_boards", RecipeCategory.BUILDING_BLOCKS, planks, boards);

				sawmillingRecipe(woodName + "_board_slab_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, boardSlab, 8);
				sawmillingRecipe(woodName + "_board_slab_from_planks", RecipeCategory.BUILDING_BLOCKS, planks, boardSlab, 2);
				sawmillingRecipe(woodName + "_board_slab", RecipeCategory.BUILDING_BLOCKS, boards, boardSlab, 2);

				sawmillingRecipe(woodName + "_board_stairs_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, boardStairs, 4);
				sawmillingRecipe(woodName + "_board_stairs_from_planks", RecipeCategory.BUILDING_BLOCKS, planks, boardStairs);
				sawmillingRecipe(woodName + "_board_stairs", RecipeCategory.BUILDING_BLOCKS, boards, boardStairs);
			}
			catch (Exception e) {
			}

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
				catch (Exception e2) {
				}
			}

			try {
				sawmillingRecipe(woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, bars, 2);
				sawmillingRecipe(woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, bars, 1, horizontalBars, horizontalCrossedBars, crossedBars);

				sawmillingRecipe("crossed_" + woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, crossedBars, 2);
				sawmillingRecipe("crossed_" + woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, crossedBars, 1, horizontalBars, horizontalCrossedBars, bars);

				sawmillingRecipe("horizontal_" + woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, horizontalBars, 2);
				sawmillingRecipe("horizontal_" + woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, horizontalBars, 1, horizontalCrossedBars, bars, crossedBars);

				sawmillingRecipe("horizontal_crossed_" + woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, horizontalCrossedBars, 2);
				sawmillingRecipe("horizontal_crossed_" + woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, horizontalCrossedBars, 1, horizontalBars, bars, crossedBars);
			}
			catch (Exception e) {
			}
		}
	}
	
	private void getWood() {
		for (int i = 0; i < ForgeRegistries.BLOCKS.getValues().size(); i++) {
			Block block = ForgeRegistries.BLOCKS.getValues().stream().toList().get(i);
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
}
