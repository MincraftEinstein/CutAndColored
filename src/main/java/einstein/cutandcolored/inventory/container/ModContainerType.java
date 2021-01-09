package einstein.cutandcolored.inventory.container;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Mod.EventBusSubscriber(modid = CutAndColored.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModContainerType
{
    private static final List<ContainerType<?>> CONTAINER_TYPES = new ArrayList<ContainerType<?>>();
    public static final ContainerType<GlasscutterContainer> GLASSCUTTER = register("glasscutter", GlasscutterContainer::new);
    public static final ContainerType<WeaverContainer> WEAVER = register("weaver", WeaverContainer::new);
    public static final ContainerType<SawmillContainer> SAWMILL = register("sawmill", SawmillContainer::new);
    
    
	private static <T extends Container> ContainerType<T> register(final String name, final ContainerType.IFactory<T> factory) {
        final ContainerType<T> type = (ContainerType<T>)new ContainerType(factory);
        type.setRegistryName(new ResourceLocation(CutAndColored.MODID, name));
        ModContainerType.CONTAINER_TYPES.add(type);
        return type;
    }
    
	@SubscribeEvent
    public static void registerTypes(final RegistryEvent.Register<ContainerType<?>> event) {
        final IForgeRegistry<ContainerType<?>> registry = (IForgeRegistry<ContainerType<?>>)event.getRegistry();
        ModContainerType.CONTAINER_TYPES.forEach((Consumer<? super ContainerType>)registry::register);
        ModContainerType.CONTAINER_TYPES.clear();
    }
}
