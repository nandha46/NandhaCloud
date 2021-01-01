package time;

import java.time.Duration;
import java.time.Instant;

public class MeasurePerformance {

	private void someMethod() {
		// Some random sleeps and waits..
		System.out.println("sleeping...");
		try {
			Thread.sleep(500l);
			Thread.sleep(154l);
		} catch (InterruptedException e) {
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
