package org.code.media;

public class Color {
	public static final int MAX_VALUE = 255;
	public static final int MIN_VALUE = 0;
	final int red;
	final int green;
	final int blue;
	/**
	 * a color with the value {@link (255, 255, 255)}
	 */
	public static final Color WHITE = new Color(255, 255, 255);
	/**
	 * a color with the value {@link (192, 192, 192)}
	 */
	public static final Color SILVER = new Color(192, 192, 192);
	/**
	 * a color with the value {@link (128, 128, 128)}
	 */
	public static final Color GRAY = new Color(128, 128, 128);
	/**
	 * a color with the value {@link (0, 0, 0)}
	 */
	public static final Color BLACK = new Color(0, 0, 0);
	/**
	 * a color with the value {@link (255, 0, 0)}
	 */
	public static final Color RED = new Color(255, 0, 0);
	/**
	 * a color with the value {@link (128, 0, 0)}
	 */
	public static final Color MAROON = new Color(128, 0, 0);
	/**
	 * a color with the value {@link (255, 255, 0)}
	 */
	public static final Color YELLOW = new Color(255, 255, 0);
	/**
	 * a color with the value {@link (128, 128, 0)}
	 */
	public static final Color OLIVE = new Color(128, 128, 0);
	/**
	 * a color with the value {@link (0, 255, 0)}
	 */
	public static final Color LIME = new Color(0, 255, 0);
	/**
	 * a color with the value {@link (0, 128, 0)}
	 */
	public static final Color GREEN = new Color(0, 128, 0);
	/**
	 * a color with the value {@link (0, 255, 255)}
	 */
	public static final Color AQUA = new Color(0, 255, 255);
	/**
	 * a color with the value {@link (0, 128, 128)}
	 */
	public static final Color TEAL = new Color(0, 128, 128);
	/**
	 * a color with the value {@link (0, 0, 255)}
	 */
	public static final Color BLUE = new Color(0, 0, 255);
	/**
	 * a color with the value {@link (0, 0, 128)}
	 */
	public static final Color NAVY = new Color(0, 0, 128);
	/**
	 * a color with the value {@link (255, 0, 255)}
	 */
	public static final Color FUCHSIA = new Color(255, 0, 255);
	/**
	 * a color with the value {@link (128, 0, 128)}
	 */
	public static final Color PURPLE = new Color(128, 0, 128);
	/**
	 * a color with the value {@link (255, 192, 203)}
	 */
	public static final Color PINK = new Color(255, 192, 203);
	/**
	 * a color with the value {@link (255, 165, 0)}
	 */
	public static final Color ORANGE = new Color(255, 165, 0);
	/**
	 * a color with the value {@link (255, 215, 0)}
	 */
	public static final Color GOLD = new Color(255, 215, 0);
	/**
	 * a color with the value {@link (165, 42, 42)}
	 */
	public static final Color BROWN = new Color(165, 42, 42);
	/**
	 * a color with the value {@link (210, 105, 30)}
	 */
	public static final Color CHOCOLATE = new Color(210, 105, 30);
	/**
	 * a color with the value {@link (210, 180, 140)}
	 */
	public static final Color TAN = new Color(210, 180, 140);
	/**
	 * a color with the value {@link (64, 224, 208)}
	 */
	public static final Color TURQUOISE = new Color(64, 224, 208);
	/**
	 * a color with the value {@link (75, 0, 130)}
	 */
	public static final Color INDIGO = new Color(75, 0, 130);
	/**
	 * a color with the value {@link (238, 130, 238)}
	 */
	public static final Color VIOLET = new Color(238, 130, 238);
	/**
	 * a color with the value {@link (245, 245, 220)}
	 */
	public static final Color BEIGE = new Color(245, 245, 220);
	/**
	 * a color with the value {@link (255, 255, 240)}
	 */
	public static final Color IVORY = new Color(255, 255, 240);

	/**
	 * Creates a {@link Color} object from a {@link String}, like "red" or "brown".
	 * If the name is
	 * not recognized, this constructor will throw an
	 * {@link IllegalArgumentException}.
	 * 
	 * @param color the name of the color (case-insensitive)
	 * @throws IllegalArgumentException
	 */
	public Color(String color) throws IllegalArgumentException {
		this.red = 0;
		this.green = 0;
		this.blue = 0;
	}

	/**
	 * Create a new {@link Color} object based on the red, green, and blue values
	 * provided.
	 * 
	 * @param red   the red value to set the {@link Color} (between 0 and 255)
	 * @param green the green value to set the {@link Color} (between 0 and 255)
	 * @param blue  the blue value to set the {@link Color} (between 0 and 255)
	 */
	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	/**
	 * Returns the amount of red of this {@link Color} (ranging from 0 to 255).
	 */
	public int getRed() {
		return this.red;
	}

	/**
	 * Returns the amount of green of this {@link Color} (ranging from 0 to 255).
	 */
	public int getGreen() {
		return this.green;
	}

	/**
	 * Returns the amount of blue of this {@link Color} (ranging from 0 to 255).
	 */
	public int getBlue() {
		return this.blue;
	}
}
