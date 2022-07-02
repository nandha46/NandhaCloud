package corejava;
/**
 * @author Nandhakumar Subramanian
 * 
 * @since 21 jan 2021
 */

import java.util.Arrays;
import java.util.logging.Level;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import util.Loggr;


public class BuildingJacksonApi {
	private static final String CLASS_NAME = BuildingJacksonApi.class.getName();

	public JsonObject buildJson() {
		final String methodName = "buildJson";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		// Creating Company object to invoke company attributes getters
				Company c = new Company();
				// Creating JsonObjectBuilders for company,address,phone number array objects
				JsonObjectBuilder companyBuilder = Json.createObjectBuilder();
				JsonObjectBuilder addressBuilder = Json.createObjectBuilder();
				JsonArrayBuilder phoneBuilder = Json.createArrayBuilder();
				// using add method to set value to object builder
				Address address = new Address();
				addressBuilder = addressBuilder.add("doorNo",address.getDoorNo()).add("streetAddress", address.getStreetAddress()).add("city", address.getCity())
						.add("state", address.getState()).add("country", address.getCountry());
				for (long phone : c.getPhoneNumbers()) {
					phoneBuilder.add(phone);
				}
				companyBuilder = companyBuilder.add("id",c.getId()).add("name", c.getName()).add("address", addressBuilder.build()).add("phoneNumbers", phoneBuilder.build());
				// building json object
				JsonObject jo = companyBuilder.build();
				Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
				return jo;
	}
	
	public static void main(String[] args) {
		BuildingJacksonApi b = new BuildingJacksonApi();
		JsonObject json = b.buildJson();
		System.out.println(json);
	}
}

class Company {
	private int id;
	private String name;
	private long[] phoneNumbers;
	private Address address;

	Company() {
		id = 0;
		name = "ab corp";
		phoneNumbers = new long[5];
		phoneNumbers[0] = 4582565l;
		phoneNumbers[1] = 1549998l;
		@SuppressWarnings("unused")
		Address addr = new Address();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", phoneNumbers=" + Arrays.toString(phoneNumbers) + ", address="
				+ address + "]";
	}

}

class Address {
	private String doorNo;
	private String streetAddress;
	private String city;
	private String state;
	private String country;

	Address (){
		doorNo = "14b";
		streetAddress = "Baker Street";
		city = "West Minister";
		state = "London";
		country = "UK";
	}
	
	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}

}