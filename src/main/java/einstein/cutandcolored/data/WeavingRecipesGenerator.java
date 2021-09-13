package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class WeavingRecipesGenerator extends RecipeResources {

	public static final List<Block> allFBlocks = new ArrayList<Block>(ForgeRegistries.BLOCKS.getValues().stream()
            .filter((block) -> CutAndColored.FMODID.equals(Objects.requireNonNull(block.getRegistryName()).getNamespace()))
            .collect(Collectors.toList()));
	
	private List<Item> coloredWool = new ArrayList<Item>();
//	private List<Item> fColoredWool = new ArrayList<Item>();
	
	public WeavingRecipesGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		setConsumer(consumer);
		for (int i = 0; i < ModBlocks.allMCBlocks.size(); i++) {
			for (int i1 = 0; i1 < DyeColor.values().length; i1++) {
				if (ModBlocks.allMCBlocks.get(i).getRegistryName().getPath().equals(DyeColor.byId(i1).getName() + "_wool")) {
					coloredWool.add(ModBlocks.allMCBlocks.get(i).asItem());
				}
			}
		}
//		for (int i = 0; i < allFBlocks.size(); i++) {
//			for (int i1 = 0; i1 < FlamboyantDyeColors.values().length; i1++) {
//				if (allFBlocks.get(i).getRegistryName().getPath().equals(FlamboyantDyeColors.byId(i1).getName() + "_wool")) {
//					fColoredWool.add(allFBlocks.get(i).asItem());
//				}
//			}
//		}
		for (int i = 0; i < coloredWool.size(); i++) {
			Item item = coloredWool.get(i);
			String color = item.getRegistryName().getPath().replaceFirst("_wool", "");
			
			Item carpet = getItem(MCRL(color + "_carpet"));
			weavingRecipe(carpet.getRegistryName().getPath(), item, carpet, 2);
			
			Item slab = getItem(ModRL(color + "_wool_slab"));
			weavingRecipe(slab.getRegistryName().getPath(), item, slab, 2);
			
			Item stairs = getItem(ModRL(color + "_wool_stairs"));
			weavingRecipe(stairs.getRegistryName().getPath(), item, stairs);
		}
//		for (int i = 0; i < fColoredWool.size(); i++) {
//			Item item = fColoredWool.get(i);
//			String color = item.getRegistryName().getPath().replaceFirst("_wool", "");
//			
//			Item carpet = getItem(FRL(color + "_carpet"));
//			weavingRecipe(carpet.getRegistryName().getPath(), item, carpet, 2);
//			
//			Item slab = getItem(ModRL(color + "_wool_slab"));
//			weavingRecipe(slab.getRegistryName().getPath(), item, slab, 2, CutAndColored.FMODID);
//			
//			Item stairs = getItem(ModRL(color + "_wool_stairs"));
//			weavingRecipe(stairs.getRegistryName().getPath(), item, stairs, 1, CutAndColored.FMODID);
//		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored weaving recipes";
	}
}
