package einstein.cutandcolored.data;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemAssetsGenerator extends ItemModelProvider {

	public ItemAssetsGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, CutAndColored.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
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
		blockItemModel(ModBlocks.SOUL_SANDSTONE_STAIR);
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
		blockItemModel(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
		blockItemModel(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
		blockItemModel(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
		
		blockItemModel(ModBlocks.TERRACOTTA_SLAB);
		blockItemModel(ModBlocks.GRANITE_BRICK_SLAB);
		blockItemModel(ModBlocks.DIORITE_BRICK_SLAB);
		blockItemModel(ModBlocks.ANDESITE_BRICK_SLAB);
		blockItemModel(ModBlocks.SOUL_SANDSTONE_SLAB);
		blockItemModel(ModBlocks.CUT_SOUL_SANDSTONE_SLAB);
		blockItemModel(ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
		
		blockItemModel(ModBlocks.SMOOTH_STONE_STAIRS);
		blockItemModel(ModBlocks.GLASS_STAIRS);
		blockItemModel(ModBlocks.SOUL_GLASS_STAIRS);
		
		blockItemModel(ModBlocks.GLASS_SLAB);
		blockItemModel(ModBlocks.SOUL_GLASS_SLAB);
		
		blockItemModel(ModBlocks.SOUL_SANDSTONE_WALL, "soul_sandstone_wall_inventory");
		blockItemModel(ModBlocks.PURPUR_WALL, "purpur_wall_inventory");
		
		generatedItem("soul_glass_pane", new ResourceLocation(CutAndColored.MODID, "block/soul_glass"));
		
		blockItemModel(ModBlocks.PRISMARINE_BRICK_PILLAR);
		blockItemModel(ModBlocks.POLISHED_BLACKSTONE_PILLAR);
		blockItemModel(ModBlocks.END_STONE_BRICK_PILLAR);
		
		blockItemModel(ModBlocks.NETHER_BRICK_FENCE_GATE);
		blockItemModel(ModBlocks.IRON_FENCE_GATE);
	}
	
	private void blockItemModel(Block block) {
		String name = block.getRegistryName().getPath();
		getBuilder(name).parent(getExistingFile(new ResourceLocation(CutAndColored.MODID, "block/" + name)));
	}
	
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
	
	@Override
	public String getName() {
		return "CutAndColored item assets";
	}
}
