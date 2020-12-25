package MultiThreading;
/**
 * @author Nandha
 * @since 1.5
 * @version 1.0
 * 
 */
public class ThreadUtil extends Thread {
	@Override
	public void run() {
		for(int i=3333;i<3433;i++) {
			System.out.println(Thread.currentThread().getName()+ ":"+i );
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadUtil();
		Thread t2 = new ThreadUtil();
		Thread t3 = new ThreadUtil();
		t1.setName("first");
		t2.setName("second");
		t3.setName("third");
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
		try {
		Thread.sleep(10);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t3.start();
	}
	
}
