package einstein.cutandcolored;

import einstein.cutandcolored.init.ModBlocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.ModList;

public class CreativeTabContents {

    public static void buildContents(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() != CutAndColored.MOD_TAB) {
            return;
        }

        // Work stations
        event.accept(ModBlocks.GLASSCUTTER.get());
        event.accept(ModBlocks.SAWMILL.get());
        event.accept(ModBlocks.WEAVER.get());

        // Oak wood set
        event.accept(ModBlocks.OAK_BOARDS.get());
        event.accept(ModBlocks.OAK_BOARD_STAIRS.get());
        event.accept(ModBlocks.OAK_BOARD_SLAB.get());

        // Spruce wood set
        event.accept(ModBlocks.SPRUCE_BOARDS.get());
        event.accept(ModBlocks.SPRUCE_BOARD_STAIRS.get());
        event.accept(ModBlocks.SPRUCE_BOARD_SLAB.get());
        
        // Birch wood set
        event.accept(ModBlocks.BIRCH_BOARDS.get());
        event.accept(ModBlocks.BIRCH_BOARD_STAIRS.get());
        event.accept(ModBlocks.BIRCH_BOARD_SLAB.get());

        // Jungle wood set
        event.accept(ModBlocks.JUNGLE_BOARDS.get());
        event.accept(ModBlocks.JUNGLE_BOARD_STAIRS.get());
        event.accept(ModBlocks.JUNGLE_BOARD_SLAB.get());
        
        // Acacia wood set
        event.accept(ModBlocks.ACACIA_BOARDS.get());
        event.accept(ModBlocks.ACACIA_BOARD_STAIRS.get());
        event.accept(ModBlocks.ACACIA_BOARD_SLAB.get());

        // Dark oak wood set
        event.accept(ModBlocks.DARK_OAK_BOARDS.get());
        event.accept(ModBlocks.DARK_OAK_BOARD_STAIRS.get());
        event.accept(ModBlocks.DARK_OAK_BOARD_SLAB.get());

        // Mangrove wood set
        event.accept(ModBlocks.MANGROVE_BOARDS.get());
        event.accept(ModBlocks.MANGROVE_BOARD_STAIRS.get());
        event.accept(ModBlocks.MANGROVE_BOARD_SLAB.get());

        // Crimson wood set
        event.accept(ModBlocks.CRIMSON_BOARDS.get());
        event.accept(ModBlocks.CRIMSON_BOARD_STAIRS.get());
        event.accept(ModBlocks.CRIMSON_BOARD_SLAB.get());

        // Warped wood set
        event.accept(ModBlocks.WARPED_BOARDS.get());
        event.accept(ModBlocks.WARPED_BOARD_STAIRS.get());
        event.accept(ModBlocks.WARPED_BOARD_SLAB.get());

        // Stone
        event.accept(ModBlocks.POLISHED_STONE.get());

        // Smooth stone
        event.accept(ModBlocks.SMOOTH_STONE_STAIRS.get());
        event.accept(ModBlocks.SMOOTH_STONE_WALL.get());

        // Stone brick
        event.accept(ModBlocks.CRACKED_STONE_BRICK_STAIRS.get());
        event.accept(ModBlocks.CRACKED_STONE_BRICK_SLAB.get());
        event.accept(ModBlocks.CRACKED_STONE_BRICK_WALL.get());

        // Granite
        event.accept(ModBlocks.POLISHED_GRANITE_WALL.get());
        event.accept(ModBlocks.GRANITE_BRICKS.get());
        event.accept(ModBlocks.GRANITE_BRICK_STAIRS.get());
        event.accept(ModBlocks.GRANITE_BRICK_SLAB.get());
        event.accept(ModBlocks.GRANITE_BRICK_WALL.get());

        // Diorite
        event.accept(ModBlocks.POLISHED_DIORITE_WALL.get());
        event.accept(ModBlocks.DIORITE_BRICKS.get());
        event.accept(ModBlocks.DIORITE_BRICK_STAIRS.get());
        event.accept(ModBlocks.DIORITE_BRICK_SLAB.get());
        event.accept(ModBlocks.DIORITE_BRICK_WALL.get());

