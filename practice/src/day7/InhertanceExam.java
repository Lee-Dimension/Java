
/*
 * 상속 ㅣ is~a
 * super class : 상속해주는 클래스
 * sub class : 상속 받는 클래스
 * 
 * -100 프로 상속구조.
 * -객체끼리는 단일상속만 가능. 인터페이스는 다중상속이 가능하다.
 * -extends
 * -상속 시 super class의 객체를 자동으로 호출 : super()
 * this() -> 현재 내 클래스에 있는 오버로딩 된 생성자를 호출
 * super()는 항상 sub 클래스의 생성자 함수의 첫번째 라인에 항상 존재. 첫번째 라인을 벗어나면 안됨.
 * 
 * super
 * -sub class에서 부모의 멤버를 접근할 때 사용한다.
 * 오버라이딩
 * -super class가 가지고 있는 멤버를 똑같이 재정의하는것.
 * -목적
 *  1. 새로 내용을 바꾸고자 할 경우.
 *  2. 부모의 기능을 쓰면서 추가 하고 싶을 때.
 *  
 *  3. 바인딩
 * 	  1. 정적 바인딩
 *    2. 동적 바인딩 D dd = in;
 *    	부모의 권한으로 자식의 레퍼런스에 접근
 */
package day7;

//class A{
//	//super();
//	private int a;
//	
//	public A() {
//		System.out.println("super 생성자");
//	}
//	
//	public int getA() {
//		return a;
//	}
//	public void setA(int a) {
//		this.a = a;
//	}
//}

//public class InhertanceExam extends A {
//	private int b;
//	public InhertanceExam() {
//		//super(); 는 항상 있음. 생략되어있을 뿐.
//		System.out.println("sub 생성자");
//	}
//
//	public static void main(String[] args) {
//		
//		InhertanceExam in = new InhertanceExam();
//		
//		System.out.println(in.toString());
//		System.out.println(in.getA());
//		System.out.println(in.a);
//		System.out.println(in.b);
//	}
//
//}
