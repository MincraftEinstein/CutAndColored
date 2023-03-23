package einstein.cutandcolored.init;

import java.util.function.Supplier;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.block.GlassSlabBlock;
import einstein.cutandcolored.block.GlassStairsBlock;
import einstein.cutandcolored.block.GlasscutterBlock;
import einstein.cutandcolored.block.HorizontalSoulGlassPane;
import einstein.cutandcolored.block.IronFenceGateBlock;
import einstein.cutandcolored.block.SawmillBlock;
import einstein.cutandcolored.block.StainedGlassSlabBlock;
import einstein.cutandcolored.block.StainedGlassStairsBlock;
import einstein.cutandcolored.block.TintedGlassPane;
import einstein.cutandcolored.block.TintedGlassSlabBlock;
import einstein.cutandcolored.block.TintedGlassStairsBlock;
import einstein.cutandcolored.block.WeaverBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TintedGlassBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutAndColored.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CutAndColored.MOD_ID);
	
    /*********************WORK_STATIONS**********************/
    public static final RegistryObject<Block> GLASSCUTTER = register("glasscutter", () -> new GlasscutterBlock(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5F)));
    public static final RegistryObject<Block> WEAVER = register("weaver", () -> new WeaverBlock(Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1.3F)));
    public static final RegistryObject<Block> SAWMILL = register("sawmill", () -> new SawmillBlock(Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1.3F)));
    
    /************************GLASS***************************/
    // FULL BLOCKS
    public static final RegistryObject<Block> SOUL_GLASS = register("soul_glass", () -> new GlassBlock(BlockProperties.GLASS));
    
    // PANES
    public static final RegistryObject<Block> SOUL_GLASS_PANE = register("soul_glass_pane", () -> new IronBarsBlock(BlockProperties.GLASS));
    public static final RegistryObject<Block> TINTED_GLASS_PANE = register("tinted_glass_pane", () -> new TintedGlassPane(Properties.copy(Blocks.GLASS_PANE).color(MaterialColor.COLOR_GRAY).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never)));
    public static final RegistryObject<Block> HORIZONTAL_SOUL_GLASS_PANE = register("horizontalpanes", "horizontal_soul_glass_pane", () -> new HorizontalSoulGlassPane(Properties.of(Material.GLASS).noOcclusion().strength(0.3F, 0.3F).sound(SoundType.GLASS)));
    
    // STAIRS
    public static final RegistryObject<Block> GLASS_STAIRS = register("glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> TINTED_GLASS_STAIRS = register("tinted_glass_stairs", () -> new TintedGlassStairsBlock(Blocks.TINTED_GLASS, Properties.copy(Blocks.TINTED_GLASS).color(MaterialColor.COLOR_GRAY).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never)));
    public static final RegistryObject<Block> SOUL_GLASS_STAIRS = register("soul_glass_stairs", () -> new GlassStairsBlock(ModBlocks.SOUL_GLASS.get(), Properties.copy(ModBlocks.SOUL_GLASS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_STAIRS = register("white_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS, Properties.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_STAIRS = register("orange_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS, Properties.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_STAIRS = register("magenta_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS, Properties.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = register("light_blue_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS, Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_STAIRS = register("yellow_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS, Properties.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final RegistryObject<Block> LIME_STAINED_GLASS_STAIRS = register("lime_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS, Properties.copy(Blocks.LIME_STAINED_GLASS)));
    public static final RegistryObject<Block> PINK_STAINED_GLASS_STAIRS = register("pink_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS, Properties.copy(Blocks.PINK_STAINED_GLASS)));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_STAIRS = register("gray_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS, Properties.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = register("light_gray_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS, Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_STAIRS = register("cyan_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS, Properties.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_STAIRS = register("purple_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS, Properties.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_STAIRS = register("blue_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS, Properties.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_STAIRS = register("brown_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS, Properties.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_STAIRS = register("green_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS, Properties.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final RegistryObject<Block> RED_STAINED_GLASS_STAIRS = register("red_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS, Properties.copy(Blocks.RED_STAINED_GLASS)));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_STAIRS = register("black_stained_glass_stairs", () -> new StainedGlassStairsBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS, Properties.copy(Blocks.BLACK_STAINED_GLASS)));
    
    // SLABS
    public static final RegistryObject<Block> GLASS_SLAB = register("glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> TINTED_GLASS_SLAB = register("tinted_glass_slab", () -> new TintedGlassSlabBlock(Blocks.TINTED_GLASS, Properties.copy(Blocks.TINTED_GLASS).color(MaterialColor.COLOR_GRAY).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never)));
    public static final RegistryObject<Block> SOUL_GLASS_SLAB = register("soul_glass_slab", () -> new GlassSlabBlock(ModBlocks.SOUL_GLASS.get(), Properties.copy(ModBlocks.SOUL_GLASS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_SLAB = register("white_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS, Properties.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB = register("orange_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS, Properties.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB = register("magenta_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS, Properties.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = register("light_blue_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS, Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB = register("yellow_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS, Properties.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final RegistryObject<Block> LIME_STAINED_GLASS_SLAB = register("lime_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS, Properties.copy(Blocks.LIME_STAINED_GLASS)));
    public static final RegistryObject<Block> PINK_STAINED_GLASS_SLAB = register("pink_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS, Properties.copy(Blocks.PINK_STAINED_GLASS)));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_SLAB = register("gray_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS, Properties.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = register("light_gray_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS, Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_SLAB = register("cyan_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS, Properties.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB = register("purple_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS, Properties.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_SLAB = register("blue_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS, Properties.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_SLAB = register("brown_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS, Properties.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_SLAB = register("green_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS, Properties.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final RegistryObject<Block> RED_STAINED_GLASS_SLAB = register("red_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS, Properties.copy(Blocks.RED_STAINED_GLASS)));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_SLAB = register("black_stained_glass_slab", () -> new StainedGlassSlabBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS, Properties.copy(Blocks.BLACK_STAINED_GLASS)));
    
    // WINDOWS
    public static final RegistryObject<Block> GLASS_WINDOW = register("glass_window", () -> new GlassBlock(BlockProperties.GLASS));
    public static final RegistryObject<Block> TINTED_GLASS_WINDOW = register("tinted_glass_window", () -> new TintedGlassBlock(BlockProperties.TINTED_GLASS));
    public static final RegistryObject<Block> SOUL_GLASS_WINDOW = register("soul_glass_window", () -> new GlassBlock(Properties.copy(SOUL_GLASS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_WINDOW = register("white_stained_glass_window", () -> new StainedGlassBlock(DyeColor.WHITE, BlockProperties.GLASS));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_WINDOW = register("orange_stained_glass_window", () -> new StainedGlassBlock(DyeColor.ORANGE, BlockProperties.GLASS));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_WINDOW = register("magenta_stained_glass_window", () -> new StainedGlassBlock(DyeColor.MAGENTA, BlockProperties.GLASS));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_WINDOW = register("light_blue_stained_glass_window", () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockProperties.GLASS));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_WINDOW = register("yellow_stained_glass_window", () -> new StainedGlassBlock(DyeColor.YELLOW, BlockProperties.GLASS));
    public static final RegistryObject<Block> LIME_STAINED_GLASS_WINDOW = register("lime_stained_glass_window", () -> new StainedGlassBlock(DyeColor.LIME, BlockProperties.GLASS));
    public static final RegistryObject<Block> PINK_STAINED_GLASS_WINDOW = register("pink_stained_glass_window", () -> new StainedGlassBlock(DyeColor.PINK, BlockProperties.GLASS));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_WINDOW = register("gray_stained_glass_window", () -> new StainedGlassBlock(DyeColor.GRAY, BlockProperties.GLASS));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_WINDOW = register("light_gray_stained_glass_window", () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockProperties.GLASS));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_WINDOW = register("cyan_stained_glass_window", () -> new StainedGlassBlock(DyeColor.CYAN, BlockProperties.GLASS));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_WINDOW = register("purple_stained_glass_window", () -> new StainedGlassBlock(DyeColor.PURPLE, BlockProperties.GLASS));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_WINDOW = register("blue_stained_glass_window", () -> new StainedGlassBlock(DyeColor.BLUE, BlockProperties.GLASS));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_WINDOW = register("brown_stained_glass_window", () -> new StainedGlassBlock(DyeColor.BROWN, BlockProperties.GLASS));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_WINDOW = register("green_stained_glass_window", () -> new StainedGlassBlock(DyeColor.GREEN, BlockProperties.GLASS));
    public static final RegistryObject<Block> RED_STAINED_GLASS_WINDOW = register("red_stained_glass_window", () -> new StainedGlassBlock(DyeColor.RED, BlockProperties.GLASS));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_WINDOW = register("black_stained_glass_window", () -> new StainedGlassBlock(DyeColor.BLACK, BlockProperties.GLASS));
    
    // WINDOW PANES
    public static final RegistryObject<Block> GLASS_WINDOW_PANE = register("glass_window_pane", () -> new IronBarsBlock(BlockProperties.GLASS));
    public static final RegistryObject<Block> TINTED_GLASS_WINDOW_PANE = register("tinted_glass_window_pane", () -> new TintedGlassPane(BlockProperties.TINTED_GLASS));
    public static final RegistryObject<Block> SOUL_GLASS_WINDOW_PANE = register("soul_glass_window_pane", () -> new IronBarsBlock(BlockProperties.GLASS));
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_WINDOW_PANE = register("white_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.WHITE, BlockProperties.GLASS));
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_WINDOW_PANE = register("orange_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.ORANGE, BlockProperties.GLASS));
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_WINDOW_PANE = register("magenta_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.MAGENTA, BlockProperties.GLASS));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_WINDOW_PANE = register("light_blue_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockProperties.GLASS));
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_WINDOW_PANE = register("yellow_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.YELLOW, BlockProperties.GLASS));
    public static final RegistryObject<Block> LIME_STAINED_GLASS_WINDOW_PANE = register("lime_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.LIME, BlockProperties.GLASS));
    public static final RegistryObject<Block> PINK_STAINED_GLASS_WINDOW_PANE = register("pink_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.PINK, BlockProperties.GLASS));
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_WINDOW_PANE = register("gray_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.GRAY, BlockProperties.GLASS));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_WINDOW_PANE = register("light_gray_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockProperties.GLASS));
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_WINDOW_PANE = register("cyan_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockProperties.GLASS));
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_WINDOW_PANE = register("purple_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.PURPLE, BlockProperties.GLASS));
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_WINDOW_PANE = register("blue_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.BLUE, BlockProperties.GLASS));
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_WINDOW_PANE = register("brown_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.BROWN, BlockProperties.GLASS));
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_WINDOW_PANE = register("green_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.GREEN, BlockProperties.GLASS));
    public static final RegistryObject<Block> RED_STAINED_GLASS_WINDOW_PANE = register("red_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.RED, BlockProperties.GLASS));
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_WINDOW_PANE = register("black_stained_glass_window_pane", () -> new StainedGlassPaneBlock(DyeColor.BLACK, BlockProperties.GLASS));
    
    /*************************WOOL**************************/
    // STAIRS
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = register("white_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = register("orange_wool_stairs", () -> new StairBlock(Blocks.ORANGE_WOOL::defaultBlockState, Properties.copy(Blocks.ORANGE_WOOL)));
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = register("magenta_wool_stairs", () -> new StairBlock(Blocks.MAGENTA_WOOL::defaultBlockState, Properties.copy(Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = register("light_blue_wool_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_WOOL::defaultBlockState, Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = register("yellow_wool_stairs", () -> new StairBlock(Blocks.YELLOW_WOOL::defaultBlockState, Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = register("lime_wool_stairs", () -> new StairBlock(Blocks.LIME_WOOL::defaultBlockState, Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = register("pink_wool_stairs", () -> new StairBlock(Blocks.PINK_WOOL::defaultBlockState, Properties.copy(Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = register("gray_wool_stairs", () -> new StairBlock(Blocks.GRAY_WOOL::defaultBlockState, Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = register("light_gray_wool_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_WOOL::defaultBlockState, Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = register("cyan_wool_stairs", () -> new StairBlock(Blocks.CYAN_WOOL::defaultBlockState, Properties.copy(Blocks.CYAN_WOOL)));
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = register("purple_wool_stairs", () -> new StairBlock(Blocks.PURPLE_WOOL::defaultBlockState, Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = register("blue_wool_stairs", () -> new StairBlock(Blocks.BLUE_WOOL::defaultBlockState, Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = register("brown_wool_stairs", () -> new StairBlock(Blocks.BROWN_WOOL::defaultBlockState, Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = register("green_wool_stairs", () -> new StairBlock(Blocks.GREEN_WOOL::defaultBlockState, Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> RED_WOOL_STAIRS = register("red_wool_stairs", () -> new StairBlock(Blocks.RED_WOOL::defaultBlockState, Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = register("black_wool_stairs", () -> new StairBlock(Blocks.BLACK_WOOL::defaultBlockState, Properties.copy(Blocks.BLACK_WOOL)));
    
    // SLABS
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = register("white_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = register("orange_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.ORANGE_WOOL)));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = register("magenta_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = register("light_blue_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = register("yellow_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = register("lime_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = register("pink_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = register("gray_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = register("light_gray_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = register("cyan_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.CYAN_WOOL)));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = register("purple_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.PURPLE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = register("blue_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = register("brown_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = register("green_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> RED_WOOL_SLAB = register("red_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = register("black_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.BLACK_WOOL)));
    
    /*******************STAINED_PLANKS**********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = register("white_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.SNOW)));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = register("orange_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = register("magenta_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = register("light_blue_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = register("yellow_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LIME_STAINED_PLANKS = register("lime_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> PINK_STAINED_PLANKS = register("pink_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_PINK)));
    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = register("gray_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = register("light_gray_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = register("cyan_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_CYAN)));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = register("purple_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = register("blue_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = register("brown_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = register("green_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_GREEN)));
    public static final RegistryObject<Block> RED_STAINED_PLANKS = register("red_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = register("black_stained_planks", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_BLACK)));
    
    // STAIRS
    public static final RegistryObject<Block> WHITE_STAINED_PLANK_STAIRS = register("white_stained_plank_stairs", () -> new StairBlock(ModBlocks.WHITE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANK_STAIRS = register("orange_stained_plank_stairs", () -> new StairBlock(ModBlocks.ORANGE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANK_STAIRS = register("magenta_stained_plank_stairs", () -> new StairBlock(ModBlocks.MAGENTA_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANK_STAIRS = register("light_blue_stained_plank_stairs", () -> new StairBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANK_STAIRS = register("yellow_stained_plank_stairs", () -> new StairBlock(ModBlocks.YELLOW_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_PLANK_STAIRS = register("lime_stained_plank_stairs", () -> new StairBlock(ModBlocks.LIME_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_PLANK_STAIRS = register("pink_stained_plank_stairs", () -> new StairBlock(ModBlocks.PINK_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_PLANK_STAIRS = register("gray_stained_plank_stairs", () -> new StairBlock(ModBlocks.GRAY_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANK_STAIRS = register("light_gray_stained_plank_stairs", () -> new StairBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_PLANK_STAIRS = register("cyan_stained_plank_stairs", () -> new StairBlock(ModBlocks.CYAN_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANK_STAIRS = register("purple_stained_plank_stairs", () -> new StairBlock(ModBlocks.PURPLE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_PLANK_STAIRS = register("blue_stained_plank_stairs", () -> new StairBlock(ModBlocks.BLUE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_PLANK_STAIRS = register("brown_stained_plank_stairs", () -> new StairBlock(ModBlocks.BROWN_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_PLANK_STAIRS = register("green_stained_plank_stairs", () -> new StairBlock(ModBlocks.GREEN_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_PLANK_STAIRS = register("red_stained_plank_stairs", () -> new StairBlock(ModBlocks.RED_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.RED_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_PLANK_STAIRS = register("black_stained_plank_stairs", () -> new StairBlock(ModBlocks.BLACK_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get())));
    
    // SLABS
    public static final RegistryObject<Block> WHITE_STAINED_PLANK_SLAB = register("white_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANK_SLAB = register("orange_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANK_SLAB = register("magenta_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANK_SLAB = register("light_blue_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANK_SLAB = register("yellow_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_PLANK_SLAB = register("lime_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_PLANK_SLAB = register("pink_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_PLANK_SLAB = register("gray_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANK_SLAB = register("light_gray_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_PLANK_SLAB = register("cyan_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANK_SLAB = register("purple_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_PLANK_SLAB = register("blue_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_PLANK_SLAB = register("brown_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_PLANK_SLAB = register("green_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_PLANK_SLAB = register("red_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.RED_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_PLANK_SLAB = register("black_stained_plank_slab", () -> new SlabBlock(Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get())));
    
    /*********************TERRACOTTA************************/
    // STAIRS
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = register("terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", () -> new StairBlock(Blocks.ORANGE_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", () -> new StairBlock(Blocks.YELLOW_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", () -> new StairBlock(Blocks.LIME_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", () -> new StairBlock(Blocks.PINK_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", () -> new StairBlock(Blocks.GRAY_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", () -> new StairBlock(Blocks.CYAN_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", () -> new StairBlock(Blocks.PURPLE_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", () -> new StairBlock(Blocks.BLUE_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", () -> new StairBlock(Blocks.BROWN_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", () -> new StairBlock(Blocks.GREEN_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", () -> new StairBlock(Blocks.RED_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", () -> new StairBlock(Blocks.BLACK_TERRACOTTA::defaultBlockState, Properties.copy(Blocks.BLACK_TERRACOTTA)));
    
    // SLABS
    public static final RegistryObject<Block> TERRACOTTA_SLAB = register("terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = register("red_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.BLACK_TERRACOTTA)));
    
    /**********************CONCRETE*************************/
    // STAIRS
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", () -> new StairBlock(Blocks.ORANGE_CONCRETE::defaultBlockState, Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", () -> new StairBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState, Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState, Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", () -> new StairBlock(Blocks.YELLOW_CONCRETE::defaultBlockState, Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", () -> new StairBlock(Blocks.LIME_CONCRETE::defaultBlockState, Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", () -> new StairBlock(Blocks.PINK_CONCRETE::defaultBlockState, Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", () -> new StairBlock(Blocks.GRAY_CONCRETE::defaultBlockState, Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState, Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", () -> new StairBlock(Blocks.CYAN_CONCRETE::defaultBlockState, Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", () -> new StairBlock(Blocks.PURPLE_CONCRETE::defaultBlockState, Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", () -> new StairBlock(Blocks.BLUE_CONCRETE::defaultBlockState, Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE::defaultBlockState, Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", () -> new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState, Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = register("red_concrete_stairs", () -> new StairBlock(Blocks.RED_CONCRETE::defaultBlockState, Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", () -> new StairBlock(Blocks.BLACK_CONCRETE::defaultBlockState, Properties.copy(Blocks.BLACK_CONCRETE)));
    
	// SLABS
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = register("white_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = register("lime_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = register("pink_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = register("gray_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = register("blue_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = register("brown_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = register("green_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = register("red_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = register("black_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.BLACK_CONCRETE)));
    
    /*******************STAINED_BRICKS**********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> WHITE_STAINED_BRICKS = register("white_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.SNOW)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICKS = register("orange_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICKS = register("magenta_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICKS = register("light_blue_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICKS = register("yellow_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LIME_STAINED_BRICKS = register("lime_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> PINK_STAINED_BRICKS = register("pink_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_PINK)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICKS = register("gray_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICKS = register("light_gray_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICKS = register("cyan_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_CYAN)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICKS = register("purple_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICKS = register("blue_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICKS = register("brown_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICKS = register("green_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_GREEN)));
    public static final RegistryObject<Block> RED_STAINED_BRICKS = register("red_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICKS = register("black_stained_bricks", () -> new Block(BlockProperties.stainedBricks(MaterialColor.COLOR_BLACK)));
    
    // STAIRS
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_STAIRS = register("white_stained_brick_stairs", () -> new StairBlock(ModBlocks.WHITE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.WHITE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_STAIRS = register("orange_stained_brick_stairs", () -> new StairBlock(ModBlocks.ORANGE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.ORANGE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_STAIRS = register("magenta_stained_brick_stairs", () -> new StairBlock(ModBlocks.MAGENTA_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.MAGENTA_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_STAIRS = register("light_blue_stained_brick_stairs", () -> new StairBlock(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_STAIRS = register("yellow_stained_brick_stairs", () -> new StairBlock(ModBlocks.YELLOW_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.YELLOW_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_STAIRS = register("lime_stained_brick_stairs", () -> new StairBlock(ModBlocks.LIME_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.LIME_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_STAIRS = register("pink_stained_brick_stairs", () -> new StairBlock(ModBlocks.PINK_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_STAIRS = register("gray_stained_brick_stairs", () -> new StairBlock(ModBlocks.GRAY_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_STAIRS = register("light_gray_stained_brick_stairs", () -> new StairBlock(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_STAIRS = register("cyan_stained_brick_stairs", () -> new StairBlock(ModBlocks.CYAN_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.CYAN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_STAIRS = register("purple_stained_brick_stairs", () -> new StairBlock(ModBlocks.PURPLE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.PURPLE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_STAIRS = register("blue_stained_brick_stairs", () -> new StairBlock(ModBlocks.BLUE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_STAIRS = register("brown_stained_brick_stairs", () -> new StairBlock(ModBlocks.BROWN_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.BROWN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_STAIRS = register("green_stained_brick_stairs", () -> new StairBlock(ModBlocks.GREEN_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> RED_STAINED_BRICK_STAIRS = register("red_stained_brick_stairs", () -> new StairBlock(ModBlocks.RED_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.RED_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_STAIRS = register("black_stained_brick_stairs", () -> new StairBlock(ModBlocks.BLACK_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.BLACK_STAINED_BRICKS.get())));
    
    // SLABS
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_SLAB = register("white_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.WHITE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_SLAB = register("orange_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.ORANGE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_SLAB = register("magenta_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.MAGENTA_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_SLAB = register("light_blue_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_SLAB = register("yellow_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.YELLOW_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_SLAB = register("lime_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.LIME_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_SLAB = register("pink_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_SLAB = register("gray_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_SLAB = register("light_gray_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_SLAB = register("cyan_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.CYAN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_SLAB = register("purple_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.PURPLE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_SLAB = register("blue_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_SLAB = register("brown_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.BROWN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_SLAB = register("green_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> RED_STAINED_BRICK_SLAB = register("red_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.RED_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_SLAB = register("black_stained_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.BLACK_STAINED_BRICKS.get())));
    
    // WALLS
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_WALL = register("white_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.WHITE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_WALL = register("orange_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.ORANGE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_WALL = register("magenta_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.MAGENTA_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_WALL = register("light_blue_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_WALL = register("yellow_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.YELLOW_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_WALL = register("lime_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.LIME_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_WALL = register("pink_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_WALL = register("gray_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_WALL = register("light_gray_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_WALL = register("cyan_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.CYAN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_WALL = register("purple_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.PURPLE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_WALL = register("blue_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_WALL = register("brown_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.BROWN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_WALL = register("green_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> RED_STAINED_BRICK_WALL = register("red_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.RED_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_WALL = register("black_stained_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.BLACK_STAINED_BRICKS.get())));
    
    /************************LAMPS**************************/
    public static final RegistryObject<Block> WHITE_REDSTONE_LAMP = register("white_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> ORANGE_REDSTONE_LAMP = register("orange_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> MAGENTA_REDSTONE_LAMP = register("magenta_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> LIGHT_BLUE_REDSTONE_LAMP = register("light_blue_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> YELLOW_REDSTONE_LAMP = register("yellow_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> LIME_REDSTONE_LAMP = register("lime_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> PINK_REDSTONE_LAMP = register("pink_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> GRAY_REDSTONE_LAMP = register("gray_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> LIGHT_GRAY_REDSTONE_LAMP = register("light_gray_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> CYAN_REDSTONE_LAMP = register("cyan_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> PURPLE_REDSTONE_LAMP = register("purple_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> BLUE_REDSTONE_LAMP = register("blue_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> BROWN_REDSTONE_LAMP = register("brown_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> GREEN_REDSTONE_LAMP = register("green_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> RED_REDSTONE_LAMP = register("red_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> BLACK_REDSTONE_LAMP = register("black_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    
    /******************GRANITE_BRICKS***********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> GRANITE_BRICKS = register("granite_bricks", () -> new Block(BlockProperties.stone(MaterialColor.DIRT)));

    // STAIRS
    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = register("granite_brick_stairs", () -> new StairBlock(ModBlocks.GRANITE_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.GRANITE_BRICKS.get())));
    
    // SLABS
    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = register("granite_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.GRANITE_BRICKS.get())));
    
    // WALLS
    public static final RegistryObject<Block> GRANITE_BRICK_WALL = register("granite_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.GRANITE_BRICKS.get())));
    
    /******************DIORITE_BRICKS***********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> DIORITE_BRICKS = register("diorite_bricks", () -> new Block(BlockProperties.stone(MaterialColor.QUARTZ)));

    // STAIRS
    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", () -> new StairBlock(ModBlocks.DIORITE_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.DIORITE_BRICKS.get())));

    // SLABS
    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = register("diorite_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.DIORITE_BRICKS.get())));

    // WALLS
    public static final RegistryObject<Block> DIORITE_BRICK_WALL = register("diorite_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.DIORITE_BRICKS.get())));
    
    /******************ANDESITE_BRICKS**********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> ANDESITE_BRICKS = register("andesite_bricks", () -> new Block(BlockProperties.stone(MaterialColor.STONE)));
    
    // STAIRS
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", () -> new StairBlock(ModBlocks.ANDESITE_BRICKS.get()::defaultBlockState, Properties.copy(ModBlocks.ANDESITE_BRICKS.get())));
    
    // SLABS
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = register("andesite_brick_slab", () -> new SlabBlock(Properties.copy(ModBlocks.ANDESITE_BRICKS.get())));
    
    // WALLS
    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = register("andesite_brick_wall", () -> new WallBlock(Properties.copy(ModBlocks.ANDESITE_BRICKS.get())));

    /*******************SOUL_SANDSTONE**********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> SOUL_SANDSTONE = register("soul_sandstone", () -> new Block(BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", () -> new Block(BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", () -> new Block(BlockProperties.SOUL_SANDSTONE));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", () -> new Block(BlockProperties.SOUL_SANDSTONE));
    
    // STAIRS
    public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", () -> new StairBlock(ModBlocks.SOUL_SANDSTONE.get()::defaultBlockState, Properties.copy(ModBlocks.SOUL_SANDSTONE.get())));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", () -> new StairBlock(ModBlocks.SMOOTH_SOUL_SANDSTONE.get()::defaultBlockState, Properties.copy(ModBlocks.SMOOTH_SOUL_SANDSTONE.get())));
    
    // SLABS
    public static final RegistryObject<Block> SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", () -> new SlabBlock(Properties.copy(ModBlocks.SOUL_SANDSTONE.get())));
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", () -> new SlabBlock(Properties.copy(ModBlocks.CUT_SOUL_SANDSTONE.get())));
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", () -> new SlabBlock(Properties.copy(ModBlocks.SMOOTH_SOUL_SANDSTONE.get())));
    
    // WALLS
    public static final RegistryObject<Block> SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", () -> new WallBlock(Properties.copy(ModBlocks.SOUL_SANDSTONE.get())));
    
    /**********************WOOD_BOARDS**********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> OAK_BOARDS = register("oak_boards", () -> new Block(BlockProperties.planks(MaterialColor.WOOD)));
    public static final RegistryObject<Block> SPRUCE_BOARDS = register("spruce_boards", () -> new Block(BlockProperties.planks(MaterialColor.PODZOL)));
    public static final RegistryObject<Block> BIRCH_BOARDS = register("birch_boards", () -> new Block(BlockProperties.planks(MaterialColor.SAND)));
    public static final RegistryObject<Block> JUNGLE_BOARDS = register("jungle_boards", () -> new Block(BlockProperties.planks(MaterialColor.DIRT)));
    public static final RegistryObject<Block> ACACIA_BOARDS = register("acacia_boards", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> DARK_OAK_BOARDS = register("dark_oak_boards", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> MANGROVE_BOARDS = register("mangrove_boards", () -> new Block(BlockProperties.planks(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> CRIMSON_BOARDS = register("crimson_boards", () -> new Block(BlockProperties.netherPlanks(MaterialColor.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_BOARDS = register("warped_boards", () -> new Block(BlockProperties.netherPlanks(MaterialColor.WARPED_STEM)));
    
    // STAIRS
    public static final RegistryObject<Block> OAK_BOARD_STAIRS = register("oak_board_stairs", () -> new StairBlock(OAK_BOARDS.get()::defaultBlockState, Properties.copy(OAK_BOARDS.get())));
    public static final RegistryObject<Block> SPRUCE_BOARD_STAIRS = register("spruce_board_stairs", () -> new StairBlock(SPRUCE_BOARDS.get()::defaultBlockState, Properties.copy(SPRUCE_BOARDS.get())));
    public static final RegistryObject<Block> BIRCH_BOARD_STAIRS = register("birch_board_stairs", () -> new StairBlock(BIRCH_BOARDS.get()::defaultBlockState, Properties.copy(BIRCH_BOARDS.get())));
    public static final RegistryObject<Block> JUNGLE_BOARD_STAIRS = register("jungle_board_stairs", () -> new StairBlock(JUNGLE_BOARDS.get()::defaultBlockState, Properties.copy(JUNGLE_BOARDS.get())));
    public static final RegistryObject<Block> ACACIA_BOARD_STAIRS = register("acacia_board_stairs", () -> new StairBlock(ACACIA_BOARDS.get()::defaultBlockState, Properties.copy(ACACIA_BOARDS.get())));
    public static final RegistryObject<Block> DARK_OAK_BOARD_STAIRS = register("dark_oak_board_stairs", () -> new StairBlock(DARK_OAK_BOARDS.get()::defaultBlockState, Properties.copy(DARK_OAK_BOARDS.get())));
    public static final RegistryObject<Block> MANGROVE_BOARD_STAIRS = register("mangrove_board_stairs", () -> new StairBlock(MANGROVE_BOARDS.get()::defaultBlockState, Properties.copy(MANGROVE_BOARDS.get())));
    public static final RegistryObject<Block> CRIMSON_BOARD_STAIRS = register("crimson_board_stairs", () -> new StairBlock(CRIMSON_BOARDS.get()::defaultBlockState, Properties.copy(CRIMSON_BOARDS.get())));
    public static final RegistryObject<Block> WARPED_BOARD_STAIRS = register("warped_board_stairs", () -> new StairBlock(WARPED_BOARDS.get()::defaultBlockState, Properties.copy(WARPED_BOARDS.get())));
    
    // SLABS
    public static final RegistryObject<Block> OAK_BOARD_SLAB = register("oak_board_slab", () -> new SlabBlock(Properties.copy(OAK_BOARDS.get())));
    public static final RegistryObject<Block> SPRUCE_BOARD_SLAB = register("spruce_board_slab", () -> new SlabBlock(Properties.copy(SPRUCE_BOARDS.get())));
    public static final RegistryObject<Block> BIRCH_BOARD_SLAB = register("birch_board_slab", () -> new SlabBlock(Properties.copy(BIRCH_BOARDS.get())));
    public static final RegistryObject<Block> JUNGLE_BOARD_SLAB = register("jungle_board_slab", () -> new SlabBlock(Properties.copy(JUNGLE_BOARDS.get())));
    public static final RegistryObject<Block> ACACIA_BOARD_SLAB = register("acacia_board_slab", () -> new SlabBlock(Properties.copy(ACACIA_BOARDS.get())));
    public static final RegistryObject<Block> DARK_OAK_BOARD_SLAB = register("dark_oak_board_slab", () -> new SlabBlock(Properties.copy(DARK_OAK_BOARDS.get())));
    public static final RegistryObject<Block> MANGROVE_BOARD_SLAB = register("mangrove_board_slab", () -> new SlabBlock(Properties.copy(MANGROVE_BOARDS.get())));
    public static final RegistryObject<Block> CRIMSON_BOARD_SLAB = register("crimson_board_slab", () -> new SlabBlock(Properties.copy(CRIMSON_BOARDS.get())));
    public static final RegistryObject<Block> WARPED_BOARD_SLAB = register("warped_board_slab", () -> new SlabBlock(Properties.copy(WARPED_BOARDS.get())));
    
    /**********************MISC_BLOCKS**********************/
    // FULL BLOCKS
    public static final RegistryObject<Block> CHISELED_PRISMARINE_BRICKS = register("chiseled_prismarine_bricks", () -> new Block(Properties.copy(Blocks.PRISMARINE_BRICKS)) {
        @Override
        public boolean isConduitFrame(BlockState state, LevelReader level, BlockPos pos, BlockPos conduit) {
            return true;
        }
    });
    public static final RegistryObject<Block> PRISMARINE_BRICK_PILLAR = register("prismarine_brick_pillar", () -> new RotatedPillarBlock(Properties.copy(Blocks.PRISMARINE_BRICKS)) {
        @Override
        public boolean isConduitFrame(BlockState state, LevelReader level, BlockPos pos, BlockPos conduit) {
            return true;
        }
    });
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_PILLAR = register("polished_blackstone_pillar", () -> new RotatedPillarBlock(Properties.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final RegistryObject<Block> END_STONE_BRICK_PILLAR = register("end_stone_brick_pillar", () -> new RotatedPillarBlock(Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_END_STONE = register("polished_end_stone", () -> new Block(Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = register("chiseled_end_stone_bricks", () -> new Block(Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_STONE = register("polished_stone", () -> new Block(BlockProperties.stone(MaterialColor.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_BRICKS = register("obsidian_bricks", () -> new Block(Properties.copy(Blocks.OBSIDIAN)) {
        @Override
        public boolean isPortalFrame(BlockState state, BlockGetter getter, BlockPos pos) {
            return true;
        }
    });
    public static final RegistryObject<Block> OBSIDIAN_BRICK_PILLAR = register("obsidian_brick_pillar", () -> new RotatedPillarBlock(Properties.copy(OBSIDIAN_BRICKS.get())) {
        @Override
        public boolean isPortalFrame(BlockState state, BlockGetter getter, BlockPos pos) {
            return true;
        }
    });
    
    // STAIRS
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", () -> new StairBlock(Blocks.SMOOTH_STONE::defaultBlockState, Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", () -> new StairBlock(Blocks.CRACKED_STONE_BRICKS::defaultBlockState, Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", () -> new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS::defaultBlockState, Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", () -> new StairBlock(Blocks.CRACKED_NETHER_BRICKS::defaultBlockState, Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS::defaultBlockState, Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES::defaultBlockState, Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", () -> new StairBlock(Blocks.QUARTZ_BRICKS::defaultBlockState, Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> CALCITE_STAIRS = register("calcite_stairs", () -> new StairBlock(Blocks.CALCITE::defaultBlockState, Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_STAIRS = register("tuff_stairs", () -> new StairBlock(Blocks.TUFF::defaultBlockState, Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> RAW_IRON_STAIRS = register("raw_iron_stairs", () -> new StairBlock(Blocks.RAW_IRON_BLOCK::defaultBlockState, Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_GOLD_STAIRS = register("raw_gold_stairs", () -> new StairBlock(Blocks.RAW_GOLD_BLOCK::defaultBlockState, Properties.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final RegistryObject<Block> RAW_COPPER_STAIRS = register("raw_copper_stairs", () -> new StairBlock(Blocks.RAW_COPPER_BLOCK::defaultBlockState, Properties.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final RegistryObject<Block> OBSIDIAN_BRICK_STAIRS = register("obsidian_brick_stairs", () -> new StairBlock(Blocks.OBSIDIAN::defaultBlockState, Properties.copy(OBSIDIAN_BRICKS.get())));
    
    // SLABS
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", () -> new SlabBlock(Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", () -> new SlabBlock(Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", () -> new SlabBlock(Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", () -> new SlabBlock(Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", () -> new SlabBlock(Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", () -> new SlabBlock(Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> CALCITE_SLAB = register("calcite_slab", () -> new SlabBlock(Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_SLAB = register("tuff_slab", () -> new SlabBlock(Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> RAW_IRON_SLAB = register("raw_iron_slab", () -> new SlabBlock(Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_GOLD_SLAB = register("raw_gold_slab", () -> new SlabBlock(Properties.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final RegistryObject<Block> RAW_COPPER_SLAB = register("raw_copper_slab", () -> new SlabBlock(Properties.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final RegistryObject<Block> OBSIDIAN_BRICK_SLAB = register("obsidian_brick_slab", () -> new SlabBlock(Properties.copy(OBSIDIAN_BRICKS.get())));
    
    // WALLS
    public static final RegistryObject<Block> PURPUR_WALL = register("purpur_wall", () -> new WallBlock(Properties.copy(Blocks.PURPUR_BLOCK)));
    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", () -> new WallBlock(Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = register("dark_prismarine_wall", () -> new WallBlock(Properties.copy(Blocks.DARK_PRISMARINE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", () -> new WallBlock(Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", () -> new WallBlock(Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", () -> new WallBlock(Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", () -> new WallBlock(Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", () -> new WallBlock(Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final RegistryObject<Block> SMOOTH_STONE_WALL = register("smooth_stone_wall", () -> new WallBlock(Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = register("quartz_brick_wall", () -> new WallBlock(Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> CALCITE_WALL = register("calcite_wall", () -> new WallBlock(Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> TUFF_WALL = register("tuff_wall", () -> new WallBlock(Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> OBSIDIAN_BRICK_WALL = register("obsidian_brick_wall", () -> new WallBlock(Properties.copy(OBSIDIAN_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = register("polished_granite_wall", () -> new WallBlock(Properties.copy(Blocks.POLISHED_GRANITE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = register("polished_diorite_wall", () -> new WallBlock(Properties.copy(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = register("polished_andesite_wall", () -> new WallBlock(Properties.copy(Blocks.POLISHED_ANDESITE)));

    // MISC MODELS
    public static final RegistryObject<Block> NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", () -> new FenceGateBlock(Properties.of(Material.STONE, MaterialColor.NETHER).strength(2.0F, 6.0F), WoodType.OAK));
    public static final RegistryObject<Block> IRON_FENCE_GATE = register("iron_fence_gate", () -> new IronFenceGateBlock(Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F).sound(SoundType.METAL)));
    
    public static <T extends Block> RegistryObject<Block> register(final String name, final Supplier<T> block) {
    	final RegistryObject<Block> instance = BLOCKS.register(name, block);
    	ITEMS.register(name, () -> new BlockItem(instance.get(), new Item.Properties()));
    	return instance;
    }

    // TODO remove modid paramatar
    public static <T extends Block> RegistryObject<Block> register(final String modid, final String name, final Supplier<T> block) {
    	final RegistryObject<Block> instance = BLOCKS.register(name, block);
    	ITEMS.register(name, () -> new BlockItem(instance.get(), new Item.Properties()));
    	return instance;
    }
	
    public static class BlockProperties {
    	public static final Properties GLASS = Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never);
    	public static final Properties TINTED_GLASS = Properties.copy(Blocks.TINTED_GLASS).color(MaterialColor.COLOR_GRAY).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor(Blocks::never).isSuffocating(Blocks::never).isViewBlocking(Blocks::never);
    	public static final Properties SOUL_SANDSTONE = Properties.of(Material.STONE, MaterialColor.COLOR_BROWN).requiresCorrectToolForDrops().strength(0.8F);
    	
    	public static Properties planks(MaterialColor color) {
    		return Properties.of(Material.WOOD, color).strength(2.0F, 3.0F).sound(SoundType.WOOD);
    	}
    	
    	public static Properties netherPlanks(MaterialColor color) {
    		return Properties.of(Material.NETHER_WOOD, color).strength(2.0F, 3.0F).sound(SoundType.WOOD);
    	}
    	
    	public static Properties stainedBricks(MaterialColor color) {
    		return Properties.of(Material.STONE, color).requiresCorrectToolForDrops().strength(2.0F, 6.0F);
    	}
    	
    	public static Properties stone(MaterialColor color) {
    		return Properties.of(Material.STONE, color).requiresCorrectToolForDrops().strength(1.5F, 6.0F);
    	}
    }
}
