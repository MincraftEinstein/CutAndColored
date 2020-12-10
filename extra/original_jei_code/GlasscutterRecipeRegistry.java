/*package einstein.cutandcolored.jei;

import einstein.cutandcolored.init.ModBlocks;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;

public class GlasscutterRecipeRegistry {

	public static void registerRecipes(IRecipeRegistration registration) {
		// Slabs
		addGlasscuttingRecipe(registration, Blocks.GLASS, ModBlocks.GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.WHITE_STAINED_GLASS, ModBlocks.WHITE_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.ORANGE_STAINED_GLASS, ModBlocks.ORANGE_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.MAGENTA_STAINED_GLASS, ModBlocks.MAGENTA_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.LIGHT_BLUE_STAINED_GLASS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.YELLOW_STAINED_GLASS, ModBlocks.YELLOW_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.LIME_STAINED_GLASS, ModBlocks.LIME_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.PINK_STAINED_GLASS, ModBlocks.PINK_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.GRAY_STAINED_GLASS, ModBlocks.GRAY_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.LIGHT_GRAY_STAINED_GLASS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.CYAN_STAINED_GLASS, ModBlocks.CYAN_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.PURPLE_STAINED_GLASS, ModBlocks.PURPLE_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.BLUE_STAINED_GLASS, ModBlocks.BLUE_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.BROWN_STAINED_GLASS, ModBlocks.BROWN_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.GREEN_STAINED_GLASS, ModBlocks.GREEN_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.RED_STAINED_GLASS, ModBlocks.RED_STAINED_GLASS_SLAB, 2);
		addGlasscuttingRecipe(registration, Blocks.BLACK_STAINED_GLASS, ModBlocks.BLACK_STAINED_GLASS_SLAB, 2);
		// Stairs
		addGlasscuttingRecipe(registration, Blocks.GLASS, ModBlocks.GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.WHITE_STAINED_GLASS, ModBlocks.WHITE_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.ORANGE_STAINED_GLASS, ModBlocks.ORANGE_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.MAGENTA_STAINED_GLASS, ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.LIGHT_BLUE_STAINED_GLASS, ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.YELLOW_STAINED_GLASS, ModBlocks.YELLOW_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.LIME_STAINED_GLASS, ModBlocks.LIME_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.PINK_STAINED_GLASS, ModBlocks.PINK_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.GRAY_STAINED_GLASS, ModBlocks.GRAY_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.LIGHT_GRAY_STAINED_GLASS, ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.CYAN_STAINED_GLASS, ModBlocks.CYAN_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.PURPLE_STAINED_GLASS, ModBlocks.PURPLE_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.BLUE_STAINED_GLASS, ModBlocks.BLUE_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.BROWN_STAINED_GLASS, ModBlocks.BROWN_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.GREEN_STAINED_GLASS, ModBlocks.GREEN_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.RED_STAINED_GLASS, ModBlocks.RED_STAINED_GLASS_STAIRS, 1);
		addGlasscuttingRecipe(registration, Blocks.BLACK_STAINED_GLASS, ModBlocks.BLACK_STAINED_GLASS_STAIRS, 1);
		// Panes
		addGlasscuttingRecipe(registration, Blocks.GLASS, Blocks.GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.WHITE_STAINED_GLASS, Blocks.WHITE_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.ORANGE_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.MAGENTA_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.YELLOW_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.LIME_STAINED_GLASS, Blocks.LIME_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.PINK_STAINED_GLASS, Blocks.PINK_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.GRAY_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.LIGHT_GRAY_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.CYAN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.PURPLE_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.BLUE_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.BROWN_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.GREEN_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.RED_STAINED_GLASS, Blocks.RED_STAINED_GLASS_PANE, 4);
		addGlasscuttingRecipe(registration, Blocks.BLACK_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS_PANE, 4);
		// Other
		addGlasscuttingRecipe(registration, Blocks.GLASS, Items.GLASS_BOTTLE, 1);

	}

	public static void addGlasscuttingRecipe(IRecipeRegistration registration, IItemProvider intput, IItemProvider output, int count) {
		registration.addRecipes(JEIPlugin.recipeBase(intput, output, count), GlasscutterCategory.Uid);
	}
	
}*/
