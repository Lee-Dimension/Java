package day7;

class A{
	private int a;
	public A(int a){
		this.a = a;
	}
	
	public int getA(){
		return a;
	}
}
class B extends A{
	private int b;
	public B(int a, int b){
		super(a);
		this.b = b;
	}
	public int getB(){
		return b;
	}
}
class C extends B{
	private int c;
	public C(int a, int b, int c){
		super(a,b);
		this.c = c;
	}
	public int getC(){
		return c;
	}
}
class D extends C{
	private int d;
	public D(int a, int b, int c,int d){
		super(a,b,c);
		this.d = d;
	}
	public int getD(){
		return d;
	}	
	public void disp() {
		System.out.println("DDDDDD");
	}
	
}

public class InhertanceExam2 extends D {
    public InhertanceExam2(int a, int b, int c, int d) {
    	super(a,b,c,d);
    }
    public void disp() {
    	super.disp();
    	System.out.println("InhertanceExam");
    }
	public static void main(String[] args) {
		InhertanceExam2 in = new InhertanceExam2(10,20,30,40);
		
		A aa = in;
		
		System.out.println(in.getA());
		System.out.println(in.getB());
		System.out.println(in.getC());
		System.out.println(in.getD());
		in.disp();
	}
}
