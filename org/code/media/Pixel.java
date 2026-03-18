package org.code.media;

public class Pixel {
	/**
	 * Gets the x coordinate of this {@link Pixel} in the image.
	 */
	public int getX() {
		return 0;
	}

	/**
	 * Gets the y coordinate of this {@link Pixel} in the image.
	 */
	public int getY() {
		return 0;
	}

	/**
	 * Gets the image that this {@link Pixel} is part of.
	 */
	public Image getSourceImage() {
		return null;
	}

	/**
	 * Gets the color of the Pixel in the image.
	 */
	public Color getColor() {
		return null;
	}

	/**
	 * Sets the color of this {@link Pixel} in the image to the specified
	 * {@link Color}.
	 * 
	 * @param color the color to set this {@link Pixel}
	 */
	public void setColor(Color color) {
	}

	/**
	 * Returns the amount of red (ranging from 0 to 255) in the color of this
	 * {@link Pixel}.
	 */
	public int getRed() {
		return 0;
	}

	/**
	 * Returns the amount of green (ranging from 0 to 255) in the color of this
	 * {@link Pixel}.
	 */
	public int getGreen() {
		return 0;
	}

	/**
	 * Returns the amount of blue (ranging from 0 to 255) in the color of this
	 * {@link Pixel}.
	 */
	public int getBlue() {
		return 0;
	}

	/**
	 * Sets the amount of red (ranging from 0 to 255) in the color of this
	 * {@link Pixel}. Values below 0 will be ignored and set to 0, and values above
	 * 255 with be ignored and set to 255.
	 * 
	 * @param red the amount of red (ranging from 0 to 255) to set the color of this
	 *            {@link Pixel}
	 */
	public void setRed(int red) {
	}

	/**
	 * Sets the amount of green (ranging from 0 to 255) in the color of this
	 * {@link Pixel}. Values below 0 will be ignored and set to 0, and values above
	 * 255 with be ignored and set to 255.
	 * 
	 * @param green the amount of green (ranging from 0 to 255) to set the color of
	 *              this {@link Pixel}
	 */
	public void setGreen(int green) {
	}

	/**
	 * Sets the amount of blue (ranging from 0 to 255) in the color of this
	 * {@link Pixel}. Values below 0 will be ignored and set to 0, and values above
	 * 255 with be ignored and set to 255.
	 * 
	 * @param blue the amount of blue (ranging from 0 to 255) to set the color of
	 *             this {@link Pixel}
	 */
	public void setBlue(int blue) {
	}
}