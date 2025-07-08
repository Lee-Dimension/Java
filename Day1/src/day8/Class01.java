package day8;

public class Class01{

	private int a;
	private int b;
	private int c;
	static int d=100;
	
	public void output() {
		class MemberInner{ //inner classs
			public void disp() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		MemberInner mi = new MemberInner();
		mi.disp();
	}
	
	public static void main(String[] args) {
		Class01 c1 = new Class01();
		c1.output();
	}
}
