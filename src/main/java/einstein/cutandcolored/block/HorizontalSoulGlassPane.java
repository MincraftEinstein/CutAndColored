package einstein.cutandcolored.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

/**
 * Copied from {@link com.gamma1772.horizontalpanes.content.blocks.HorizontalPaneSlab}
 * only for the purpose of stopping runtime errors when the 'Horizontal Glass Panes' mod is not loaded
 */
public class HorizontalSoulGlassPane extends SlabBlock implements SimpleWaterloggedBlock {

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape SHAPE_BOT = Block.box(0.0F, 6.0F, 0.0F, 16.0F, 8.0F, 16.0F); //This is a bottom shape.
    protected static final VoxelShape SHAPE_TOP = Block.box(0.0F, 6.0F + 8.0F, 0.0F, 16.0F, 8.0F + 8.0F, 16.0F); //This is a top shape.
    protected static final VoxelShape SHAPE_COM = Shapes.or(SHAPE_BOT, SHAPE_TOP); //This is a combined shape

    public HorizontalSoulGlassPane(Properties properties) {
        super(properties.noOcclusion().strength(0.3F, 0.3F).sound(SoundType.GLASS));
        this.registerDefaultState(this.getStateDefinition().any().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        SlabType slabType = state.getValue(TYPE);
        switch (slabType) {
            case DOUBLE:
                return SHAPE_COM;
            case TOP:
                return SHAPE_TOP;
            default:
                return SHAPE_BOT;
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		if (adjacentBlockState.getBlock() == Blocks.GLASS) {
			return true;
		}
		if (adjacentBlockState.getBlock() == this) {
			if (slabSideInvisible(state, adjacentBlockState, side)) {
				return true;
			}
		}

        return super.skipRendering(state, adjacentBlockState, side);
    }

    /**
     * Selectively culls sides of a slab if neighbouring block is also slab type
     *
     * @return true if this and neighbouring slab are same type, or if neighbouring slab is double, otherwise false
     */
    private boolean slabSideInvisible(BlockState slabState, BlockState neighbourState, Direction dir) {
        SlabType slabType = slabState.getValue(TYPE);
        SlabType neighbourType = neighbourState.getValue(TYPE);

		if (neighbourType == SlabType.DOUBLE) {
			return true;
		}

        switch (dir) {
            case NORTH:
            case SOUTH:
            case EAST:
            case WEST:
				if (slabType == neighbourType) {
					return true;
				}
            default:
                break;
        }

        return false;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockPos blockPos = ctx.getClickedPos();
        BlockState blockState = ctx.getLevel().getBlockState(blockPos);
        FluidState fluidState = ctx.getLevel().getFluidState(blockPos);
        if (blockState.is(this)) {
            return blockState.setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        }
        else {
            BlockState blockState2 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
            Direction direction = ctx.getClickedFace();
            return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getClickLocation().y - (double) blockPos.getY() > 0.5D)) ? blockState2 : blockState2.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    public float getShadeBrightness(BlockState state, BlockGetter world, BlockPos pos) {
        return 1F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }
}