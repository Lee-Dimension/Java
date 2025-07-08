package day12;

public class Generic1Main {
	public static void main(String[] args) {
		Generic1<String> t = new Generic1<String>();
		
		String[] ss = {"예","아"};
		t.set(ss);
		t.print();
	}
}

