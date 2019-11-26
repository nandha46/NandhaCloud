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
public class JsonFolder {
	
	public static void writeJson(File file) {
		try {
		    String fwrite = file.getAbsolutePath().concat("_modified.csv");
		    String line; String[] lineArray;
		    BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
		    BufferedWriter writer = new BufferedWriter(new FileWriter(fwrite));
		    reader.readLine();
		    writer.write("Website,Industry,Employee,Revenue\n");
			while((line =reader.readLine())!=null) {
		    lineArray = line.split("~");	
		    String dynamicData = lineArray[2].replaceAll("\"\"","\"");
		    dynamicData = dynamicData.substring(1);
		    System.out.println(dynamicData);
		    dynamicData = dynamicData.substring(0, dynamicData.length()-1);
		    Object obj= new JSONParser().parse(dynamicData);
		    
		   // Object obj= new JSONParser().parse(lineArray[2]);
		    JSONObject jo = (JSONObject) obj;
		    String Employees = (String) jo.get("EMPLOYEES");
		    String Rev = (String) jo.get("REVENUES");
		    String Revenue= Rev.replaceAll("\\.","");
		    if(Revenue.contains(",")) {
		    	continue;
		    }
		    System.out.println("Employees: "+Employees+"\nRevenue: "+Revenue+"\nWebsite: "+lineArray[0]+"\nIndustry: "+lineArray[1]+"\n");
		    writer.write(lineArray[0]+","+lineArray[1]+","+Employees+","+Revenue+"\n");
			}reader.close(); writer.close();
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("Here");
		}
	}
	public static void main(String[] args) throws Exception {
		String filename= "/home/local/ZOHOCORP/nandha-con426/Documents/Smallbussinessdb extra";
		File fil = new File(filename);
		File[] fArr= fil.listFiles();
		for(File f:fArr) {
			System.out.println(f.getAbsolutePath());
			writeJson(f);
		}
	}
}