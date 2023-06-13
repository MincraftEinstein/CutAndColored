package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CutAndColored.MOD_ID);

    public static RegistryObject<CreativeModeTab> CUTANDCOLORED_TAB = CREATIVE_MODE_TABS.register("cutandcolored_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.SAWMILL.get()))
            .title(Component.translatable("itemGroup.cutandcolored_tab"))
            .build());
}