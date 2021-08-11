package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;

public class CraftingRecipesGenerator extends RecipeResources {

	public CraftingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		setConsumer(consumer);
		vanillaColoredRecipes();
		flamboyantColoredRecipes();
		stoneBrickTypeRecipes();
		
		pillarRecipe(Blocks.END_STONE_BRICK_SLAB, ModBlocks.CHISELED_END_STONE_BRICKS, 1);
		pillarRecipe(Blocks.PRISMARINE_BRICK_SLAB, ModBlocks.CHISELED_PRISMARINE_BRICKS, 1);
		pillarRecipe(ModBlocks.CHISELED_SOUL_SANDSTONE, ModBlocks.CHISELED_SOUL_SANDSTONE, 1);
		
		slabsRecipe("cracked_nether_brick_slab", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, "");
		stairsRecipe("cracked_nether_brick_stairs", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, "");
		wallsRecipe("cracked_nether_brick_wall", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_WALL, "");
		
		slabsRecipe("cracked_polished_blackstone_brick_slab", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, "");
		stairsRecipe("cracked_polished_blackstone_brick_stairs", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, "");
		wallsRecipe("cracked_polished_blackstone_brick_wall", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, "");
		
		slabsRecipe("cracked_stone_brick_slab", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, "");
		stairsRecipe("cracked_stone_brick_stairs", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, "");
		wallsRecipe("cracked_stone_brick_wall", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_WALL, "");
		
