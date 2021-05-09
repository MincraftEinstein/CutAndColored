package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.einsteins_library.util.RegistryHandler;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModSounds
{
    public static final SoundEvent UI_GLASSCUTTER_TAKE_RESULT = RegistryHandler.registerSound(CutAndColored.MODID, "ui.glasscutter_take_result");
    public static final SoundEvent UI_SAWMILL_TAKE_RESULT = RegistryHandler.registerSound(CutAndColored.MODID, "ui.sawmill_take_result");
    
}
