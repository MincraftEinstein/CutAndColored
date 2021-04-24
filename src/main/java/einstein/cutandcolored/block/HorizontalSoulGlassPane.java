package einstein.cutandcolored.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

@SuppressWarnings("deprecation")
public class HorizontalSoulGlassPane extends SlabBlock implements IWaterLoggable {

	public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	protected static final VoxelShape BOTTOM = Block.makeCuboidShape(0.0F, 6.0F, 0.0F, 16.0F, 8.0F, 16.0F);
	protected static final VoxelShape TOP = Block.makeCuboidShape(0.0F, 6.0F + 8.0F, 0.0F, 16.0F, 8.0F + 8.0F, 16.0F);
	protected static final VoxelShape SHAPE = VoxelShapes.or(BOTTOM, TOP);

	public HorizontalSoulGlassPane(Properties properties) {
		super(properties.notSolid().hardnessAndResistance(0.3F, 0.3F).sound(SoundType.GLASS));
		this.setDefaultState(this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false));
	}

	@Override
	public boolean isTransparent(BlockState state) {
		return true;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		SlabType slabType = state.get(TYPE);
		switch(slabType) {
			case DOUBLE:
				return SHAPE;
			case TOP:
				return TOP;
			default:
				return BOTTOM;
		}
	}
	
	@Override
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		if (adjacentBlockState.getBlock() == Blocks.GLASS) return true;
		if (adjacentBlockState.getBlock() == this) if (slabSideInvisible(state, adjacentBlockState, side)) return true;

		return super.isSideInvisible(state, adjacentBlockState, side);
	}
	
	private boolean slabSideInvisible(BlockState slabState, BlockState neighbourState, Direction dir)
	{
		SlabType slabType = slabState.get(TYPE);
		SlabType neighbourType = neighbourState.get(TYPE);

		if (neighbourType == SlabType.DOUBLE) return true;

		switch (dir)
		{
			case NORTH: case SOUTH: case EAST: case WEST:
			if(slabType == neighbourType) return true;
			default:
				break;
		}

		return false;
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx) {
		BlockPos blockPos = ctx.getPos();
		BlockState blockState = ctx.getWorld().getBlockState(blockPos);
		FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
		if (blockState.matchesBlock(this)) {
			return blockState.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
		} else {
			BlockState blockState2 = this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
			Direction direction = ctx.getFace();
			return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitVec().y - blockPos.getY() > 0.5D)) ? blockState2 : blockState2.with(TYPE, SlabType.TOP);
		}
	}
}