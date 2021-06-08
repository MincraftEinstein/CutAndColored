package einstein.cutandcolored.item;

import java.util.Arrays;
import java.util.Comparator;

public enum FlamboyantDyeColors {

	AMBER(0, "amber"),
	BEIGE(1, "beige"),
	CREAM(2, "cream"),
	DARK_GREEN(3, "dark_green"),
	FOREST_GREEN(4, "forest_green"),
	HOT_PINK(5, "hot_pink"),
	INDIGO(6, "indigo"),
	MAROON(7, "maroon"),
	NAVY(8, "navy"),
	OLIVE(9, "olive"),
	PALE_GREEN(10, "pale_green"),
	PALE_PINK(11, "pale_pink"),
	PALE_YELLOW(12, "pale_yellow"),
	SKY_BLUE(13, "sky_blue"),
	SLATE_GRAY(14, "slate_gray"),
	VIOLET(15, "violet");

	private static final FlamboyantDyeColors[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(FlamboyantDyeColors::getId)).toArray((colorId) -> {
				return new FlamboyantDyeColors[colorId];
			});

	private final int id;
	private final String translationKey;

	private FlamboyantDyeColors(int idIn, String translationKeyIn) {
		this.id = idIn;
		this.translationKey = translationKeyIn;
	}

	public int getId() {
		return this.id;
	}

	public String getTranslationKey() {
		return this.translationKey;
	}

	public static FlamboyantDyeColors byId(int colorId) {
		if (colorId < 0 || colorId >= VALUES.length) {
			colorId = 0;
		}

		return VALUES[colorId];
	}
}
