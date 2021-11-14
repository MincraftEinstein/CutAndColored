package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

public class GlasscuttingRecipesGenerator extends RecipeResources {

	private List<Item> stainedGlass = new ArrayList<Item>();
//	private List<Item> fStainedGlass = new ArrayList<Item>();
	
	public GlasscuttingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		
		vanillaGlass();
		flamboyantGlass();
		
		glasscuttingRecipe("glass_bottle", Tags.Items.GLASS_COLORLESS, Items.GLASS_BOTTLE);
		glasscuttingRecipe("glass_pane", Tags.Items.GLASS_COLORLESS, Blocks.GLASS_PANE, 4);
		glasscuttingRecipe("glass_slab", Tags.Items.GLASS_COLORLESS, ModBlocks.GLASS_SLAB, 2);
		glasscuttingRecipe("glass_stairs", Tags.Items.GLASS_COLORLESS, ModBlocks.GLASS_STAIRS);
		glasscuttingRecipe("horizontal_glass_pane", Tags.Items.GLASS_COLORLESS, getItem(new ResourceLocation("horizontalpanes:horizontal_glass_pane")), 4);
		glasscuttingRecipe("glass_window", Blocks.GLASS, ModBlocks.GLASS_WINDOW);
		glasscuttingRecipe("glass_window_pane_from_glass", Blocks.GLASS, ModBlocks.GLASS_WINDOW_PANE);
		glasscuttingRecipe("glass_window_pane", Blocks.GLASS_PANE, ModBlocks.GLASS_WINDOW_PANE);
		
		glasscuttingRecipe("soul_glass_pane", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_PANE, 4);
		glasscuttingRecipe("soul_glass_slab", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_SLAB, 2);
		glasscuttingRecipe("soul_glass_stairs", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_STAIRS);
		glasscuttingRecipe("horizontal_soul_glass_pane", ModBlocks.SOUL_GLASS, ModBlocks.HORIZONTAL_SOUL_GLASS_PANE, 4, "horizontalpanes");
		glasscuttingRecipe("soul_glass_window", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW);
		glasscuttingRecipe("soul_glass_window_pane_from_glass", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW_PANE);
		glasscuttingRecipe("soul_glass_window_pane", ItemTagsGenerator.SOUL_GLASS_PANES, ModBlocks.SOUL_GLASS_WINDOW_PANE);
		
		glasscuttingRecipe("tinted_glass_pane", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_PANE, 4);
		glasscuttingRecipe("tinted_glass_slab", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_SLAB, 2);
		glasscuttingRecipe("tinted_glass_stairs", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_STAIRS);
		glasscuttingRecipe("horizontal_tinted_glass_pane", Blocks.TINTED_GLASS, getItem(new ResourceLocation("horizontalpanes:horizontal_tinted_glass_pane")), 4);
		glasscuttingRecipe("tinted_glass_window", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW);
		glasscuttingRecipe("tinted_glass_window_pane_from_glass", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW_PANE);
		glasscuttingRecipe("tinted_glass_window_pane", ItemTagsGenerator.TINTED_GLASS_PANES, ModBlocks.TINTED_GLASS_WINDOW_PANE);
		
	}
	
	private void vanillaGlass() {
		for (int i = 0; i < ModBlocks.allMCBlocks.size(); i++) {
			for (int i1 = 0; i1 < DyeColor.values().length; i1++) {
				if (ModBlocks.allMCBlocks.get(i).getRegistryName().getPath().equals(DyeColor.byId(i1).getName() + "_stained_glass")) {
					stainedGlass.add(ModBlocks.allMCBlocks.get(i).asItem());
				}
			}
		}
		for (int i = 0; i < stainedGlass.size(); i++) {
			Item item = stainedGlass.get(i);
			String color = item.getRegistryName().getPath().replaceFirst("_stained_glass", "");
			Tag.Named<Item> tag = ItemTags.bind("forge:glass/" + color);
			
			Item pane = getItem(MCRL(color + "_stained_glass_pane"));
			glasscuttingRecipe(pane.getRegistryName().getPath(), tag, pane, 4);
			
			Item slab = getItem(ModRL(color + "_stained_glass_slab"));
			glasscuttingRecipe(slab.getRegistryName().getPath(), tag, slab, 2);
			
			Item stairs = getItem(ModRL(color + "_stained_glass_stairs"));
			glasscuttingRecipe(stairs.getRegistryName().getPath(), tag, stairs);
			
			Item hPane = getItem(new ResourceLocation("horizontalpanes", "horizontal_stained_" + color + "_pane"));
			glasscuttingRecipe(hPane.getRegistryName().getPath(), tag, hPane, 4);
			
			Item window = getItem(ModRL(color + "_stained_glass_window"));
			glasscuttingRecipe(window.getRegistryName().getPath(), tag, window);
			
			Item window_pane = getItem(ModRL(color + "_stained_glass_window_pane"));
			glasscuttingRecipe(window_pane.getRegistryName().getPath() + "_from_glass", tag, window_pane);
			glasscuttingRecipe(window_pane.getRegistryName().getPath(), ItemTags.bind("forge:glass_panes/" + color), window_pane);
		}
	}
	
	private void flamboyantGlass() {
//		for (int i = 0; i < ModDataGenerators.allFBlocks.size(); i++) {
//			for (int i1 = 0; i1 < FlamboyantDyeColors.values().length; i1++) {
//				if (ModDataGenerators.allFBlocks.get(i).getRegistryName().getPath().equals(FlamboyantDyeColors.byId(i1).getName() + "_stained_glass")) {
//					fStainedGlass.add(ModDataGenerators.allFBlocks.get(i).asItem());
//				}
//			}
//		}
//		for (int i = 0; i < fStainedGlass.size(); i++) {
//			Item item = fStainedGlass.get(i);
//			String color = item.getRegistryName().getPath().replaceFirst("_stained_glass", "");
//			
//			Item pane = getItem(FRL(color + "_stained_glass_pane"));
//			glasscuttingRecipe(pane.getRegistryName().getPath(), item, pane, 4);
//			
//			Item slab = getItem(ModRL(color + "_stained_glass_slab"));
//			glasscuttingRecipe(slab.getRegistryName().getPath(), item, slab, 2, CutAndColored.FMODID);
//			
//			Item stairs = getItem(ModRL(color + "_stained_glass_stairs"));
//			glasscuttingRecipe(stairs.getRegistryName().getPath(), item, stairs, 1, CutAndColored.FMODID);
//		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored glasscutting recipes";
	}
}