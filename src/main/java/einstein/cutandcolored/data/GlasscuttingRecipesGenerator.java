package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

public class GlasscuttingRecipesGenerator extends RecipeResources {

	private List<Item> stainedGlass = new ArrayList<Item>();
	private List<Item> fStainedGlass = new ArrayList<Item>();
	
	public GlasscuttingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < ModBlocks.allMCBlocks.size(); i++) {
			for (int i1 = 0; i1 < DyeColor.values().length; i1++) {
				if (ModBlocks.allMCBlocks.get(i).getRegistryName().getPath().equals(DyeColor.byId(i1).getTranslationKey() + "_stained_glass")) {
					stainedGlass.add(ModBlocks.allMCBlocks.get(i).asItem());
				}
			}
		}
		for (int i = 0; i < WeavingRecipesGenerator.allFBlocks.size(); i++) {
			for (int i1 = 0; i1 < FlamboyantDyeColors.values().length; i1++) {
				if (WeavingRecipesGenerator.allFBlocks.get(i).getRegistryName().getPath().equals(FlamboyantDyeColors.byId(i1).getTranslationKey() + "_stained_glass")) {
					fStainedGlass.add(WeavingRecipesGenerator.allFBlocks.get(i).asItem());
				}
			}
		}
		
		glasscuttingRecipe(consumer, "glass_bottle", Blocks.GLASS, Items.GLASS_BOTTLE);
		glasscuttingRecipe(consumer, "glass_pane", Blocks.GLASS, Blocks.GLASS_PANE, 4);
		glasscuttingRecipe(consumer, "glass_slab", Blocks.GLASS, ModBlocks.GLASS_SLAB, 2);
		glasscuttingRecipe(consumer, "glass_stairs", Blocks.GLASS, ModBlocks.GLASS_STAIRS);
		glasscuttingRecipe(consumer, "horizontal_glass_pane", Blocks.GLASS, com.codenamerevy.horizontalpanes.content.blocks.ModBlocks.GLASS_PANE.get(), 4, "horizontalpanes");
		
		glasscuttingRecipe(consumer, "soul_glass_pane", ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_PANE, 4);
		glasscuttingRecipe(consumer, "soul_glass_slab", ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_SLAB, 2);
		glasscuttingRecipe(consumer, "soul_glass_stairs", ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_STAIRS);
		glasscuttingRecipe(consumer, "horizontal_soul_glass_pane", ModBlocks.SOUL_GLASS, ModBlocks.HORIZONTAL_SOUL_GLASS_PANE, 4, "horizontalpanes");
		
		for (int i = 0; i < stainedGlass.size(); i++) {
			Item item = stainedGlass.get(i);
			String color = item.getRegistryName().getPath().replaceFirst("_stained_glass", "");
			
			Item pane = getItem(new ResourceLocation(CutAndColored.MCMODID, color + "_stained_glass_pane"));
			glasscuttingRecipe(consumer, pane.getRegistryName().getPath(), item, pane, 4);
			
			Item slab = getItem(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_slab"));
			glasscuttingRecipe(consumer, slab.getRegistryName().getPath(), item, slab, 2);
			
			Item stairs = getItem(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_stairs"));
			glasscuttingRecipe(consumer, stairs.getRegistryName().getPath(), item, stairs);
			
			Item hPane = getItem(new ResourceLocation("horizontalpanes", "horizontal_stained_" + color + "_pane"));
			glasscuttingRecipe(consumer, hPane.getRegistryName().getPath(), item, hPane, 4, "horizontalpanes");
		}
		for (int i = 0; i < fStainedGlass.size(); i++) {
			Item item = fStainedGlass.get(i);
			String color = item.getRegistryName().getPath().replaceFirst("_stained_glass", "");
			
			Item pane = getItem(new ResourceLocation(CutAndColored.FMODID, color + "_stained_glass_pane"));
			glasscuttingRecipe(consumer, pane.getRegistryName().getPath(), item, pane, 4, CutAndColored.FMODID);
			
			Item slab = getItem(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_slab"));
			glasscuttingRecipe(consumer, slab.getRegistryName().getPath(), item, slab, 2, CutAndColored.FMODID);
			
			Item stairs = getItem(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_stairs"));
			glasscuttingRecipe(consumer, stairs.getRegistryName().getPath(), item, stairs, 1, CutAndColored.FMODID);
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored glasscutting recipes";
	}
}
