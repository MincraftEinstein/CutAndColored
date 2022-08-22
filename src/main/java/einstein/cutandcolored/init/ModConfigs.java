package einstein.cutandcolored.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {

	public static ForgeConfigSpec.BooleanValue CREATIVE_SEARCH_BAR;

    public static final ForgeConfigSpec buildConfigs() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        CREATIVE_SEARCH_BAR = builder.comment("Does the creative tab have a search bar").define("CreativeSearchBar", false);

        return builder.build();
    }
}
