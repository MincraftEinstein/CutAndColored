package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;

public class CraftingRecipesGenerator extends RecipeResources {

	public CraftingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		
		vanillaColoredRecipes();
		stoneBrickTypeRecipes();
		
		pillarRecipe(Blocks.END_STONE_BRICK_SLAB, ModBlocks.CHISELED_END_STONE_BRICKS.get(), 1);
		pillarRecipe(Blocks.PRISMARINE_BRICK_SLAB, ModBlocks.CHISELED_PRISMARINE_BRICKS.get(), 1);
		pillarRecipe(ModBlocks.CHISELED_SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get(), 1);
		
		slabsRecipe("cracked_nether_brick_slab", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), "");
		stairsRecipe("cracked_nether_brick_stairs", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), "");
		wallsRecipe("cracked_nether_brick_wall", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(), "");
		
		slabsRecipe("cracked_polished_blackstone_brick_slab", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), "");
		stairsRecipe("cracked_polished_blackstone_brick_stairs", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), "");
		wallsRecipe("cracked_polished_blackstone_brick_wall", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), "");
		
		slabsRecipe("cracked_stone_brick_slab", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), "");
		stairsRecipe("cracked_stone_brick_stairs", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(), "");
		wallsRecipe("cracked_stone_brick_wall", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_WALL.get(), "");
		
		slabsRecipe("cracked_deepslate_brick_slab", Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), "");
		stairsRecipe("cracked_deepslate_brick_stairs", Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), "");
		wallsRecipe("cracked_deepslate_brick_wall", Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), "");
		
		slabsRecipe("cracked_deepslate_tile_slab", Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), "");
		stairsRecipe("cracked_deepslate_tile_stairs", Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), "");
		wallsRecipe("cracked_deepslate_tile_wall", Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), "");
		
		blockRecipe4x4("cut_soul_sandstone", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get(), 1);
		slabsRecipe("cut_soul_sandstone_slab", ModBlocks.CUT_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), "");
		
		wallsRecipe("dark_prismarine_wall", Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL.get(), "");
		
		pillarRecipe(Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR.get(), 2);
		
		blockRecipe4x4("obsidian_bricks", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICKS.get(), 4);
		pillarRecipe(ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get(), 2);
		stairsRecipe("obsidian_brick_stairs", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_STAIRS.get(), "");
		slabsRecipe("obsidian_brick_slab", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_SLAB.get(), "");
		wallsRecipe("obsidian_brick_wall", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get(), "");
		
		ShapedRecipeBuilder.shaped(ModBlocks.GLASSCUTTER.get())
			.pattern(" # ")
			.pattern("$$$")
			.define('#', Items.DIAMOND)
			.define('$', Blocks.STONE)
			.unlockedBy("has_item", has(Items.DIAMOND))
			.save(consumer, location(ModBlocks.GLASSCUTTER.get(), "crafting/"));
		
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition("horizontalpanes"))
		.addRecipe(ShapedRecipeBuilder.shaped(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get(), 3)
			.pattern("###")
			.define('#', ItemTagsGenerator.SOUL_GLASS_PANES)
			.unlockedBy("has_item", has(ItemTagsGenerator.SOUL_GLASS_PANES))::save)
			.generateAdvancement()
			.build(consumer, location(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get(), "crafting/"));
		
		ShapedRecipeBuilder.shaped(ModBlocks.IRON_FENCE_GATE.get())
			.pattern("#$#")
			.pattern("#$#")
			.define('#', Items.IRON_INGOT)
			.define('$', Items.IRON_NUGGET)
			.unlockedBy("has_item", has(Items.IRON_INGOT))
			.save(consumer, location(ModBlocks.IRON_FENCE_GATE.get(), "crafting/"));
		
		ShapedRecipeBuilder.shaped(ModBlocks.NETHER_BRICK_FENCE_GATE.get())
			.pattern("#$#")
			.pattern("#$#")
			.define('#', Blocks.NETHER_BRICKS)
			.define('$', Items.NETHER_BRICK)
			.unlockedBy("has_item", has(Blocks.NETHER_BRICKS))
			.save(consumer, location(ModBlocks.NETHER_BRICK_FENCE_GATE.get(), "crafting/"));
		
		pillarRecipe(Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR.get(), 2);
		
		blockRecipe4x4("polished_end_stone", Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE.get(), 4);
		
		blockRecipe4x4("polished_stone", Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE.get(), 4);
		
		pillarRecipe(Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR.get(), 2);
		wallsRecipe("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL.get(), "");
		
		wallsRecipe("purpur_wall", Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL.get(), "");
		
		slabsRecipe("quartz_brick_slab", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB.get(), "");
		stairsRecipe("quartz_brick_stairs", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS.get(), "");
		wallsRecipe("quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL.get(), "");
		
		ShapedRecipeBuilder.shaped(ModBlocks.SAWMILL.get())
			.pattern(" # ")
			.pattern("$$$")
			.define('#', Items.IRON_INGOT)
			.define('$', ItemTags.PLANKS)
			.unlockedBy("has_item", has(Items.IRON_INGOT))
			.save(consumer, location(ModBlocks.SAWMILL.get(), "crafting/"));
		
		slabsRecipe("smooth_soul_sandstone_slab", ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), "");
		stairsRecipe("smooth_soul_sandstone_stairs", ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(), "");
		
		stairsRecipe("smooth_stone_stairs", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS.get(), "");
		wallsRecipe("smooth_stone_wall", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL.get(), "");
		
		wallsRecipe("glass_window_pane", ModBlocks.GLASS_WINDOW.get(), ModBlocks.GLASS_WINDOW_PANE.get(), "");
		wallsRecipe("soul_glass_window_pane", ModBlocks.SOUL_GLASS_WINDOW.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), "");
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition("horizontalpanes"))
		.addRecipe(ShapelessRecipeBuilder.shapeless(ModBlocks.SOUL_GLASS_PANE.get())
			.requires(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get())
			.unlockedBy("has_item", has(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get()))::save)
			.generateAdvancement()
			.build(consumer, location("soul_glass_pane_from_horizontal_pane", "crafting/"));
		
		ShapedRecipeBuilder.shaped(ModBlocks.SOUL_GLASS_PANE.get(), 16)
			.pattern("###")
			.pattern("###")
			.define('#', ModBlocks.SOUL_GLASS.get())
			.unlockedBy("has_item", has(ModBlocks.SOUL_GLASS.get()))
			.save(consumer, location(ModBlocks.SOUL_GLASS_PANE.get(), "crafting/"));
		wallsRecipe("tinted_glass_window_pane", ModBlocks.TINTED_GLASS_WINDOW.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), "");
		ShapedRecipeBuilder.shaped(ModBlocks.TINTED_GLASS_PANE.get(), 16)
			.pattern("###")
			.pattern("###")
			.define('#', Blocks.TINTED_GLASS)
			.unlockedBy("has_item", has(Blocks.TINTED_GLASS))
			.save(consumer, location(ModBlocks.TINTED_GLASS_PANE.get(), "crafting/"));
		
		Item horizontal_tinted_glass_pane = getItem(new ResourceLocation("horizontalpanes:horizontal_tinted_glass_pane"));
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition("horizontalpanes"))
		.addRecipe(ShapedRecipeBuilder.shaped(horizontal_tinted_glass_pane, 3)
			.pattern("###")
			.define('#', ItemTagsGenerator.TINTED_GLASS_PANES)
			.unlockedBy("has_item", has(ItemTagsGenerator.TINTED_GLASS_PANES))::save)
			.generateAdvancement()
			.build(consumer, location(horizontal_tinted_glass_pane, "crafting/"));
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition("horizontalpanes"))
		.addRecipe(ShapelessRecipeBuilder.shapeless(ModBlocks.TINTED_GLASS_PANE.get())
			.requires(horizontal_tinted_glass_pane)
			.unlockedBy("has_item", has(horizontal_tinted_glass_pane))::save)
			.generateAdvancement()
			.build(consumer, location("tinted_glass_pane_from_horizontal_pane", "crafting/"));
		
		ShapedRecipeBuilder.shaped(ModBlocks.SOUL_SANDSTONE_SLAB.get(), 6)
			.pattern("###")
			.define('#', Ingredient.of(ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get()))
			.unlockedBy("has_soul_sandstone", has(ModBlocks.SOUL_SANDSTONE.get()))
			.unlockedBy("has_chiseled_soul_sandstone", has(ModBlocks.CHISELED_SOUL_SANDSTONE.get()))
			.save(consumer, location("soul_sandstone_slab", "crafting/"));
		ShapedRecipeBuilder.shaped(ModBlocks.SOUL_SANDSTONE_STAIRS.get(), 4)
			.pattern("#  ")
			.pattern("## ")
			.pattern("###")
			.define('#', Ingredient.of(ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get()))
			.unlockedBy("has_soul_sandstone", has(ModBlocks.SOUL_SANDSTONE.get()))
			.unlockedBy("has_chiseled_soul_sandstone", has(ModBlocks.CHISELED_SOUL_SANDSTONE.get()))
			.unlockedBy("has_cut_soul_sandstone", has(ModBlocks.CUT_SOUL_SANDSTONE.get()))
			.save(consumer, location("soul_sandstone_stairs", "crafting/"));
		wallsRecipe("soul_sandstone_wall", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_WALL.get(), "");
		blockRecipe4x4("soul_sandstone", Blocks.SOUL_SAND, ModBlocks.SOUL_SANDSTONE.get(), 1);
		
		slabsRecipe("terracotta_slab", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB.get(), "");
		stairsRecipe("terracotta_stairs", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS.get(), "");
		
		ShapedRecipeBuilder.shaped(ModBlocks.WEAVER.get())
			.pattern("#~#")
			.pattern("#~#")
			.pattern("$ $")
			.define('#', Items.STICK)
			.define('~', Items.STRING)
			.define('$', ItemTags.PLANKS)
			.unlockedBy("has_item", has(Items.STRING))
			.save(consumer, location(ModBlocks.WEAVER.get(), "crafting/"));
		
		slabsRecipe("calcite_slab", Blocks.CALCITE, ModBlocks.CALCITE_SLAB.get(), "");
		stairsRecipe("calcite_stairs", Blocks.CALCITE, ModBlocks.CALCITE_STAIRS.get(), "");
		wallsRecipe("calcite_wall", Blocks.CALCITE, ModBlocks.CALCITE_WALL.get(), "");
		
		slabsRecipe("tuff_slab", Blocks.TUFF, ModBlocks.TUFF_SLAB.get(), "");
		stairsRecipe("tuff_stairs", Blocks.TUFF, ModBlocks.TUFF_STAIRS.get(), "");
		wallsRecipe("tuff_wall", Blocks.TUFF, ModBlocks.TUFF_WALL.get(), "");
		
		slabsRecipe("raw_iron_slab", Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_SLAB.get(), "");
		stairsRecipe("raw_iron_stairs", Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_STAIRS.get(), "");
		
		slabsRecipe("raw_gold_slab", Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_SLAB.get(), "");
		stairsRecipe("raw_gold_stairs", Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_STAIRS.get(), "");
		
		slabsRecipe("raw_copper_slab", Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_SLAB.get(), "");
		stairsRecipe("raw_copper_stairs", Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_STAIRS.get(), "");
	}
	
	private void vanillaColoredRecipes() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item dye = getItem(MCRL(color + "_dye"));
			
			// Concrete
			String blockKind = "_concrete";
			String block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(modRL(block + "_slab")), "concrete_slabs");
			recolorObject(ItemTagsGenerator.CONCRETE_SLABS, getItem(modRL(block + "_slab")), color, "recolor_concrete_slabs");
			stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(modRL(block + "_stairs")), "concrete_stairs");
			recolorObject(ItemTagsGenerator.CONCRETE_STAIRS, getItem(modRL(block + "_stairs")), color, "recolor_concrete_stairs");
			
			// Stained Bricks
			blockKind = "_stained_brick";
			block = color + blockKind + "s";
			slabsRecipe(color + blockKind + "_slab", getItem(modRL(block)), getItem(modRL(color + blockKind + "_slab")), "stained_brick_slabs");
			recolorObject(ItemTagsGenerator.CLAY_BRICK_SLABS, getItem(modRL(color + blockKind + "_slab")), color, "recolor_stained_brick_slabs");
			stairsRecipe(color + blockKind + "_stairs", getItem(modRL(block)), getItem(modRL(color + blockKind + "_stairs")), "stained_brick_stairs");
			recolorObject(ItemTagsGenerator.CLAY_BRICK_STAIRS, getItem(modRL(color + blockKind + "_stairs")), color, "recolor_stained_brick_stairs");
			wallsRecipe(color + blockKind + "_wall", getItem(modRL(block)), getItem(modRL(color + blockKind + "_wall")), "stained_brick_walls");
			recolorObject(ItemTagsGenerator.CLAY_BRICK_WALLS, getItem(modRL(color + blockKind + "_wall")), color, "recolor_stained_brick_walls");
			recolorObject(ItemTagsGenerator.CLAY_BRICKS, getItem(modRL(block)), color, "recolor_stained_bricks");
			
			// Stained Glass
			blockKind = "_stained_glass";
			block = color + blockKind;
			recolorObject(ItemTagsGenerator.GLASS_SLABS, getItem(modRL(block + "_slab")), color, "recolor_stained_glass_slabs");
			recolorObject(ItemTagsGenerator.GLASS_STAIRS, getItem(modRL(block + "_stairs")), color, "recolor_stained_glass_stairs");
			wallsRecipe(block + "_window_pane", getItem(modRL(block + "_window")), getItem(modRL(block + "_window_pane")), "stained_glass_window_panes");
			recolorObject(ItemTagsGenerator.GLASS_WINDOWS, getItem(modRL(block + "_window")), color, "recolor_stained_glass_windows");
			recolorObject(ItemTagsGenerator.GLASS_WINDOW_PANES, getItem(modRL(block + "_window_pane")), color, "recolor_stained_glass_window_panes");
			
			// Stained Planks
			blockKind = "_stained_plank";
			block = color + blockKind + "s";
			slabsRecipe(color + blockKind + "_slab", getItem(modRL(block)), getItem(modRL(color + blockKind + "_slab")), "stained_plank_slabs");
			recolorObject(ItemTags.WOODEN_SLABS, getItem(modRL(color + blockKind + "_slab")), color, "recolor_stained_plank_slabs");
			stairsRecipe(color + blockKind + "_stairs", getItem(modRL(block)), getItem(modRL(color + blockKind + "_stairs")), "stained_plank_stairs");
			recolorObject(ItemTags.WOODEN_STAIRS, getItem(modRL(color + blockKind + "_stairs")), color, "recolor_stained_plank_stairs");
			recolorObject(ItemTags.PLANKS, getItem(modRL(block)), color, "recolor_stained_planks");
			
			// Terracotta
			blockKind = "_terracotta";
			block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(modRL(block + "_slab")), "colored_tarracotta_slabs");
			recolorObject(ItemTagsGenerator.TERRACOTTA_SLABS, getItem(modRL(block + "_slab")), color, "recolored_tarracotta_slabs");
			stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(modRL(block + "_stairs")), "colored_tarracotta_stairs");
			recolorObject(ItemTagsGenerator.TERRACOTTA_STAIRS, getItem(modRL(block + "_stairs")), color, "recolored_tarracotta_stairs");
			
			// Wool
			blockKind = "_wool";
			block = color + blockKind;
			slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(modRL(block + "_slab")), "wool_slabs");
			recolorObject(ItemTagsGenerator.WOOL_SLABS, getItem(modRL(block + "_slab")), color, "recolor_wool_slabs");
			stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(modRL(block + "_stairs")), "wool_stairs");
			recolorObject(ItemTagsGenerator.WOOL_STAIRS, getItem(modRL(block + "_stairs")), color, "recolor_wool_stairs");
			
			// Redstone Lamps
			String name = color + "_redstone_lamp";
			ShapelessRecipeBuilder.shapeless(getItem(modRL(name)))
				.requires(ItemTagsGenerator.REDSTONE_LAMPS)
				.requires(dye)
				.group("redstone_lamp")
				.unlockedBy("has_item", has(ItemTagsGenerator.REDSTONE_LAMPS))
				.save(consumer, location(name, "crafting/"));
		}
	}
	
	private void stoneBrickTypeRecipes() {
		String[] stoneTypes = {"andesite", "diorite", "granite"};
		for (int i = 0; i < stoneTypes.length; i++) {
			String type = stoneTypes[i] + "_brick";
			String block = type + "s";
			slabsRecipe(type + "_slab", getItem(modRL(block)), getItem(modRL(type + "_slab")), "");
			slabsRecipe(type + "_stairs", getItem(modRL(block)), getItem(modRL(type + "_stairs")), "");
			slabsRecipe(type + "_wall", getItem(modRL(block)), getItem(modRL(type + "_wall")), "");
			blockRecipe4x4(block, getItem(MCRL("polished_" + stoneTypes[i])), getItem(modRL(block)), 4);
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored crafting recipes";
	}
}
