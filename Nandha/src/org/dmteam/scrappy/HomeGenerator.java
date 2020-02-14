package org.dmteam.scrappy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * @author Nandhakumar Subramanian
 *
 */
public class HomeGenerator {
	public static void main(String[] args) {
		int i=0,j=0;
		try {
			PrintWriter print = new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Gen/home_"+j+".html");
			for(i=0;i<2665;i++) {
				print.println("<a href=\"page_"+i+".html\"> page_"+i+" </a> <br />");
				if(i%498==0) {
					j++;
					print.close();
					print= new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Gen/home_"+j+".html");
				}
			}
			print.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
