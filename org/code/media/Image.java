package org.code.media;

public class Image {
	/** the 2D array of {@link Pixel} objects that make up this {@link Image} */
	private Pixel[][] pixels;
	/** the width of this {@link Image} */
	private int width;
	/** the height of this {@link Image} */
	private int height;
	/** the default background color of an empty {@link Image} */
	public static final Color DEFAULT_BACKGROUND_COLOR = Color.WHITE;
	/** the maximum width of an {@link Image} */
	public static final int MAX_WIDTH = 400;
	/** the maximum height of an {@link Image} */
	public static final int MAX_HEIGHT = 400;

	/**
	 * Creates a new {@link Image} object using the pixel information from the
	 * specified file.
	 * 
	 * @param filename the filename of the image
	 */
	public Image(String filename) {
	}

	/**
	 * Creates an empty {@link Image} object filled with the default background
	 * color.
	 * 
	 * @param width  the width of the image to create
	 * @param height the height of the image to create
	 */
	public Image(int width, int height) {
	}

	/**
	 * Gets the {@link Pixel} object at the specified x and y coordinate.
	 * 
	 * @param x the x coordinate of the {@link Pixel}
	 * @param y the y coordinate of the {@link Pixel}
	 */
	public Pixel getPixel(int x, int y) {
		return null;
	}

	/**
	 * Sets the {@link Pixel} at the specified x and y coordinate to the
	 * {@link Color} provided.
	 * 
	 * @param x     the x coordinate to set the {@link Pixel}
	 * @param y     the y coordinate to set the {@link Pixel}
	 * @param color the {@link Color} to use to set the {@link Pixel}
	 */
	public void setPixel(int x, int y, Color color) {
	}

	/** Returns the width of this {@link Image} in pixels. */
	public int getWidth() {
		return 0;
	}

	/** Returns the height of this {@link Image} in pixels. */
	public int getHeight() {
		return 0;
	}

	/**
	 * Clears this {@link Image} and fills it with the specified {@link Color}.
	 * 
	 * @param color the {@link Color} to fill this {@link Image}
	 */
	public void clear(Color color) {
	}
}