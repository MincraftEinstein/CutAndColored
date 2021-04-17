package einstein.cutandcolored.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

@SuppressWarnings("deprecation")
public class HorizontalSoulGlassPane extends GlassBlock implements IWaterLoggable 
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	private final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 6.0D, 0.0D, 16.0D, 8.0D, 16.0D);

	public HorizontalSoulGlassPane(Properties properties) {
		super(properties);
		this.setDefaultState(this.getStateContainer().getBaseState().with(WATERLOGGED, false));
	}

	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.matchesBlock(this) ? true : super.isSideInvisible(state, adjacentBlockState, side);
	}

	public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 1.0F;
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updatePostPlacement(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos, BlockPos facingPos) {
		if (state.get(WATERLOGGED)) {
			world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
		}
		return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		FluidState fluidState = context.getWorld().getFluidState(context.getPos());
		return this.getDefaultState().with(WATERLOGGED, Boolean.valueOf(fluidState.isTagged(FluidTags.WATER) && fluidState.getLevel() == 8));
	}

	@Override
	public boolean allowsMovement(BlockState state, IBlockReader world, BlockPos pos, PathType path) {
		return true;
	}
}