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
		vanillaColoredRecipes();
//		flamboyantColoredRecipes();
		stoneBrickTypeRecipes();
		
		stonecuttingRecipe("chiseled_end_stone_bricks", Blocks.END_STONE, ModBlocks.CHISELED_END_STONE_BRICKS);
		stonecuttingRecipe("chiseled_end_stone_bricks_from_end_stone_bricks", Blocks.END_STONE_BRICKS, ModBlocks.CHISELED_END_STONE_BRICKS);
		stonecuttingRecipe("chiseled_prismarine_bricks", Blocks.PRISMARINE_BRICKS, ModBlocks.CHISELED_PRISMARINE_BRICKS);
		stonecuttingRecipe("chiseled_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CHISELED_SOUL_SANDSTONE);
		stonecuttingRecipe("cut_soul_sandstone_slab", ModBlocks.CUT_SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe("cut_soul_sandstone_slab_from_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe("cut_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE);
		stonecuttingRecipe("dark_prismarine_wall", Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL);
		stonecuttingRecipe("end_stone_brick_pillar", Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR);
		stonecuttingRecipe("end_stone_brick_pillar_from_end_stone", Blocks.END_STONE, ModBlocks.END_STONE_BRICK_PILLAR);
		stonecuttingRecipe("polished_blackstone_pillar", Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR);
		stonecuttingRecipe("polished_end_stone", Blocks.END_STONE, ModBlocks.POLISHED_END_STONE);
		stonecuttingRecipe("polished_end_stone_from_end_stone_bricks", Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);
		stonecuttingRecipe("polished_stone", Blocks.STONE, ModBlocks.POLISHED_STONE);
		stonecuttingRecipe("polished_stone_from_bricks", Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE);
		stonecuttingRecipe("prismarine_brick_pillar", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR);
		stonecuttingRecipe("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL);
		stonecuttingRecipe("purpur_wall", Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL);
		stonecuttingRecipe("quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL);
		stonecuttingRecipe("smooth_soul_sandstone_slab", ModBlocks.SMOOTH_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe("smooth_soul_sandstone_stairs", ModBlocks.SMOOTH_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
		stonecuttingRecipe("smooth_stone_stairs", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS);
		stonecuttingRecipe("smooth_stone_wall", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL);
		stonecuttingRecipe("soul_sandstone_slab", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe("soul_sandstone_stairs", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_STAIR);
		stonecuttingRecipe("soul_sandstone_wall", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_WALL);
		stonecuttingRecipe("terracotta_slab", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB, 2);
		stonecuttingRecipe("terracotta_stairs", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS);
	}
	
	private void vanillaColoredRecipes() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			
			String type = color + "_concrete";
			stonecuttingRecipe(type + "_slab", getItem(MCRL(type)), getItem(ModRL(type + "_slab")), 2);
			stonecuttingRecipe(type + "_stairs", getItem(MCRL(type)), getItem(ModRL(type + "_stairs")));
			
			type = color + "_stained_brick";
			stonecuttingRecipe(type + "_slab", getItem(ModRL(type + "s")), getItem(ModRL(type + "_slab")), 2);
			stonecuttingRecipe(type + "_stairs", getItem(ModRL(type + "s")), getItem(ModRL(type + "_stairs")));
			stonecuttingRecipe(type + "_wall", getItem(ModRL(type + "s")), getItem(ModRL(type + "_wall")));
			
			type = color + "_terracotta";
			stonecuttingRecipe(type + "_slab", getItem(MCRL(type)), getItem(ModRL(type + "_slab")), 2);
			stonecuttingRecipe(type + "_stairs", getItem(MCRL(type)), getItem(ModRL(type + "_stairs")));
		}
	}
	
//	private void flamboyantColoredRecipes() {
//		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
//			String color = FlamboyantDyeColors.byId(i).getName();
//			
//			String type = color + "_concrete";
//			stonecuttingRecipe(type + "_slab", getItem(FRL(type)), getItem(ModRL(type + "_slab")), 2, CutAndColored.FMODID);
//			stonecuttingRecipe(type + "_stairs", getItem(FRL(type)), getItem(ModRL(type + "_stairs")), 1, CutAndColored.FMODID);
//			
//			type = color + "_stained_brick";
//			stonecuttingRecipe(type + "_slab", getItem(ModRL(type + "s")), getItem(ModRL(type + "_slab")), 2);
//			stonecuttingRecipe(type + "_stairs", getItem(ModRL(type + "s")), getItem(ModRL(type + "_stairs")), 1);
//			stonecuttingRecipe(type + "_wall", getItem(ModRL(type + "s")), getItem(ModRL(type + "_wall")), 1);
//			
//			type = color + "_terracotta";
//			stonecuttingRecipe(type + "_slab", getItem(FRL(type)), getItem(ModRL(type + "_slab")), 2, CutAndColored.FMODID);
//			stonecuttingRecipe(type + "_stairs", getItem(FRL(type)), getItem(ModRL(type + "_stairs")), 1, CutAndColored.FMODID);
//		}
//	}
	
	private void stoneBrickTypeRecipes() {
		String[] stoneTypes = {"andesite", "diorite", "granite"};
		for (int i = 0; i < stoneTypes.length; i++) {
			String type = stoneTypes[i];
			
			stonecuttingRecipe(type + "_bricks", getItem(MCRL(type)), getItem(ModRL(type + "_bricks")));
			stonecuttingRecipe(type + "_bricks_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_bricks")));
			stonecuttingRecipe(type + "_brick_slab", getItem(MCRL(type)), getItem(ModRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(type + "_brick_slab_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(type + "_brick_slab_from_bricks", getItem(ModRL(type + "_bricks")), getItem(ModRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(type + "_brick_stairs", getItem(MCRL(type)), getItem(ModRL(type + "_brick_stairs")));
			stonecuttingRecipe(type + "_brick_stairs_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_brick_stairs")));
			stonecuttingRecipe(type + "_brick_stairs_from_bricks", getItem(ModRL(type + "_bricks")), getItem(ModRL(type + "_brick_stairs")));
			stonecuttingRecipe(type + "_brick_wall", getItem(MCRL(type)), getItem(ModRL(type + "_brick_wall")));
			stonecuttingRecipe(type + "_brick_wall_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_brick_wall")));
			stonecuttingRecipe(type + "_brick_wall_from_bricks", getItem(ModRL(type + "_bricks")), getItem(ModRL(type + "_brick_wall")));
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored stonecutting recipes";
	}
}