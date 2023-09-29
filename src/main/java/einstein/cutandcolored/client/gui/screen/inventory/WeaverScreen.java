package einstein.cutandcolored.client.gui.screen.inventory;

import einstein.cutandcolored.inventory.container.WeaverMenu;
import einstein.cutandcolored.item.crafting.WeavingRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WeaverScreen extends AbstractSingleItemRecipeScreen<WeaverMenu, WeavingRecipe> {

    public WeaverScreen(WeaverMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component, "weaver");
    }
}
