package einstein.cutandcolored;

import einstein.cutandcolored.client.PropertyEvents;
import einstein.cutandcolored.data.*;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModConfigs;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.tags.BlockTagsGenerator;
import einstein.cutandcolored.tags.ItemTagsGenerator;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
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
    public static final CreativeModeTab MOD_TAB = new ModCreativeTab(CreativeModeTab.TABS.length, "cutandcolored_tab");

    public static final List<Block> allBlocks = new ArrayList<>();
    public static final List<Block> allMCBlocks = new ArrayList<>(ForgeRegistries.BLOCKS.getValues().stream()
            .filter((block) -> CutAndColored.MC_MOD_ID.equals(Objects.requireNonNull(Util.getBlockRegistryName(block)).getNamespace()))
            .collect(Collectors.toList()));
    public static final String[] BOARD_TYPES = {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "crimson", "warped"};

    public CutAndColored() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::generateData);
        ModBlocks.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModMenuTypes.MENUS.register(modEventBus);
        ModRecipeTypes.RECIPE_TYPE.register(modEventBus);
        ModRecipeTypes.RECIPE_SERIALIZERS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(new PropertyEvents());
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfigs.buildConfigs());
    }

    void generateData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ModBlocks.BLOCKS.getEntries().forEach((block) -> allBlocks.add(block.get()));

        // Server providers
        generator.addProvider(event.includeServer(), new CraftingRecipesGenerator(generator));
        generator.addProvider(event.includeServer(), new SmeltingRecipeGenerator(generator));
        generator.addProvider(event.includeServer(), new StonecuttingRecipesGenerator(generator));
        generator.addProvider(event.includeServer(), new GlasscuttingRecipesGenerator(generator));
        generator.addProvider(event.includeServer(), new SawmillingRecipesGenerator(generator));
        generator.addProvider(event.includeServer(), new WeavingRecipesGenerator(generator));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
        BlockTagsProvider blockTags = new BlockTagsGenerator(generator, event.getExistingFileHelper()); // Used for both item and block tags
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ItemTagsGenerator(generator, blockTags, event.getExistingFileHelper()));

        // Client providers
        generator.addProvider(event.includeClient(), new BlockAssetsGenerator(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ItemModelsGenerator(generator, event.getExistingFileHelper()));
    }
}
