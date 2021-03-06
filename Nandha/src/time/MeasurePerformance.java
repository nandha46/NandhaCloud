package time;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;

import util.Loggr;
/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class MeasurePerformance {
	private static final String CLASS_NAME = MeasurePerformance.class.getName();
	// TODO make this class universal & slice into any file to measure performance
	// TODO Logger into all java codes
	private void someMethod() {
		final String methodName = "someMethod";
		// Some random sleeps and waits..
		Loggr.logMessage(Loggr.METHOD_ENTRY,Level.INFO, CLASS_NAME, methodName, null);
		System.out.println("sleeping...");
		try {
			Thread.sleep(500l);
			Thread.sleep(154l);
			Loggr.logMessage(Loggr.METHOD_EXIT,Level.INFO, CLASS_NAME, methodName, null);
		} catch (InterruptedException e) {
			Loggr.logMessage("error",Level.INFO, CLASS_NAME, methodName, null, e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MeasurePerformance mp = new MeasurePerformance();
		// Method 1
		Instant start = Instant.now();
		mp.someMethod();
		Instant end = Instant.now();
		System.out.println("Duration 1: " +Duration.between(start, end).toMillis()+" ms");
		// Method 2 
		long start2 = System.nanoTime();
		mp.someMethod();
		long end2 = System.nanoTime();
		double dur = ((end2-start2)/1000000);
		System.out.println("Duration 2: "+dur +" ms");
	}
}
