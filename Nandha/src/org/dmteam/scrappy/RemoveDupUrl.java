package org.dmteam.scrappy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Nandhakumar Subramanian
 *
 */
public class RemoveDupUrl {

	public static void main(String[] args) throws Exception {
		String line;
		Set<String> allurl = new HashSet<String>();
		Set<String> secondurls = new HashSet<String>();
		BufferedReader reader = new BufferedReader(new FileReader("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/investing url duplicate removed file 98k.csv"));
		BufferedReader reader2 = new BufferedReader(new FileReader("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/xa.csv"));
		BufferedWriter writer =new BufferedWriter(new FileWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/out.csv"));
		while((line=reader.readLine())!=null) {
			allurl.add(line);
		}
		while((line=reader2.readLine())!=null) {
			secondurls.add(line);
		}
		allurl.removeAll(secondurls);
	reader.close();
	reader2.close();
	writer.write(allurl.toString().replaceAll(", ","\n").replaceAll("\\[","").replaceAll("\\]",""));
	writer.close();
	}
}