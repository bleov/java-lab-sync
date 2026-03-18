package org.code.theater;

import org.code.media.*;

public class Scene {
	/** the default {@link Font} for text */
	public static final Font DEFAULT_FONT = Font.SANS;
	/** the default {@link FontStyle} for text */
	public static final FontStyle DEFAULT_FONT_STYLE = FontStyle.NORMAL;
	/** the default size of text */
	public static final int DEFAULT_TEXT_HEIGHT = 20;
	/** the default color to use for the fill color, stroke color, and text color */
	public static final Color DEFAULT_COLOR = Color.BLACK;
	/** the default stroke width for shapes and lines */
	public static final double DEFAULT_STROKE_WIDTH = 1.0;
	/** the default {@link Instrument} used to play notes */
	public static final Instrument DEFAULT_INSTRUMENT = Instrument.PIANO;
	/** the {@link Font} to use to draw text */
	Font font;
	/** the {@link FontStyle} to use to draw text */
	FontStyle fontStyle;
	Color color;
	Color strokeColor;
	Color fillColor;
	double strokeWidth;

	/**
	 * Creates a new {@link Scene} object to be played in The Theater. A
	 * {@link Scene} is a set of
	 * steps of animation, such as drawing an image, text or a shape. A
	 * {@link Scene} can
	 * also include sound, like playing a sound file or musical notes.
	 */
	public Scene() {
	}

	/** Returns the width of the canvas in pixels. */
	public final int getWidth() {
		return 0;
	}

	/** Returns the height of the canvas in pixels. */
	public final int getHeight() {
		return 0;
	}

	/**
	 * Clears the canvas and sets the background color to the specified color name.
	 * If the name provided does not match a known color or hex value, this method
	 * will set the background to black.
	 * 
	 * @param color the name of the color to use as the color of the canvas
	 */
	public final void clear(String color) {
	}

	/**
	 * Clears the canvas and sets the background color to the specified Color.
	 * 
	 * @param color the color to use as the background color of the canvas
	 */
	public final void clear(Color color) {
	}

	/**
	 * Plays the sound referenced by the specified filename.
	 * 
	 * @param filename the filename of the sound to play
	 */
	public final void playSound(String filename) {
	}

	/**
	 * Plays an array of sound samples provided.
	 * 
	 * @param sound the array of sound samples to play
	 */
	public final void playSound(double[] sound) {
	}

	/**
	 * Plays a note with the default {@link Instrument} ({@link Instrument#PIANO}).
	 * 
	 * @param note    the note to play
	 *                The note 60 represents middle C on a piano.
	 * @param seconds the length of the note
	 */
	public final void playNote(int note, double seconds) {
	}

	/**
	 * Plays a note with the specified {@link Instrument}.
	 * 
	 * @param instrument the {@link Instrument} to use to play the note
	 * @param note       the note to play
	 *                   The note 60 represents middle C on a piano.
	 * @param seconds    the length of the note
	 */
	public final void playNote(Instrument instrument, int note, double seconds) {
	}

	/**
	 * Plays a note with the default {@link Instrument} ({@link Instrument#PIANO})
	 * and adds a pause
	 * in the {@link Scene} for the duration of the note, so that subsequent play
	 * commands
	 * begin after the note has finished playing.
	 * 
	 * @param note    the note to play
	 *                The note 60 represents middle C on a piano.
	 * @param seconds the length of the note
	 */
	public final void playNoteAndPause(int note, double seconds) {
	}

	/**
	 * Plays a note with the specified {@link Instrument} and adds a pause in the
	 * {@link Scene} for
	 * the duration of the note, so that subsequent play commands begin after the
	 * note has finished playing.
	 * 
	 * @param instrument the {@link Instrument} to use to play the note
	 * @param note       the note to play
	 *                   The note 60 represents middle C on a piano.
	 * @param seconds    the length of the note
	 */
	public final void playNoteAndPause(Instrument instrument, int note, double seconds) {
	}

	/**
	 * Waits the provided number of seconds before performing the next draw or play
	 * command.
	 * 
	 * @param seconds the number of seconds to wait
	 *                This can be a fraction of a second, but the smallest value can
	 *                be 0.1 seconds.
	 */
	public final void pause(double seconds) {
	}

