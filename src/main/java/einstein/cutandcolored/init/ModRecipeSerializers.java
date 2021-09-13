package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import einstein.einsteins_library.util.RegistryHandler;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@SuppressWarnings({"rawtypes", "unchecked"})
@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModRecipeSerializers
{
	public static final RecipeSerializer<GlasscuttingRecipe> GLASSCUTTING = RegistryHandler.registerSerializer(CutAndColored.MODID, "glasscutting", new GlasscuttingRecipe.Serializer(GlasscuttingRecipe::new));
    public static final RecipeSerializer<WeavingRecipe> WEAVING = RegistryHandler.registerSerializer(CutAndColored.MODID, "weaving", new WeavingRecipe.Serializer(WeavingRecipe::new));
	public static final RecipeSerializer<SawmillingRecipe> SAWMILLING = RegistryHandler.registerSerializer(CutAndColored.MODID, "sawmilling", new SawmillingRecipe.Serializer(SawmillingRecipe::new));
}
