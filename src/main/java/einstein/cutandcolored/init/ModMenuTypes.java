package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.inventory.container.GlasscutterMenu;
import einstein.cutandcolored.inventory.container.SawmillMenu;
import einstein.cutandcolored.inventory.container.WeaverMenu;
import einstein.einsteins_library.util.RegistryHandler;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModMenuTypes
{
    public static final MenuType<GlasscutterMenu> GLASSCUTTER = RegistryHandler.registerMenuType(CutAndColored.MODID, "glasscutter", GlasscutterMenu::new);
    public static final MenuType<WeaverMenu> WEAVER = RegistryHandler.registerMenuType(CutAndColored.MODID, "weaver", WeaverMenu::new);
    public static final MenuType<SawmillMenu> SAWMILL = RegistryHandler.registerMenuType(CutAndColored.MODID, "sawmill", SawmillMenu::new);
}
