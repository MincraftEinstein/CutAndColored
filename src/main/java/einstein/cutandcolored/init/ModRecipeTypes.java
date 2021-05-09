package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import einstein.einsteins_library.util.RegistryHandler;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModRecipeTypes
{
    public static final IRecipeType<GlasscuttingRecipe> GLASSCUTTING = RegistryHandler.registerRecipeType(CutAndColored.MODID, "glasscutting");
    public static final IRecipeType<WeavingRecipe> WEAVING = RegistryHandler.registerRecipeType(CutAndColored.MODID, "weaving");
    public static final IRecipeType<SawmillingRecipe> SAWMILLING = RegistryHandler.registerRecipeType(CutAndColored.MODID, "sawmilling");
}
