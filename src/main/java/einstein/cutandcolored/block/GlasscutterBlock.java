package einstein.cutandcolored.block;

import einstein.cutandcolored.inventory.container.GlasscutterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class GlasscutterBlock extends AbstractSingleItemRecipeBlock {

    private static final Component CONTAINER_TITLE = Component.translatable("container.cutandcolored.glasscutter");

    public GlasscutterBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((id, inventory, player) -> {
            return new GlasscutterMenu(id, inventory, ContainerLevelAccess.create(level, pos));
        }, CONTAINER_TITLE);
    }
}
