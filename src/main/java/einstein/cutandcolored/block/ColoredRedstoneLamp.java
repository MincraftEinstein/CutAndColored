package einstein.cutandcolored.block;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;

public class ColoredRedstoneLamp extends RedstoneLampBlock
{
    public ColoredRedstoneLamp(final Supplier<BlockState> state, final Block.Properties properties) {
        super(properties);
    }
}
