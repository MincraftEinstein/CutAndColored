package einstein.cutandcolored.item.crafting;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
@Mod.EventBusSubscriber(modid = CutAndColored.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRecipeSerializers
{
	private static final List<IRecipeSerializer> RECIPES = new ArrayList<IRecipeSerializer>();
	public static final IRecipeSerializer<GlasscuttingRecipe> GLASSCUTTING = register("glasscutting", new GlasscuttingRecipe.Serializer(GlasscuttingRecipe::new));
    public static final IRecipeSerializer<WeavingRecipe> WEAVING = register("weaving", new WeavingRecipe.Serializer(WeavingRecipe::new));
	public static final IRecipeSerializer<SawmillingRecipe> SAWMILLING = register("sawmilling", new SawmillingRecipe.Serializer(SawmillingRecipe::new));
    
    private static <T extends IRecipeSerializer<? extends IRecipe<?>>> T register(final String name, final T t) {
        t.setRegistryName(new ResourceLocation(CutAndColored.MODID + ":" + name));
        ModRecipeSerializers.RECIPES.add(t);
        return t;
    }
    
	@SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
		final IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
        ModRecipeSerializers.RECIPES.forEach(item -> event.getRegistry().register(item));
        ModRecipeSerializers.RECIPES.clear();
    }
}
