package coreJava;

import java.util.logging.Level;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import util.Loggr;

public class Api {
	private static final String CLASS_NAME = Api.class.getName();
	
	private int id;
	private String name;
	private String[] address;
	
Api (int id, String name, String[] address){
		this.id = id;
		this.name =name;
		this.address = address;
	}
	
	
	public static void main (String[] args) {
		Loggr.logMessage("main", Level.INFO, CLASS_NAME, "main", args);
		String json="";
		ObjectMapper mapper = new ObjectMapper();
		String[] addr = {"No 1","First Street"};
		Api api = new Api(0,"jackson", addr);
		try {
			json = 
			//json = mapper.writeValueAsString(api);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			Loggr.logMessage("Catch", Level.SEVERE, CLASS_NAME, "main", args, e);
		}
		
		System.out.println(json);
	}
}
