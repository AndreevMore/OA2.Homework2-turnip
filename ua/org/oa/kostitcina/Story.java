package ua.org.oa.kostitcina;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Story {
	private static final Logger logger = Logger.getLogger(DoStory.class
			.getSimpleName());

	public static void main(String[] args) {
		logger.log(Level.INFO, "Programm Starting");
		DoStory dostory = new DoStory();
		logger.log(Level.INFO, "Method doStory Starting");
		dostory.doStory();
		logger.log(Level.INFO, "End Programm");
	}
}
