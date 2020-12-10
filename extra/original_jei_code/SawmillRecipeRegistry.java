/*package einstein.cutandcolored.jei;

import einstein.cutandcolored.init.ModBlocks;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;

public class SawmillRecipeRegistry {

	public static void registerRecipes(IRecipeRegistration registration) {
		// Stripped Logs
		addSawmillingRecipe(registration, Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG, 1);
		addSawmillingRecipe(registration, Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG, 1);
		// Stripped Wood
		addSawmillingRecipe(registration, Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD, 1);
		addSawmillingRecipe(registration, Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD, 1);
		// Planks Form Logs
		addSawmillingRecipe(registration, Blocks.ACACIA_LOG, Blocks.ACACIA_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.BIRCH_LOG, Blocks.BIRCH_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.JUNGLE_LOG, Blocks.JUNGLE_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.OAK_LOG, Blocks.OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.SPRUCE_LOG, Blocks.SPRUCE_PLANKS, 4);
		// Planks Form Wood
		addSawmillingRecipe(registration, Blocks.ACACIA_WOOD, Blocks.ACACIA_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.BIRCH_WOOD, Blocks.BIRCH_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.JUNGLE_WOOD, Blocks.JUNGLE_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.OAK_WOOD, Blocks.OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.SPRUCE_WOOD, Blocks.SPRUCE_PLANKS, 4);
		// Planks Form Stripped Logs
		addSawmillingRecipe(registration, Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_OAK_LOG, Blocks.OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_PLANKS, 4);
		// Planks Form Stripped Wood
		addSawmillingRecipe(registration, Blocks.STRIPPED_ACACIA_WOOD, Blocks.ACACIA_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_BIRCH_WOOD, Blocks.BIRCH_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.DARK_OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_JUNGLE_WOOD, Blocks.JUNGLE_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_OAK_WOOD, Blocks.OAK_PLANKS, 4);
		addSawmillingRecipe(registration, Blocks.STRIPPED_SPRUCE_WOOD, Blocks.SPRUCE_PLANKS, 4);
		// Slabs
		addSawmillingRecipe(registration, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, 2);
		addSawmillingRecipe(registration, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, 2);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, 2);
		addSawmillingRecipe(registration, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, 2);
		addSawmillingRecipe(registration, Blocks.OAK_PLANKS, Blocks.OAK_SLAB, 2);
		addSawmillingRecipe(registration, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.WHITE_STAINED_PLANKS, ModBlocks.WHITE_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.ORANGE_STAINED_PLANKS, ModBlocks.ORANGE_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.MAGENTA_STAINED_PLANKS, ModBlocks.MAGENTA_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.LIGHT_BLUE_STAINED_PLANKS, ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.YELLOW_STAINED_PLANKS, ModBlocks.YELLOW_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.LIME_STAINED_PLANKS, ModBlocks.LIME_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.PINK_STAINED_PLANKS, ModBlocks.PINK_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.GRAY_STAINED_PLANKS, ModBlocks.GRAY_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.LIGHT_GRAY_STAINED_PLANKS, ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.CYAN_STAINED_PLANKS, ModBlocks.CYAN_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.PURPLE_STAINED_PLANKS, ModBlocks.PURPLE_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.BLUE_STAINED_PLANKS, ModBlocks.BLUE_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.BROWN_STAINED_PLANKS, ModBlocks.BROWN_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.GREEN_STAINED_PLANKS, ModBlocks.GREEN_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.RED_STAINED_PLANKS, ModBlocks.RED_STAINED_PLANK_SLAB, 2);
		addSawmillingRecipe(registration, ModBlocks.BLACK_STAINED_PLANKS, ModBlocks.BLACK_STAINED_PLANK_SLAB, 2);
		// Stairs
		addSawmillingRecipe(registration, Blocks.ACACIA_PLANKS, Blocks.ACACIA_STAIRS, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_PLANKS, Blocks.BIRCH_STAIRS, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_STAIRS, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_STAIRS, 1);
		addSawmillingRecipe(registration, Blocks.OAK_PLANKS, Blocks.OAK_STAIRS, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.WHITE_STAINED_PLANKS, ModBlocks.WHITE_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.ORANGE_STAINED_PLANKS, ModBlocks.ORANGE_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.MAGENTA_STAINED_PLANKS, ModBlocks.MAGENTA_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.LIGHT_BLUE_STAINED_PLANKS, ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.YELLOW_STAINED_PLANKS, ModBlocks.YELLOW_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.LIME_STAINED_PLANKS, ModBlocks.LIME_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.PINK_STAINED_PLANKS, ModBlocks.PINK_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.GRAY_STAINED_PLANKS, ModBlocks.GRAY_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.LIGHT_GRAY_STAINED_PLANKS, ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.CYAN_STAINED_PLANKS, ModBlocks.CYAN_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.PURPLE_STAINED_PLANKS, ModBlocks.PURPLE_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.BLUE_STAINED_PLANKS, ModBlocks.BLUE_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.BROWN_STAINED_PLANKS, ModBlocks.BROWN_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.GREEN_STAINED_PLANKS, ModBlocks.GREEN_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.RED_STAINED_PLANKS, ModBlocks.RED_STAINED_PLANK_STAIRS, 1);
		addSawmillingRecipe(registration, ModBlocks.BLACK_STAINED_PLANKS, ModBlocks.BLACK_STAINED_PLANK_STAIRS, 1);
		// Fences
		addSawmillingRecipe(registration, Blocks.ACACIA_PLANKS, Blocks.ACACIA_FENCE, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_PLANKS, Blocks.BIRCH_FENCE, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_FENCE, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_FENCE, 1);
		addSawmillingRecipe(registration, Blocks.OAK_PLANKS, Blocks.OAK_FENCE, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_FENCE, 1);
		// Fence Gates
		addSawmillingRecipe(registration, Blocks.ACACIA_PLANKS, Blocks.ACACIA_FENCE_GATE, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_PLANKS, Blocks.BIRCH_FENCE_GATE, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_FENCE_GATE, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_FENCE_GATE, 1);
		addSawmillingRecipe(registration, Blocks.OAK_PLANKS, Blocks.OAK_FENCE_GATE, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_FENCE_GATE, 1);
		// Trapdoors
		addSawmillingRecipe(registration, Blocks.ACACIA_PLANKS, Blocks.ACACIA_TRAPDOOR, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_PLANKS, Blocks.BIRCH_TRAPDOOR, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_TRAPDOOR, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_TRAPDOOR, 1);
		addSawmillingRecipe(registration, Blocks.OAK_PLANKS, Blocks.OAK_TRAPDOOR, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_TRAPDOOR, 1);
		// Signs
		addSawmillingRecipe(registration, Blocks.ACACIA_PLANKS, Items.ACACIA_SIGN, 1);
		addSawmillingRecipe(registration, Blocks.BIRCH_PLANKS, Items.BIRCH_SIGN, 1);
		addSawmillingRecipe(registration, Blocks.DARK_OAK_PLANKS, Items.DARK_OAK_SIGN, 1);
		addSawmillingRecipe(registration, Blocks.JUNGLE_PLANKS, Items.JUNGLE_SIGN, 1);
		addSawmillingRecipe(registration, Blocks.OAK_PLANKS, Items.OAK_SIGN, 1);
		addSawmillingRecipe(registration, Blocks.SPRUCE_PLANKS, Items.SPRUCE_SIGN, 1);
		
	}

	public static void addSawmillingRecipe(IRecipeRegistration registration, IItemProvider intput, IItemProvider output, int count) {
		registration.addRecipes(JEIPlugin.recipeBase(intput, output, count), SawmillCategory.Uid);
	}
	
}
*/