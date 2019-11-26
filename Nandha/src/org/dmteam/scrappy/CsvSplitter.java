package org.dmteam.scrappy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * @author Nandhakumar Subramanian
 *
 */
public class CsvSplitter {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		File file =new File("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urlsAll.html");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line; int i=0; int j=0;
		PrintWriter writer = new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urls/page_"+j+".html");
		while((line =reader.readLine())!= null) {
			i++; 
		//	System.out.println("Current line:" +i );
		//	System.out.println("\tCuurent file:" +j );
		//	writer.println(line.concat("\">"+i+"</a>").replaceFirst("companyo","<a href=\"http://companyo"));
			writer.println(line);
			if (i==498) {
				j++; i=0;
				writer.close();
				writer = new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urls/page_"+j+".html");
			}
		}
		writer.close();	reader.close();
	}
}