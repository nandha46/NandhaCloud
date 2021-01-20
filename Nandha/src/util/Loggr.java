package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;

/**
 * The {@code Loggr} class Represents a custom version of logger,
 * designed to log at various levels. The output of the log is stored in a file.
 * <pre>
 * Location of logs : "C:\Users\nandh\git\NandhaCloud\logs\"
 * </pre>
 * @author Nandhakumar Subramanian
 *
 * @since 14 Jan, 2021
 */

//TODO write detailed Documentation
public class Loggr {
	private static Loggr Instance;
	
	public static final String METHOD_ENTRY = "Entry";
	public static final String METHOD_EXIT = "Exit";
	private static final String CLASS_NAME = Loggr.class.getName();
	private static FileWriter fileWriter;
	private static File file;
	private static Date date;

	private Loggr() {
		
	}
	
	public static Loggr getInstance () {
		return Instance;
	}
	/**
	 * This method is a Polymorph of {@code logMessage} which takes all logging parameters except Exception.
	 * 
	 * @param entry
	 * @param logLevel
	 * @param className
	 * @param methodName
	 * @param msg
	 */
	public static void logMessage(String entry, Level logLevel, String className, String methodName, Object[] msg) {
		logMessage(entry, logLevel, className, methodName, msg, null);
	}
	//TODO Remove entry and include it to Object
	//TODO add getMessage method 
	/**
	 * This method initiates a File Writer for each class it logs, and writes log message in JSON format. 
	 * 
	 * @param entry
	 * @param logLevel
	 * @param className
	 * @param methodName
	 * @param msg
	 * @param e
	 */
	public static void logMessage (String entry, Level logLevel, String className, String methodName, Object[] msg, Throwable e) {
		date = new Date();
		String fileName = "C:\\Users\\nandh\\git\\NandhaCloud\\logs\\" + className + ".txt";
		try {
		file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("New Logging file created");
		}
		fileWriter = new FileWriter(file,true);
		//TODO build JSON object & add info into it and then write the JSON to the file
		fileWriter.write("{ "+"\"Level : \""+logLevel +"\", \"className\" : \""+ className +"\", \"Method Name\" : \""+methodName+"\", \"Point\" : \""+entry+ "\", \"Date\": \""+ date +"\", \"Exception\" : \""+e+ "\" }\n");
		fileWriter.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
