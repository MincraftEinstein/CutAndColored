package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(modid = CutAndColored.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModConfigs 
{	
	public static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder(); 
	public static final ForgeConfigSpec.BooleanValue CREATIVESEARCHBAR = COMMON_BUILDER.comment("Does the creative tab have a search bar").define("CreativeSearchBar", false);
	private static final ForgeConfigSpec COMMONSPEC = COMMON_BUILDER.build();

    public static void init() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMONSPEC);
    }
}
