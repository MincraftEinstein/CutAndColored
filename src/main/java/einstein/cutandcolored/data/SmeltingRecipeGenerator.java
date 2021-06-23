package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;

public class SmeltingRecipeGenerator extends RecipeResources {

	public SmeltingRecipeGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		smeltingRecipe(consumer, Blocks.SOUL_SAND, ModBlocks.SOUL_GLASS, 0.3F, 300);
		smeltingRecipe(consumer, ModBlocks.SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE, 0.3F, 300);
		
		smeltingRecipe(consumer, Blocks.STONE_BRICK_SLAB, ModBlocks.CRACKED_STONE_BRICK_SLAB, 0.1F, 200);
		smeltingRecipe(consumer, Blocks.STONE_BRICK_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, 0.1F, 200);
		smeltingRecipe(consumer, Blocks.STONE_BRICK_WALL, ModBlocks.CRACKED_STONE_BRICK_WALL, 0.1F, 200);
		
		smeltingRecipe(consumer, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, 0.1F, 200);
		smeltingRecipe(consumer, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, 0.1F, 200);
		smeltingRecipe(consumer, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, 0.1F, 200);
		
		smeltingRecipe(consumer, Blocks.NETHER_BRICK_SLAB, ModBlocks.CRACKED_NETHER_BRICK_SLAB, 0.1F, 200);
		smeltingRecipe(consumer, Blocks.NETHER_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, 0.1F, 200);
		smeltingRecipe(consumer, Blocks.NETHER_BRICK_WALL, ModBlocks.CRACKED_NETHER_BRICK_WALL, 0.1F, 200);

	}
	
	@Override
	public String getName() {
		return "CutAndColored smelting recipes";
	}
}
