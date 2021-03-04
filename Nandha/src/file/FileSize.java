package file;
/**
 * @author Nandhakumar Subramanian
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

import util.Loggr;

public class FileSize {
	private static final String CLASS_NAME = FileSize.class.getName();
	
	static String findSize(long length) {
		final String methodName = "findSize";
		Loggr.logMessage(Loggr.METHOD_ENTRY,Level.INFO, CLASS_NAME, methodName, null);
		double size = length/1024;
		if (size<1) {
			System.out.println(size*1024+" B");
			return  size*1024 + " B";
		} else if(size>1 && size<1024){
			System.out.println(Math.round(size)+" KB");
			return Math.round(size)+" KB";
		} else if(size/1024>1 && size/1024 <1024) {
			System.out.println(Math.round(size/1024)+" MB");
			return Math.round(size/1024)+" MB";
		} else {
			size/=1024;
			System.out.println(String.format("%.2f",size/1024)+" GB");
			Loggr.logMessage(Loggr.METHOD_EXIT,Level.INFO, CLASS_NAME, methodName, null);
			return String.format("%.2f",size/1024)+" GB";
		}
	}
		
	public static void main(String[] args) {
		String methodName = "main";
		File f = new File("C:\\Users\\nandh\\Downloads\\linkedlist.txt");
		File f2 = new File("C:\\Users\\nandh\\Downloads\\linkedlistCalc.txt");
		String fileSize;
		try {
		FileWriter writer = new FileWriter(f2);
		Scanner sc = new Scanner(f);
		while(sc.hasNext()) {
			fileSize = findSize(sc.nextLong());
			writer.append(fileSize+"\n");
		}
		sc.close();
		writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			Loggr.logMessage(Loggr.METHOD_EXIT,Level.INFO, CLASS_NAME, methodName, null,e);
		}
	}
}