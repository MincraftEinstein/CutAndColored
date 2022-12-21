package einstein.cutandcolored;

import einstein.cutandcolored.client.PropertyEvents;
import einstein.cutandcolored.data.*;
import einstein.cutandcolored.init.*;
import einstein.cutandcolored.tags.BlockTagsGenerator;
import einstein.cutandcolored.tags.ItemTagsGenerator;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Mod(CutAndColored.MOD_ID)
public class CutAndColored {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cutandcolored";
    public static final String MC_MOD_ID = "minecraft";
    public static final String F_MOD_ID = "flamboyant";
    private static CreativeModeTab MOD_TAB;

    public static final List<Block> allBlocks = new ArrayList<>();
    public static final List<Block> allMCBlocks = new ArrayList<>(ForgeRegistries.BLOCKS.getValues().stream()
            .filter((block) -> CutAndColored.MC_MOD_ID.equals(Objects.requireNonNull(Util.getBlockRegistryName(block)).getNamespace()))
            .collect(Collectors.toList()));
    public static final String[] BOARD_TYPES = { "oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "crimson", "warped" };

    public CutAndColored() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::generateData);
        modEventBus.addListener(this::registerCreativeTab);
        modEventBus.addListener(this::onBuildContents);
        ModBlocks.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModMenuTypes.MENUS.register(modEventBus);
        ModRecipeTypes.RECIPE_TYPE.register(modEventBus);
        ModRecipeTypes.RECIPE_SERIALIZERS.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(new PropertyEvents());
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModConfigs.buildConfigs());
    }

    void onBuildContents(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == MOD_TAB) {
            for (RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                event.accept(block);
            }
        }
    }

    void registerCreativeTab(CreativeModeTabEvent.Register event) {
        MOD_TAB = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "cutandcolored_tab"), builder -> {
            builder.icon(() -> new ItemStack(ModBlocks.SAWMILL.get())).title(Component.translatable("itemGroup.cutandcolored_tab"));

//            if (ModConfigs.CREATIVE_SEARCH_BAR.get()) {
//                builder.withSearchBar(80).withBackgroundLocation(new ResourceLocation(MOD_ID, "textures/gui/container/creative_inventory/tab_cutandcolored_item_search.png"));
//            }

            builder.build();
        });
    }

    void generateData(GatherDataEvent event) {
        ModBlocks.BLOCKS.getEntries().forEach((block) -> allBlocks.add(block.get()));
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();

        // Server providers
        generator.addProvider(event.includeServer(), new ModRecipesGenerator(output));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(output));
        BlockTagsProvider blockTags = new BlockTagsGenerator(output, event.getLookupProvider(), helper); // Used for both item and block tags
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ItemTagsGenerator(output, event.getLookupProvider(), blockTags, helper));

        // Client providers
        generator.addProvider(event.includeClient(), new BlockAssetsGenerator(output, helper));
        generator.addProvider(event.includeClient(), new ItemModelsGenerator(output, helper));
    }
}
