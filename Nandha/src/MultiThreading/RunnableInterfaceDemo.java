package MultiThreading;

import java.util.logging.Level;

import util.Loggr;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
class RunnableWorker implements Runnable{
	private static final String CLASS_NAME = RunnableWorker.class.getName();
	
	@Override
	public void run() {
		final String methodName = "run";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		for (int i = 0; i <= 4; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);			

		}
	}
	
}

public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		Runnable r = new RunnableWorker();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();

	}

}