package org.code.media;

public class FontStyle {
	/**
	 * Represents a “normal” style for a font. This text is an example of a normal
	 * font style.
	 */
	public static final FontStyle NORMAL;
	/**
	 * Represents a bold style for a font, which has heavier lines.
	 */
	public static final FontStyle BOLD;
	/**
	 * Represents an italic style for a font, which is slanted forward.
	 */
	public static final FontStyle ITALIC;
	/**
	 * Represents a bold and italic style for a font.
	 */
	public static final FontStyle BOLD_ITALIC;

	static {
		NORMAL = new FontStyle();
		BOLD = new FontStyle();
		ITALIC = new FontStyle();
		BOLD_ITALIC = new FontStyle();
	}
}
