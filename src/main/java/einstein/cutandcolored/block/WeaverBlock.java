package einstein.cutandcolored.block;

import javax.annotation.Nullable;

import einstein.cutandcolored.inventory.container.WeaverContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class WeaverBlock extends Block
{
    private static final TranslationTextComponent CONTAINER_NAME = new TranslationTextComponent("container.cutandcolored.weaver", new Object[0]);
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    protected static final VoxelShape NORTH_RIGHT_LEG = Block.makeCuboidShape(14.0, 0.0, 7.0, 15.0, 8.0, 9.0);
    protected static final VoxelShape NORTH_RIGHT_LEG_PIVOT = Block.makeCuboidShape(14.0, 8.0, 6.5, 15.0, 11.0, 9.5);
    protected static final VoxelShape NORTH_LEFT_LEG = Block.makeCuboidShape(1.0, 0.0, 7.0, 2.0, 8.0, 9.0);
    protected static final VoxelShape NORTH_LEFT_LEG_PIVOT = Block.makeCuboidShape(1.0, 8.0, 6.5, 2.0, 11.0, 9.5);
    protected static final VoxelShape NORTH_BOARD1 = Block.makeCuboidShape(2.0, 3.0, 1.5, 14.0, 4.0, 2.5);
    protected static final VoxelShape NORTH_BOARD2 = Block.makeCuboidShape(2.0, 4.0, 2.5, 14.0, 5.0, 3.5);
    protected static final VoxelShape NORTH_BOARD3 = Block.makeCuboidShape(2.0, 5.0, 3.5, 14.0, 6.0, 4.5);
    protected static final VoxelShape NORTH_BOARD4 = Block.makeCuboidShape(2.0, 6.0, 4.5, 14.0, 7.0, 5.5);
    protected static final VoxelShape NORTH_BOARD5 = Block.makeCuboidShape(2.0, 7.0, 5.5, 14.0, 8.0, 6.5);
    protected static final VoxelShape NORTH_BOARD6 = Block.makeCuboidShape(2.0, 8.0, 6.5, 14.0, 9.0, 7.5);
    protected static final VoxelShape NORTH_BOARD7 = Block.makeCuboidShape(2.0, 9.0, 7.5, 14.0, 10.0, 8.5);
    protected static final VoxelShape NORTH_BOARD8 = Block.makeCuboidShape(2.0, 10.0, 8.5, 14.0, 11.0, 9.5);
    protected static final VoxelShape NORTH_BOARD9 = Block.makeCuboidShape(2.0, 11.0, 9.5, 14.0, 12.0, 10.5);
    protected static final VoxelShape NORTH_BOARD10 = Block.makeCuboidShape(2.0, 12.0, 10.5, 14.0, 13.0, 11.5);
    protected static final VoxelShape NORTH_BOARD11 = Block.makeCuboidShape(2.0, 13.0, 11.5, 14.0, 14.0, 12.5);
    protected static final VoxelShape NORTH_FACING = VoxelShapes.or(WeaverBlock.NORTH_RIGHT_LEG, new VoxelShape[] { WeaverBlock.NORTH_RIGHT_LEG_PIVOT, WeaverBlock.NORTH_LEFT_LEG, WeaverBlock.NORTH_LEFT_LEG_PIVOT, WeaverBlock.NORTH_BOARD1, WeaverBlock.NORTH_BOARD2, WeaverBlock.NORTH_BOARD3, WeaverBlock.NORTH_BOARD4, WeaverBlock.NORTH_BOARD5, WeaverBlock.NORTH_BOARD6, WeaverBlock.NORTH_BOARD7, WeaverBlock.NORTH_BOARD8, WeaverBlock.NORTH_BOARD9, WeaverBlock.NORTH_BOARD10, WeaverBlock.NORTH_BOARD11 });
    protected static final VoxelShape SOUTH_RIGHT_LEG = Block.makeCuboidShape(1.0, 0.0, 7.0, 2.0, 8.0, 9.0);
    protected static final VoxelShape SOUTH_RIGHT_LEG_PIVOT = Block.makeCuboidShape(1.0, 8.0, 6.5, 2.0, 11.0, 9.5);
    protected static final VoxelShape SOUTH_LEFT_LEG = Block.makeCuboidShape(14.0, 0.0, 7.0, 15.0, 8.0, 9.0);
    protected static final VoxelShape SOUTH_LEFT_LEG_PIVOT = Block.makeCuboidShape(14.0, 8.0, 6.5, 15.0, 11.0, 9.5);
    protected static final VoxelShape SOUTH_BOARD1 = Block.makeCuboidShape(2.0, 3.0, 13.5, 14.0, 4.0, 14.5);
    protected static final VoxelShape SOUTH_BOARD2 = Block.makeCuboidShape(2.0, 4.0, 12.5, 14.0, 5.0, 13.5);
    protected static final VoxelShape SOUTH_BOARD3 = Block.makeCuboidShape(2.0, 5.0, 11.5, 14.0, 6.0, 12.5);
    protected static final VoxelShape SOUTH_BOARD4 = Block.makeCuboidShape(2.0, 6.0, 10.5, 14.0, 7.0, 11.5);
    protected static final VoxelShape SOUTH_BOARD5 = Block.makeCuboidShape(2.0, 7.0, 9.5, 14.0, 8.0, 10.5);
    protected static final VoxelShape SOUTH_BOARD6 = Block.makeCuboidShape(2.0, 8.0, 8.5, 14.0, 9.0, 9.5);
    protected static final VoxelShape SOUTH_BOARD7 = Block.makeCuboidShape(2.0, 9.0, 7.5, 14.0, 10.0, 8.5);
    protected static final VoxelShape SOUTH_BOARD8 = Block.makeCuboidShape(2.0, 10.0, 6.5, 14.0, 11.0, 7.5);
    protected static final VoxelShape SOUTH_BOARD9 = Block.makeCuboidShape(2.0, 11.0, 5.5, 14.0, 12.0, 6.5);
    protected static final VoxelShape SOUTH_BOARD10 = Block.makeCuboidShape(2.0, 12.0, 4.5, 14.0, 13.0, 5.5);
    protected static final VoxelShape SOUTH_BOARD11 = Block.makeCuboidShape(2.0, 13.0, 3.5, 14.0, 14.0, 4.5);
    protected static final VoxelShape SOUTH_FACING = VoxelShapes.or(WeaverBlock.SOUTH_RIGHT_LEG, new VoxelShape[] { WeaverBlock.SOUTH_RIGHT_LEG_PIVOT, WeaverBlock.SOUTH_LEFT_LEG, WeaverBlock.SOUTH_LEFT_LEG_PIVOT, WeaverBlock.SOUTH_BOARD1, WeaverBlock.SOUTH_BOARD2, WeaverBlock.SOUTH_BOARD3, WeaverBlock.SOUTH_BOARD4, WeaverBlock.SOUTH_BOARD5, WeaverBlock.SOUTH_BOARD6, WeaverBlock.SOUTH_BOARD7, WeaverBlock.SOUTH_BOARD8, WeaverBlock.SOUTH_BOARD9, WeaverBlock.SOUTH_BOARD10, WeaverBlock.SOUTH_BOARD11 });
    protected static final VoxelShape EAST_RIGHT_LEG = Block.makeCuboidShape(7.0, 0.0, 14.0, 9.0, 8.0, 15.0);
    protected static final VoxelShape EAST_RIGHT_LEG_PIVOT = Block.makeCuboidShape(6.5, 8.0, 14.0, 9.5, 11.0, 15.0);
    protected static final VoxelShape EAST_LEFT_LEG = Block.makeCuboidShape(7.0, 0.0, 1.0, 9.0, 8.0, 2.0);
    protected static final VoxelShape EAST_LEFT_LEG_PIVOT = Block.makeCuboidShape(6.5, 8.0, 1.0, 9.5, 11.0, 2.0);
    protected static final VoxelShape EAST_BOARD1 = Block.makeCuboidShape(13.5, 3.0, 2.0, 14.5, 4.0, 14.0);
    protected static final VoxelShape EAST_BOARD2 = Block.makeCuboidShape(12.5, 4.0, 2.0, 13.5, 5.0, 14.0);
    protected static final VoxelShape EAST_BOARD3 = Block.makeCuboidShape(11.5, 5.0, 2.0, 12.5, 6.0, 14.0);
    protected static final VoxelShape EAST_BOARD4 = Block.makeCuboidShape(10.5, 6.0, 2.0, 11.5, 7.0, 14.0);
    protected static final VoxelShape EAST_BOARD5 = Block.makeCuboidShape(9.5, 7.0, 2.0, 10.5, 8.0, 14.0);
    protected static final VoxelShape EAST_BOARD6 = Block.makeCuboidShape(8.5, 8.0, 2.0, 9.5, 9.0, 14.0);
    protected static final VoxelShape EAST_BOARD7 = Block.makeCuboidShape(7.5, 9.0, 2.0, 8.5, 10.0, 14.0);
    protected static final VoxelShape EAST_BOARD8 = Block.makeCuboidShape(6.5, 10.0, 2.0, 7.5, 11.0, 14.0);
    protected static final VoxelShape EAST_BOARD9 = Block.makeCuboidShape(5.5, 11.0, 2.0, 6.5, 12.0, 14.0);
    protected static final VoxelShape EAST_BOARD10 = Block.makeCuboidShape(4.5, 12.0, 2.0, 5.5, 13.0, 14.0);
    protected static final VoxelShape EAST_BOARD11 = Block.makeCuboidShape(3.5, 13.0, 2.0, 4.5, 14.0, 14.0);
    protected static final VoxelShape EAST_FACING = VoxelShapes.or(WeaverBlock.EAST_RIGHT_LEG, new VoxelShape[] { WeaverBlock.EAST_RIGHT_LEG_PIVOT, WeaverBlock.EAST_LEFT_LEG, WeaverBlock.EAST_LEFT_LEG_PIVOT, WeaverBlock.EAST_BOARD1, WeaverBlock.EAST_BOARD2, WeaverBlock.EAST_BOARD3, WeaverBlock.EAST_BOARD4, WeaverBlock.EAST_BOARD5, WeaverBlock.EAST_BOARD6, WeaverBlock.EAST_BOARD7, WeaverBlock.EAST_BOARD8, WeaverBlock.EAST_BOARD9, WeaverBlock.EAST_BOARD10, WeaverBlock.EAST_BOARD11 });
    protected static final VoxelShape WEST_RIGHT_LEG = Block.makeCuboidShape(7.0, 0.0, 1.0, 9.0, 8.0, 2.0);
    protected static final VoxelShape WEST_RIGHT_LEG_PIVOT = Block.makeCuboidShape(6.5, 8.0, 1.0, 9.5, 11.0, 2.0);
    protected static final VoxelShape WEST_LEFT_LEG = Block.makeCuboidShape(7.0, 0.0, 14.0, 9.0, 8.0, 15.0);
    protected static final VoxelShape WEST_LEFT_LEG_PIVOT = Block.makeCuboidShape(6.5, 8.0, 14.0, 9.5, 11.0, 15.0);
    protected static final VoxelShape WEST_BOARD1 = Block.makeCuboidShape(1.5, 3.0, 2.0, 2.5, 4.0, 14.0);
    protected static final VoxelShape WEST_BOARD2 = Block.makeCuboidShape(2.5, 4.0, 2.0, 3.5, 5.0, 14.0);
    protected static final VoxelShape WEST_BOARD3 = Block.makeCuboidShape(3.5, 5.0, 2.0, 4.5, 6.0, 14.0);
    protected static final VoxelShape WEST_BOARD4 = Block.makeCuboidShape(4.5, 6.0, 2.0, 5.5, 7.0, 14.0);
    protected static final VoxelShape WEST_BOARD5 = Block.makeCuboidShape(5.5, 7.0, 2.0, 6.5, 8.0, 14.0);
    protected static final VoxelShape WEST_BOARD6 = Block.makeCuboidShape(6.5, 8.0, 2.0, 7.5, 9.0, 14.0);
    protected static final VoxelShape WEST_BOARD7 = Block.makeCuboidShape(7.5, 9.0, 2.0, 8.5, 10.0, 14.0);
    protected static final VoxelShape WEST_BOARD8 = Block.makeCuboidShape(8.5, 10.0, 2.0, 9.5, 11.0, 14.0);
    protected static final VoxelShape WEST_BOARD9 = Block.makeCuboidShape(9.5, 11.0, 2.0, 10.5, 12.0, 14.0);
    protected static final VoxelShape WEST_BOARD10 = Block.makeCuboidShape(10.5, 12.0, 2.0, 11.5, 13.0, 14.0);
    protected static final VoxelShape WEST_BOARD11 = Block.makeCuboidShape(11.5, 13.0, 2.0, 12.5, 14.0, 14.0);
    protected static final VoxelShape WEST_FACING = VoxelShapes.or(WeaverBlock.WEST_RIGHT_LEG, new VoxelShape[] { WeaverBlock.WEST_RIGHT_LEG_PIVOT, WeaverBlock.WEST_LEFT_LEG, WeaverBlock.WEST_LEFT_LEG_PIVOT, WeaverBlock.WEST_BOARD1, WeaverBlock.WEST_BOARD2, WeaverBlock.WEST_BOARD3, WeaverBlock.WEST_BOARD4, WeaverBlock.WEST_BOARD5, WeaverBlock.WEST_BOARD6, WeaverBlock.WEST_BOARD7, WeaverBlock.WEST_BOARD8, WeaverBlock.WEST_BOARD9, WeaverBlock.WEST_BOARD10, WeaverBlock.WEST_BOARD11 });
    
    public WeaverBlock(final Block.Properties propertiesIn) {
        super(propertiesIn);
        this.setDefaultState((this.stateContainer.getBaseState()).with(WeaverBlock.FACING, Direction.NORTH));
    }
    
    public BlockState getStateForPlacement(final BlockItemUseContext context) {
        return this.getDefaultState().with(WeaverBlock.FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    
    public ActionResultType onBlockActivated(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            return ActionResultType.SUCCESS;
        }
        player.openContainer(state.getContainer(worldIn, pos));
        return ActionResultType.SUCCESS;
    }
    
    @Nullable
    public INamedContainerProvider getContainer(final BlockState state, final World worldIn, final BlockPos pos) {
        return new SimpleNamedContainerProvider((p_220283_2_, p_220283_3_, p_220283_4_) -> new WeaverContainer(p_220283_2_, p_220283_3_, IWorldPosCallable.of(worldIn, pos)), WeaverBlock.CONTAINER_NAME);
    }
    
    public VoxelShape getShape(final BlockState state, final IBlockReader worldIn, final BlockPos pos, final ISelectionContext context) {
        final Direction direction = state.get(WeaverBlock.FACING);
        if (direction == Direction.NORTH) {
            return WeaverBlock.NORTH_FACING;
        }
        if (direction == Direction.SOUTH) {
            return WeaverBlock.SOUTH_FACING;
        }
        if (direction == Direction.WEST) {
            return WeaverBlock.WEST_FACING;
        }
        return WeaverBlock.EAST_FACING;
    }
    
    public boolean isTransparent(final BlockState state) {
        return true;
    }
    
    public boolean isNormalCube(final BlockState state, final IBlockReader worldIn, final BlockPos pos) {
        return false;
    }
    
    @Deprecated
    public BlockRenderType getRenderType(final BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @Deprecated
    public BlockState rotate(final BlockState state, final Rotation rot) {
        return state.with(WeaverBlock.FACING, rot.rotate(state.get(WeaverBlock.FACING)));
    }
    
    @Deprecated
    public BlockState mirror(final BlockState state, final Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(WeaverBlock.FACING)));
    }
    
    protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
    	builder.add(FACING);
    }
    
    public boolean allowsMovement(final BlockState state, final IBlockReader worldIn, final BlockPos pos, final PathType type) {
        return false;
    }
}
