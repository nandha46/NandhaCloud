package Leetcode;

import java.util.logging.Level;

import util.Loggr;

/**
 * <pre>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

 * </pre>
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class DefangingIP {
	private static final String CLASS_NAME = DefangingIP.class.getName();
	
	static String defangingIp (String address) {
		final String methodName = "defangingIp";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		return address.replace(".", "[.]");
	}
	public static void main(String[] args) {
		String address = "255.100.50.0";
		address = defangingIp(address);
		System.out.println(address);
	}
}
