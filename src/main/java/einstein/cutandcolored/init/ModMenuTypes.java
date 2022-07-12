package einstein.cutandcolored.init;

import java.util.function.Supplier;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.inventory.container.GlasscutterMenu;
import einstein.cutandcolored.inventory.container.SawmillMenu;
import einstein.cutandcolored.inventory.container.WeaverMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes
{
	public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CutAndColored.MODID);
	
    public static final RegistryObject<MenuType<GlasscutterMenu>> GLASSCUTTER = register("glasscutter", () -> IForgeMenuType.create((id, inventory, data) -> new GlasscutterMenu(id, inventory)));
    public static final RegistryObject<MenuType<WeaverMenu>> WEAVER = register("weaver", () -> IForgeMenuType.create((id, inventory, data) -> new WeaverMenu(id, inventory)));
    public static final RegistryObject<MenuType<SawmillMenu>> SAWMILL = register("sawmill", () -> IForgeMenuType.create((id, inventory, data) -> new SawmillMenu(id, inventory)));
    
    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> register(final String name, final Supplier<MenuType<T>> menu) {
    	return MENUS.register(name, menu);
    }
}
