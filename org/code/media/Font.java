package org.code.media;

public class Font {
	/**
	 * Represents a monospaced font, used for code or other situations where it’s
	 * important that the characters are all the same width for alignment.
	 */
	public static final Font MONO;
	/**
	 * Represents a sans-serif font, which has no lines or strokes attached to the
	 * end of larger strokes in a letter.
	 */
	public static final Font SANS;
	/**
	 * Represents a serif font, which has small lines or strokes attached to the end
	 * of larger strokes in a letter.
	 */
	public static final Font SERIF;

	static {
		MONO = new Font();
		SANS = new Font();
		SERIF = new Font();
	}
}