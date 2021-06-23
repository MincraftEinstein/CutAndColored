package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class WeavingRecipesGenerator extends RecipeResources {

	public static final List<Block> allFBlocks = new ArrayList<Block>(ForgeRegistries.BLOCKS.getValues().stream()
            .filter((block) -> CutAndColored.FMODID.equals(Objects.requireNonNull(block.getRegistryName()).getNamespace()))
            .collect(Collectors.toList()));
	
	private List<Item> coloredWool = new ArrayList<Item>();
	private List<Item> fColoredWool = new ArrayList<Item>();
	
	public WeavingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		for (int i = 0; i < ModBlocks.allMCBlocks.size(); i++) {
			for (int i1 = 0; i1 < DyeColor.values().length; i1++) {
				if (ModBlocks.allMCBlocks.get(i).getRegistryName().getPath().equals(DyeColor.byId(i1).getTranslationKey() + "_wool")) {
					coloredWool.add(ModBlocks.allMCBlocks.get(i).asItem());
				}
			}
		}
		for (int i = 0; i < allFBlocks.size(); i++) {
			for (int i1 = 0; i1 < FlamboyantDyeColors.values().length; i1++) {
				if (allFBlocks.get(i).getRegistryName().getPath().equals(FlamboyantDyeColors.byId(i1).getTranslationKey() + "_wool")) {
					fColoredWool.add(allFBlocks.get(i).asItem());
				}
			}
		}
		for (int i = 0; i < coloredWool.size(); i++) {
			Item item = coloredWool.get(i);
			String color = item.getRegistryName().getPath().replaceFirst("_wool", "");
			
			Item carpet = getItem(new ResourceLocation(color + "_carpet"));
			weavingRecipe(consumer, carpet.getRegistryName().getPath(), item, carpet, 2);
			
			Item slab = getItem(new ResourceLocation(CutAndColored.MODID, color + "_wool_slab"));
			weavingRecipe(consumer, slab.getRegistryName().getPath(), item, slab, 2);
			
			Item stairs = getItem(new ResourceLocation(CutAndColored.MODID, color + "_wool_stairs"));
			weavingRecipe(consumer, stairs.getRegistryName().getPath(), item, stairs);
		}
		for (int i = 0; i < fColoredWool.size(); i++) {
			Item item = fColoredWool.get(i);
			String color = item.getRegistryName().getPath().replaceFirst("_wool", "");
			
			Item carpet = getItem(new ResourceLocation(CutAndColored.FMODID, color + "_carpet"));
			weavingRecipe(consumer, carpet.getRegistryName().getPath(), item, carpet, 2, CutAndColored.FMODID);
			
			Item slab = getItem(new ResourceLocation(CutAndColored.MODID, color + "_wool_slab"));
			weavingRecipe(consumer, slab.getRegistryName().getPath(), item, slab, 2, CutAndColored.FMODID);
			
			Item stairs = getItem(new ResourceLocation(CutAndColored.MODID, color + "_wool_stairs"));
			weavingRecipe(consumer, stairs.getRegistryName().getPath(), item, stairs, 1, CutAndColored.FMODID);
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored weaving recipes";
	}
}
