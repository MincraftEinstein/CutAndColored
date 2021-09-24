package einstein.cutandcolored.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassStairsBlock extends GlassStairsBlock {

	public TintedGlassStairsBlock(Block block, Properties properties) {
		super(block, properties);
	}
	
	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter getter, BlockPos pos) {
		return false;
	}
	
	@Override
	public int getLightBlock(BlockState state, BlockGetter getter, BlockPos pos) {
		return getter.getMaxLightLevel();
	}
}
