package einstein.cutandcolored;

import einstein.cutandcolored.client.PropertyEvents;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModConfigs;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.tab.ModCreativeTab;
import einstein.cutandcolored.util.Util;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Mod(CutAndColored.MODID)
public class CutAndColored {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "cutandcolored";
	public static final String MCMODID = "minecraft";
	public static final String FMODID = "flamboyant";
	public static final CreativeModeTab MOD_TAB = new ModCreativeTab(CreativeModeTab.TABS.length, "cutandcolored_tab");

	public static final List<Block> allBlocks = new ArrayList<Block>();
	public static final List<Block> allMCBlocks = new ArrayList<Block>(ForgeRegistries.BLOCKS.getValues().stream()
			.filter((block) -> CutAndColored.MCMODID.equals(Objects.requireNonNull(Util.getBlockRegistryName(block)).getNamespace()))
			.collect(Collectors.toList()));
	public static final String[] BOARD_TYPES = { "oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "crimson", "warped" };

	public CutAndColored() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModBlocks.ITEMS.register(modEventBus);
		ModBlocks.BLOCKS.register(modEventBus);
		ModMenuTypes.MENUS.register(modEventBus);
		ModRecipeTypes.RECIPE_TYPE.register(modEventBus);
		ModRecipeTypes.RECIPE_SERIALIZERS.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(new PropertyEvents());
		ModConfigs.init();
	}
}
