package MultiThreading;
/**
 * @author Nandha
 * @version 1.0
 */
public class RunnableUtil implements Runnable{
int ans = 10;
	
	public void  run() {
		for (int i = 0; i < 23; i++) {
			System.out.println(Thread.currentThread().getName() +": "+i);
			// TODO something practical
		}
	}
	
	public static void main(String[] args) {
			Runnable ru = new RunnableUtil();
			Thread t1 = new Thread(ru);
			Thread t2 = new Thread(ru);
			t1.start();
			t2.start();
			
	}
}