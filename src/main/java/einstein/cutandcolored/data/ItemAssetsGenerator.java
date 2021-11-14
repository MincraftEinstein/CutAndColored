package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemAssetsGenerator extends ItemModelProvider {

	private List<Block> wallBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof WallBlock)
			.filter((block) -> block.getRegistryName().getPath().contains("wall"))
			.collect(Collectors.toList()));
	
	private List<Block> windowBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("window") && !block.getRegistryName().getPath().contains("pane"))
			.collect(Collectors.toList()));
	
	public ItemAssetsGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, CutAndColored.MODID, existingFileHelper);
	}
	
	@Override
	protected void registerModels() {
		blockItemModel(ModBlocks.GLASSCUTTER);
		blockItemModel(ModBlocks.SAWMILL);
		blockItemModel(ModBlocks.WEAVER);
		
		blockItemModel(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE);
		
		blockItemModel(ModBlocks.SOUL_SANDSTONE);
		blockItemModel(ModBlocks.CHISELED_SOUL_SANDSTONE);
		blockItemModel(ModBlocks.CUT_SOUL_SANDSTONE);
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE);
		blockItemModel(ModBlocks.SOUL_GLASS);
		blockItemModel(ModBlocks.POLISHED_END_STONE);
		blockItemModel(ModBlocks.POLISHED_STONE);
		
		blockItemModel(ModBlocks.TERRACOTTA_STAIRS);
		blockItemModel(ModBlocks.GRANITE_BRICK_STAIRS);
		blockItemModel(ModBlocks.DIORITE_BRICK_STAIRS);
		blockItemModel(ModBlocks.ANDESITE_BRICK_STAIRS);
		blockItemModel(ModBlocks.SOUL_SANDSTONE_STAIRS);
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
		blockItemModel(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
		blockItemModel(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
		blockItemModel(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
		blockItemModel(ModBlocks.QUARTZ_BRICK_STAIRS);
		blockItemModel(ModBlocks.CALCITE_STAIRS);
		blockItemModel(ModBlocks.TUFF_STAIRS);
		blockItemModel(ModBlocks.RAW_IRON_STAIRS);
		blockItemModel(ModBlocks.RAW_GOLD_STAIRS);
		blockItemModel(ModBlocks.RAW_COPPER_STAIRS);
		
		blockItemModel(ModBlocks.TERRACOTTA_SLAB);
		blockItemModel(ModBlocks.GRANITE_BRICK_SLAB);
		blockItemModel(ModBlocks.DIORITE_BRICK_SLAB);
		blockItemModel(ModBlocks.ANDESITE_BRICK_SLAB);
		blockItemModel(ModBlocks.SOUL_SANDSTONE_SLAB);
		blockItemModel(ModBlocks.CUT_SOUL_SANDSTONE_SLAB);
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
		blockItemModel(ModBlocks.CRACKED_STONE_BRICK_SLAB);
		blockItemModel(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
		blockItemModel(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
		blockItemModel(ModBlocks.QUARTZ_BRICK_SLAB);
		blockItemModel(ModBlocks.CALCITE_SLAB);
		blockItemModel(ModBlocks.TUFF_SLAB);
		blockItemModel(ModBlocks.RAW_IRON_SLAB);
		blockItemModel(ModBlocks.RAW_GOLD_SLAB);
		blockItemModel(ModBlocks.RAW_COPPER_SLAB);
		
		blockItemModel(ModBlocks.SMOOTH_STONE_STAIRS);
		blockItemModel(ModBlocks.GLASS_STAIRS);
		blockItemModel(ModBlocks.SOUL_GLASS_STAIRS);
		blockItemModel(ModBlocks.TINTED_GLASS_STAIRS);
		
		blockItemModel(ModBlocks.GLASS_SLAB);
		blockItemModel(ModBlocks.SOUL_GLASS_SLAB);
		blockItemModel(ModBlocks.TINTED_GLASS_SLAB);
		
		wallInventory("soul_sandstone_wall", new ResourceLocation(CutAndColored.MODID, "block/soul_sandstone_side"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.SOUL_SANDSTONE_WALL));
		wallInventory("purpur_wall", new ResourceLocation(CutAndColored.MCMODID, "block/purpur_block"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.PURPUR_WALL));
		
		generatedItem("soul_glass_pane", new ResourceLocation(CutAndColored.MODID, "block/soul_glass"));
		generatedItem("tinted_glass_pane", new ResourceLocation(CutAndColored.MCMODID, "block/tinted_glass"));
		generatedItem("glass_window_pane", new ResourceLocation(CutAndColored.MODID, "block/glass_window"));
		generatedItem("soul_glass_window_pane", new ResourceLocation(CutAndColored.MODID, "block/soul_glass_window"));
		generatedItem("tinted_glass_window_pane", new ResourceLocation(CutAndColored.MODID, "block/tinted_glass_window"));
		
		blockItemModel(ModBlocks.PRISMARINE_BRICK_PILLAR);
		blockItemModel(ModBlocks.POLISHED_BLACKSTONE_PILLAR);
		blockItemModel(ModBlocks.END_STONE_BRICK_PILLAR);
		
		blockItemModel(ModBlocks.NETHER_BRICK_FENCE_GATE);
		blockItemModel(ModBlocks.IRON_FENCE_GATE);
		
		for (int i = 0; i < wallBlocks.size(); i++) {
			String name = wallBlocks.get(i).getRegistryName().getPath();
			String fileName = name.replaceAll("_wall", "");
			try {
				if (name.contains("brick")) {
					wallInventory(name, blockRL(fileName + "s"));
				}
				else {
					wallInventory(name, blockRL(fileName));
				}
			} catch (IllegalArgumentException e) {
				if (name.contains("brick") || name.contains("tile")) {
					wallInventory(name, blockMCRL(fileName + "s"));
				}
				else {
					wallInventory(name, blockMCRL(fileName));
				}
			}
		}
		
		for (int i = 0; i < DyeColor.values().length; i++) {
			String name = DyeColor.byId(i).getName() + "_stained_glass_window";
			generatedItem(name + "_pane", blockRL(name));
		}
		
		for (int i = 0; i < windowBlocks.size(); i++) {
			blockItemModel(windowBlocks.get(i));
		}
	}
	
	private void blockItemModel(Block block) {
		String name = block.getRegistryName().getPath();
		getBuilder(name).parent(getExistingFile(new ResourceLocation(CutAndColored.MODID, "block/" + name)));
	}
	
	@SuppressWarnings("unused")
	private void blockItemModel(Block block, String parentName) {
		String name = block.getRegistryName().getPath();
		getBuilder(name).parent(getExistingFile(new ResourceLocation(CutAndColored.MODID, "block/" + parentName)));
	}
	
	private ItemModelBuilder generatedItem(String name, ResourceLocation... layers) {
		ItemModelBuilder model = withExistingParent(name, "item/generated");
		for (int i = 0; i < layers.length; i++) {
			model = model.texture("layer" + i, layers[i]);
		}
		return model;
	}
	
	private ResourceLocation blockRL(String string) {
		return new ResourceLocation(CutAndColored.MODID, "block/" + string);
	}
	
	private ResourceLocation blockMCRL(String string) {
		return new ResourceLocation(CutAndColored.MCMODID, "block/" + string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored item assets";
	}
}
