package einstein.cutandcolored.init;

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

import java.util.function.Supplier;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CutAndColored.MOD_ID);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPE = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, CutAndColored.MOD_ID);

	public static final RecipeType<GlasscuttingRecipe> GLASSCUTTING_RECIPE = registerType("glasscutting");
	public static final RegistryObject<RecipeSerializer<GlasscuttingRecipe>> GLASSCUTTING = register("glasscutting", () -> new GlasscuttingRecipe.Serializer(GlasscuttingRecipe::new), GLASSCUTTING_RECIPE);

	public static final RecipeType<WeavingRecipe> WEAVING_RECIPE = registerType("weaving");
	public static final RegistryObject<RecipeSerializer<WeavingRecipe>> WEAVING = register("weaving", () -> new WeavingRecipe.Serializer(WeavingRecipe::new), WEAVING_RECIPE);

	public static final RecipeType<SawmillingRecipe> SAWMILLING_RECIPE = registerType("sawmilling");
	public static final RegistryObject<RecipeSerializer<SawmillingRecipe>> SAWMILLING = register("sawmilling", () -> new SawmillingRecipe.Serializer(SawmillingRecipe::new), SAWMILLING_RECIPE);

	private static <T extends Recipe<?>> RegistryObject<RecipeSerializer<T>> register(final String name, final Supplier<RecipeSerializer<T>> serializer, RecipeType<T> recipeType) {
		return RECIPE_SERIALIZERS.register(name, serializer);
	}

	private static <T extends Recipe<?>> RecipeType<T> registerType(String name) {
		RecipeType<T> type = new RecipeType<T>() {
			@Override
			public String toString() {
				return name;
			}
		};

		return type;
	}
}
