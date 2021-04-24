package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class ModRecipeTypes
{
    public static final IRecipeType<GlasscuttingRecipe> GLASSCUTTING = register("glasscutting");
    public static final IRecipeType<WeavingRecipe> WEAVING = register("weaving");
    public static final IRecipeType<SawmillingRecipe> SAWMILLING = register("sawmilling");
    
	private static <T extends IRecipe<?>> IRecipeType<T> register(final String name) {
        return Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(CutAndColored.MODID, name), new IRecipeType<T>() {
            @Override
            public String toString() {
                return name.toString();
            }
        });
    }
}
