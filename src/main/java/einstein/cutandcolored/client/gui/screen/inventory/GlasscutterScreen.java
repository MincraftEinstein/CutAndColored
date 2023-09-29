package einstein.cutandcolored.client.gui.screen.inventory;

import einstein.cutandcolored.inventory.container.GlasscutterMenu;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GlasscutterScreen extends AbstractSingleItemRecipeScreen<GlasscutterMenu, GlasscuttingRecipe> {

    public GlasscutterScreen(GlasscutterMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component, "glasscutter");
    }
}
