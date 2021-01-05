package org.dmteam.scrappy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Nandhakumar Subramanian
 *
 */
public class JsonFileRead {

	public static void main(String[] args) {
		try {
			String file = "/home/local/ZOHOCORP/nandha-con426/Documents/Smallbussinessdb extra/Automobile DealersA.csv";
			String file1 = "/home/local/ZOHOCORP/nandha-con426/Documents/Smallbussinessdb extra/Automobile DealersB.csv";
			String line;
			String[] lineArray;
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
			reader.readLine();
			while ((line = reader.readLine()) != null) {
				lineArray = line.split("~");
				Object obj = new JSONParser().parse(lineArray[2]);
				JSONObject jo = (JSONObject) obj;
				String Employees = (String) jo.get("EMPLOYEES");
				String Revenue = (String) jo.get("REVENUES");
				// String Website = lineArray[0];
				// String Industry= lineArray[1];
				if (Revenue.contains(",")) {
					continue;
				}
				System.out.println("Employees: " + Employees + "\nRevenue: " + Revenue + "\nWebsite: " + lineArray[0]
						+ "\nIndustry: " + lineArray[1] + "\n");
				writer.write(lineArray[0] + "," + lineArray[1] + "," + Employees + "," + Revenue + "\n");
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}