package day15;

public class SingleThreadEx extends Thread{
	private int[] temp;
	public SingleThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start=0;start<temp.length;start++) {
			temp[start] = start;
		}
	}
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("Tread Name: %s , ", currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreadEx st= new SingleThreadEx("Superman");
		st.start();
	}
}
