package einstein.cutandcolored.data;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModDataGenerators {

	@SubscribeEvent
	public static void DataGenerator(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		generator.addProvider(new GenCraftingRecipes(generator));
		generator.addProvider(new GenStonecuttingRecipes(generator));
		generator.addProvider(new GenGlasscuttingRecipes(generator));
		generator.addProvider(new GenSawmillingRecipes(generator));
		generator.addProvider(new GenWeavingRecipes(generator));
	}
}
