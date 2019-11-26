package org.dmteam.scrappy;

import java.io.IOException;
import java.io.PrintWriter;

public class InvestingUrlGen {
	
	public static void main(String[] args) throws IOException {
	String a = "https://www.investing.com/stock-screener/?sp=country%3A%3A" ;
  //  String file = "/home/local/ZOHOCORP/anjali-2903/tickersymbol/nandha/List of countries.csv";
    String b = "%7Csector%3A%3Aa%7Cindustry%3A%3Aa%7CequityType%3A%3Aa%7Cexchange%3A%3Aa%3Ceq_market_cap%3B";
  //  String line; 
    int[] countries = {5,29,25,54,145,47,34,174,163,32,70,6,27,37,122,15,78,113,107,55,24,59,72,71,22,17,51,39,93,106,14,48,66,33,23,10,119,35,92,102,57,94,68,103,111,42,109,188,7,139,247,105,172,21,43,20,60,87,44,193,125,45,53,38,170,100,56,80,52,238,36,90,112,110,11,26,162,9,12,46,85,41,202,63,123,61,143,4,138,178,84,75};
    int[] pages = {223,5,43,10,3,9,5,3,2,16,4,88,5,77,3,2,3,3,3,2,5,7,35,5,17,404,5,50,3,2,116,15,3,3,12,11,3,77,5,3,3,5,3,2,2,21,3,4,14,3,3,4,3,5,5,5,7,4,12,3,3,8,20,3,3,6,7,2,6,3,17,2,2,10,48,6,8,22,14,40,2,20,4,10,2,2,4,57,2,29,2,3};
    int k=0;
    // BufferedReader sc = new BufferedReader(new FileReader(file));
    PrintWriter pw = new PrintWriter("/home/local/ZOHOCORP/nandha-con426/Documents/Investing URL/urlsAll.html");
    for (int i=0; i<countries.length; i++) {
      //  line = sc.readLine();
    //    String[] data = line.split(",");
    	k++;
        System.out.println("Country:"+countries[i]);
       // int noOfLine=Integer.valueOf(data[1]);
        for (int j=0; j<pages.length; j++) {
        	k++;
            String url= "<a href=\""+a+countries[i]+b+pages[j]+"\">Page_"+k+"</a>";
            System.out.println(url);
            pw.println(url);
        }
    }
    pw.close(); //sc.close();
   
	}
}