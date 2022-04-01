package einstein.cutandcolored.data;

import java.util.function.Consumer;

import einstein.cutandcolored.init.ModBlocks;
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
		glasscuttingRecipe("glass_pane", Blocks.GLASS, Blocks.GLASS_PANE, 4);
		glasscuttingRecipe("glass_slab", Blocks.GLASS, ModBlocks.GLASS_SLAB.get(), 2);
		glasscuttingRecipe("glass_stairs", Blocks.GLASS, ModBlocks.GLASS_STAIRS.get());
		glasscuttingRecipe("horizontal_glass_pane", Blocks.GLASS, getItem(new ResourceLocation("horizontalpanes:horizontal_glass_pane")), 4);
		glasscuttingRecipe("glass_window", Blocks.GLASS, ModBlocks.GLASS_WINDOW.get());
		glasscuttingRecipe("glass_window_pane_from_glass", Tags.Items.GLASS_COLORLESS, ModBlocks.GLASS_WINDOW_PANE.get());
		glasscuttingRecipe("glass_window_pane", Blocks.GLASS_PANE, ModBlocks.GLASS_WINDOW_PANE.get());
		
		glasscuttingRecipe("soul_glass_pane", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_PANE.get(), 4);
		glasscuttingRecipe("soul_glass_slab", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_SLAB.get(), 2);
		glasscuttingRecipe("soul_glass_stairs", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_STAIRS.get());
		glasscuttingRecipe("horizontal_soul_glass_pane", ModBlocks.SOUL_GLASS.get(), ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get(), 4, "horizontalpanes");
		glasscuttingRecipe("soul_glass_window", ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_WINDOW.get());
		glasscuttingRecipe("soul_glass_window_pane_from_glass", ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW_PANE.get());
		glasscuttingRecipe("soul_glass_window_pane", ModBlocks.SOUL_GLASS_PANE.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get());
		
		glasscuttingRecipe("tinted_glass_pane", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_PANE.get(), 4);
		glasscuttingRecipe("tinted_glass_slab", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_SLAB.get(), 2);
		glasscuttingRecipe("tinted_glass_stairs", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_STAIRS.get());
		glasscuttingRecipe("horizontal_tinted_glass_pane", Blocks.TINTED_GLASS, getItem(new ResourceLocation("horizontalpanes:horizontal_tinted_glass_pane")), 4);
		glasscuttingRecipe("tinted_glass_window", Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW.get());
		glasscuttingRecipe("tinted_glass_window_pane_from_glass", ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
		glasscuttingRecipe("tinted_glass_window_pane", ModBlocks.TINTED_GLASS_PANE.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
		
	}
	
	private void vanillaGlass() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			Item glass = getItem(MCRL(color + "_stained_glass"));
			TagKey<Item> tag = ItemTags.create(new ResourceLocation("forge", "glass/" + color));
			
			Item pane = getItem(MCRL(color + "_stained_glass_pane"));
			glasscuttingRecipe(pane.getRegistryName().getPath(), glass, pane, 4);
			
			Item slab = getItem(ModRL(color + "_stained_glass_slab"));
			glasscuttingRecipe(slab.getRegistryName().getPath(), glass, slab, 2);
			
			Item stairs = getItem(ModRL(color + "_stained_glass_stairs"));
			glasscuttingRecipe(stairs.getRegistryName().getPath(), glass, stairs);
			
			Item hPane = getItem(new ResourceLocation("horizontalpanes", "horizontal_stained_" + color + "_pane"));
			glasscuttingRecipe(hPane.getRegistryName().getPath(), glass, hPane, 4);
			
			Item window = getItem(ModRL(color + "_stained_glass_window"));
			glasscuttingRecipe(window.getRegistryName().getPath(), glass, window);
			
			Item window_pane = getItem(ModRL(color + "_stained_glass_window_pane"));
			glasscuttingRecipe(window_pane.getRegistryName().getPath() + "_from_glass", tag, window_pane);
			glasscuttingRecipe(window_pane.getRegistryName().getPath(), getItem(MCRL(color + "_stained_glass_pane")), window_pane);
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