        // Andesite
        event.accept(ModBlocks.POLISHED_ANDESITE_WALL);
        event.accept(ModBlocks.ANDESITE_BRICKS.get());
        event.accept(ModBlocks.ANDESITE_BRICK_STAIRS.get());
        event.accept(ModBlocks.ANDESITE_BRICK_SLAB.get());
        event.accept(ModBlocks.ANDESITE_BRICK_WALL.get());

        // Calcite
        event.accept(ModBlocks.CALCITE_STAIRS.get());
        event.accept(ModBlocks.CALCITE_SLAB.get());
        event.accept(ModBlocks.CALCITE_WALL.get());
        
        // Tuff
        event.accept(ModBlocks.TUFF_STAIRS.get());
        event.accept(ModBlocks.TUFF_SLAB.get());
        event.accept(ModBlocks.TUFF_WALL.get());

        // Deepslate bricks
        event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get());
        event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get());
        event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get());

        // Deepslate tiles
        event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get());
        event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get());
        event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get());

        // Soul sandstone
        event.accept(ModBlocks.SOUL_SANDSTONE.get());
        event.accept(ModBlocks.SOUL_SANDSTONE_STAIRS.get());
        event.accept(ModBlocks.SOUL_SANDSTONE_SLAB.get());
        event.accept(ModBlocks.SOUL_SANDSTONE_WALL.get());
        event.accept(ModBlocks.CHISELED_SOUL_SANDSTONE.get());
        event.accept(ModBlocks.SMOOTH_SOUL_SANDSTONE.get());
        event.accept(ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get());
        event.accept(ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get());
        event.accept(ModBlocks.CUT_SOUL_SANDSTONE.get());
        event.accept(ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get());

        // Prismarine bricks
        event.accept(ModBlocks.PRISMARINE_BRICK_PILLAR.get());
        event.accept(ModBlocks.PRISMARINE_BRICK_WALL.get());

        // Dark prismarine bricks
        event.accept(ModBlocks.DARK_PRISMARINE_WALL.get());

        // Obsidian bricks
        event.accept(ModBlocks.OBSIDIAN_BRICKS.get());
        event.accept(ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
        event.accept(ModBlocks.OBSIDIAN_BRICK_STAIRS.get());
        event.accept(ModBlocks.OBSIDIAN_BRICK_SLAB.get());
        event.accept(ModBlocks.OBSIDIAN_BRICK_WALL.get());

        // Nether bricks
        event.accept(ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get());
        event.accept(ModBlocks.CRACKED_NETHER_BRICK_SLAB.get());
        event.accept(ModBlocks.CRACKED_NETHER_BRICK_WALL.get());
        event.accept(ModBlocks.NETHER_BRICK_FENCE_GATE.get());

        // Polished blackstone
        event.accept(ModBlocks.POLISHED_BLACKSTONE_PILLAR.get());

        // Polished blackstone bricks
        event.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
        event.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get());
        event.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get());

        // End stone
        event.accept(ModBlocks.POLISHED_END_STONE.get());

        // End stone brick
        event.accept(ModBlocks.CHISELED_END_STONE_BRICKS.get());
        event.accept(ModBlocks.END_STONE_BRICK_PILLAR.get());

        // Purpur
        event.accept(ModBlocks.PURPUR_WALL.get());

        // Iron
        event.accept(ModBlocks.IRON_FENCE_GATE.get());

        // Quartz brick
        event.accept(ModBlocks.QUARTZ_BRICK_STAIRS.get());
        event.accept(ModBlocks.QUARTZ_BRICK_SLAB.get());
        event.accept(ModBlocks.QUARTZ_BRICK_WALL.get());

        // Raw iron
        event.accept(ModBlocks.RAW_IRON_STAIRS.get());
        event.accept(ModBlocks.RAW_IRON_SLAB.get());

        // Raw copper
        event.accept(ModBlocks.RAW_COPPER_STAIRS.get());
        event.accept(ModBlocks.RAW_COPPER_SLAB.get());

        // Raw gold
        event.accept(ModBlocks.RAW_GOLD_STAIRS.get());
        event.accept(ModBlocks.RAW_GOLD_SLAB.get());

        // Wool stairs
        event.accept(ModBlocks.WHITE_WOOL_STAIRS.get());
        event.accept(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        event.accept(ModBlocks.GRAY_WOOL_STAIRS.get());
        event.accept(ModBlocks.BLACK_WOOL_STAIRS.get());
        event.accept(ModBlocks.BROWN_WOOL_STAIRS.get());
        event.accept(ModBlocks.RED_WOOL_STAIRS.get());
        event.accept(ModBlocks.ORANGE_WOOL_STAIRS.get());
        event.accept(ModBlocks.YELLOW_WOOL_STAIRS.get());
        event.accept(ModBlocks.LIME_WOOL_STAIRS.get());
        event.accept(ModBlocks.GREEN_WOOL_STAIRS.get());
        event.accept(ModBlocks.CYAN_WOOL_STAIRS.get());
        event.accept(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        event.accept(ModBlocks.BLUE_WOOL_STAIRS.get());
        event.accept(ModBlocks.PURPLE_WOOL_STAIRS.get());
        event.accept(ModBlocks.MAGENTA_WOOL_STAIRS.get());
        event.accept(ModBlocks.PINK_WOOL_STAIRS.get());
        
        // Wool slabs
        event.accept(ModBlocks.WHITE_WOOL_SLAB.get());
        event.accept(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get());
        event.accept(ModBlocks.GRAY_WOOL_SLAB.get());
        event.accept(ModBlocks.BLACK_WOOL_SLAB.get());
        event.accept(ModBlocks.BROWN_WOOL_SLAB.get());
        event.accept(ModBlocks.RED_WOOL_SLAB.get());
        event.accept(ModBlocks.ORANGE_WOOL_SLAB.get());
        event.accept(ModBlocks.YELLOW_WOOL_SLAB.get());
        event.accept(ModBlocks.LIME_WOOL_SLAB.get());
        event.accept(ModBlocks.GREEN_WOOL_SLAB.get());
        event.accept(ModBlocks.CYAN_WOOL_SLAB.get());
        event.accept(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get());
        event.accept(ModBlocks.BLUE_WOOL_SLAB.get());
        event.accept(ModBlocks.PURPLE_WOOL_SLAB.get());
        event.accept(ModBlocks.MAGENTA_WOOL_SLAB.get());
        event.accept(ModBlocks.PINK_WOOL_SLAB.get());

        // Terracotta stairs
        event.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        event.accept(ModBlocks.PINK_TERRACOTTA_STAIRS.get());

        // Terracotta slabs
        event.accept(ModBlocks.WHITE_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.GRAY_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.BLACK_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.BROWN_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.RED_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.YELLOW_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.LIME_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.GREEN_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.CYAN_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.BLUE_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.PURPLE_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get());
        event.accept(ModBlocks.PINK_TERRACOTTA_SLAB.get());

        // Concrete stairs
        event.accept(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.RED_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.LIME_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        event.accept(ModBlocks.PINK_CONCRETE_STAIRS.get());

        // Concrete slabs
        event.accept(ModBlocks.WHITE_CONCRETE_SLAB.get());
        event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
        event.accept(ModBlocks.GRAY_CONCRETE_SLAB.get());
        event.accept(ModBlocks.BLACK_CONCRETE_SLAB.get());
        event.accept(ModBlocks.BROWN_CONCRETE_SLAB.get());
        event.accept(ModBlocks.RED_CONCRETE_SLAB.get());
        event.accept(ModBlocks.ORANGE_CONCRETE_SLAB.get());
        event.accept(ModBlocks.YELLOW_CONCRETE_SLAB.get());
        event.accept(ModBlocks.LIME_CONCRETE_SLAB.get());
        event.accept(ModBlocks.GREEN_CONCRETE_SLAB.get());
        event.accept(ModBlocks.CYAN_CONCRETE_SLAB.get());
        event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
        event.accept(ModBlocks.BLUE_CONCRETE_SLAB.get());
        event.accept(ModBlocks.PURPLE_CONCRETE_SLAB.get());
        event.accept(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
        event.accept(ModBlocks.PINK_CONCRETE_SLAB.get());

        // Glass
        event.accept(ModBlocks.SOUL_GLASS.get());

        // Glass panes
        event.accept(ModBlocks.TINTED_GLASS_PANE.get());
        event.accept(ModBlocks.SOUL_GLASS_PANE.get());

        // Horizontal glass panes
        if (ModList.get().isLoaded("horizontalpanes")) {
            event.accept(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get());
        }

        // Glass windows
        event.accept(ModBlocks.GLASS_WINDOW.get());
        event.accept(ModBlocks.TINTED_GLASS_WINDOW.get());
        event.accept(ModBlocks.SOUL_GLASS_WINDOW.get());
        event.accept(ModBlocks.WHITE_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.GRAY_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.BLACK_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.BROWN_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.RED_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.ORANGE_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.YELLOW_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.LIME_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.GREEN_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.CYAN_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.BLUE_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.PURPLE_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.MAGENTA_STAINED_GLASS_WINDOW.get());
        event.accept(ModBlocks.PINK_STAINED_GLASS_WINDOW.get());

        // Glass window panes
        event.accept(ModBlocks.GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.SOUL_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.WHITE_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.GRAY_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.BLACK_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.BROWN_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.RED_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.ORANGE_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.YELLOW_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.LIME_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.GREEN_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.CYAN_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.BLUE_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.PURPLE_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.MAGENTA_STAINED_GLASS_WINDOW_PANE.get());
        event.accept(ModBlocks.PINK_STAINED_GLASS_WINDOW_PANE.get());

        // Glass stairs
        event.accept(ModBlocks.GLASS_STAIRS.get());
        event.accept(ModBlocks.TINTED_GLASS_STAIRS.get());
        event.accept(ModBlocks.SOUL_GLASS_STAIRS.get());
        event.accept(ModBlocks.WHITE_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.GRAY_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.BLACK_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.BROWN_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.RED_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.ORANGE_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.YELLOW_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.LIME_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.GREEN_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.CYAN_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.BLUE_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.PURPLE_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS.get());
        event.accept(ModBlocks.PINK_STAINED_GLASS_STAIRS.get());

        // Glass slabs
        event.accept(ModBlocks.GLASS_SLAB.get());
        event.accept(ModBlocks.TINTED_GLASS_SLAB.get());
        event.accept(ModBlocks.SOUL_GLASS_SLAB.get());
        event.accept(ModBlocks.WHITE_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.GRAY_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.BLACK_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.BROWN_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.RED_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.ORANGE_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.YELLOW_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.LIME_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.GREEN_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.CYAN_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.BLUE_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.PURPLE_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.MAGENTA_STAINED_GLASS_SLAB.get());
        event.accept(ModBlocks.PINK_STAINED_GLASS_SLAB.get());

        // Redstone lamps
        event.accept(ModBlocks.WHITE_REDSTONE_LAMP.get());
        event.accept(ModBlocks.LIGHT_GRAY_REDSTONE_LAMP.get());
        event.accept(ModBlocks.GRAY_REDSTONE_LAMP.get());
        event.accept(ModBlocks.BLACK_REDSTONE_LAMP.get());
        event.accept(ModBlocks.BROWN_REDSTONE_LAMP.get());
        event.accept(ModBlocks.RED_REDSTONE_LAMP.get());
        event.accept(ModBlocks.ORANGE_REDSTONE_LAMP.get());
        event.accept(ModBlocks.YELLOW_REDSTONE_LAMP.get());
        event.accept(ModBlocks.LIME_REDSTONE_LAMP.get());
        event.accept(ModBlocks.GREEN_REDSTONE_LAMP.get());
        event.accept(ModBlocks.CYAN_REDSTONE_LAMP.get());
        event.accept(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP.get());
        event.accept(ModBlocks.BLUE_REDSTONE_LAMP.get());
        event.accept(ModBlocks.PURPLE_REDSTONE_LAMP.get());
        event.accept(ModBlocks.MAGENTA_REDSTONE_LAMP.get());
        event.accept(ModBlocks.PINK_REDSTONE_LAMP.get());
        
        // Stained planks
        event.accept(ModBlocks.WHITE_STAINED_PLANKS.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
        event.accept(ModBlocks.GRAY_STAINED_PLANKS.get());
        event.accept(ModBlocks.BLACK_STAINED_PLANKS.get());
        event.accept(ModBlocks.BROWN_STAINED_PLANKS.get());
        event.accept(ModBlocks.RED_STAINED_PLANKS.get());
        event.accept(ModBlocks.ORANGE_STAINED_PLANKS.get());
        event.accept(ModBlocks.YELLOW_STAINED_PLANKS.get());
        event.accept(ModBlocks.LIME_STAINED_PLANKS.get());
        event.accept(ModBlocks.GREEN_STAINED_PLANKS.get());
        event.accept(ModBlocks.CYAN_STAINED_PLANKS.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
        event.accept(ModBlocks.BLUE_STAINED_PLANKS.get());
        event.accept(ModBlocks.PURPLE_STAINED_PLANKS.get());
        event.accept(ModBlocks.MAGENTA_STAINED_PLANKS.get());
        event.accept(ModBlocks.PINK_STAINED_PLANKS.get());

        // Stained plank stairs
        event.accept(ModBlocks.WHITE_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.GRAY_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.BLACK_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.BROWN_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.RED_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.LIME_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.GREEN_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.CYAN_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.BLUE_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get());
        event.accept(ModBlocks.PINK_STAINED_PLANK_STAIRS.get());

        // Stained plank slabs
        event.accept(ModBlocks.WHITE_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.GRAY_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.BLACK_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.BROWN_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.RED_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.ORANGE_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.YELLOW_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.LIME_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.GREEN_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.CYAN_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.BLUE_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.PURPLE_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get());
        event.accept(ModBlocks.PINK_STAINED_PLANK_SLAB.get());
        
        // Stained bricks
        event.accept(ModBlocks.WHITE_STAINED_BRICKS.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get());
        event.accept(ModBlocks.GRAY_STAINED_BRICKS.get());
        event.accept(ModBlocks.BLACK_STAINED_BRICKS.get());
        event.accept(ModBlocks.BROWN_STAINED_BRICKS.get());
        event.accept(ModBlocks.RED_STAINED_BRICKS.get());
        event.accept(ModBlocks.ORANGE_STAINED_BRICKS.get());
        event.accept(ModBlocks.YELLOW_STAINED_BRICKS.get());
        event.accept(ModBlocks.LIME_STAINED_BRICKS.get());
        event.accept(ModBlocks.GREEN_STAINED_BRICKS.get());
        event.accept(ModBlocks.CYAN_STAINED_BRICKS.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get());
        event.accept(ModBlocks.BLUE_STAINED_BRICKS.get());
        event.accept(ModBlocks.PURPLE_STAINED_BRICKS.get());
        event.accept(ModBlocks.MAGENTA_STAINED_BRICKS.get());
        event.accept(ModBlocks.PINK_STAINED_BRICKS.get());
        
        // Stained brick stairs
        event.accept(ModBlocks.WHITE_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.GRAY_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.BLACK_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.BROWN_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.RED_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.LIME_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.GREEN_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.CYAN_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.BLUE_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get());
        event.accept(ModBlocks.PINK_STAINED_BRICK_STAIRS.get());

        // Stained brick slabs
        event.accept(ModBlocks.WHITE_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.GRAY_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.BLACK_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.BROWN_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.RED_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.ORANGE_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.YELLOW_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.LIME_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.GREEN_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.CYAN_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.BLUE_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.PURPLE_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get());
        event.accept(ModBlocks.PINK_STAINED_BRICK_SLAB.get());

        // Stained brick walls
        event.accept(ModBlocks.WHITE_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.GRAY_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.BLACK_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.BROWN_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.RED_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.ORANGE_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.YELLOW_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.LIME_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.GREEN_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.CYAN_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.BLUE_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.PURPLE_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get());
        event.accept(ModBlocks.PINK_STAINED_BRICK_WALL.get());
    }
}
