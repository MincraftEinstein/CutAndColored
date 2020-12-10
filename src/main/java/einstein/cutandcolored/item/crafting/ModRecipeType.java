package einstein.cutandcolored.item.crafting;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class ModRecipeType
{
    public static final IRecipeType<GlasscuttingRecipe> GLASSCUTTING = register(new ResourceLocation(CutAndColored.MODID, "glasscutting"));
    public static final IRecipeType<WeavingRecipe> WEAVING = register(new ResourceLocation(CutAndColored.MODID, "weaving"));
    public static final IRecipeType<SawmillingRecipe> SAWMILLING = register(new ResourceLocation(CutAndColored.MODID, "sawmilling"));
    
	private static <T extends IRecipe<?>> IRecipeType<T> register(final ResourceLocation name) {
        return (IRecipeType<T>)Registry.register(Registry.RECIPE_TYPE, name, new IRecipeType<T>() {
            @Override
            public String toString() {
                return name.toString();
            }
        });
    }

}
