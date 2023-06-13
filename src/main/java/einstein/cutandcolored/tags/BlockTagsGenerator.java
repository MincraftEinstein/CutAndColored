package einstein.cutandcolored.tags;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BlockTagsGenerator extends BlockTagsProvider {

    private final List<Block> coloredBlocks = new ArrayList<Block>();

    /**********************Mod***********************/
    public static final TagKey<Block> VANILLA_STAINED_BRICKS = create("vanilla_stained_bricks");
    public static final TagKey<Block> VANILLA_STAINED_PLANKS = create("vanilla_stained_planks");
    public static final TagKey<Block> VANILLA_REDSTONE_LAMPS = create("vanilla_redstone_lamps");
    public static final TagKey<Block> VANILLA_STAINED_GLASS_WINDOWS = create("vanilla_stained_glass_windows");

    public static final TagKey<Block> VANILLA_CONCRETE_SLABS = create("vanilla_concrete_slabs");
    public static final TagKey<Block> VANILLA_STAINED_BRICK_SLABS = create("vanilla_stained_brick_slabs");
    public static final TagKey<Block> VANILLA_STAINED_GLASS_SLABS = create("vanilla_stained_glass_slabs");
    public static final TagKey<Block> VANILLA_STAINED_PLANK_SLABS = create("vanilla_plank_slabs");
    public static final TagKey<Block> VANILLA_TERRACOTTA_SLABS = create("vanilla_terracotta_slabs");
    public static final TagKey<Block> VANILLA_WOOL_SLABS = create("vanilla_wool_slabs");

    public static final TagKey<Block> VANILLA_CONCRETE_STAIRS = create("vanilla_concrete_stairs");
    public static final TagKey<Block> VANILLA_STAINED_BRICK_STAIRS = create("vanilla_stained_brick_stairs");
    public static final TagKey<Block> VANILLA_STAINED_GLASS_STAIRS = create("vanilla_stained_glass_stairs");
    public static final TagKey<Block> VANILLA_STAINED_PLANK_STAIRS = create("vanilla_plank_stairs");
    public static final TagKey<Block> VANILLA_TERRACOTTA_STAIRS = create("vanilla_terracotta_stairs");
    public static final TagKey<Block> VANILLA_WOOL_STAIRS = create("vanilla_wool_stairs");

    public static final TagKey<Block> VANILLA_STAINED_BRICK_WALLS = create("vanilla_stained_brick_walls");

    public static final TagKey<Block> VANILLA_STAINED_GLASS_WINDOW_PANES = create("vanilla_stained_glass_window_panes");

    /**********************Forge***********************/
    public static final TagKey<Block> CLAY_BRICKS = forgeCreate("clay_bricks");
    public static final TagKey<Block> REDSTONE_LAMPS = forgeCreate("redstone_lamps");
    public static final TagKey<Block> CARVED_PUMPKINS = forgeCreate("carved_pumpkins");
    public static final TagKey<Block> JACK_O_LANTERNS = forgeCreate("jack_o_lanterns");
    public static final TagKey<Block> STAINED_PLANKS = forgeCreate("stained_planks");
    public static final TagKey<Block> GLASS_WINDOWS = forgeCreate("glass_windows");
    public static final TagKey<Block> TINTED_GLASS = forgeCreate("glass/tinted");
    public static final TagKey<Block> BOARDS = forgeCreate("boards");

    public static final TagKey<Block> CLAY_BRICK_SLABS = forgeCreate("clay_brick_slabs");
    public static final TagKey<Block> CONCRETE_SLABS = forgeCreate("concrete_slabs");
    public static final TagKey<Block> GLASS_SLABS = forgeCreate("glass_slabs");
    public static final TagKey<Block> STAINED_PLANK_SLABS = forgeCreate("stained_plank_slabs");
    public static final TagKey<Block> TERRACOTTA_SLABS = forgeCreate("terracotta_slabs");
    public static final TagKey<Block> WOOL_SLABS = forgeCreate("wool_slabs");
    public static final TagKey<Block> BOARD_SLABS = forgeCreate("board_slabs");

    public static final TagKey<Block> CLAY_BRICK_STAIRS = forgeCreate("clay_brick_stairs");
    public static final TagKey<Block> CONCRETE_STAIRS = forgeCreate("concrete_stairs");
    public static final TagKey<Block> GLASS_STAIRS = forgeCreate("glass_stairs");
    public static final TagKey<Block> STAINED_PLANK_STAIRS = forgeCreate("stained_plank_stairs");
    public static final TagKey<Block> TERRACOTTA_STAIRS = forgeCreate("terracotta_stairs");
    public static final TagKey<Block> WOOL_STAIRS = forgeCreate("wool_stairs");
    public static final TagKey<Block> BOARD_STAIRS = forgeCreate("board_stairs");

    public static final TagKey<Block> CLAY_BRICK_WALLS = forgeCreate("clay_brick_walls");

    public static final TagKey<Block> NETHER_BRICK_FENCE_GATES = forgeCreate("fence_gates/nether_brick");

    public static final TagKey<Block> SOUL_GLASS_PANES = forgeCreate("glass_panes/soul");
    public static final TagKey<Block> TINTED_GLASS_PANES = forgeCreate("glass_panes/tinted");
    public static final TagKey<Block> GLASS_WINDOW_PANES = forgeCreate("glass_window_panes");

    public static final TagKey<Block> SOUL_GLASS = forgeCreate("glass/soul");

    public BlockTagsGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CutAndColored.MOD_ID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        vanillaDyedTags();

        /**********************Minecraft***********************/
        tag(BlockTags.IMPERMEABLE).add(ModBlocks.SOUL_GLASS.get()).addTags(GLASS_SLABS, GLASS_STAIRS, GLASS_WINDOWS);
        tag(BlockTags.PLANKS).addTags(STAINED_PLANKS);
        tag(BlockTags.SLABS).add(ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                        ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), ModBlocks.SOUL_SANDSTONE_SLAB.get(),
                        ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(),
                        ModBlocks.GRANITE_BRICK_SLAB.get(), ModBlocks.DIORITE_BRICK_SLAB.get(), ModBlocks.ANDESITE_BRICK_SLAB.get(),
                        ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),
                        ModBlocks.QUARTZ_BRICK_SLAB.get(), ModBlocks.CALCITE_SLAB.get(), ModBlocks.TUFF_SLAB.get(),
                        ModBlocks.RAW_IRON_SLAB.get(), ModBlocks.RAW_GOLD_SLAB.get(), ModBlocks.RAW_COPPER_SLAB.get(),
                        ModBlocks.OBSIDIAN_BRICK_SLAB.get())
                .addTags(CONCRETE_SLABS, GLASS_SLABS, TERRACOTTA_SLABS, WOOL_SLABS, BOARD_SLABS);
        tag(BlockTags.STAIRS).add(ModBlocks.SMOOTH_STONE_STAIRS.get(), ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(),
                        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(),
                        ModBlocks.SOUL_SANDSTONE_STAIRS.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(),
                        ModBlocks.GRANITE_BRICK_STAIRS.get(), ModBlocks.DIORITE_BRICK_STAIRS.get(), ModBlocks.ANDESITE_BRICK_STAIRS.get(),
                        ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(),
                        ModBlocks.QUARTZ_BRICK_STAIRS.get(), ModBlocks.CALCITE_STAIRS.get(), ModBlocks.TUFF_STAIRS.get(),
                        ModBlocks.RAW_IRON_STAIRS.get(), ModBlocks.RAW_GOLD_STAIRS.get(), ModBlocks.RAW_COPPER_STAIRS.get(),
                        ModBlocks.OBSIDIAN_BRICK_STAIRS.get())
                .addTags(CONCRETE_STAIRS, GLASS_STAIRS, TERRACOTTA_STAIRS, WOOL_STAIRS, BOARD_STAIRS);
        tag(BlockTags.WALLS).addTag(CLAY_BRICK_WALLS).add(ModBlocks.SOUL_SANDSTONE_WALL.get(), ModBlocks.GRANITE_BRICK_WALL.get(),
                ModBlocks.DIORITE_BRICK_WALL.get(), ModBlocks.ANDESITE_BRICK_WALL.get(), ModBlocks.PURPUR_WALL.get(),
                ModBlocks.PRISMARINE_BRICK_WALL.get(), ModBlocks.DARK_PRISMARINE_WALL.get(), ModBlocks.CRACKED_STONE_BRICK_WALL.get(),
                ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), ModBlocks.CRACKED_NETHER_BRICK_WALL.get(),
                ModBlocks.SMOOTH_STONE_WALL.get(), ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(),
                ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), ModBlocks.QUARTZ_BRICK_WALL.get(), ModBlocks.CALCITE_WALL.get(),
                ModBlocks.TUFF_WALL.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get(), ModBlocks.POLISHED_GRANITE_WALL.get(),
                ModBlocks.POLISHED_DIORITE_WALL.get(), ModBlocks.POLISHED_ANDESITE_WALL.get());
        tag(BlockTags.WOODEN_SLABS).addTag(STAINED_PLANK_SLABS);
        tag(BlockTags.WOODEN_STAIRS).addTag(STAINED_PLANK_STAIRS);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.GLASSCUTTER.get(), ModBlocks.ANDESITE_BRICK_SLAB.get(), ModBlocks.ANDESITE_BRICK_STAIRS.get(),
                        ModBlocks.ANDESITE_BRICKS.get(), ModBlocks.DIORITE_BRICK_SLAB.get(), ModBlocks.DIORITE_BRICK_STAIRS.get(),
                        ModBlocks.DIORITE_BRICKS.get(), ModBlocks.GRANITE_BRICK_SLAB.get(), ModBlocks.GRANITE_BRICK_STAIRS.get(),
                        ModBlocks.GRANITE_BRICKS.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get(),
                        ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE.get(),
                        ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(),
                        ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_SLAB.get(), ModBlocks.SOUL_SANDSTONE_STAIRS.get(),
                        ModBlocks.CHISELED_PRISMARINE_BRICKS.get(), ModBlocks.PRISMARINE_BRICK_PILLAR.get(),
                        ModBlocks.POLISHED_BLACKSTONE_PILLAR.get(), ModBlocks.END_STONE_BRICK_PILLAR.get(),
                        ModBlocks.POLISHED_END_STONE.get(), ModBlocks.CHISELED_END_STONE_BRICKS.get(), ModBlocks.POLISHED_STONE.get(),
                        ModBlocks.SMOOTH_STONE_STAIRS.get(), ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(),
                        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(),
                        ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(),
                        ModBlocks.QUARTZ_BRICK_STAIRS.get(), ModBlocks.CALCITE_STAIRS.get(), ModBlocks.TUFF_STAIRS.get(),
                        ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                        ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),
                        ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), ModBlocks.QUARTZ_BRICK_SLAB.get(), ModBlocks.CALCITE_SLAB.get(),
                        ModBlocks.TUFF_SLAB.get(), ModBlocks.NETHER_BRICK_FENCE_GATE.get(), ModBlocks.IRON_FENCE_GATE.get(),
                        ModBlocks.RAW_IRON_SLAB.get(), ModBlocks.RAW_IRON_STAIRS.get(), ModBlocks.RAW_GOLD_SLAB.get(),
                        ModBlocks.RAW_GOLD_STAIRS.get(), ModBlocks.RAW_COPPER_SLAB.get(), ModBlocks.RAW_COPPER_STAIRS.get(),
                        ModBlocks.SOUL_GLASS_STAIRS.get(), ModBlocks.SOUL_GLASS_SLAB.get(), ModBlocks.OBSIDIAN_BRICKS.get(),
                        ModBlocks.OBSIDIAN_BRICK_STAIRS.get(), ModBlocks.OBSIDIAN_BRICK_SLAB.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get(),
                        ModBlocks.OBSIDIAN_BRICK_WALL.get())
                .addTags(CLAY_BRICK_SLABS, CLAY_BRICK_STAIRS, CLAY_BRICKS, CONCRETE_SLABS, CONCRETE_STAIRS, GLASS_SLABS,
                        GLASS_STAIRS, REDSTONE_LAMPS, TERRACOTTA_SLABS, TERRACOTTA_STAIRS, NETHER_BRICK_FENCE_GATES,
                        SOUL_GLASS, SOUL_GLASS_PANES, TINTED_GLASS_PANES, GLASS_WINDOWS, GLASS_WINDOW_PANES)
                .addOptional(Util.getBlockRegistryName(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get()));
        tag(BlockTags.MINEABLE_WITH_AXE).add(ModBlocks.WEAVER.get(), ModBlocks.SAWMILL.get())
                .addTags(STAINED_PLANK_SLABS, STAINED_PLANK_STAIRS, STAINED_PLANKS, BOARDS, BOARD_STAIRS, BOARD_SLABS);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_STAIRS.get(),
                ModBlocks.OBSIDIAN_BRICK_SLAB.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get());
        tag(BlockTags.DRAGON_IMMUNE).add(ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_STAIRS.get(),
                ModBlocks.OBSIDIAN_BRICK_SLAB.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get(),
                ModBlocks.CHISELED_END_STONE_BRICKS.get(), ModBlocks.END_STONE_BRICK_PILLAR.get(), ModBlocks.POLISHED_END_STONE.get());

        /**********************Forge***********************/
        tag(CLAY_BRICK_SLABS).add(Blocks.BRICK_SLAB).addTag(VANILLA_STAINED_BRICK_SLABS);
        tag(CLAY_BRICK_STAIRS).add(Blocks.BRICK_STAIRS).addTag(VANILLA_STAINED_BRICK_STAIRS);
        tag(CLAY_BRICK_WALLS).add(Blocks.BRICK_WALL).addTag(VANILLA_STAINED_BRICK_WALLS);
        tag(CLAY_BRICKS).add(Blocks.BRICKS).addTag(VANILLA_STAINED_BRICKS);
        tag(CONCRETE_SLABS).addTag(VANILLA_CONCRETE_SLABS);
        tag(CONCRETE_STAIRS).addTag(VANILLA_CONCRETE_STAIRS);
        tag(GLASS_SLABS).add(ModBlocks.GLASS_SLAB.get()).addTag(VANILLA_STAINED_GLASS_SLABS);
        tag(GLASS_STAIRS).add(ModBlocks.GLASS_STAIRS.get()).addTag(VANILLA_STAINED_GLASS_STAIRS);
        tag(GLASS_WINDOWS).add(ModBlocks.GLASS_WINDOW.get()).addTag(VANILLA_STAINED_GLASS_WINDOWS);
        tag(GLASS_WINDOW_PANES).add(ModBlocks.GLASS_WINDOW_PANE.get()).addTag(VANILLA_STAINED_GLASS_WINDOW_PANES);
        tag(REDSTONE_LAMPS).add(Blocks.REDSTONE_LAMP).addTag(VANILLA_REDSTONE_LAMPS);
        tag(CARVED_PUMPKINS).add(Blocks.CARVED_PUMPKIN);
        tag(JACK_O_LANTERNS).add(Blocks.JACK_O_LANTERN);
        tag(TERRACOTTA_SLABS).add(ModBlocks.TERRACOTTA_SLAB.get()).addTag(VANILLA_TERRACOTTA_SLABS);
        tag(TERRACOTTA_STAIRS).add(ModBlocks.TERRACOTTA_STAIRS.get()).addTag(VANILLA_TERRACOTTA_STAIRS);
        tag(WOOL_SLABS).addTag(VANILLA_WOOL_SLABS);
        tag(WOOL_STAIRS).addTag(VANILLA_WOOL_STAIRS);
        tag(STAINED_PLANK_SLABS).addTag(VANILLA_STAINED_PLANK_SLABS);
        tag(STAINED_PLANK_STAIRS).addTag(VANILLA_STAINED_PLANK_STAIRS);
        tag(STAINED_PLANKS).addTag(VANILLA_STAINED_PLANKS);
        tag(NETHER_BRICK_FENCE_GATES).add(ModBlocks.NETHER_BRICK_FENCE_GATE.get());
        tag(SOUL_GLASS).add(ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_WINDOW.get());
        tag(SOUL_GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get());
        tag(TINTED_GLASS).add(Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW.get());
        tag(TINTED_GLASS_PANES).add(ModBlocks.TINTED_GLASS_PANE.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
        tag(BOARDS).add(ModBlocks.OAK_BOARDS.get(), ModBlocks.SPRUCE_BOARDS.get(), ModBlocks.BIRCH_BOARDS.get(),
                ModBlocks.JUNGLE_BOARDS.get(), ModBlocks.ACACIA_BOARDS.get(), ModBlocks.DARK_OAK_BOARDS.get(),
                ModBlocks.CRIMSON_BOARDS.get(), ModBlocks.WARPED_BOARDS.get(), ModBlocks.MANGROVE_BOARDS.get());
        tag(BOARD_STAIRS).add(ModBlocks.OAK_BOARD_STAIRS.get(), ModBlocks.SPRUCE_BOARD_STAIRS.get(), ModBlocks.BIRCH_BOARD_STAIRS.get(),
                ModBlocks.JUNGLE_BOARD_STAIRS.get(), ModBlocks.ACACIA_BOARD_STAIRS.get(), ModBlocks.DARK_OAK_BOARD_STAIRS.get(),
                ModBlocks.CRIMSON_BOARD_STAIRS.get(), ModBlocks.WARPED_BOARD_STAIRS.get(), ModBlocks.MANGROVE_BOARD_STAIRS.get());
        tag(BOARD_SLABS).add(ModBlocks.OAK_BOARD_SLAB.get(), ModBlocks.SPRUCE_BOARD_SLAB.get(), ModBlocks.BIRCH_BOARD_SLAB.get(),
                ModBlocks.JUNGLE_BOARD_SLAB.get(), ModBlocks.ACACIA_BOARD_SLAB.get(), ModBlocks.DARK_OAK_BOARD_SLAB.get(),
                ModBlocks.CRIMSON_BOARD_SLAB.get(), ModBlocks.WARPED_BOARD_SLAB.get(), ModBlocks.MANGROVE_BOARD_SLAB.get());

        tag(Tags.Blocks.GLASS_COLORLESS).add(ModBlocks.GLASS_WINDOW.get());
        tag(Tags.Blocks.GLASS_PANES_COLORLESS).add(ModBlocks.GLASS_WINDOW_PANE.get());
        tag(Tags.Blocks.STAINED_GLASS).addTag(VANILLA_STAINED_GLASS_WINDOWS);
        tag(Tags.Blocks.STAINED_GLASS_PANES).addTag(VANILLA_STAINED_GLASS_WINDOW_PANES);
        tag(Tags.Blocks.SANDSTONE).add(ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get(),
                ModBlocks.CHISELED_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE.get());
    }

    private void vanillaDyedTags() {
        for (int i = 0; i < DyeColor.values().length; i++) {
            String color = DyeColor.byId(i).getName();
            int i1 = CutAndColored.allBlocks.size() - 1;
            while (i1 >= 0) {
                Block block = CutAndColored.allBlocks.get(i1);
                if (isVanillaColored(block, i)) {
                    coloredBlocks.add(block);
                }
                i1--;
            }
            tag(forgeCreate("glass/" + color)).add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MOD_ID, color + "_stained_glass_window")));
            tag(forgeCreate("glass_panes/" + color)).add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MOD_ID, color + "_stained_glass_window_pane")));
        }
        for (int i = 0; i < coloredBlocks.size(); i++) {
            Block block = coloredBlocks.get(i);
            String name = Util.getBlockRegistryName(block).getPath();
            if (name.contains("concrete")) {
                if (name.contains("slab")) {
                    tag(VANILLA_CONCRETE_SLABS).add(block);
                }
                else if (name.contains("stairs")) {
                    tag(VANILLA_CONCRETE_STAIRS).add(block);
                }
            }
            else if (name.contains("redstone_lamp")) {
                tag(VANILLA_REDSTONE_LAMPS).add(block);
            }
            else if (name.contains("stained_brick")) {
                if (name.contains("slab")) {
                    tag(VANILLA_STAINED_BRICK_SLABS).add(block);
                }
                else if (name.contains("stairs")) {
                    tag(VANILLA_STAINED_BRICK_STAIRS).add(block);
                }
                else if (name.contains("wall")) {
                    tag(VANILLA_STAINED_BRICK_WALLS).add(block);
                }
                else if (name.contains("bricks")) {
                    tag(VANILLA_STAINED_BRICKS).add(block);
                }
            }
            else if (name.contains("stained_glass")) {
                if (name.contains("slab")) {
                    tag(VANILLA_STAINED_GLASS_SLABS).add(block);
                }
                else if (name.contains("stairs")) {
                    tag(VANILLA_STAINED_GLASS_STAIRS).add(block);
                }
                else if (name.contains("window")) {
                    if (name.contains("pane")) {
                        tag(VANILLA_STAINED_GLASS_WINDOW_PANES).add(block);
                    }
                    else {
                        tag(VANILLA_STAINED_GLASS_WINDOWS).add(block);
                    }
                }
            }
            else if (name.contains("stained_plank")) {
                if (name.contains("slab")) {
                    tag(VANILLA_STAINED_PLANK_SLABS).add(block);
                }
                else if (name.contains("stairs")) {
                    tag(VANILLA_STAINED_PLANK_STAIRS).add(block);
                }
                else if (name.contains("planks")) {
                    tag(VANILLA_STAINED_PLANKS).add(block);
                }
            }
            else if (name.contains("terracotta")) {
                if (name.contains("slab")) {
                    tag(VANILLA_TERRACOTTA_SLABS).add(block);
                }
                else if (name.contains("stairs")) {
                    tag(VANILLA_TERRACOTTA_STAIRS).add(block);
                }
            }
            else if (name.contains("wool")) {
                if (name.contains("slab")) {
                    tag(VANILLA_WOOL_SLABS).add(block);
                }
                else if (name.contains("stairs")) {
                    tag(VANILLA_WOOL_STAIRS).add(block);
                }
            }
        }
    }

    private boolean isVanillaColored(Block block, int colorIndex) {
        String name = Util.getBlockRegistryName(block).getPath();
        return name.contains(DyeColor.byId(colorIndex).getName()) && !name.contains("blackstone");
    }

    private static TagKey<Block> create(String name) {
        return BlockTags.create(new ResourceLocation(CutAndColored.MOD_ID, name));
    }

    private static TagKey<Block> forgeCreate(String name) {
        return BlockTags.create(new ResourceLocation("forge", name));
    }

    @Override
    public String getName() {
        return "CutAndColored block tags";
    }
}
