package org.code.neighborhood;

public class Painter {
	private int xLocation;
	private int yLocation;
	private String direction;
	private int remainingPaint;

	/**
	 * Creates a {@link Painter} object at (0, 0) facing "East" with 0 units of
	 * paint
	 */
	public Painter() {
	}

	/**
	 * Creates a {@link Painter} at specific x and y coordinates facing a specified
	 * direction with a given number of units of paint.
	 * 
	 * @param x     the x coordinate to place the {@link Painter} object
	 * @param y     the y coordinate to place the {@link Painter} object
	 * @param dir   the direction for the {@link Painter} object to face
	 * @param paint the number of units of paint the {@link Painter} object starts
	 *              with
	 */
	public Painter(int x, int y, String dir, int paint) {
	}

	/**
	 * Moves the {@link Painter} object one space forward in the direction it is
	 * facing.
	 */
	public void move() {
	}

	/**
	 * Turns a {@link Painter} object to the left.
	 */
	public void turnLeft() {
	}

	/**
	 * Paints the space the {@link Painter} object is standing on.
	 * 
	 * @param color the color of the paint - can be a color name or a hex value
	 */
	public void paint(String color) {
	}

	/**
	 * Takes paint from the paint bucket the {@link Painter} object is currently
	 * standing on and adds a single unit of paint to their paint bucket. The number
	 * of units of
	 * paint in the paint bucket decreases by 1. If the {@link Painter} object is
	 * not on a paint bucket, nothing happens.
	 */
	public void takePaint() {
	}

	/**
	 * Removes the paint from the space the {@link Painter} object is standing on.
	 */
	public void scrapePaint() {
	}

	/**
	 * Returns true if there is no barrier one space ahead in the direction the
	 * {@link Painter} object is currently facing.
	 */
	public boolean canMove() {
		return false;
	}

	/**
	 * Returns true if there is no barrier one space ahead in the specified
	 * direction.
	 * 
	 * @param direction the direction to check
	 */
	public boolean canMove(String direction) {
		return false;
	}

	/**
	 * Returns true if there is paint on the space the {@link Painter} object is
	 * currently
	 * standing on.
	 */
	public boolean isOnPaint() {
		return false;
	}

	/**
	 * Returns true if there is a paint bucket on the space the {@link Painter}
	 * object is
	 * currently standing on and the paint bucket has paint in it.
	 */
	public boolean isOnPaintBucket() {
		return false;
	}

	/**
	 * Returns true if the {@link Painter} object has paint in their paint bucket.
	 */
	public boolean hasPaint() {
		return false;
	}

	/**
	 * Returns true if the {@link Painter} object is currently facing "North".
	 */
	public boolean isFacingNorth() {
		return false;
	}

	/**
	 * Returns true if the {@link Painter} object is currently facing "South".
	 */
	public boolean isFacingSouth() {
		return false;
	}

	/**
	 * Returns true if the {@link Painter} object is currently facing "East".
	 */
	public boolean isFacingEast() {
		return false;
	}

	/**
	 * Returns true if the {@link Painter} object is currently facing "West".
	 */
	public boolean isFacingWest() {
		return false;
	}

	/**
	 * Returns the number of units of paint that the {@link Painter} object has in
	 * their paint bucket.
	 */
	public int getMyPaint() {
		return 0;
	}

	/**
	 * Returns the color of the space the {@link Painter} object is currently
	 * standing on.
	 */
	public String getColor() {
		return null;
	}

	/**
	 * Returns the x coordinate for the current position of the {@link Painter}
	 * object.
	 */
	public int getX() {
		return 0;
	}

	/**
	 * Returns the y coordinate for the current position of the {@link Painter}
	 * object.
	 */
	public int getY() {
		return 0;
	}

	/**
	 * Returns the direction that the {@link Painter} object is currently facing.
	 */
	public String getDirection() {
		return null;
	}

	/**
	 * Sets the number of units of paint in the {@link Painter} object's paint
	 * bucket. If the value passed is a negative number, nothing happens.
	 * 
	 * @param paint the number of units of paint that should be in the
	 *              {@link Painter} object's paint bucket
	 */
	public void setPaint(int paint) {

	}
}