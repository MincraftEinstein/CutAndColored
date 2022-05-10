package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemTagsGenerator extends ItemTagsProvider {
	
	private List<Item> coloredItems = new ArrayList<Item>();
	
	/**********************Mod***********************/
	public static final TagKey<Item> VANILLA_STAINED_BRICKS = create("vanilla_stained_bricks");
	public static final TagKey<Item> VANILLA_STAINED_PLANKS = create("vanilla_stained_planks");
	public static final TagKey<Item> VANILLA_REDSTONE_LAMPS = create("vanilla_redstone_lamps");
	public static final TagKey<Item> VANILLA_STAINED_GLASS_WINDOWS = create("vanilla_stained_glass_windows");
	
	public static final TagKey<Item> VANILLA_CONCRETE_SLABS = create("vanilla_concrete_slabs");
	public static final TagKey<Item> VANILLA_STAINED_BRICK_SLABS = create("vanilla_stained_brick_slabs");
	public static final TagKey<Item> VANILLA_STAINED_GLASS_SLABS = create("vanilla_stained_glass_slabs");
	public static final TagKey<Item> VANILLA_STAINED_PLANK_SLABS = create("vanilla_plank_slabs");
	public static final TagKey<Item> VANILLA_TERRACOTTA_SLABS = create("vanilla_terracotta_slabs");
	public static final TagKey<Item> VANILLA_WOOL_SLABS = create("vanilla_wool_slabs");
	
	public static final TagKey<Item> VANILLA_CONCRETE_STAIRS = create("vanilla_concrete_stairs");
	public static final TagKey<Item> VANILLA_STAINED_BRICK_STAIRS = create("vanilla_stained_brick_stairs");
	public static final TagKey<Item> VANILLA_STAINED_GLASS_STAIRS = create("vanilla_stained_glass_stairs");
	public static final TagKey<Item> VANILLA_STAINED_PLANK_STAIRS = create("vanilla_plank_stairs");
	public static final TagKey<Item> VANILLA_TERRACOTTA_STAIRS = create("vanilla_terracotta_stairs");
	public static final TagKey<Item> VANILLA_WOOL_STAIRS = create("vanilla_wool_stairs");
	
	public static final TagKey<Item> VANILLA_STAINED_BRICK_WALLS = create("vanilla_stained_brick_walls");
	
	public static final TagKey<Item> VANILLA_STAINED_GLASS_WINDOW_PANES = create("vanilla_stained_glass_window_panes");
	
	/**********************Forge***********************/
	public static final TagKey<Item> CLAY_BRICKS = forgeCreate("clay_bricks");
	public static final TagKey<Item> REDSTONE_LAMPS = forgeCreate("redstone_lamps");
	public static final TagKey<Item> CARVED_PUMPKINS = forgeCreate("carved_pumpkins");
	public static final TagKey<Item> JACK_O_LANTERNS = forgeCreate("jack_o_lanterns");
	public static final TagKey<Item> STAINED_PLANKS = forgeCreate("stained_planks");
	public static final TagKey<Item> GLASS_WINDOWS = forgeCreate("glass_windows");
	public static final TagKey<Item> TINTED_GLASS = forgeCreate("glass/tinted");
	
	public static final TagKey<Item> CLAY_BRICK_SLABS = forgeCreate("clay_brick_slabs");
	public static final TagKey<Item> CONCRETE_SLABS = forgeCreate("concrete_slabs");
	public static final TagKey<Item> GLASS_SLABS = forgeCreate("glass_slabs");
	public static final TagKey<Item> STAINED_PLANK_SLABS = forgeCreate("stained_plank_slabs");
	public static final TagKey<Item> TERRACOTTA_SLABS = forgeCreate("terracotta_slabs");
	public static final TagKey<Item> WOOL_SLABS = forgeCreate("wool_slabs");
	
	public static final TagKey<Item> CLAY_BRICK_STAIRS = forgeCreate("clay_brick_stairs");
	public static final TagKey<Item> CONCRETE_STAIRS = forgeCreate("concrete_stairs");
	public static final TagKey<Item> GLASS_STAIRS = forgeCreate("glass_stairs");
	public static final TagKey<Item> STAINED_PLANK_STAIRS = forgeCreate("stained_plank_stairs");
	public static final TagKey<Item> TERRACOTTA_STAIRS = forgeCreate("terracotta_stairs");
	public static final TagKey<Item> WOOL_STAIRS = forgeCreate("wool_stairs");
	
	public static final TagKey<Item> CLAY_BRICK_WALLS = forgeCreate("clay_brick_walls");
	
	public static final TagKey<Item> NETHER_BRICK_FENCE_GATES = forgeCreate("fence_gates/nether_brick");
	
	public static final TagKey<Item> SOUL_GLASS_PANES = forgeCreate("glass_panes/soul");
	public static final TagKey<Item> TINTED_GLASS_PANES = forgeCreate("glass_panes/tinted");
	public static final TagKey<Item> GLASS_WINDOW_PANES = forgeCreate("glass_window_panes");
	
	public static final TagKey<Item> SOUL_GLASS = forgeCreate("glass/soul");
	
	public ItemTagsGenerator(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, CutAndColored.MODID, existingFileHelper);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void addTags() {
		
		vanillaDyedTags();
		
		/**********************Minecraft***********************/
		tag(ItemTags.PLANKS).addTag(STAINED_PLANKS);
		tag(ItemTags.SLABS).addTags(CONCRETE_SLABS, GLASS_SLABS, TERRACOTTA_SLABS, WOOL_SLABS)
				.add(ModBlocks.CRACKED_STONE_BRICK_SLAB.get().asItem(),
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get().asItem(),
						ModBlocks.CRACKED_NETHER_BRICK_SLAB.get().asItem(), ModBlocks.SOUL_SANDSTONE_SLAB.get().asItem(),
						ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get().asItem(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get().asItem(),
						ModBlocks.GRANITE_BRICK_SLAB.get().asItem(), ModBlocks.DIORITE_BRICK_SLAB.get().asItem(),
						ModBlocks.ANDESITE_BRICK_SLAB.get().asItem(), ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get().asItem(),
						ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get().asItem(), ModBlocks.QUARTZ_BRICK_SLAB.get().asItem(),
						ModBlocks.CALCITE_SLAB.get().asItem(), ModBlocks.TUFF_SLAB.get().asItem(), ModBlocks.RAW_IRON_SLAB.get().asItem(),
						ModBlocks.RAW_GOLD_SLAB.get().asItem(), ModBlocks.RAW_COPPER_SLAB.get().asItem());
		tag(ItemTags.STAIRS).addTags(CONCRETE_STAIRS, GLASS_STAIRS, TERRACOTTA_STAIRS, WOOL_STAIRS)
				.add(ModBlocks.SMOOTH_STONE_STAIRS.get().asItem(), ModBlocks.CRACKED_STONE_BRICK_STAIRS.get().asItem(),
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get().asItem(),
						ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get().asItem(), ModBlocks.SOUL_SANDSTONE_STAIRS.get().asItem(),
						ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get().asItem(), ModBlocks.GRANITE_BRICK_STAIRS.get().asItem(),
						ModBlocks.DIORITE_BRICK_STAIRS.get().asItem(), ModBlocks.ANDESITE_BRICK_STAIRS.get().asItem(),
						ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get().asItem(),
						ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get().asItem(), ModBlocks.QUARTZ_BRICK_STAIRS.get().asItem(),
						ModBlocks.CALCITE_STAIRS.get().asItem(), ModBlocks.TUFF_STAIRS.get().asItem(),
						ModBlocks.RAW_IRON_STAIRS.get().asItem(), ModBlocks.RAW_GOLD_STAIRS.get().asItem(),
						ModBlocks.RAW_COPPER_STAIRS.get().asItem());
		tag(ItemTags.WALLS).addTag(CLAY_BRICK_WALLS).add(ModBlocks.SOUL_SANDSTONE_WALL.get().asItem(),
				ModBlocks.GRANITE_BRICK_WALL.get().asItem(), ModBlocks.DIORITE_BRICK_WALL.get().asItem(),
				ModBlocks.ANDESITE_BRICK_WALL.get().asItem(), ModBlocks.PURPUR_WALL.get().asItem(),
				ModBlocks.PRISMARINE_BRICK_WALL.get().asItem(), ModBlocks.DARK_PRISMARINE_WALL.get().asItem(),
				ModBlocks.CRACKED_STONE_BRICK_WALL.get().asItem(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get().asItem(),
				ModBlocks.CRACKED_NETHER_BRICK_WALL.get().asItem(), ModBlocks.SMOOTH_STONE_WALL.get().asItem(),
				ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get().asItem(), ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get().asItem(),
				ModBlocks.QUARTZ_BRICK_WALL.get().asItem(), ModBlocks.CALCITE_WALL.get().asItem(), ModBlocks.TUFF_WALL.get().asItem());
		tag(ItemTags.WOODEN_SLABS).addTag(STAINED_PLANK_SLABS);
		tag(ItemTags.WOODEN_STAIRS).addTag(STAINED_PLANK_STAIRS);
		
		/**********************Forge***********************/
		tag(CLAY_BRICK_SLABS).add(Items.BRICK_SLAB).addTag(VANILLA_STAINED_BRICK_SLABS);
		tag(CLAY_BRICK_STAIRS).add(Items.BRICK_STAIRS).addTag(VANILLA_STAINED_BRICK_STAIRS);
		tag(CLAY_BRICK_WALLS).add(Items.BRICK_WALL).addTag(VANILLA_STAINED_BRICK_WALLS);
		tag(CLAY_BRICKS).add(Items.BRICKS).addTag(VANILLA_STAINED_BRICKS);
		tag(CONCRETE_SLABS).addTag(VANILLA_CONCRETE_SLABS);
		tag(CONCRETE_STAIRS).addTag(VANILLA_CONCRETE_STAIRS);
		tag(GLASS_SLABS).add(ModBlocks.GLASS_SLAB.get().asItem()).addTag(VANILLA_STAINED_GLASS_SLABS);
		tag(GLASS_STAIRS).add(ModBlocks.GLASS_STAIRS.get().asItem()).addTag(VANILLA_STAINED_GLASS_STAIRS);
		tag(GLASS_WINDOWS).add(ModBlocks.GLASS_WINDOW.get().asItem()).addTag(VANILLA_STAINED_GLASS_WINDOWS);
		tag(GLASS_WINDOW_PANES).add(ModBlocks.GLASS_WINDOW_PANE.get().asItem()).addTag(VANILLA_STAINED_GLASS_WINDOW_PANES);
		tag(REDSTONE_LAMPS).add(Items.REDSTONE_LAMP).addTag(VANILLA_REDSTONE_LAMPS);
		tag(CARVED_PUMPKINS).add(Items.CARVED_PUMPKIN);
		tag(JACK_O_LANTERNS).add(Items.JACK_O_LANTERN);
		tag(TERRACOTTA_SLABS).addTag(VANILLA_TERRACOTTA_SLABS);
		tag(TERRACOTTA_STAIRS).addTag(VANILLA_TERRACOTTA_STAIRS);
		tag(WOOL_SLABS).addTag(VANILLA_WOOL_SLABS);
		tag(WOOL_STAIRS).addTag(VANILLA_WOOL_STAIRS);
		tag(STAINED_PLANK_SLABS).addTag(VANILLA_STAINED_PLANK_SLABS);
		tag(STAINED_PLANK_STAIRS).addTag(VANILLA_STAINED_PLANK_STAIRS);
		tag(STAINED_PLANKS).addTag(VANILLA_STAINED_PLANKS);
		tag(NETHER_BRICK_FENCE_GATES).add(ModBlocks.NETHER_BRICK_FENCE_GATE.get().asItem());
		tag(SOUL_GLASS).add(ModBlocks.SOUL_GLASS.get().asItem(), ModBlocks.SOUL_GLASS_WINDOW.get().asItem());
		tag(SOUL_GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE.get().asItem(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get().asItem());
		tag(TINTED_GLASS).add(Blocks.TINTED_GLASS.asItem(), ModBlocks.TINTED_GLASS_WINDOW.get().asItem());
		tag(TINTED_GLASS_PANES).add(ModBlocks.TINTED_GLASS_PANE.get().asItem(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get().asItem());
		
		tag(Tags.Items.GLASS_COLORLESS).add(ModBlocks.GLASS_WINDOW.get().asItem());
		tag(Tags.Items.GLASS_PANES_COLORLESS).add(ModBlocks.GLASS_WINDOW_PANE.get().asItem());
		tag(Tags.Items.STAINED_GLASS).addTag(VANILLA_STAINED_GLASS_WINDOWS);
		tag(Tags.Items.STAINED_GLASS_PANES).addTag(VANILLA_STAINED_GLASS_WINDOW_PANES);
		tag(Tags.Items.SANDSTONE).add(ModBlocks.SOUL_SANDSTONE.get().asItem(), ModBlocks.CUT_SOUL_SANDSTONE.get().asItem(),
				ModBlocks.CHISELED_SOUL_SANDSTONE.get().asItem(), ModBlocks.SMOOTH_SOUL_SANDSTONE.get().asItem());
	}
	
	private void vanillaDyedTags() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			int i1 = ModDataGenerators.allBlocks.size() - 1;
			while (i1 >= 0) {
				Block block = ModDataGenerators.allBlocks.get(i1);
				if (isVanillaColored(block, i)) {
					coloredItems.add(block.asItem());
				}
				i1--;
			}
			tag(forgeCreate("glass/" + color)).add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_window")).asItem());
			tag(forgeCreate("glass_panes/" + color)).add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_window_pane")).asItem());
		}
		for (int i = 0; i < coloredItems.size(); i++) {
			Item item = coloredItems.get(i);
			String name = item.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					tag(VANILLA_CONCRETE_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_CONCRETE_STAIRS).add(item);
				}
			}
			else if (name.contains("redstone_lamp")) {
				tag(VANILLA_REDSTONE_LAMPS).add(item);
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_BRICK_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_BRICK_STAIRS).add(item);
				}
				else if (name.contains("wall")) {
					tag(VANILLA_STAINED_BRICK_WALLS).add(item);
				}
				else if (name.contains("bricks")) {
					tag(VANILLA_STAINED_BRICKS).add(item);
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_GLASS_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_GLASS_STAIRS).add(item);
				}
				else if (name.contains("window")) {
					if (name.contains("pane")) {
						tag(VANILLA_STAINED_GLASS_WINDOW_PANES).add(item);
					}
					else {
						tag(VANILLA_STAINED_GLASS_WINDOWS).add(item);
					}
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_PLANK_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_PLANK_STAIRS).add(item);
				}
				else if (name.contains("planks")) {
					tag(VANILLA_STAINED_PLANKS).add(item);
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					tag(VANILLA_TERRACOTTA_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_TERRACOTTA_STAIRS).add(item);
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					tag(VANILLA_WOOL_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_WOOL_STAIRS).add(item);
				}
			}
		}
	}
	
	private boolean isVanillaColored(Block block, int colorIndex) {
		String name = block.getRegistryName().getPath();
		return name.contains(DyeColor.byId(colorIndex).getName()) && !name.contains("blackstone");
	}
	
	private static TagKey<Item> create(String name) {
		return ItemTags.create(new ResourceLocation(CutAndColored.MODID, name));
	}
	
	private static TagKey<Item> forgeCreate(String name) {
		return ItemTags.create(new ResourceLocation("forge", name));
	}
	
	@Override
	public String getName() {
		return "CutAndColored item tags";
	}
}
