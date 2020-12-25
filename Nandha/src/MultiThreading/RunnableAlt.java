package MultiThreading;
/**
 * @author nandha-con426
 *
 */
public class RunnableAlt implements Runnable {
	private Thread t;
	public void  run() {
		for (int i = 0; i < 23; i++) {
			System.out.println(Thread.currentThread().getName() +": "+i);
			// TODO something practical
		}
	}
	// Overriding start method since RunnableAlt object is not passed to the thread
	public void start() {
		t= new Thread(this,"Worker1");
		t.start();
	}
	public static void main(String[] args) {
		RunnableAlt ra = new RunnableAlt();
		RunnableAlt ra2 = new RunnableAlt();
		ra.start();
		ra2.start();
		
}
}
