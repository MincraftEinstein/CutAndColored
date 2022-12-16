package einstein.cutandcolored.data;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.tags.ItemTagsGenerator;
import einstein.cutandcolored.util.RecipeResources;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class GlasscuttingRecipesGenerator extends RecipeResources {

	public GlasscuttingRecipesGenerator(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item glass = getItem(MCRL(color + "_stained_glass"));
			TagKey<Item> tag = ItemTags.create(new ResourceLocation("forge", "glass/" + color));
			
			Item pane = getItem(MCRL(color + "_stained_glass_pane"));
			glasscuttingRecipe(Util.getItemRegistryName(pane).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, pane, 4);
			
			Item slab = getItem(modRL(color + "_stained_glass_slab"));
			glasscuttingRecipe(Util.getItemRegistryName(slab).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, slab, 2);
			
			Item stairs = getItem(modRL(color + "_stained_glass_stairs"));
			glasscuttingRecipe(Util.getItemRegistryName(stairs).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, stairs);
			
			Item window = getItem(modRL(color + "_stained_glass_window"));
			glasscuttingRecipe(Util.getItemRegistryName(window).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, window);
			
			Item windowPane = getItem(modRL(color + "_stained_glass_window_pane"));
			glasscuttingRecipe(Util.getItemRegistryName(windowPane).getPath() + "_from_glass", RecipeCategory.BUILDING_BLOCKS, tag, windowPane, 4);
			glasscuttingRecipe(Util.getItemRegistryName(windowPane).getPath(), RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(color + "_stained_glass_pane")), windowPane);
		}
		
		glasscuttingRecipe("glass_bottle", RecipeCategory.BUILDING_BLOCKS, Tags.Items.GLASS_COLORLESS, Items.GLASS_BOTTLE);
		glasscuttingRecipe("glass_pane", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, Blocks.GLASS_PANE, 4);
		glasscuttingRecipe("glass_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, ModBlocks.GLASS_SLAB.get(), 2);
		glasscuttingRecipe("glass_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, ModBlocks.GLASS_STAIRS.get());
		glasscuttingRecipe("glass_window", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, ModBlocks.GLASS_WINDOW.get());
		glasscuttingRecipe("glass_window_pane_from_glass", RecipeCategory.BUILDING_BLOCKS, Tags.Items.GLASS_COLORLESS, ModBlocks.GLASS_WINDOW_PANE.get(), 4);
		glasscuttingRecipe("glass_window_pane", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS_PANE, ModBlocks.GLASS_WINDOW_PANE.get());
		
		glasscuttingRecipe("soul_glass_pane", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_PANE.get(), 4);
		glasscuttingRecipe("soul_glass_slab", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_SLAB.get(), 2);
		glasscuttingRecipe("soul_glass_stairs", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_STAIRS.get());
		glasscuttingRecipe("soul_glass_window", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_WINDOW.get());
		glasscuttingRecipe("soul_glass_window_pane_from_glass", RecipeCategory.BUILDING_BLOCKS, ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), 4);
		glasscuttingRecipe("soul_glass_window_pane", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS_PANE.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get());
		
		glasscuttingRecipe("tinted_glass_pane", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_PANE.get(), 4);
		glasscuttingRecipe("tinted_glass_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_SLAB.get(), 2);
		glasscuttingRecipe("tinted_glass_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_STAIRS.get());
		glasscuttingRecipe("tinted_glass_window", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW.get());
		glasscuttingRecipe("tinted_glass_window_pane_from_glass", RecipeCategory.BUILDING_BLOCKS, ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), 4);
		glasscuttingRecipe("tinted_glass_window_pane", RecipeCategory.BUILDING_BLOCKS, ModBlocks.TINTED_GLASS_PANE.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
	}
}
