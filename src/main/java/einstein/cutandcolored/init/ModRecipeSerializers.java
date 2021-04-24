package einstein.cutandcolored.init;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe.Serializer;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModRecipeSerializers
{
	private static final List<IRecipeSerializer> RECIPES = new ArrayList<IRecipeSerializer>();
	public static final IRecipeSerializer<GlasscuttingRecipe> GLASSCUTTING = register("glasscutting", new GlasscuttingRecipe.Serializer(GlasscuttingRecipe::new));
    public static final IRecipeSerializer<WeavingRecipe> WEAVING = register("weaving", new WeavingRecipe.Serializer(WeavingRecipe::new));
	public static final IRecipeSerializer<SawmillingRecipe> SAWMILLING = register("sawmilling", new SawmillingRecipe.Serializer(SawmillingRecipe::new));
    
    private static <T extends IRecipeSerializer<? extends IRecipe<?>>> T register(final String name, final T serializer) {
        serializer.setRegistryName(new ResourceLocation(CutAndColored.MODID + ":" + name));
        ModRecipeSerializers.RECIPES.add(serializer);
        return serializer;
    }
    
	@SubscribeEvent
    public static void registerSerializers(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
		final IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
        ModRecipeSerializers.RECIPES.forEach(item -> event.getRegistry().register(item));
        ModRecipeSerializers.RECIPES.clear();
    }
}
