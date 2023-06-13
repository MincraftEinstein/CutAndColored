package einstein.cutandcolored.client.gui.screen.inventory;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.inventory.container.GlasscutterMenu;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GlasscutterScreen extends AbstractSingleItemRecipeScreen<GlasscutterMenu, GlasscuttingRecipe> {

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(CutAndColored.MOD_ID, "textures/gui/container/glasscutter.png");

    public GlasscutterScreen(GlasscutterMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected ResourceLocation getBackgroundTexture() {
        return BACKGROUND_TEXTURE;
    }
}
