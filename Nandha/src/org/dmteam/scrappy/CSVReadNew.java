package org.dmteam.scrappy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * @author Nandhakumar Subramanian
 *
 */
public class CSVReadNew {

	private static final String SPLIT_REGEX = ",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))";
	
	public static String[] splitCSVLine(String s) {
        return s.split(SPLIT_REGEX, -1);
    }
	
	public static void main(String[] args) {
		try {
		    String file = "/home/local/ZOHOCORP/nandha-con426/Documents/Dec 2, 2019/revenue with src Original.csv";
		    String fwrite = "/home/local/ZOHOCORP/nandha-con426/Documents/Dec 2, 2019/only multiDynamic revenue.csv";
		    String fwrite2 = "/home/local/ZOHOCORP/nandha-con426/Documents/Dec 2, 2019/src and 1Dynamic revenue.csv";
		    String fwrite3 = "/home/local/ZOHOCORP/nandha-con426/Documents/Dec 2, 2019/revenue with 1src or 1dynamic.csv";
		    String fwrite4 = "/home/local/ZOHOCORP/nandha-con426/Documents/Dec 2, 2019/revenue with src n Multidynamic.csv";
		    String line; String[] lineArray;
		    String revenueDynamic="";
		    String revenueSymbol="";
		    BufferedReader reader = new BufferedReader(new FileReader(file));
		    File file1 = new File(fwrite);
		    File file2 = new File(fwrite2);
		    File file3 = new File(fwrite3);
		    File file4 = new File(fwrite4);
		    BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
		    BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));
		    BufferedWriter writer3 = new BufferedWriter(new FileWriter(file3));
		    BufferedWriter writer4 = new BufferedWriter(new FileWriter(file4));	
		    reader.readLine();
		    writer.write("s_id\torg_name\twebsite\teitherRevenue\tdynamicSymbol\n");
		    writer2.write("s_id\torg_name\twebsite\trevenue\tdynamicRevenue\tdynamicSymbol\n");
		    writer3.write("s_id\torg_name\twebsite\trevenue\tdynamicRevenue\tdynamicSymbol\n");
		    writer4.write("s_id\torg_name\twebsite\trevenue\tdynamicRevenue\tdynamicSymbol\n");
	while((line =reader.readLine())!=null) {		
			lineArray = splitCSVLine(line);	    
		if (!(lineArray[4].isEmpty()) && lineArray[4].contains("REVENUE")) {
		    String dynamicData = lineArray[4];
		    dynamicData = dynamicData.substring(1);
//		    System.out.println(dynamicData);
		    dynamicData = dynamicData.substring(0, dynamicData.length()-1);
		    Object obj= new JSONParser().parse(dynamicData.replaceAll("\"\"", "\""));
		    JSONObject jo = (JSONObject) obj;
		    revenueDynamic = (String) jo.get("REVENUES");
		    revenueSymbol = (String) jo.get("REVENUE_SYMBOL");
		    String sid = lineArray[0];
		    String orgname = lineArray[1];
		    String website = lineArray[2];
		    String revenue= lineArray[3];
		    System.out.println("SID: "+sid+"\nOrg name: "+orgname+"\nWebsite: "+website+"\nRevenue: "+revenue+"\nRevenueSymbol :"+revenueSymbol+"\nRevenueDynamic: "+revenueDynamic+"\n");
		   if (revenueDynamic !=null || !(revenue.isEmpty())) {
		    	if(revenueDynamic !=null && !(revenue.isEmpty())) {
		    		if(revenueDynamic.contains(",")) {
		    	 writer4.write(sid+"\t"+orgname+"\t"+website+"\t"+revenue+"\t"+revenueDynamic+"\t"+revenueSymbol+"\n");
		    		}
		    		else {
		    			writer2.write(sid+"\t"+orgname+"\t"+website+"\t"+revenue+"\t"+revenueDynamic+"\t"+revenueSymbol+"\n");
		    		}	
		    	} else if (revenueDynamic !=null) {
		    		if(revenueDynamic.contains(",")) {
		    	writer.write(sid+"\t"+orgname+"\t"+website+"\t"+revenueDynamic+"\t"+revenueSymbol+"\n");
		    	}
		    	else {
		    		writer3.write(sid+"\t"+orgname+"\t"+website+"\t"+revenueDynamic+"\t"+revenueSymbol+"\n");
		    	}}
		    	else if (!(revenue.isEmpty())) {
		    	writer3.write(sid+"\t"+orgname+"\t"+website+"\t"+revenue+"\n");
		    	}
		    	}
		    }
		}
		
		    reader.close(); writer.close(); writer2.close(); writer3.close(); writer4.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}