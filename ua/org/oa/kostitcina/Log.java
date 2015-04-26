package ua.org.oa.kostitcina;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
	private static final Logger logger = Logger.getLogger("MyApp");
	private static boolean Debugable = false;

	public static void debug(String str) {
		if (Debugable) {
			logger.log(Level.INFO, str);
		}
		logger.log(Level.INFO, str);
	}
}
