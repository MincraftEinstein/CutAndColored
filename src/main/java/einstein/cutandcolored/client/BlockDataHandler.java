package einstein.cutandcolored.client;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.client.gui.screen.inventory.GlasscutterScreen;
import einstein.cutandcolored.client.gui.screen.inventory.SawmillScreen;
import einstein.cutandcolored.client.gui.screen.inventory.WeaverScreen;
import einstein.cutandcolored.init.FlamboyantBlocks;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.inventory.container.ModContainerType;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = CutAndColored.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class BlockDataHandler
{
    @SubscribeEvent
    public static void setBlockFlammable(final FMLCommonSetupEvent event) {
        final FireBlock fire = (FireBlock)Blocks.FIRE;
        
        /*************************WOOL**************************/
        // STAIRS
        fire.setFireInfo(ModBlocks.WHITE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.ORANGE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.MAGENTA_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.YELLOW_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.LIME_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.PINK_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.GRAY_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.CYAN_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.PURPLE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.BLUE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.BROWN_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.GREEN_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.RED_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(ModBlocks.BLACK_WOOL_STAIRS, 30, 60);
        
        // SLABS
        fire.setFireInfo(ModBlocks.WHITE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.ORANGE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.MAGENTA_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.LIGHT_BLUE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.YELLOW_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.LIME_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.PINK_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.GRAY_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.LIGHT_GRAY_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.CYAN_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.PURPLE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.BLUE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.BROWN_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.GREEN_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.RED_WOOL_SLAB, 30, 60);
        fire.setFireInfo(ModBlocks.BLACK_WOOL_SLAB, 30, 60);
        
        /*******************STAINED_PLANKS**********************/
        // FULL BLOCKS
        fire.setFireInfo(ModBlocks.WHITE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.ORANGE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.MAGENTA_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.LIGHT_BLUE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.YELLOW_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.LIME_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.PINK_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.GRAY_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.LIGHT_GRAY_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.CYAN_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.PURPLE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.BLUE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.BROWN_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.GREEN_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.RED_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(ModBlocks.BLACK_STAINED_PLANKS, 5, 20);
        
        // STAIRS
        fire.setFireInfo(ModBlocks.WHITE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.ORANGE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.YELLOW_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.LIME_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.PINK_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.GRAY_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.CYAN_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.PURPLE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.BLUE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.BROWN_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.GREEN_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.RED_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(ModBlocks.BLACK_STAINED_PLANK_STAIRS, 5, 20);
        
        // SLABS
        fire.setFireInfo(ModBlocks.WHITE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.ORANGE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.MAGENTA_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.YELLOW_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.LIME_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.PINK_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.GRAY_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.CYAN_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.PURPLE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.BLUE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.BROWN_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.GREEN_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.RED_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(ModBlocks.BLACK_STAINED_PLANK_SLAB, 5, 20);
        
        /*#######################FLAMBOYANT############################*/
        /*************************WOOL**************************/
        // STAIRS
        fire.setFireInfo(FlamboyantBlocks.AMBER_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.BEIGE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.CREAM_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.DARK_GREEN_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.FOREST_GREEN_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.HOT_PINK_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.INDIGO_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.MAROON_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.NAVY_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.OLIVE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.PALE_GREEN_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.PALE_PINK_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.PALE_YELLOW_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.SKY_BLUE_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.SLATE_GRAY_WOOL_STAIRS, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.VIOLET_WOOL_STAIRS, 30, 60);
        
        // SLABS
        fire.setFireInfo(FlamboyantBlocks.AMBER_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.BEIGE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.CREAM_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.DARK_GREEN_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.FOREST_GREEN_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.HOT_PINK_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.INDIGO_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.MAROON_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.NAVY_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.OLIVE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.PALE_GREEN_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.PALE_PINK_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.PALE_YELLOW_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.SKY_BLUE_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.SLATE_GRAY_WOOL_SLAB, 30, 60);
        fire.setFireInfo(FlamboyantBlocks.VIOLET_WOOL_SLAB, 30, 60);
        
        /*******************STAINED_PLANKS**********************/
        // FULL BLOCKS
        fire.setFireInfo(FlamboyantBlocks.AMBER_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.BEIGE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.CREAM_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.DARK_GREEN_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.HOT_PINK_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.INDIGO_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.MAROON_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.NAVY_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.OLIVE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_GREEN_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_PINK_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.SKY_BLUE_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANKS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.VIOLET_STAINED_PLANKS, 5, 20);
        
        // STAIRS
        fire.setFireInfo(FlamboyantBlocks.AMBER_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.BEIGE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.CREAM_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.DARK_GREEN_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.HOT_PINK_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.INDIGO_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.MAROON_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.NAVY_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.OLIVE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_GREEN_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_PINK_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.SKY_BLUE_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANK_STAIRS, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.VIOLET_STAINED_PLANK_STAIRS, 5, 20);
        
        // SLABS
        fire.setFireInfo(FlamboyantBlocks.AMBER_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.BEIGE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.CREAM_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.DARK_GREEN_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.HOT_PINK_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.INDIGO_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.MAROON_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.NAVY_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.OLIVE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_GREEN_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_PINK_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.SKY_BLUE_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANK_SLAB, 5, 20);
        fire.setFireInfo(FlamboyantBlocks.VIOLET_STAINED_PLANK_SLAB, 5, 20);
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
        ScreenManager.registerFactory(ModContainerType.GLASSCUTTER, GlasscutterScreen::new);
        ScreenManager.registerFactory(ModContainerType.WEAVER, WeaverScreen::new);
        ScreenManager.registerFactory(ModContainerType.SAWMILL, SawmillScreen::new);
        
    	/***********************CUTTERS*************************/
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASSCUTTER, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SAWMILL, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WEAVER, RenderType.getCutout());
        
        /************************GLASS***************************/
        // FULL BLOCKS
        RenderTypeLookup.setRenderLayer(ModBlocks.SOUL_GLASS, RenderType.getCutout());
        
        // PANES
        RenderTypeLookup.setRenderLayer(ModBlocks.SOUL_GLASS_PANE, RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE, RenderType.getCutout());
        
        // STAIRS
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_STAIRS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SOUL_GLASS_STAIRS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        
        // SLABS
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_SLAB, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SOUL_GLASS_SLAB, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        /*#######################FLAMBOYANT############################*/
    	/************************GLASS***************************/
        // STAIRS
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.INDIGO_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.MAROON_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.NAVY_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.OLIVE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.VIOLET_STAINED_GLASS_STAIRS, RenderType.getTranslucent());
        
        // SLABS
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.INDIGO_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.MAROON_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.NAVY_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.OLIVE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_SLAB, RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(FlamboyantBlocks.VIOLET_STAINED_GLASS_SLAB, RenderType.getTranslucent());
    }
}
