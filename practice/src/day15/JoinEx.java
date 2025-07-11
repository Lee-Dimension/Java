package day15;

class MyRunnableTwo implements Runnable{
	public void run() {
		System.out.println("run");	first();
	}
	public void first() {
		System.out.println("first"); second();
	}
	public void second() {
		System.out.println("second");
	}
}


public class JoinEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Thread.currentThread().getName()+" start");
		
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		myThread.start();
		try {
			myThread.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println( Thread.currentThread().getName()+" end");
	}
}
