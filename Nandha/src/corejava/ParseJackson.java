package corejava;

import java.util.logging.Level;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import util.Loggr;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class ParseJackson {
	private static final String CLASS_NAME = ParseJackson.class.getName();
	
	
	private void parse (String json){
		final String methodName = "parse";
		Company comp = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			comp = mapper.readValue(json, Company.class);
		} catch (JsonProcessingException e) {
			Loggr.logMessage("Error", Level.SEVERE, CLASS_NAME, methodName, null, e);
			e.printStackTrace();
		}
		
		System.out.println(comp.getName() + comp.getAddress());
	}
	
	public static void main (String[] args) {
		ParseJackson p = new ParseJackson();
		String json = "{\"id\":0,\"name\":\"ab corp\",\"address\":{\"doorNo\":\"14b\",\"streetAddress\":\"Baker Street\",\"city\":\"West Minister\",\"state\":\"London\",\"country\":\"UK\"},\"phoneNumbers\":[4582565,1549998,0,0,0]}\r\n"
				+ "";
		p.parse(json);
		
	}
}
