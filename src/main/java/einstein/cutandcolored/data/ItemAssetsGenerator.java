package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemAssetsGenerator extends ItemModelProvider {

	private List<Block> wallBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block instanceof WallBlock)
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("wall"))
			.collect(Collectors.toList()));
	
	private List<Block> windowBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("window") && !Util.getBlockRegistryName(block).getPath().contains("pane"))
			.collect(Collectors.toList()));
	
	public ItemAssetsGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, CutAndColored.MODID, existingFileHelper);
	}
	
	@Override
	protected void registerModels() {
		blockItemModel(ModBlocks.GLASSCUTTER.get());
		blockItemModel(ModBlocks.SAWMILL.get());
		blockItemModel(ModBlocks.WEAVER.get());
		
		blockItemModel(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get());
		
		blockItemModel(ModBlocks.SOUL_SANDSTONE.get());
		blockItemModel(ModBlocks.CHISELED_SOUL_SANDSTONE.get());
		blockItemModel(ModBlocks.CUT_SOUL_SANDSTONE.get());
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE.get());
		blockItemModel(ModBlocks.SOUL_GLASS.get());
		blockItemModel(ModBlocks.POLISHED_END_STONE.get());
		blockItemModel(ModBlocks.POLISHED_STONE.get());
		
		blockItemModel(ModBlocks.TERRACOTTA_STAIRS.get());
		blockItemModel(ModBlocks.GRANITE_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.DIORITE_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.ANDESITE_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.SOUL_SANDSTONE_STAIRS.get());
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get());
		blockItemModel(ModBlocks.CRACKED_STONE_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get());
		blockItemModel(ModBlocks.QUARTZ_BRICK_STAIRS.get());
		blockItemModel(ModBlocks.CALCITE_STAIRS.get());
		blockItemModel(ModBlocks.TUFF_STAIRS.get());
		blockItemModel(ModBlocks.RAW_IRON_STAIRS.get());
		blockItemModel(ModBlocks.RAW_GOLD_STAIRS.get());
		blockItemModel(ModBlocks.RAW_COPPER_STAIRS.get());
		blockItemModel(ModBlocks.OBSIDIAN_BRICK_STAIRS.get());
		
		blockItemModel(ModBlocks.TERRACOTTA_SLAB.get());
		blockItemModel(ModBlocks.GRANITE_BRICK_SLAB.get());
		blockItemModel(ModBlocks.DIORITE_BRICK_SLAB.get());
		blockItemModel(ModBlocks.ANDESITE_BRICK_SLAB.get());
		blockItemModel(ModBlocks.SOUL_SANDSTONE_SLAB.get());
		blockItemModel(ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get());
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get());
		blockItemModel(ModBlocks.CRACKED_STONE_BRICK_SLAB.get());
		blockItemModel(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get());
		blockItemModel(ModBlocks.CRACKED_NETHER_BRICK_SLAB.get());
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get());
		blockItemModel(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get());
		blockItemModel(ModBlocks.QUARTZ_BRICK_SLAB.get());
		blockItemModel(ModBlocks.CALCITE_SLAB.get());
		blockItemModel(ModBlocks.TUFF_SLAB.get());
		blockItemModel(ModBlocks.RAW_IRON_SLAB.get());
		blockItemModel(ModBlocks.RAW_GOLD_SLAB.get());
		blockItemModel(ModBlocks.RAW_COPPER_SLAB.get());
		blockItemModel(ModBlocks.OBSIDIAN_BRICK_SLAB.get());
		
		blockItemModel(ModBlocks.SMOOTH_STONE_STAIRS.get());
		blockItemModel(ModBlocks.GLASS_STAIRS.get());
		blockItemModel(ModBlocks.SOUL_GLASS_STAIRS.get());
		blockItemModel(ModBlocks.TINTED_GLASS_STAIRS.get());
		
		blockItemModel(ModBlocks.GLASS_SLAB.get());
		blockItemModel(ModBlocks.SOUL_GLASS_SLAB.get());
		blockItemModel(ModBlocks.TINTED_GLASS_SLAB.get());
		
		wallInventory("soul_sandstone_wall", blockRL("soul_sandstone_side"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.SOUL_SANDSTONE_WALL.get()));
		wallInventory("purpur_wall", blockMCRL("purpur_block"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.PURPUR_WALL.get()));
		
		generatedItem("soul_glass_pane", blockRL("soul_glass"));
		generatedItem("tinted_glass_pane", blockMCRL("tinted_glass"));
		generatedItem("glass_window_pane", blockRL("glass_window"));
		generatedItem("soul_glass_window_pane", blockRL("soul_glass_window"));
		generatedItem("tinted_glass_window_pane", blockRL("tinted_glass_window"));
		
		blockItemModel(ModBlocks.PRISMARINE_BRICK_PILLAR.get());
		blockItemModel(ModBlocks.POLISHED_BLACKSTONE_PILLAR.get());
		blockItemModel(ModBlocks.END_STONE_BRICK_PILLAR.get());
		
		blockItemModel(ModBlocks.NETHER_BRICK_FENCE_GATE.get());
		blockItemModel(ModBlocks.IRON_FENCE_GATE.get());
		
		for (int i = 0; i < ModDataGenerators.BOARD_TYPES.length; i++) {
			String type = ModDataGenerators.BOARD_TYPES[i];
			blockItemModel(BlockAssetsGenerator.getBlock(type + "_boards"));
			blockItemModel(BlockAssetsGenerator.getBlock(type + "_board_stairs"));
			blockItemModel(BlockAssetsGenerator.getBlock(type + "_board_slab"));
		}
		
		blockItemModel(ModBlocks.OBSIDIAN_BRICKS.get());
		blockItemModel(ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
		
		for (int i = 0; i < wallBlocks.size(); i++) {
			String name = Util.getBlockRegistryName(wallBlocks.get(i)).getPath();
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
		String name = Util.getBlockRegistryName(block).getPath();
		getBuilder(name).parent(getExistingFile(blockRL(name)));
	}
	
	@SuppressWarnings("unused")
	private void blockItemModel(Block block, String parentName) {
		String name = Util.getBlockRegistryName(block).getPath();
		getBuilder(name).parent(getExistingFile(blockRL(parentName)));
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
