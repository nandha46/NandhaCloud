package MultiThreading;

import java.util.logging.Level;

import util.Loggr;

/**
 * @author Nandhakumar Subramanian
 *
 */
public class RunnableAlt implements Runnable {
	private static final String CLASS_NAME = RunnableAlt.class.getName();
	private Thread t;
	@Override
	public void  run() {
		final String methodName = "RunnableAlt.run";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		for (int i = 0; i < 23; i++) {
			System.out.println(Thread.currentThread().getName() +": "+i);
			// TODO something practical
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
	}
	// Overriding start method since RunnableAlt object is not passed to the thread
	public void start() {
		final String methodName = "RunnableAlt.start";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		t= new Thread(this,"Worker1");
		t.start();
	}
	public static void main(String[] args) {
		final String methodName = "main";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		RunnableAlt ra = new RunnableAlt();
		RunnableAlt ra2 = new RunnableAlt();
		ra.start();
		ra2.start();
}
}
