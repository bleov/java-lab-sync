package org.code.theater;

public class Instrument {
	/** represents a piano sound */
	public static final Instrument PIANO;
	/** represents a lower bass guitar sound */
	public static final Instrument BASS;

	static {
		PIANO = new Instrument();
		BASS = new Instrument();
	}
}
