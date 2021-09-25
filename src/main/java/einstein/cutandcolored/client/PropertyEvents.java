package einstein.cutandcolored.client;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.client.gui.screen.inventory.GlasscutterScreen;
import einstein.cutandcolored.client.gui.screen.inventory.SawmillScreen;
import einstein.cutandcolored.client.gui.screen.inventory.WeaverScreen;
import einstein.cutandcolored.init.FlamboyantBlocks;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.einsteins_library.util.PropertyRegistry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD, value = { Dist.CLIENT })
public class PropertyEvents
{
    @SubscribeEvent
    public static void setBlockFlammable(final FMLCommonSetupEvent event) {
        
        /*************************WOOL**************************/
        // STAIRS
        PropertyRegistry.FlammableBlock(ModBlocks.WHITE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.ORANGE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.MAGENTA_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.YELLOW_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.LIME_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.PINK_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.GRAY_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.CYAN_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.PURPLE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.BLUE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.BROWN_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.GREEN_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.RED_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.BLACK_WOOL_STAIRS, 30, 60);
        
        // SLABS
        PropertyRegistry.FlammableBlock(ModBlocks.WHITE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.ORANGE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.MAGENTA_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_BLUE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.YELLOW_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.LIME_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.PINK_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.GRAY_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_GRAY_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.CYAN_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.PURPLE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.BLUE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.BROWN_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.GREEN_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.RED_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(ModBlocks.BLACK_WOOL_SLAB, 30, 60);
        
        /*******************STAINED_PLANKS**********************/
        // FULL BLOCKS
        PropertyRegistry.FlammableBlock(ModBlocks.WHITE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.ORANGE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.MAGENTA_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.YELLOW_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIME_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.PINK_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.GRAY_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.CYAN_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.PURPLE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BLUE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BROWN_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.GREEN_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.RED_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BLACK_STAINED_PLANKS, 5, 20);
        
        // STAIRS
        PropertyRegistry.FlammableBlock(ModBlocks.WHITE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.ORANGE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.YELLOW_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIME_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.PINK_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.GRAY_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.CYAN_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.PURPLE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BLUE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BROWN_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.GREEN_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.RED_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BLACK_STAINED_PLANK_STAIRS, 5, 20);
        
        // SLABS
        PropertyRegistry.FlammableBlock(ModBlocks.WHITE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.ORANGE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.MAGENTA_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.YELLOW_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIME_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.PINK_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.GRAY_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.CYAN_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.PURPLE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BLUE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BROWN_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.GREEN_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.RED_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(ModBlocks.BLACK_STAINED_PLANK_SLAB, 5, 20);
        
        /*#######################FLAMBOYANT############################*/
        /*************************WOOL**************************/
        // STAIRS
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.AMBER_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.BEIGE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.CREAM_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.DARK_GREEN_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.FOREST_GREEN_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.HOT_PINK_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.INDIGO_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.MAROON_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.NAVY_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.OLIVE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_GREEN_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_PINK_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_YELLOW_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SKY_BLUE_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SLATE_GRAY_WOOL_STAIRS, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.VIOLET_WOOL_STAIRS, 30, 60);
        
        // SLABS
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.AMBER_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.BEIGE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.CREAM_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.DARK_GREEN_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.FOREST_GREEN_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.HOT_PINK_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.INDIGO_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.MAROON_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.NAVY_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.OLIVE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_GREEN_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_PINK_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_YELLOW_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SKY_BLUE_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SLATE_GRAY_WOOL_SLAB, 30, 60);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.VIOLET_WOOL_SLAB, 30, 60);
        
