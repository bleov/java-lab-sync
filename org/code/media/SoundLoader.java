package org.code.media;

import java.io.FileNotFoundException;

public class SoundLoader {

	/**
	 * Extracts audio samples from a WAV or AU file into an array. It returns an
	 * array of samples as double values, at 44.1 kilohertz. This means that 441000
	 * samples are played per second.
	 * This method will throw SoundException if there is an error reading the file.
	 * 
	 * @param filename the name of the audio file
	 * @throws SoundException
	 * @throws FileNotFoundException
	 */
	public static double[] read(String filename) throws FileNotFoundException {
		return new double[0];
	}
}
