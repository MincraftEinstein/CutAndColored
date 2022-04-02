//package einstein.cutandcolored.crafttweaker;
//
//import org.openzen.zencode.java.ZenCodeGlobals;
//import org.openzen.zencode.java.ZenCodeType;
//
//import com.blamejared.crafttweaker.api.CraftTweakerAPI;
//import com.blamejared.crafttweaker.api.action.recipe.ActionAddRecipe;
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker.api.ingredient.IIngredient;
//import com.blamejared.crafttweaker.api.item.IItemStack;
//import com.blamejared.crafttweaker.api.recipe.manager.base.IRecipeManager;
//
//import einstein.cutandcolored.init.ModRecipeTypes;
//import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.crafting.RecipeType;
//
//@SuppressWarnings({"rawtypes", "unchecked"})
//@ZenRegister
//@ZenCodeType.Name("crafttweaker.api.glasscutterManager")
//public class GlasscutterManager implements IRecipeManager
//{
//    @ZenCodeGlobals.Global("glasscutting")
//    public static final GlasscutterManager INSTANCE = new GlasscutterManager();
//    
//    @ZenCodeType.Method
//    public void addRecipe(String recipeName, final IItemStack output, final IIngredient input) {
//        recipeName = fixRecipeName(recipeName);
//        CraftTweakerAPI.apply(new ActionAddRecipe(this, new GlasscuttingRecipe(new ResourceLocation("crafttweaker", recipeName), "", input.asVanillaIngredient(), output.getInternal()), ""));
//    }
//    
//	@Override
//    public RecipeType getRecipeType() {
//		return ModRecipeTypes.GLASSCUTTING;
//	}
//}
