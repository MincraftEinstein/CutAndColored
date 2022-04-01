package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Blocks;

public class SmeltingRecipeGenerator extends RecipeResources {

	public SmeltingRecipeGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		smeltingRecipe(Blocks.SOUL_SAND, ModBlocks.SOUL_GLASS.get(), 0.3F, 300);
		smeltingRecipe(ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), 0.3F, 300);
		
		smeltingRecipe(Blocks.STONE_BRICK_SLAB, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(Blocks.STONE_BRICK_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(Blocks.STONE_BRICK_WALL, ModBlocks.CRACKED_STONE_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(Blocks.NETHER_BRICK_SLAB, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(Blocks.NETHER_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(Blocks.NETHER_BRICK_WALL, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), 0.1F, 200);
		smeltingRecipe(Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), 0.1F, 200);
		
		smeltingRecipe(Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), 0.1F, 200);
		smeltingRecipe(Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), 0.1F, 200);
		smeltingRecipe(Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), 0.1F, 200);

	}
	
	@Override
	public String getName() {
		return "CutAndColored smelting recipes";
	}
}
