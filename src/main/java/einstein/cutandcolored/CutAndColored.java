package einstein.cutandcolored;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import einstein.cutandcolored.client.PropertyEvents;
import einstein.cutandcolored.init.ModConfigs;
import einstein.cutandcolored.tab.ModCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(CutAndColored.MODID)
public class CutAndColored
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "cutandcolored";
	public static final String MCMODID = "minecraft";
	public static final String FMODID = "flamboyant";
	public static final CreativeModeTab MOD_TAB = new ModCreativeTab(CreativeModeTab.TABS.length, "cutandcolored_tab");

	public CutAndColored() {
		MinecraftForge.EVENT_BUS.register(new PropertyEvents());
		ModConfigs.init();
	}
}
