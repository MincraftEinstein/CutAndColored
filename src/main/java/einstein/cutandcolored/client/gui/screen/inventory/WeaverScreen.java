package einstein.cutandcolored.client.gui.screen.inventory;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.inventory.container.WeaverMenu;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WeaverScreen extends AbstractSingleItemRecipeScreen<WeaverMenu, WeavingRecipe> {

	private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(CutAndColored.MOD_ID, "textures/gui/container/weaver.png");
	
	public WeaverScreen(WeaverMenu menu, Inventory inventory, Component component) {
		super(menu, inventory, component);
	}
	
	@Override
	protected ResourceLocation getBackgroundTexture() {
		return BACKGROUND_TEXTURE;
	}
}
