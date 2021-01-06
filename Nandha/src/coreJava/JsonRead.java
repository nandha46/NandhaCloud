package coreJava;


import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
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


		String Employees = (String) jo.get("US_SICCODE");

		System.out.println(Employees);

		long age = (long) jo.get("age");
		System.out.println(age);


		Map<?, ?> address = ((Map<?, ?>)jo.get("address"));

		Iterator<?> itr1 = address.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry<?,?> pair = (Entry<?,?>)itr1.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

		JSONArray ja = (JSONArray) jo.get("phoneNumbers");

		Iterator<?> itr2 = ja.iterator();

		while (itr2.hasNext())
		{
			itr1 = ((Map<?, ?>) itr2.next()).entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry<?,?> pair = (Entry<?, ?>) itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}
	}
}
