package coreJava;



 

import java.io.FileReader; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class JsonRead 
{ 
	public static void main(String[] args) throws Exception 
	{ 
		// parsing file "JSONExample.json" 
		 Object obj = new JSONParser().parse(new FileReader("/home/local/ZOHOCORP/nandha-con426/Documents/Smallbussinessdb extra/Automobil_json.json"));

		
		// typecasting obj to JSONObject 
		JSONObject jo = (JSONObject) obj; 
		
		// getting firstName and lastName 
		String Employees = (String) jo.get("US_SICCODE"); 
		//String lastName = (String) jo.get("lastName"); 
		
		System.out.println(Employees); 
		//System.out.println(lastName); 
		
//		// getting age 
//		long age = (long) jo.get("age"); 
//		System.out.println(age); 
//		
//		// getting address 
//		Map address = ((Map)jo.get("address")); 
//		
//		// iterating address Map 
//		Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
//		while (itr1.hasNext()) { 
//			Map.Entry pair = itr1.next(); 
//			System.out.println(pair.getKey() + " : " + pair.getValue()); 
//		} 
//		
//		// getting phoneNumbers 
//		JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 
//		
//		// iterating phoneNumbers 
//		Iterator itr2 = ja.iterator(); 
//		
//		while (itr2.hasNext()) 
//		{ 
//			itr1 = ((Map) itr2.next()).entrySet().iterator(); 
//			while (itr1.hasNext()) { 
//				Map.Entry pair = itr1.next(); 
//				System.out.println(pair.getKey() + " : " + pair.getValue()); 
//			} 
//		} 
	} 
} 