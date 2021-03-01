package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import util.Loggr;
/**
 * @author Nandhakumar Subramanian
 *
 */
public class CsvSplitter {
		private static final String CLASS_NAME = CsvSplitter.class.getName();
		
	public void split(String fname, BufferedReader reader) {
		final String methodName = "split";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.SEVERE, CLASS_NAME, methodName, null);
		String line; 
		int i=0, j=0;
		try {
		PrintWriter writer = new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urls/page_"+j+".html");
		while((line =reader.readLine())!= null) {
			i++; 
			writer.println(line);
			if (i==498) {
				j++; i=0;
				writer.close();
				writer = new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urls/page_"+j+".html");
			}
		}
		writer.close();	
		reader.close();
		}
		catch (IOException e) {
			Loggr.logMessage(Loggr.ERROR, Level.SEVERE, CLASS_NAME, methodName, null, e);
			e.printStackTrace();
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.SEVERE, CLASS_NAME, methodName, null);
	}
	
	public static void main(String[] args) {
		final String methodName = "main";
		//File file =new File("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urlsAll.html");
		String fname = "/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urlsAll.html";
		BufferedReader reader = null;
		try {
		 reader = new BufferedReader(new FileReader(fname));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			Loggr.logMessage(Loggr.ERROR, Level.SEVERE, CLASS_NAME, methodName, null, e);
		}
		CsvSplitter splitter = new CsvSplitter();
		splitter.split(fname, reader);
	}
}