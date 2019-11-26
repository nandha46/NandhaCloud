package org.dmteam.scrappy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Nandhakumar Subramanian
 *
 */
public class UrlGenerator {
	
	public static void main(String[] args) {

		String url = "companyontop.com/c/";
		Set<String> url_Set = new HashSet<String>();
		Set<String> crawled_set = new HashSet<String>();
		try {
		File file = new File("/home/local/ZOHOCORP/nandha-con426/Documents/sourceUrls.csv");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		while((line = reader.readLine())!=null) {
			crawled_set.add(line);
		}
		int upperLimit=2400000;
		for (int i=1; i<=upperLimit;i++) {
			url_Set.add(url+i);
		 }
		System.out.println("Initial Generated Url Set Size: "+ url_Set.size());
		System.out.println("Initial crawled Set Size: "+ crawled_set.size());
		PrintWriter writer= new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/GeneratedUrl.csv");		
		url_Set.removeAll(crawled_set);
		System.out.println("URL set size after deduplication: " +url_Set.size());
		Set<String> sortedUrl = new TreeSet<String>(url_Set);
		System.out.println("Size after Sorting: "+ sortedUrl.size());
		String listofurl = sortedUrl.toString().replaceAll(", ","\n").replaceAll("\\[","").replaceAll("\\]","");
		System.out.println(listofurl);
		writer.print(listofurl);
		 writer.close(); 
		 reader.close();
		 System.out.println("Completed Successfully");
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
