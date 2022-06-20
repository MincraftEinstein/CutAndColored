package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

public class GlasscuttingRecipesGenerator extends RecipeResources {

	public GlasscuttingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item glass = getItem(MCRL(color + "_stained_glass"));
			TagKey<Item> tag = ItemTags.create(new ResourceLocation("forge", "glass/" + color));
			
			Item pane = getItem(MCRL(color + "_stained_glass_pane"));
			glasscuttingRecipe(Util.getItemRegistryName(pane).getPath(), glass, pane, 4);
			
			Item slab = getItem(modRL(color + "_stained_glass_slab"));
			glasscuttingRecipe(Util.getItemRegistryName(slab).getPath(), glass, slab, 2);
			
			Item stairs = getItem(modRL(color + "_stained_glass_stairs"));
			glasscuttingRecipe(Util.getItemRegistryName(stairs).getPath(), glass, stairs);
			
			Item window = getItem(modRL(color + "_stained_glass_window"));
			glasscuttingRecipe(Util.getItemRegistryName(window).getPath(), glass, window);
			
			Item windowPane = getItem(modRL(color + "_stained_glass_window_pane"));
			glasscuttingRecipe(Util.getItemRegistryName(windowPane).getPath() + "_from_glass", tag, windowPane, 4);
			glasscuttingRecipe(Util.getItemRegistryName(windowPane).getPath(), getItem(MCRL(color + "_stained_glass_pane")), windowPane);
		}
		
		glasscuttingRecipe("glass_bottle", Tags.Items.GLASS_COLORLESS, Items.GLASS_BOTTLE);
		glasscuttingRecipe("glass_pane", Blocks.GLASS, Blocks.GLASS_PANE, 4);
		glasscuttingRecipe("glass_slab", Blocks.GLASS, ModBlocks.GLASS_SLAB.get(), 2);
		glasscuttingRecipe("glass_stairs", Blocks.GLASS, ModBlocks.GLASS_STAIRS.get());
		glasscuttingRecipe("glass_window", Blocks.GLASS, ModBlocks.GLASS_WINDOW.get());
		glasscuttingRecipe("glass_window_pane_from_glass", Tags.Items.GLASS_COLORLESS, ModBlocks.GLASS_WINDOW_PANE.get(), 4);
		glasscuttingRecipe("glass_window_pane", Blocks.GLASS_PANE, ModBlocks.GLASS_WINDOW_PANE.get());
		
		glasscuttingRecipe("soul_glass_pane", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_PANE.get(), 4);
		glasscuttingRecipe("soul_glass_slab", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_SLAB.get(), 2);
		glasscuttingRecipe("soul_glass_stairs", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_STAIRS.get());
		glasscuttingRecipe("soul_glass_window", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_WINDOW.get());
		glasscuttingRecipe("soul_glass_window_pane_from_glass", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), 4);
		glasscuttingRecipe("soul_glass_window_pane", ModBlocks.SOUL_GLASS_PANE.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get());
		
		glasscuttingRecipe("tinted_glass_pane", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_PANE.get(), 4);
		glasscuttingRecipe("tinted_glass_slab", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_SLAB.get(), 2);
		glasscuttingRecipe("tinted_glass_stairs", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_STAIRS.get());
		glasscuttingRecipe("tinted_glass_window", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW.get());
		glasscuttingRecipe("tinted_glass_window_pane_from_glass", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), 4);
		glasscuttingRecipe("tinted_glass_window_pane", ModBlocks.TINTED_GLASS_PANE.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
		
	}
	
	@Override
	public String getName() {
		return "CutAndColored glasscutting recipes";
	}
}
