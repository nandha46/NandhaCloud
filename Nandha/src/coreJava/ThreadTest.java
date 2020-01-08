package coreJava;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new ThreadTest();
		Thread t2 = new ThreadTest();
		Thread t3 = new ThreadTest();

		t1.start();		t2.start();		t3.start();

	}

}
