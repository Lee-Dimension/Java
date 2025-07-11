package day15;

public class SingleThreadEx2 implements Runnable {
	private int[] temp;
	public SingleThreadEx2() {
		temp = new int[10];
		for(int start=0;start<temp.length;start++) {
			temp[start] = start;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("Tread Name: %s , ", Thread.currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreadEx2 st= new SingleThreadEx2();
		Thread t = new Thread(st);
		t.setName("SuperMan");
		t.start();
	}
}
