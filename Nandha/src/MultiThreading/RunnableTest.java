package MultiThreading;

public class RunnableTest implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
	public static void main(String[] args) {
		Runnable r = new RunnableTest();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