		blockRecipe4x4("cut_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE, 1);
		slabsRecipe("cut_soul_sandstone_slab", ModBlocks.CUT_SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE_SLAB, "");
		
		wallsRecipe("dark_prismarine_wall", Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL, "");
		
		pillarRecipe(Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR, 2);
		
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.GLASSCUTTER)
			.patternLine(" # ")
			.patternLine("$$$")
			.key('#', Items.DIAMOND)
			.key('$', Blocks.STONE)
			.addCriterion("has_item", hasItem(Items.DIAMOND))
			.build(consumer, location(ModBlocks.GLASSCUTTER, "crafting/"));
		
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition("horizontalpanes"))
		.addRecipe(ShapedRecipeBuilder.shapedRecipe(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE, 3)
			.patternLine("###")
			.key('#', ModBlocks.SOUL_GLASS_PANE)
			.addCriterion("has_item", hasItem(ModBlocks.SOUL_GLASS_PANE))::build)
			.generateAdvancement()
			.build(consumer, location(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE, "crafting/"));
		
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.IRON_FENCE_GATE)
			.patternLine("#$#")
			.patternLine("#$#")
			.key('#', Items.IRON_INGOT)
			.key('$', Items.IRON_NUGGET)
			.addCriterion("has_item", hasItem(Items.IRON_INGOT))
			.build(consumer, location(ModBlocks.IRON_FENCE_GATE, "crafting/"));
		
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.NETHER_BRICK_FENCE_GATE)
			.patternLine("#$#")
			.patternLine("#$#")
			.key('#', Blocks.NETHER_BRICKS)
			.key('$', Items.NETHER_BRICK)
			.addCriterion("has_item", hasItem(Blocks.NETHER_BRICKS))
			.build(consumer, location(ModBlocks.NETHER_BRICK_FENCE_GATE, "crafting/"));
		
		pillarRecipe(Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR, 2);
		
		blockRecipe4x4("polished_end_stone", Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE, 4);
		
		blockRecipe4x4("polished_stone", Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE, 4);
		
		pillarRecipe(Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR, 2);
		wallsRecipe("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL, "");
		
		wallsRecipe("purpur_wall", Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL, "");
		
		wallsRecipe("quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL, "");
		
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.SAWMILL)
			.patternLine(" # ")
			.patternLine("$$$")
			.key('#', Items.IRON_INGOT)
			.key('$', ItemTags.PLANKS)
			.addCriterion("has_item", hasItem(Items.IRON_INGOT))
			.build(consumer, location(ModBlocks.SAWMILL, "crafting/"));
		
		slabsRecipe("smooth_soul_sandstone_slab", ModBlocks.SMOOTH_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, "");
		stairsRecipe("smooth_soul_sandstone_stairs", ModBlocks.SMOOTH_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS, "");
		
		stairsRecipe("smooth_stone_stairs", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS, "");
		wallsRecipe("smooth_stone_wall", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL, "");
		
		ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.SOUL_GLASS_PANE)
			.addIngredient(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE)
			.addCriterion("has_item", hasItem(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE))
			.build(consumer, location("soul_glass_pane_from_horizontal_pane", "crafting/"));
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.SOUL_GLASS_PANE, 16)
			.patternLine("###")
			.patternLine("###")
			.key('#', ModBlocks.SOUL_GLASS)
			.addCriterion("has_item", hasItem(ModBlocks.SOUL_GLASS))
			.build(consumer, location(ModBlocks.SOUL_GLASS_PANE, "crafting/"));
		
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.SOUL_SANDSTONE_SLAB, 6)
			.patternLine("###")
			.key('#', Ingredient.fromItems(ModBlocks.SOUL_SANDSTONE, ModBlocks.CHISELED_SOUL_SANDSTONE))
			.addCriterion("has_soul_sandstone", hasItem(ModBlocks.SOUL_SANDSTONE))
			.addCriterion("has_chiseled_soul_sandstone", hasItem(ModBlocks.CHISELED_SOUL_SANDSTONE))
			.build(consumer, location("soul_sandstone_slab", "crafting/"));
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.SOUL_SANDSTONE_STAIR, 4)
			.patternLine("#  ")
			.patternLine("## ")
			.patternLine("###")
			.key('#', Ingredient.fromItems(ModBlocks.SOUL_SANDSTONE, ModBlocks.CHISELED_SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE))
			.addCriterion("has_soul_sandstone", hasItem(ModBlocks.SOUL_SANDSTONE))
			.addCriterion("has_chiseled_soul_sandstone", hasItem(ModBlocks.CHISELED_SOUL_SANDSTONE))
			.addCriterion("has_cut_soul_sandstone", hasItem(ModBlocks.CUT_SOUL_SANDSTONE))
			.build(consumer, location("soul_sandstone_stairs", "crafting/"));
		wallsRecipe("soul_sandstone_wall", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_WALL, "");
		blockRecipe4x4("soul_sandstone", Blocks.SOUL_SAND, ModBlocks.SOUL_SANDSTONE, 1);
		
		slabsRecipe("terracotta_slab", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB, "");
		stairsRecipe("terracotta_stairs", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS, "");
		
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.WEAVER)
			.patternLine("#~#")
			.patternLine("#~#")
			.patternLine("$ $")
			.key('#', Items.STICK)
			.key('~', Items.STRING)
			.key('$', ItemTags.PLANKS)
			.addCriterion("has_item", hasItem(Items.STRING))
			.build(consumer, location(ModBlocks.WEAVER, "crafting/"));
	}
	
	private void vanillaColoredRecipes() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getTranslationKey();
			Item dye = getItem(MCRL(color + "_dye"));
			
			// Concrete
			String blockKind = "_concrete";
			String block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(ModRL(block + "_slab")), "concrete_slabs");
			recolorObject(ItemTagsGenerator.CONCRETE_SLABS, getItem(ModRL(block + "_slab")), color, "recolor_concrete_slabs");
			stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(ModRL(block + "_stairs")), "concrete_stairs");
			recolorObject(ItemTagsGenerator.CONCRETE_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolor_concrete_stairs");
			
			// Stained Bricks
			blockKind = "_stained_brick";
			block = color + blockKind + "s";
			slabsRecipe(color + blockKind + "_slab", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_slab")), "stained_brick_slabs");
			recolorObject(ItemTagsGenerator.CLAY_BRICK_SLABS, getItem(ModRL(color + blockKind + "_slab")), color, "recolor_stained_brick_slabs");
			stairsRecipe(color + blockKind + "_stairs", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_stairs")), "stained_brick_stairs");
			recolorObject(ItemTagsGenerator.CLAY_BRICK_STAIRS, getItem(ModRL(color + blockKind + "_stairs")), color, "recolor_stained_brick_stairs");
			wallsRecipe(color + blockKind + "_wall", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_wall")), "stained_brick_walls");
			recolorObject(ItemTagsGenerator.CLAY_BRICK_WALLS, getItem(ModRL(color + blockKind + "_wall")), color, "recolor_stained_brick_walls");
			recolorObject(ItemTagsGenerator.CLAY_BRICKS, getItem(ModRL(block)), color, "recolor_stained_bricks");
			
			// Stained Glass
			blockKind = "_stained_glass";
			block = color + blockKind;
			recolorObject(ItemTagsGenerator.GLASS_SLABS, getItem(ModRL(block + "_slab")), color, "recolor_stained_glass_slabs");
			recolorObject(ItemTagsGenerator.GLASS_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolor_stained_glass_stairs");
			
			// Stained Planks
			blockKind = "_stained_plank";
			block = color + blockKind + "s";
			slabsRecipe(color + blockKind + "_slab", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_slab")), "stained_plank_slabs");
			recolorObject(ItemTags.WOODEN_SLABS, getItem(ModRL(color + blockKind + "_slab")), color, "recolor_stained_plank_slabs");
			stairsRecipe(color + blockKind + "_stairs", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_stairs")), "stained_plank_stairs");
			recolorObject(ItemTags.WOODEN_STAIRS, getItem(ModRL(color + blockKind + "_stairs")), color, "recolor_stained_plank_stairs");
			recolorObject(ItemTags.PLANKS, getItem(ModRL(block)), color, "recolor_stained_planks");
			
			// Terracotta
			blockKind = "_terracotta";
			block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(ModRL(block + "_slab")), "colored_tarracotta_slabs");
			recolorObject(ItemTagsGenerator.TERRACOTTA_SLABS, getItem(ModRL(block + "_slab")), color, "recolored_tarracotta_slabs");
			stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(ModRL(block + "_stairs")), "colored_tarracotta_stairs");
			recolorObject(ItemTagsGenerator.TERRACOTTA_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolored_tarracotta_stairs");
			
			// Wool
			blockKind = "_wool";
			block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(ModRL(block + "_slab")), "wool_slabs");
			recolorObject(ItemTagsGenerator.WOOL_SLABS, getItem(ModRL(block + "_slab")), color, "recolor_wool_slabs");
			stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(ModRL(block + "_stairs")), "wool_stairs");
			recolorObject(ItemTagsGenerator.WOOL_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolor_wool_stairs");
			
			// Redstone Lamps
			String name = color + "_redstone_lamp";
			ShapelessRecipeBuilder.shapelessRecipe(getItem(ModRL(name)))
				.addIngredient(ItemTagsGenerator.REDSTONE_LAMPS)
				.addIngredient(dye)
				.setGroup("redstone_lamp")
				.addCriterion("has_item", hasItem(ItemTagsGenerator.REDSTONE_LAMPS))
				.build(consumer, location(name, "crafting/"));
		}
	}
	
	private void flamboyantColoredRecipes() {
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			String color = FlamboyantDyeColors.byId(i).getTranslationKey();
			Item dye = getItem(FRL(color + "_dye"));
			
			// Concrete
			String blockKind = "_concrete";
			String block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(FRL(block)), getItem(ModRL(block + "_slab")), "concrete_slabs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.CONCRETE_SLABS, getItem(ModRL(block + "_slab")), color, "recolor_concrete_slabs", CutAndColored.FMODID);
			stairsRecipe(block + "_stairs", getItem(FRL(block)), getItem(ModRL(block + "_stairs")), "concrete_stairs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.CONCRETE_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolor_concrete_stairs", CutAndColored.FMODID);
			
			// Stained Bricks
			blockKind = "_stained_brick";
			block = color + blockKind + "s";
			slabsRecipe(color + blockKind + "_slab", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_slab")), "stained_brick_slabs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.CLAY_BRICK_SLABS, getItem(ModRL(color + blockKind + "_slab")), color, "recolor_stained_brick_slabs", CutAndColored.FMODID);
			stairsRecipe(color + blockKind + "_stairs", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_stairs")), "stained_brick_stairs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.CLAY_BRICK_STAIRS, getItem(ModRL(color + blockKind + "_stairs")), color, "recolor_stained_brick_stairs", CutAndColored.FMODID);
			wallsRecipe(color + blockKind + "_wall", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_wall")), "stained_brick_walls", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.CLAY_BRICK_WALLS, getItem(ModRL(color + blockKind + "_wall")), color, "recolor_stained_brick_walls", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.CLAY_BRICKS, getItem(ModRL(block)), color, "recolor_stained_bricks", CutAndColored.FMODID);
			
			// Stained Glass
			blockKind = "_stained_glass";
			block = color + blockKind;
			recolorObject(ItemTagsGenerator.GLASS_SLABS, getItem(ModRL(block + "_slab")), color, "recolor_stained_glass_slabs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.GLASS_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolor_stained_glass_stairs", CutAndColored.FMODID);
			
			// Stained Planks
			blockKind = "_stained_plank";
			block = color + blockKind + "s";
			slabsRecipe(color + blockKind + "_slab", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_slab")), "stained_plank_slabs", CutAndColored.FMODID);
			recolorObject(ItemTags.WOODEN_SLABS, getItem(ModRL(color + blockKind + "_slab")), color, "recolor_stained_plank_slabs", CutAndColored.FMODID);
			stairsRecipe(color + blockKind + "_stairs", getItem(ModRL(block)), getItem(ModRL(color + blockKind + "_stairs")), "stained_plank_stairs", CutAndColored.FMODID);
			recolorObject(ItemTags.WOODEN_STAIRS, getItem(ModRL(color + blockKind + "_stairs")), color, "recolor_stained_plank_stairs", CutAndColored.FMODID);
			recolorObject(ItemTags.PLANKS, getItem(ModRL(block)), color, "recolor_stained_planks", CutAndColored.FMODID);
			
			// Terracotta
			blockKind = "_terracotta";
			block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(FRL(block)), getItem(ModRL(block + "_slab")), "colored_tarracotta_slabs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.TERRACOTTA_SLABS, getItem(ModRL(block + "_slab")), color, "recolored_tarracotta_slabs", CutAndColored.FMODID);
			stairsRecipe(block + "_stairs", getItem(FRL(block)), getItem(ModRL(block + "_stairs")), "colored_tarracotta_stairs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.TERRACOTTA_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolored_tarracotta_stairs", CutAndColored.FMODID);
			
			// Wool
			blockKind = "_wool";
			block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(FRL(block)), getItem(ModRL(block + "_slab")), "wool_slabs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.WOOL_SLABS, getItem(ModRL(block + "_slab")), color, "recolor_wool_slabs", CutAndColored.FMODID);
			stairsRecipe(block + "_stairs", getItem(FRL(block)), getItem(ModRL(block + "_stairs")), "wool_stairs", CutAndColored.FMODID);
			recolorObject(ItemTagsGenerator.WOOL_STAIRS, getItem(ModRL(block + "_stairs")), color, "recolor_wool_stairs", CutAndColored.FMODID);
			
			// Redstone Lamps
			String name = color + "_redstone_lamp";
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(CutAndColored.FMODID))
			.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(getItem(ModRL(name)))
				.addIngredient(ItemTagsGenerator.REDSTONE_LAMPS)
				.addIngredient(dye)
				.setGroup("redstone_lamp")
				.addCriterion("has_item", hasItem(ItemTagsGenerator.REDSTONE_LAMPS))::build)
				.generateAdvancement()
				.build(consumer, location(name, "crafting/"));
		}
	}
	
	private void stoneBrickTypeRecipes() {
		String[] stoneTypes = {"andesite", "diorite", "granite"};
		for (int i = 0; i < stoneTypes.length; i++) {
			String type = stoneTypes[i] + "_brick";
			String block = type + "s";
			slabsRecipe(type + "_slab", getItem(ModRL(block)), getItem(ModRL(type + "_slab")), "");
			slabsRecipe(type + "_stairs", getItem(ModRL(block)), getItem(ModRL(type + "_stairs")), "");
			slabsRecipe(type + "_wall", getItem(ModRL(block)), getItem(ModRL(type + "_wall")), "");
			blockRecipe4x4(block, getItem(MCRL("polished_" + stoneTypes[i])), getItem(ModRL(block)), 4);
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored crafting recipes";
	}
}
