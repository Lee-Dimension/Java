package day4;

public class Exam {
	
	private int a;
	private int b;
	

	public Exam(){
//		this.a=0;
//		this.b=0;
		this(0,0);
	}
	public Exam(int a) {
//		this.a = a;
//		this.b = 0;
		this(a,0);
	}
	public Exam(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		
		Exam dw = new Exam(10, 30);
		Exam dw2 = new Exam();
		Exam dw3 = new Exam(50);
		
		System.out.println(dw2.a); //0
		System.out.println(dw2.b); //0
		
		System.out.println(dw.a); //10
		System.out.println(dw.b); //30
		
		System.out.println(dw3.a); //50
		System.out.println(dw3.b); //0
	
	}
//	public Exam(int a, int b) { //기본 생성자함수
//		System.out.println("생성자 함수");
//		this.a = a;
//		this.b = b;
//	}
//	public Exam() {//생성자 함수 오버로딩
//		System.out.println("생성자 함수2");
//	}
}