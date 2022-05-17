package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;

public class StonecuttingRecipesGenerator extends RecipeResources {

	public StonecuttingRecipesGenerator(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			
			String type = color + "_concrete";
			stonecuttingRecipe(type + "_slab", getItem(MCRL(type)), getItem(modRL(type + "_slab")), 2);
			stonecuttingRecipe(type + "_stairs", getItem(MCRL(type)), getItem(modRL(type + "_stairs")));
			
			type = color + "_stained_brick";
			stonecuttingRecipe(type + "_slab", getItem(modRL(type + "s")), getItem(modRL(type + "_slab")), 2);
			stonecuttingRecipe(type + "_stairs", getItem(modRL(type + "s")), getItem(modRL(type + "_stairs")));
			stonecuttingRecipe(type + "_wall", getItem(modRL(type + "s")), getItem(modRL(type + "_wall")));
			
			type = color + "_terracotta";
			stonecuttingRecipe(type + "_slab", getItem(MCRL(type)), getItem(modRL(type + "_slab")), 2);
			stonecuttingRecipe(type + "_stairs", getItem(MCRL(type)), getItem(modRL(type + "_stairs")));
		}
		
		String[] stoneTypes = {"andesite", "diorite", "granite"};
		for (int i = 0; i < stoneTypes.length; i++) {
			String type = stoneTypes[i];
			
			stonecuttingRecipe(type + "_bricks", getItem(MCRL(type)), getItem(modRL(type + "_bricks")));
			stonecuttingRecipe(type + "_bricks_from_polished", getItem(MCRL("polished_" + type)), getItem(modRL(type + "_bricks")));
			stonecuttingRecipe(type + "_brick_slab", getItem(MCRL(type)), getItem(modRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(type + "_brick_slab_from_polished", getItem(MCRL("polished_" + type)), getItem(modRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(type + "_brick_slab_from_bricks", getItem(modRL(type + "_bricks")), getItem(modRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(type + "_brick_stairs", getItem(MCRL(type)), getItem(modRL(type + "_brick_stairs")));
			stonecuttingRecipe(type + "_brick_stairs_from_polished", getItem(MCRL("polished_" + type)), getItem(modRL(type + "_brick_stairs")));
			stonecuttingRecipe(type + "_brick_stairs_from_bricks", getItem(modRL(type + "_bricks")), getItem(modRL(type + "_brick_stairs")));
			stonecuttingRecipe(type + "_brick_wall", getItem(MCRL(type)), getItem(modRL(type + "_brick_wall")));
			stonecuttingRecipe(type + "_brick_wall_from_polished", getItem(MCRL("polished_" + type)), getItem(modRL(type + "_brick_wall")));
			stonecuttingRecipe(type + "_brick_wall_from_bricks", getItem(modRL(type + "_bricks")), getItem(modRL(type + "_brick_wall")));
		}
		
		stonecuttingRecipe("chiseled_end_stone_bricks", Blocks.END_STONE, ModBlocks.CHISELED_END_STONE_BRICKS.get());
		stonecuttingRecipe("chiseled_end_stone_bricks_from_end_stone_bricks", Blocks.END_STONE_BRICKS, ModBlocks.CHISELED_END_STONE_BRICKS.get());
		stonecuttingRecipe("chiseled_prismarine_bricks", Blocks.PRISMARINE_BRICKS, ModBlocks.CHISELED_PRISMARINE_BRICKS.get());
		stonecuttingRecipe("chiseled_soul_sandstone", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get());
		stonecuttingRecipe("cut_soul_sandstone_slab", ModBlocks.CUT_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), 2);
		stonecuttingRecipe("cut_soul_sandstone_slab_from_soul_sandstone", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), 2);
		stonecuttingRecipe("cut_soul_sandstone", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get());
		stonecuttingRecipe("dark_prismarine_wall", Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL.get());
		stonecuttingRecipe("end_stone_brick_pillar", Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR.get());
		stonecuttingRecipe("end_stone_brick_pillar_from_end_stone", Blocks.END_STONE, ModBlocks.END_STONE_BRICK_PILLAR.get());
		stonecuttingRecipe("polished_blackstone_pillar", Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR.get());
		stonecuttingRecipe("polished_end_stone", Blocks.END_STONE, ModBlocks.POLISHED_END_STONE.get());
		stonecuttingRecipe("polished_end_stone_from_end_stone_bricks", Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE.get());
		stonecuttingRecipe("polished_stone", Blocks.STONE, ModBlocks.POLISHED_STONE.get());
		stonecuttingRecipe("polished_stone_from_bricks", Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE.get());
		stonecuttingRecipe("prismarine_brick_pillar", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR.get());
		stonecuttingRecipe("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL.get());
		stonecuttingRecipe("purpur_wall", Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL.get());
		stonecuttingRecipe("quartz_brick_slab", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB.get());
		stonecuttingRecipe("quartz_brick_stairs", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS.get());
		stonecuttingRecipe("quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL.get());
		stonecuttingRecipe("smooth_soul_sandstone_slab", ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), 2);
		stonecuttingRecipe("smooth_soul_sandstone_stairs", ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get());
		stonecuttingRecipe("smooth_stone_stairs", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS.get());
		stonecuttingRecipe("smooth_stone_wall", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL.get());
		stonecuttingRecipe("soul_sandstone_slab", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_SLAB.get(), 2);
		stonecuttingRecipe("soul_sandstone_stairs", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_STAIRS.get());
		stonecuttingRecipe("soul_sandstone_wall", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_WALL.get());
		stonecuttingRecipe("terracotta_slab", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB.get(), 2);
		stonecuttingRecipe("terracotta_stairs", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS.get());
		stonecuttingRecipe("calcite_slab", Blocks.CALCITE, ModBlocks.CALCITE_SLAB.get(), 2);
		stonecuttingRecipe("calcite_stairs", Blocks.CALCITE, ModBlocks.CALCITE_STAIRS.get());
		stonecuttingRecipe("calcite_wall", Blocks.CALCITE, ModBlocks.CALCITE_WALL.get());
		stonecuttingRecipe("tuff_slab", Blocks.TUFF, ModBlocks.TUFF_SLAB.get(), 2);
		stonecuttingRecipe("tuff_stairs", Blocks.TUFF, ModBlocks.TUFF_STAIRS.get());
		stonecuttingRecipe("tuff_wall", Blocks.TUFF, ModBlocks.TUFF_WALL.get());
		stonecuttingRecipe("raw_iron_slab", Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_SLAB.get(), 2);
		stonecuttingRecipe("raw_iron_stairs", Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_STAIRS.get());
		stonecuttingRecipe("raw_gold_slab", Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_SLAB.get(), 2);
		stonecuttingRecipe("raw_gold_stairs", Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_STAIRS.get());
		stonecuttingRecipe("raw_copper_slab", Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_SLAB.get(), 2);
		stonecuttingRecipe("raw_copper_stairs", Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_STAIRS.get());
		stonecuttingRecipe("obsidian_bricks", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICKS.get());
		stonecuttingRecipe("obsidian_brick_stairs", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_STAIRS.get());
		stonecuttingRecipe("obsidian_brick_stairs_from_bricks", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_STAIRS.get());
		stonecuttingRecipe("obsidian_brick_slab", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_SLAB.get(), 2);
		stonecuttingRecipe("obsidian_brick_slab_from_bricks", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_SLAB.get(), 2);
		stonecuttingRecipe("obsidian_brick_pillar", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
		stonecuttingRecipe("obsidian_brick_pillar_from_bricks", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
		stonecuttingRecipe("obsidian_brick_wall", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_WALL.get());
		stonecuttingRecipe("obsidian_brick_wall_from_bricks", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get());
	}
	
	@Override
	public String getName() {
		return "CutAndColored stonecutting recipes";
	}
}