package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.inventory.container.GlasscutterContainer;
import einstein.cutandcolored.inventory.container.SawmillContainer;
import einstein.cutandcolored.inventory.container.WeaverContainer;
import einstein.einsteins_library.util.RegistryHandler;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModContainerTypes
{
    public static final ContainerType<GlasscutterContainer> GLASSCUTTER = RegistryHandler.registerContainerType(CutAndColored.MODID, "glasscutter", GlasscutterContainer::new);
    public static final ContainerType<WeaverContainer> WEAVER = RegistryHandler.registerContainerType(CutAndColored.MODID, "weaver", WeaverContainer::new);
    public static final ContainerType<SawmillContainer> SAWMILL = RegistryHandler.registerContainerType(CutAndColored.MODID, "sawmill", SawmillContainer::new);
}
