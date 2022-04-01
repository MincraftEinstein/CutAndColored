package einstein.cutandcolored.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ModRecipeTypes
{
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CutAndColored.MODID);
	public static final List<RecipeType<?>> types = new ArrayList<RecipeType<?>>();
	
	public static final RecipeType<GlasscuttingRecipe> GLASSCUTTING_RECIPE = createRecipeType("glasscutting"); // new GlasscuttingRecipe.Type();
	public static final RegistryObject<RecipeSerializer<GlasscuttingRecipe>> GLASSCUTTING = register("glasscutting", () -> new GlasscuttingRecipe.Serializer(GlasscuttingRecipe::new), GLASSCUTTING_RECIPE);
	
	public static final RecipeType<WeavingRecipe> WEAVING_RECIPE = createRecipeType("weaving"); // new WeavingRecipe.Type();
	public static final RegistryObject<RecipeSerializer<WeavingRecipe>> WEAVING = register("weaving", () -> new WeavingRecipe.Serializer(WeavingRecipe::new), WEAVING_RECIPE);
	
	public static final RecipeType<SawmillingRecipe> SAWMILLING_RECIPE = createRecipeType("sawmilling"); // new SawmillingRecipe.Type();
	public static final RegistryObject<RecipeSerializer<SawmillingRecipe>> SAWMILLING = register("sawmilling", () -> new SawmillingRecipe.Serializer(SawmillingRecipe::new), SAWMILLING_RECIPE);
	
	private static <T extends Recipe> RegistryObject<RecipeSerializer<T>> register(final String name, final Supplier<RecipeSerializer<T>> serializer, RecipeType<T> recipeType) {
		return RECIPE_SERIALIZERS.register(name, serializer);
	}
	
	private static <T extends Recipe> RecipeType<T> createRecipeType(String name) {
		RecipeType<T> type = new RecipeType<T>() {
			@Override
			public String toString() {
				return name;
			}
		};
		
		types.add(type);
		return type;
	}
}
