package corejava;

/**
 * @author Nandhakumar Subramanian
 */
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;

import util.Loggr;

public class UrlExample {
	private static final String CLASS_NAME = UrlExample.class.getName();

	public static void main(String[] args) {
		final String methodName = "main";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, args);
		try {
			URL url = new URL("http://www.google.com");
			URLConnection urlcon = url.openConnection();
			InputStream stream = urlcon.getInputStream();
			int i;
			while ((i = stream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			Loggr.logMessage("Error", Level.SEVERE, CLASS_NAME, methodName, args, e);
			System.out.println(e);
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, args);
	}
}
