package einstein.cutandcolored;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import einstein.cutandcolored.client.BlockDataHandler;
import einstein.cutandcolored.init.ModConfigs;
import einstein.cutandcolored.tab.ModItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(CutAndColored.MODID)
public class CutAndColored
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "cutandcolored";
	public static final String MCMODID = "minecraft";
	public static final String FMODID = "flamboyant";
	public static final ItemGroup MOD_TAB = new ModItemGroup(ItemGroup.GROUPS.length, "cutandcolored_tab");

	public CutAndColored() {
		MinecraftForge.EVENT_BUS.register(new BlockDataHandler());
		ModConfigs.init();
	}
}