	/**
	 * Draws a specified image at the given x and y coordinate. The specified size
	 * sets the width of the image in pixels. The height will stretch to make sure
	 * the image does not appear distorted.
	 * 
	 * @param filename the filename of the image to draw
	 * @param x        the x coordinate to start drawing the image from the left
	 *                 side of the image
	 * @param y        the y coordinate to start drawing the image from the top of
	 *                 the image
	 * @param size     the width of the image in pixels
	 */
	public final void drawImage(String filename, int x, int y, int size) {
	}

	/**
	 * Draws a specified image at the given x and y coordinate. The specified size
	 * sets the width of the image in pixels. The height will stretch to make sure
	 * the image does not appear distorted. The specified rotation sets how much to
	 * rotate the image.
	 * 
	 * @param filename the filename of the image to draw
	 * @param x        the x coordinate to start drawing the image from the left
	 *                 side of the image
	 * @param y        the y coordinate to start drawing the image from the top of
	 *                 the image
	 * @param size     the width of the image in pixels
	 * @param rotation the amount to rotate the image in degrees
	 */
	public final void drawImage(String filename, int x, int y, int size, double rotation) {
	}

	/**
	 * Draws a specified image at the given x and y coordinate with a given width
	 * and height. The specified rotation sets how much to rotate the image.
	 * 
	 * @param filename the filename of the image to draw
	 * @param x        the x coordinate to start drawing the image from the left
	 *                 side of the image
	 * @param y        the y coordinate to start drawing the image from the top of
	 *                 the image
	 * @param width    the withe Image object to drawdth of the image in pixels
	 * @param height   the height of the image in pixels
	 * @param rotation the amount to rotate the image in degrees
	 */
	public final void drawImage(String filename, int x, int y, int width, int height, double rotation) {
	}

	/**
	 * Draws a specified {@link Image} object at the given x and y coordinate. The
	 * specified size sets the width of the image in pixels. The height will stretch
	 * to make sure the image does not appear distorted.
	 * 
	 * @param image the {@link Image} object to draw
	 * @param x     the x coordinate to start drawing the image from the left side
	 *              of the image
	 * @param y     the y coordinate to start drawing the image from the top of the
	 *              image
	 * @param size  the width of the image in pixels
	 */
	public final void drawImage(Image image, int x, int y, int size) {
	}

	/**
	 * Draws a specified {@link Image} object at the given x and y coordinate. The
	 * specified
	 * size sets the width of the image in pixels. The height will stretch to make
	 * sure the image does not appear distorted. The specified rotation sets how
	 * much to rotate the image.
	 * 
	 * @param image    the {@link Image} object to draw
	 * @param x        the x coordinate to start drawing the image from the left
	 *                 side of the image
	 * @param y        the y coordinate to start drawing the image from the top of
	 *                 the image
	 * @param size     the width of the image in pixels
	 * @param rotation the amount to rotate the image in degrees
	 */
	public final void drawImage(Image image, int x, int y, int size, double rotation) {
	}

	/**
	 * Draws a specified Image object at the given x and y coordinate with a given
	 * width and height. The specified rotation sets how much to rotate the image.
	 * 
	 * @param image    the Image object to draw
	 * @param x        the x coordinate to start drawing the image from the left
	 *                 side of the image
	 * @param y        the y coordinate to start drawing the image from the top of
	 *                 the image
	 * @param width    the width of the image in pixels
	 * @param height   the height of the image in pixels
	 * @param rotation the amount to rotate the image in degrees
	 */
	public final void drawImage(Image image, int x, int y, int width, int height, double rotation) {
	}

	/**
	 * Sets the {@link Font} and {@link FontStyle} to draw the text.
	 * 
	 * @param font  the font to draw with
	 * @param style the style of the font
	 */
	public final void setTextStyle(Font font, FontStyle style) {
	}

	/**
	 * Sets the height of the text in pixels.
	 * 
	 * @param height the height in pixels of the text to draw
	 */
	public final void setTextHeight(int height) {
	}

	/**
	 * Sets the color of the text. If the specified name of the color cannot be
	 * found, the default color is used.
	 * 
	 * @param color the name of the color to use
	 */
	public final void setTextColor(String color) {
	}

