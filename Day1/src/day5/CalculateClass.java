package day5;
import java.util.Scanner;

class Calculate{
	//필드
	private int num1;
	private int num2;
	private String sign;
	private float result;
	//생성자
	
	//메소드
	public void inputStep(Scanner sc) {
		this.num1 = sc.nextInt();//숫자 1입력받기
		this.num2 = sc.nextInt();//숫자 2입력받기
		this.sign = sc.next();//연산기호 입력받기
	}
	public void plus() {
		this.result = num1 + num2;
	}
	public void minus() {
		this.result = num1 - num2;
	}
	public void mul() {
		this.result = num1 * num2;
	}
	public void div() {
		if(num2 == 0) {System.out.println("0으로는 나눌 수 없습니다."); return;}
		this.result = num1 / num2;
	}
	public void calc() { //계산
		switch (sign) {
		case "+" :
			this.plus(); break;
		case "-" :
			this.minus(); break;
		case "*" :
			this.mul(); break;
		case "/" :
			this.div(); break;
		default:
			System.out.println("조건에 맞지 않는 연산기호 입니다."); return;
		}
	}
	public void outputStep() { //결과 출력;
		System.out.println("결과 : " + result);
	}
	public void calculator(){//계산기 기능.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자^연산기호^숫자 순서로 입력하세요 : ");
		this.inputStep(sc);
		this.calc();
		this.outputStep();
	}
}
public class CalculateClass {
	
	public static void main(String[] args) {
		new Calculate().calculator();
	}
}
