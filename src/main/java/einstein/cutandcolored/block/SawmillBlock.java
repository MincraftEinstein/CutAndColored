package einstein.cutandcolored.block;

import javax.annotation.Nullable;

import einstein.cutandcolored.inventory.container.SawmillMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class SawmillBlock extends AbstractSingleItemRecipeBlock {
	private static final Component CONTAINER_TITLE = new TranslatableComponent("container.cutandcolored.sawmill");
	
	public SawmillBlock(Properties properties) {
		super(properties);
	}
	
	@Nullable
	@Override
	public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
		return new SimpleMenuProvider((id, inventory, player) -> {
			return new SawmillMenu(id, inventory, ContainerLevelAccess.create(level, pos));
		}, CONTAINER_TITLE);
	}
}
