package einstein.cutandcolored.data;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModDataGenerator
{
	
	@SubscribeEvent
	public static void DataGenerator(GatherDataEvent event)
	{
		//CutAndColored.LOGGER.debug("Event called the method");
		//if (event.includeServer()) {
			//CutAndColored.LOGGER.debug("Passed if statment");
			DataGenerator generator = event.getGenerator();
			generator.addProvider(new ModRecipeProvider(generator));
		//}
	}
}
