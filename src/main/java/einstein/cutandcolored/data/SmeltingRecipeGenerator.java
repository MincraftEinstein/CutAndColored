package einstein.cutandcolored.data;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.RecipeResources;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class SmeltingRecipeGenerator extends RecipeResources {

	public SmeltingRecipeGenerator(PackOutput output) {
		super(output);
	}
	
	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.SOUL_SAND, ModBlocks.SOUL_GLASS.get(), 0.3F, 300);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), 0.3F, 300);
		
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ModBlocks.CRACKED_STONE_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_SLAB, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_WALL, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), 0.1F, 200);
	}
}