        /*******************STAINED_PLANKS**********************/
        // FULL BLOCKS
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.AMBER_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.BEIGE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.CREAM_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.DARK_GREEN_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.HOT_PINK_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.INDIGO_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.MAROON_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.NAVY_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.OLIVE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_GREEN_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_PINK_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SKY_BLUE_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANKS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.VIOLET_STAINED_PLANKS, 5, 20);
        
        // STAIRS
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.AMBER_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.BEIGE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.CREAM_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.DARK_GREEN_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.HOT_PINK_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.INDIGO_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.MAROON_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.NAVY_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.OLIVE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_GREEN_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_PINK_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SKY_BLUE_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANK_STAIRS, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.VIOLET_STAINED_PLANK_STAIRS, 5, 20);
        
        // SLABS
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.AMBER_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.BEIGE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.CREAM_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.DARK_GREEN_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.HOT_PINK_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.INDIGO_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.MAROON_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.NAVY_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.OLIVE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_GREEN_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_PINK_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SKY_BLUE_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANK_SLAB, 5, 20);
        PropertyRegistry.FlammableBlock(FlamboyantBlocks.VIOLET_STAINED_PLANK_SLAB, 5, 20);
    }
    
    @SubscribeEvent
    public void setBlockItemBurnable(final FurnaceFuelBurnTimeEvent event) {
        final ItemStack fuelStack = event.getItemStack();
        final Item fuel = fuelStack.getItem();
        
        /*************************WOOL**************************/
        // STAIRS
        if (fuel == ModBlocks.WHITE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.ORANGE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.MAGENTA_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.LIGHT_BLUE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.YELLOW_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.LIME_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.PINK_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.GRAY_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.LIGHT_GRAY_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.CYAN_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.PURPLE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.BLUE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.BROWN_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.GREEN_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.RED_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == ModBlocks.BLACK_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        
        // SLABS
        else if (fuel == ModBlocks.WHITE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.ORANGE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.MAGENTA_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.YELLOW_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.LIME_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.PINK_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.GRAY_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.CYAN_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.PURPLE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.BLUE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.BROWN_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.GREEN_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.RED_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == ModBlocks.BLACK_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        
        /*#######################FLAMBOYANT############################*/
        /*************************WOOL**************************/
        // STAIRS
        if (fuel == FlamboyantBlocks.AMBER_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.BEIGE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.CREAM_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.DARK_GREEN_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.FOREST_GREEN_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.HOT_PINK_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.INDIGO_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.MAROON_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.NAVY_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.OLIVE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.PALE_GREEN_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.PALE_PINK_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.PALE_YELLOW_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.SKY_BLUE_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.SLATE_GRAY_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        else if (fuel == FlamboyantBlocks.VIOLET_WOOL_STAIRS.asItem()) {
            event.setBurnTime(100);
        }
        
        // SLABS
        else if (fuel == FlamboyantBlocks.AMBER_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.BEIGE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.CREAM_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.DARK_GREEN_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.FOREST_GREEN_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.HOT_PINK_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.INDIGO_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.MAROON_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.NAVY_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.OLIVE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.PALE_GREEN_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.PALE_PINK_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.PALE_YELLOW_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.SKY_BLUE_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.SLATE_GRAY_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
        else if (fuel == FlamboyantBlocks.VIOLET_WOOL_SLAB.asItem()) {
            event.setBurnTime(50);
        }
    }
    
    @SubscribeEvent
    public static void setupBlockRenderLayer(final FMLClientSetupEvent event) {
    	/************************GUIS***************************/
    	// SCREENS
    	MenuScreens.register(ModMenuTypes.GLASSCUTTER, GlasscutterScreen::new);
    	MenuScreens.register(ModMenuTypes.WEAVER, WeaverScreen::new);
    	MenuScreens.register(ModMenuTypes.SAWMILL, SawmillScreen::new);
        
    	/*********************WORK_STATIONS**********************/
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASSCUTTER, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAWMILL, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEAVER, RenderType.cutout());
        
        /************************GLASS***************************/
        // FULL BLOCKS
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_GLASS, RenderType.cutout());
        
        // PANES
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_GLASS_PANE, RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_PANE, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE, RenderType.cutout());
        
        // STAIRS
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_STAIRS, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_GLASS_STAIRS, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_STAIRS, RenderType.translucent());
        
        // SLABS
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_SLAB, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_GLASS_SLAB, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_SLAB, RenderType.translucent());
        /*#######################FLAMBOYANT############################*/
    	/************************GLASS***************************/
        // STAIRS
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.INDIGO_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.MAROON_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.NAVY_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.OLIVE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_STAIRS, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.VIOLET_STAINED_GLASS_STAIRS, RenderType.translucent());
        
        // SLABS
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.INDIGO_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.MAROON_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.NAVY_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.OLIVE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FlamboyantBlocks.VIOLET_STAINED_GLASS_SLAB, RenderType.translucent());
    }
}
