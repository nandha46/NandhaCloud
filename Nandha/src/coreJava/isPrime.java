package coreJava;

import java.util.logging.Level;

import util.Loggr;

/**
 * 
 * @author Nandhakumar Subramania
 * 
 * @since 15 Jan, 2021
 *
 */
public class isPrime {
	private static final String CLASS_NAME = isPrime.class.getName();
	
	public static void main(String[] args) {
			int num = 45;
			System.out.println(isPrimeNumber(num));
	}

	private static boolean isPrimeNumber(int number) {
		final String methodName = "isPrimeNumber";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		if (number < 2)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		return true;
	}
}