	/**
	 * Sets the color of the text.
	 * 
	 * @param color the {@link Color} object to use to set the color of the text
	 */
	public final void setTextColor(Color color) {
	}

	/**
	 * Draws text on the canvas.
	 * 
	 * @param text the text to draw
	 * @param x    the x coordinate to start drawing the text
	 * @param y    the y coordinate to start drawing the text
	 */
	public final void drawText(String text, int x, int y) {
	}

	/**
	 * Draws text on the canvas.
	 * 
	 * @param text     the text to draw
	 * @param x        the x coordinate to start drawing the text
	 * @param y        the y coordinate to start drawing the text
	 * @param rotation the amount to rotate the text in degrees around its center
	 */
	public final void drawText(String text, int x, int y, double rotation) {
	}

	/**
	 * Draws a line on the canvas.
	 * 
	 * @param startX the x coordinate to start drawing the line
	 * @param startY the y coordinate to start drawing the line
	 * @param endX   the x coordinate to end drawing the line
	 * @param endY   the y coordinate to end drawing the line
	 */
	public final void drawLine(int startX, int startY, int endX, int endY) {
	}

	/**
	 * Draws a regular polygon (triangle, square, pentagon, hexagon, etc.) on the
	 * canvas.
	 * 
	 * @param x      the x coordinate for the center of the polygon
	 * @param y      the y coordinate for the center of the polygon
	 * @param sides  the number of sides of the polygon
	 * @param radius the distance from the center to each point on the polygon
	 */
	public final void drawRegularPolygon(int x, int y, int sides, int radius) {
	}

	/**
	 * Draws a shape by connecting the points provided.
	 * 
	 * @param points an array of numbers for the x and y coordinates of each point
	 *               formatted as [x1, y1, x2, y2, x3, y3, . . .]
	 * @param close  whether to close the shape
	 *               If this is set to {@code true}, the last point and the first
	 *               point will be connected by a line. If a fill color is set, the
	 *               shape will be filled with that color.
	 */
	public final void drawShape(int[] points, boolean close) {
	}

	/**
	 * Draws an ellipse (an oval or a circle) on the canvas.
	 * 
	 * @param x      the x coordinate to start drawing the left side of the ellipse
	 * @param y      the y coordinate to start drawing the top of the ellipse
	 * @param width  the width of the ellipse
	 * @param height the height of the ellipse
	 */
	public final void drawEllipse(int x, int y, int width, int height) {
	}

	/**
	 * Draws a rectangle on the canvas.
	 * 
	 * @param x      the x coordinate to start drawing the left side of the
	 *               rectangle
	 * @param y      the y coordinate to start drawing the top of the rectangle
	 * @param width  the width of the rectangle
	 * @param height the height of the rectangle
	 */
	public final void drawRectangle(int x, int y, int width, int height) {
	}

	/**
	 * Sets the thickness of lines drawn.
	 * 
	 * @param width the width in pixels of the line to draw
	 *              A width of 0 means no line.
	 */
	public final void setStrokeWidth(double width) {
	}

	/**
	 * Sets the fill color for all shapes drawn. If the name of the color cannot be
	 * found, no fill color will be used.
	 * 
	 * @param color the name of the color to fill the shape
	 */
	public final void setFillColor(String color) {
	}

	/**
	 * Sets the fill color for all shapes drawn.
	 * 
	 * @param color the {@link Color} object to use to fill the shape
	 */
	public final void setFillColor(Color color) {
	}

	/**
	 * Sets the color of the lines drawn. If the name of the color cannot be found,
	 * no color is used for the stroke.
	 * 
	 * @param color the name of the color to use for the lines drawn
	 */
	public final void setStrokeColor(String color) {
	}

	/**
	 * Sets the color of the lines drawn.
	 * 
	 * @param color the {@link Color} object to use for the lines drawn
	 */
	public final void setStrokeColor(Color color) {
	}

	/** Removes the stroke color so all shapes have no stroke. */
	public final void removeStrokeColor() {
	}

	/** Removes the fill color so all shapes drawn have no fill. */
	public final void removeFillColor() {
	}
}
