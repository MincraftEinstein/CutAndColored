package einstein.cutandcolored;

import einstein.cutandcolored.client.PropertyEvents;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModConfigs;
import einstein.cutandcolored.init.ModMenuTypes;
import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.tab.ModCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CutAndColored.MODID)
public class CutAndColored
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "cutandcolored";
	public static final String MCMODID = "minecraft";
	public static final String FMODID = "flamboyant";
	public static final CreativeModeTab MOD_TAB = new ModCreativeTab(CreativeModeTab.TABS.length, "cutandcolored_tab");

	public CutAndColored() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModBlocks.ITEMS.register(modEventBus);
		ModBlocks.BLOCKS.register(modEventBus);
		ModMenuTypes.MENUS.register(modEventBus);
		ModRecipeTypes.RECIPE_TYPE.register(modEventBus);
		ModRecipeTypes.RECIPE_SERIALIZERS.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(new PropertyEvents());
//		modEventBus.addGenericListener(RecipeSerializer.class, this::registerRecipeType);
		ModConfigs.init();
	}
	
//	private void registerRecipeType(RegistryEvent.Register<RecipeSerializer<?>> event) {
//		ModRecipeTypes.types.forEach((type) -> Registry.register(Registry.RECIPE_TYPE, type.toString(), type));
//	}
}
