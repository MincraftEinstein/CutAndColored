package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CutAndColored.MOD_ID);

    public static final RegistryObject<SoundEvent> UI_GLASSCUTTER_TAKE_RESULT = registerSound("ui.glasscutter_take_result");
    public static final RegistryObject<SoundEvent> UI_SAWMILL_TAKE_RESULT = registerSound("ui.sawmill_take_result");

    private static RegistryObject<SoundEvent> registerSound(String key) {
        return SOUND_EVENTS.register(key, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(CutAndColored.MOD_ID, key)));
    }
}
