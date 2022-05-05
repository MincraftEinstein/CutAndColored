package einstein.cutandcolored.block;

import javax.annotation.Nullable;

import einstein.cutandcolored.inventory.container.WeaverMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WeaverBlock extends AbstractSingleItemRecipeBlock
{
	private static final Component CONTAINER_TITLE = new TranslatableComponent("container.cutandcolored.weaver");
	
	// North shapes
    protected static final VoxelShape NORTH_RIGHT_LEG = Block.box(14.0, 0.0, 7.0, 15.0, 8.0, 9.0);
    protected static final VoxelShape NORTH_RIGHT_LEG_PIVOT = Block.box(14.0, 8.0, 6.5, 15.0, 11.0, 9.5);
    protected static final VoxelShape NORTH_LEFT_LEG = Block.box(1.0, 0.0, 7.0, 2.0, 8.0, 9.0);
    protected static final VoxelShape NORTH_LEFT_LEG_PIVOT = Block.box(1.0, 8.0, 6.5, 2.0, 11.0, 9.5);
    protected static final VoxelShape NORTH_BOARD1 = Block.box(2.0, 3.0, 1.5, 14.0, 4.0, 2.5);
    protected static final VoxelShape NORTH_BOARD2 = Block.box(2.0, 4.0, 2.5, 14.0, 5.0, 3.5);
    protected static final VoxelShape NORTH_BOARD3 = Block.box(2.0, 5.0, 3.5, 14.0, 6.0, 4.5);
    protected static final VoxelShape NORTH_BOARD4 = Block.box(2.0, 6.0, 4.5, 14.0, 7.0, 5.5);
    protected static final VoxelShape NORTH_BOARD5 = Block.box(2.0, 7.0, 5.5, 14.0, 8.0, 6.5);
    protected static final VoxelShape NORTH_BOARD6 = Block.box(2.0, 8.0, 6.5, 14.0, 9.0, 7.5);
    protected static final VoxelShape NORTH_BOARD7 = Block.box(2.0, 9.0, 7.5, 14.0, 10.0, 8.5);
    protected static final VoxelShape NORTH_BOARD8 = Block.box(2.0, 10.0, 8.5, 14.0, 11.0, 9.5);
    protected static final VoxelShape NORTH_BOARD9 = Block.box(2.0, 11.0, 9.5, 14.0, 12.0, 10.5);
    protected static final VoxelShape NORTH_BOARD10 = Block.box(2.0, 12.0, 10.5, 14.0, 13.0, 11.5);
    protected static final VoxelShape NORTH_BOARD11 = Block.box(2.0, 13.0, 11.5, 14.0, 14.0, 12.5);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(WeaverBlock.NORTH_RIGHT_LEG, new VoxelShape[] { WeaverBlock.NORTH_RIGHT_LEG_PIVOT, WeaverBlock.NORTH_LEFT_LEG, WeaverBlock.NORTH_LEFT_LEG_PIVOT, WeaverBlock.NORTH_BOARD1, WeaverBlock.NORTH_BOARD2, WeaverBlock.NORTH_BOARD3, WeaverBlock.NORTH_BOARD4, WeaverBlock.NORTH_BOARD5, WeaverBlock.NORTH_BOARD6, WeaverBlock.NORTH_BOARD7, WeaverBlock.NORTH_BOARD8, WeaverBlock.NORTH_BOARD9, WeaverBlock.NORTH_BOARD10, WeaverBlock.NORTH_BOARD11 });
    
    // South shapes
    protected static final VoxelShape SOUTH_RIGHT_LEG = Block.box(1.0, 0.0, 7.0, 2.0, 8.0, 9.0);
    protected static final VoxelShape SOUTH_RIGHT_LEG_PIVOT = Block.box(1.0, 8.0, 6.5, 2.0, 11.0, 9.5);
    protected static final VoxelShape SOUTH_LEFT_LEG = Block.box(14.0, 0.0, 7.0, 15.0, 8.0, 9.0);
    protected static final VoxelShape SOUTH_LEFT_LEG_PIVOT = Block.box(14.0, 8.0, 6.5, 15.0, 11.0, 9.5);
    protected static final VoxelShape SOUTH_BOARD1 = Block.box(2.0, 3.0, 13.5, 14.0, 4.0, 14.5);
    protected static final VoxelShape SOUTH_BOARD2 = Block.box(2.0, 4.0, 12.5, 14.0, 5.0, 13.5);
    protected static final VoxelShape SOUTH_BOARD3 = Block.box(2.0, 5.0, 11.5, 14.0, 6.0, 12.5);
    protected static final VoxelShape SOUTH_BOARD4 = Block.box(2.0, 6.0, 10.5, 14.0, 7.0, 11.5);
    protected static final VoxelShape SOUTH_BOARD5 = Block.box(2.0, 7.0, 9.5, 14.0, 8.0, 10.5);
    protected static final VoxelShape SOUTH_BOARD6 = Block.box(2.0, 8.0, 8.5, 14.0, 9.0, 9.5);
    protected static final VoxelShape SOUTH_BOARD7 = Block.box(2.0, 9.0, 7.5, 14.0, 10.0, 8.5);
    protected static final VoxelShape SOUTH_BOARD8 = Block.box(2.0, 10.0, 6.5, 14.0, 11.0, 7.5);
    protected static final VoxelShape SOUTH_BOARD9 = Block.box(2.0, 11.0, 5.5, 14.0, 12.0, 6.5);
    protected static final VoxelShape SOUTH_BOARD10 = Block.box(2.0, 12.0, 4.5, 14.0, 13.0, 5.5);
    protected static final VoxelShape SOUTH_BOARD11 = Block.box(2.0, 13.0, 3.5, 14.0, 14.0, 4.5);
    protected static final VoxelShape SOUTH_SHAPE = Shapes.or(WeaverBlock.SOUTH_RIGHT_LEG, new VoxelShape[] { WeaverBlock.SOUTH_RIGHT_LEG_PIVOT, WeaverBlock.SOUTH_LEFT_LEG, WeaverBlock.SOUTH_LEFT_LEG_PIVOT, WeaverBlock.SOUTH_BOARD1, WeaverBlock.SOUTH_BOARD2, WeaverBlock.SOUTH_BOARD3, WeaverBlock.SOUTH_BOARD4, WeaverBlock.SOUTH_BOARD5, WeaverBlock.SOUTH_BOARD6, WeaverBlock.SOUTH_BOARD7, WeaverBlock.SOUTH_BOARD8, WeaverBlock.SOUTH_BOARD9, WeaverBlock.SOUTH_BOARD10, WeaverBlock.SOUTH_BOARD11 });
    
    // East shapes
    protected static final VoxelShape EAST_RIGHT_LEG = Block.box(7.0, 0.0, 14.0, 9.0, 8.0, 15.0);
    protected static final VoxelShape EAST_RIGHT_LEG_PIVOT = Block.box(6.5, 8.0, 14.0, 9.5, 11.0, 15.0);
    protected static final VoxelShape EAST_LEFT_LEG = Block.box(7.0, 0.0, 1.0, 9.0, 8.0, 2.0);
    protected static final VoxelShape EAST_LEFT_LEG_PIVOT = Block.box(6.5, 8.0, 1.0, 9.5, 11.0, 2.0);
    protected static final VoxelShape EAST_BOARD1 = Block.box(13.5, 3.0, 2.0, 14.5, 4.0, 14.0);
    protected static final VoxelShape EAST_BOARD2 = Block.box(12.5, 4.0, 2.0, 13.5, 5.0, 14.0);
    protected static final VoxelShape EAST_BOARD3 = Block.box(11.5, 5.0, 2.0, 12.5, 6.0, 14.0);
    protected static final VoxelShape EAST_BOARD4 = Block.box(10.5, 6.0, 2.0, 11.5, 7.0, 14.0);
    protected static final VoxelShape EAST_BOARD5 = Block.box(9.5, 7.0, 2.0, 10.5, 8.0, 14.0);
    protected static final VoxelShape EAST_BOARD6 = Block.box(8.5, 8.0, 2.0, 9.5, 9.0, 14.0);
    protected static final VoxelShape EAST_BOARD7 = Block.box(7.5, 9.0, 2.0, 8.5, 10.0, 14.0);
    protected static final VoxelShape EAST_BOARD8 = Block.box(6.5, 10.0, 2.0, 7.5, 11.0, 14.0);
    protected static final VoxelShape EAST_BOARD9 = Block.box(5.5, 11.0, 2.0, 6.5, 12.0, 14.0);
    protected static final VoxelShape EAST_BOARD10 = Block.box(4.5, 12.0, 2.0, 5.5, 13.0, 14.0);
    protected static final VoxelShape EAST_BOARD11 = Block.box(3.5, 13.0, 2.0, 4.5, 14.0, 14.0);
    protected static final VoxelShape EAST_SHAPE = Shapes.or(WeaverBlock.EAST_RIGHT_LEG, new VoxelShape[] { WeaverBlock.EAST_RIGHT_LEG_PIVOT, WeaverBlock.EAST_LEFT_LEG, WeaverBlock.EAST_LEFT_LEG_PIVOT, WeaverBlock.EAST_BOARD1, WeaverBlock.EAST_BOARD2, WeaverBlock.EAST_BOARD3, WeaverBlock.EAST_BOARD4, WeaverBlock.EAST_BOARD5, WeaverBlock.EAST_BOARD6, WeaverBlock.EAST_BOARD7, WeaverBlock.EAST_BOARD8, WeaverBlock.EAST_BOARD9, WeaverBlock.EAST_BOARD10, WeaverBlock.EAST_BOARD11 });
    
    // West shapes
    protected static final VoxelShape WEST_RIGHT_LEG = Block.box(7.0, 0.0, 1.0, 9.0, 8.0, 2.0);
    protected static final VoxelShape WEST_RIGHT_LEG_PIVOT = Block.box(6.5, 8.0, 1.0, 9.5, 11.0, 2.0);
    protected static final VoxelShape WEST_LEFT_LEG = Block.box(7.0, 0.0, 14.0, 9.0, 8.0, 15.0);
    protected static final VoxelShape WEST_LEFT_LEG_PIVOT = Block.box(6.5, 8.0, 14.0, 9.5, 11.0, 15.0);
    protected static final VoxelShape WEST_BOARD1 = Block.box(1.5, 3.0, 2.0, 2.5, 4.0, 14.0);
    protected static final VoxelShape WEST_BOARD2 = Block.box(2.5, 4.0, 2.0, 3.5, 5.0, 14.0);
    protected static final VoxelShape WEST_BOARD3 = Block.box(3.5, 5.0, 2.0, 4.5, 6.0, 14.0);
    protected static final VoxelShape WEST_BOARD4 = Block.box(4.5, 6.0, 2.0, 5.5, 7.0, 14.0);
    protected static final VoxelShape WEST_BOARD5 = Block.box(5.5, 7.0, 2.0, 6.5, 8.0, 14.0);
    protected static final VoxelShape WEST_BOARD6 = Block.box(6.5, 8.0, 2.0, 7.5, 9.0, 14.0);
    protected static final VoxelShape WEST_BOARD7 = Block.box(7.5, 9.0, 2.0, 8.5, 10.0, 14.0);
    protected static final VoxelShape WEST_BOARD8 = Block.box(8.5, 10.0, 2.0, 9.5, 11.0, 14.0);
    protected static final VoxelShape WEST_BOARD9 = Block.box(9.5, 11.0, 2.0, 10.5, 12.0, 14.0);
    protected static final VoxelShape WEST_BOARD10 = Block.box(10.5, 12.0, 2.0, 11.5, 13.0, 14.0);
    protected static final VoxelShape WEST_BOARD11 = Block.box(11.5, 13.0, 2.0, 12.5, 14.0, 14.0);
    protected static final VoxelShape WEST_SHAPE = Shapes.or(WeaverBlock.WEST_RIGHT_LEG, new VoxelShape[] { WeaverBlock.WEST_RIGHT_LEG_PIVOT, WeaverBlock.WEST_LEFT_LEG, WeaverBlock.WEST_LEFT_LEG_PIVOT, WeaverBlock.WEST_BOARD1, WeaverBlock.WEST_BOARD2, WeaverBlock.WEST_BOARD3, WeaverBlock.WEST_BOARD4, WeaverBlock.WEST_BOARD5, WeaverBlock.WEST_BOARD6, WeaverBlock.WEST_BOARD7, WeaverBlock.WEST_BOARD8, WeaverBlock.WEST_BOARD9, WeaverBlock.WEST_BOARD10, WeaverBlock.WEST_BOARD11 });
    
    public WeaverBlock(Properties properties) {
        super(properties);
    }
    
	@Nullable
	@Override
	public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
		return new SimpleMenuProvider((id, inventory, player) -> {
			return new WeaverMenu(id, inventory, ContainerLevelAccess.create(level, pos));
		}, CONTAINER_TITLE);
	}
    
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        final Direction direction = state.getValue(FACING);
        if (direction == Direction.NORTH) {
            return WeaverBlock.NORTH_SHAPE;
        }
        else if (direction == Direction.SOUTH) {
            return WeaverBlock.SOUTH_SHAPE;
        }
        else if (direction == Direction.WEST) {
            return WeaverBlock.WEST_SHAPE;
        }
        else if (direction == Direction.EAST) {
        	return WeaverBlock.EAST_SHAPE;
        }
        else {
        	return WeaverBlock.NORTH_SHAPE;
        }
    }
}
