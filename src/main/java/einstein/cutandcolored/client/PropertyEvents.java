package einstein.cutandcolored.client;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.client.gui.screen.inventory.GlasscutterScreen;
import einstein.cutandcolored.client.gui.screen.inventory.SawmillScreen;
import einstein.cutandcolored.client.gui.screen.inventory.WeaverScreen;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD, value = { Dist.CLIENT })
public class PropertyEvents {

    @SubscribeEvent
    public static void setBlockFlammable(final FMLCommonSetupEvent event) {
        final FireBlock fire = (FireBlock)Blocks.FIRE;

        /*************************WOOL**************************/
        // STAIRS
        fire.setFlammable(ModBlocks.WHITE_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.ORANGE_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.MAGENTA_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.YELLOW_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.LIME_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.PINK_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.GRAY_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.CYAN_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.PURPLE_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.BLUE_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.BROWN_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.GREEN_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.RED_WOOL_STAIRS.get(), 30, 60);
        fire.setFlammable(ModBlocks.BLACK_WOOL_STAIRS.get(), 30, 60);

        // SLABS
        fire.setFlammable(ModBlocks.WHITE_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.ORANGE_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.MAGENTA_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.YELLOW_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.LIME_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.PINK_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.GRAY_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.CYAN_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.PURPLE_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.BLUE_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.BROWN_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.GREEN_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.RED_WOOL_SLAB.get(), 30, 60);
        fire.setFlammable(ModBlocks.BLACK_WOOL_SLAB.get(), 30, 60);

        /*******************STAINED_PLANKS**********************/
        // FULL BLOCKS
        fire.setFlammable(ModBlocks.WHITE_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.ORANGE_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.MAGENTA_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.YELLOW_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIME_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.PINK_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.GRAY_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.CYAN_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.PURPLE_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BLUE_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BROWN_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.GREEN_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.RED_STAINED_PLANKS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BLACK_STAINED_PLANKS.get(), 5, 20);

        // STAIRS
        fire.setFlammable(ModBlocks.WHITE_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIME_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.PINK_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.GRAY_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.CYAN_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BLUE_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BROWN_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.GREEN_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.RED_STAINED_PLANK_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BLACK_STAINED_PLANK_STAIRS.get(), 5, 20);

        // SLABS
        fire.setFlammable(ModBlocks.WHITE_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.ORANGE_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.YELLOW_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIME_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.PINK_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.GRAY_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.CYAN_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.PURPLE_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.BLUE_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.BROWN_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.GREEN_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.RED_STAINED_PLANK_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.BLACK_STAINED_PLANK_SLAB.get(), 5, 20);

        /**********************WOOD_BOARDS**********************/
        // FULL BLOCKS
        fire.setFlammable(ModBlocks.OAK_BOARDS.get(), 5, 20);
        fire.setFlammable(ModBlocks.SPRUCE_BOARDS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BIRCH_BOARDS.get(), 5, 20);
        fire.setFlammable(ModBlocks.JUNGLE_BOARDS.get(), 5, 20);
        fire.setFlammable(ModBlocks.ACACIA_BOARDS.get(), 5, 20);
        fire.setFlammable(ModBlocks.DARK_OAK_BOARDS.get(), 5, 20);
        fire.setFlammable(ModBlocks.MANGROVE_BOARDS.get(), 5, 20);

        // STAIRS
        fire.setFlammable(ModBlocks.OAK_BOARD_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.SPRUCE_BOARD_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.BIRCH_BOARD_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.JUNGLE_BOARD_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.ACACIA_BOARD_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.DARK_OAK_BOARD_STAIRS.get(), 5, 20);
        fire.setFlammable(ModBlocks.MANGROVE_BOARD_STAIRS.get(), 5, 20);

        // SLABS
        fire.setFlammable(ModBlocks.OAK_BOARD_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.SPRUCE_BOARD_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.BIRCH_BOARD_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.JUNGLE_BOARD_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.ACACIA_BOARD_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.DARK_OAK_BOARD_SLAB.get(), 5, 20);
        fire.setFlammable(ModBlocks.MANGROVE_BOARD_SLAB.get(), 5, 20);
    }
    
    @SubscribeEvent
    public void setBlockItemBurnable(final FurnaceFuelBurnTimeEvent event) {
        final ItemStack fuelStack = event.getItemStack();
        final Item fuel = fuelStack.getItem();
        
        /*************************WOOL**************************/
        // STAIRS
        if (fuel == ModBlocks.WHITE_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.ORANGE_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.MAGENTA_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.YELLOW_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.LIME_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.PINK_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.GRAY_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.CYAN_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.PURPLE_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.BLUE_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.BROWN_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.GREEN_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.RED_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.BLACK_WOOL_STAIRS.get().asItem()) {
            event.setBurnTime(100);
        }
        
        // SLABS
        else if (fuel == ModBlocks.WHITE_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.ORANGE_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.MAGENTA_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.LIGHT_BLUE_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.YELLOW_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.LIME_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.PINK_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.GRAY_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.LIGHT_GRAY_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.CYAN_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.PURPLE_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.BLUE_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.BROWN_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.GREEN_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.RED_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.BLACK_WOOL_SLAB.get().asItem()) {
            event.setBurnTime(50);
        }
        
        /**********************WOOD_BOARDS**********************/
        // FULL BLOCKS
        else if (fuel == ModBlocks.OAK_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.SPRUCE_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.BIRCH_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.JUNGLE_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.ACACIA_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.DARK_OAK_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.MANGROVE_BOARDS.get().asItem()) {
            event.setBurnTime(300);
        }
        
        // STAIRS
        else if (fuel == ModBlocks.OAK_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.SPRUCE_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.BIRCH_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.JUNGLE_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.ACACIA_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.DARK_OAK_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        else if (fuel == ModBlocks.MANGROVE_BOARD_STAIRS.get().asItem()) {
            event.setBurnTime(300);
        }
        
        //SLABS
        else if (fuel == ModBlocks.OAK_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
        else if (fuel == ModBlocks.SPRUCE_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
        else if (fuel == ModBlocks.BIRCH_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
        else if (fuel == ModBlocks.JUNGLE_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
        else if (fuel == ModBlocks.ACACIA_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
        else if (fuel == ModBlocks.DARK_OAK_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
        else if (fuel == ModBlocks.MANGROVE_BOARD_SLAB.get().asItem()) {
            event.setBurnTime(150);
        }
    }
    
    @SubscribeEvent
    public static void setupBlockRenderLayer(final FMLClientSetupEvent event) {
    	MenuScreens.register(ModMenuTypes.GLASSCUTTER.get(), GlasscutterScreen::new);
    	MenuScreens.register(ModMenuTypes.WEAVER.get(), WeaverScreen::new);
    	MenuScreens.register(ModMenuTypes.SAWMILL.get(), SawmillScreen::new);
    }
}
