package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;

public class StonecuttingRecipesGenerator extends RecipeResources {

	public StonecuttingRecipesGenerator(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		vanillaColoredRecipes(consumer);
		flamboyantColoredRecipes(consumer);
		stoneBrickTypeRecipes(consumer);
		
		stonecuttingRecipe(consumer, "chiseled_end_stone_bricks", Blocks.END_STONE, ModBlocks.CHISELED_END_STONE_BRICKS);
		stonecuttingRecipe(consumer, "chiseled_end_stone_bricks_from_end_stone_bricks", Blocks.END_STONE_BRICKS, ModBlocks.CHISELED_END_STONE_BRICKS);
		stonecuttingRecipe(consumer, "chiseled_prismarine_bricks", Blocks.PRISMARINE_BRICKS, ModBlocks.CHISELED_PRISMARINE_BRICKS);
		stonecuttingRecipe(consumer, "chiseled_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CHISELED_SOUL_SANDSTONE);
		stonecuttingRecipe(consumer, "cut_soul_sandstone_slab", ModBlocks.CUT_SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe(consumer, "cut_soul_sandstone_slab_from_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe(consumer, "cut_soul_sandstone", ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE);
		stonecuttingRecipe(consumer, "dark_prismarine_wall", Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL);
		stonecuttingRecipe(consumer, "end_stone_brick_pillar", Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR);
		stonecuttingRecipe(consumer, "end_stone_brick_pillar_from_end_stone", Blocks.END_STONE, ModBlocks.END_STONE_BRICK_PILLAR);
		stonecuttingRecipe(consumer, "polished_blackstone_pillar", Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR);
		stonecuttingRecipe(consumer, "polished_end_stone", Blocks.END_STONE, ModBlocks.POLISHED_END_STONE);
		stonecuttingRecipe(consumer, "polished_end_stone_from_end_stone_bricks", Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);
		stonecuttingRecipe(consumer, "polished_stone", Blocks.STONE, ModBlocks.POLISHED_STONE);
		stonecuttingRecipe(consumer, "polished_stone_from_bricks", Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE);
		stonecuttingRecipe(consumer, "prismarine_brick_pillar", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR);
		stonecuttingRecipe(consumer, "prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL);
		stonecuttingRecipe(consumer, "purpur_wall", Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL);
		stonecuttingRecipe(consumer, "quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL);
		stonecuttingRecipe(consumer, "smooth_soul_sandstone_slab", ModBlocks.SMOOTH_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe(consumer, "smooth_soul_sandstone_stairs", ModBlocks.SMOOTH_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
		stonecuttingRecipe(consumer, "smooth_stone_stairs", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS);
		stonecuttingRecipe(consumer, "smooth_stone_wall", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL);
		stonecuttingRecipe(consumer, "soul_sandstone_slab", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_SLAB, 2);
		stonecuttingRecipe(consumer, "soul_sandstone_stairs", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_STAIR);
		stonecuttingRecipe(consumer, "soul_sandstone_wall", ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_WALL);
		stonecuttingRecipe(consumer, "terracotta_slab", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB, 2);
		stonecuttingRecipe(consumer, "terracotta_stairs", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS);
	}
	
	private void vanillaColoredRecipes(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getTranslationKey();
			
			String type = color + "_concrete";
			stonecuttingRecipe(consumer, type + "_slab", getItem(MCRL(type)), getItem(ModRL(type + "_slab")), 2);
			stonecuttingRecipe(consumer, type + "_stairs", getItem(MCRL(type)), getItem(ModRL(type + "_stairs")));
			
			type = color + "_stained_brick";
			stonecuttingRecipe(consumer, type + "_slab", getItem(ModRL(type + "s")), getItem(ModRL(type + "_slab")), 2);
			stonecuttingRecipe(consumer, type + "_stairs", getItem(ModRL(type + "s")), getItem(ModRL(type + "_stairs")));
			stonecuttingRecipe(consumer, type + "_wall", getItem(ModRL(type + "s")), getItem(ModRL(type + "_wall")));
			
			type = color + "_terracotta";
			stonecuttingRecipe(consumer, type + "_slab", getItem(MCRL(type)), getItem(ModRL(type + "_slab")), 2);
			stonecuttingRecipe(consumer, type + "_stairs", getItem(MCRL(type)), getItem(ModRL(type + "_stairs")));
		}
	}
	
	private void flamboyantColoredRecipes(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			String color = FlamboyantDyeColors.byId(i).getTranslationKey();
			
			String type = color + "_concrete";
			stonecuttingRecipe(consumer, type + "_slab", getItem(FRL(type)), getItem(ModRL(type + "_slab")), 2, CutAndColored.FMODID);
			stonecuttingRecipe(consumer, type + "_stairs", getItem(FRL(type)), getItem(ModRL(type + "_stairs")), 1, CutAndColored.FMODID);
			
			type = color + "_stained_brick";
			stonecuttingRecipe(consumer, type + "_slab", getItem(ModRL(type + "s")), getItem(ModRL(type + "_slab")), 2, CutAndColored.FMODID);
			stonecuttingRecipe(consumer, type + "_stairs", getItem(ModRL(type + "s")), getItem(ModRL(type + "_stairs")), 1, CutAndColored.FMODID);
			stonecuttingRecipe(consumer, type + "_wall", getItem(ModRL(type + "s")), getItem(ModRL(type + "_wall")), 1, CutAndColored.FMODID);
			
			type = color + "_terracotta";
			stonecuttingRecipe(consumer, type + "_slab", getItem(FRL(type)), getItem(ModRL(type + "_slab")), 2, CutAndColored.FMODID);
			stonecuttingRecipe(consumer, type + "_stairs", getItem(FRL(type)), getItem(ModRL(type + "_stairs")), 1, CutAndColored.FMODID);
		}
	}
	
	private void stoneBrickTypeRecipes(Consumer<IFinishedRecipe> consumer) {
		String[] stoneTypes = {"andesite", "diorite", "granite"};
		for (int i = 0; i < stoneTypes.length; i++) {
			String type = stoneTypes[i];
			
			stonecuttingRecipe(consumer, type + "_bricks", getItem(MCRL(type)), getItem(ModRL(type + "_bricks")));
			stonecuttingRecipe(consumer, type + "_bricks_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_bricks")));
			stonecuttingRecipe(consumer, type + "_brick_slab", getItem(MCRL(type)), getItem(ModRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(consumer, type + "_brick_slab_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(consumer, type + "_brick_slab_from_bricks", getItem(ModRL(type + "_bricks")), getItem(ModRL(type + "_brick_slab")), 2);
			stonecuttingRecipe(consumer, type + "_brick_stairs", getItem(MCRL(type)), getItem(ModRL(type + "_brick_stairs")));
			stonecuttingRecipe(consumer, type + "_brick_stairs_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_brick_stairs")));
			stonecuttingRecipe(consumer, type + "_brick_stairs_from_bricks", getItem(ModRL(type + "_bricks")), getItem(ModRL(type + "_brick_stairs")));
			stonecuttingRecipe(consumer, type + "_brick_wall", getItem(MCRL(type)), getItem(ModRL(type + "_brick_wall")));
			stonecuttingRecipe(consumer, type + "_brick_wall_from_polished", getItem(MCRL("polished_" + type)), getItem(ModRL(type + "_brick_wall")));
			stonecuttingRecipe(consumer, type + "_brick_wall_from_bricks", getItem(ModRL(type + "_bricks")), getItem(ModRL(type + "_brick_wall")));
		}
	}
	
	private ResourceLocation ModRL(String string) {
		return new ResourceLocation(CutAndColored.MODID, string);
	}
	
	private ResourceLocation MCRL(String string) {
		return new ResourceLocation(CutAndColored.MCMODID, string);
	}
	
	private ResourceLocation FRL(String string) {
		return new ResourceLocation(CutAndColored.FMODID, string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored stonecutting recipes";
	}
}