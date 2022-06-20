package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModSounds
{
    public static final SoundEvent UI_GLASSCUTTER_TAKE_RESULT = registerSound("ui.glasscutter_take_result");
    public static final SoundEvent UI_SAWMILL_TAKE_RESULT = registerSound("ui.sawmill_take_result");

    private static SoundEvent registerSound(String key) {
        ResourceLocation resourceKey = new ResourceLocation(CutAndColored.MODID, key);
        final SoundEvent soundEvent = new SoundEvent(resourceKey);
        ForgeRegistries.SOUND_EVENTS.register(resourceKey, soundEvent);
        return soundEvent;
    }
}
