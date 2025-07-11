package day4;

import java.util.Scanner;

public class method2 {
	static Scanner sc = new Scanner(System.in);
	
    public static int inputNum(){return  sc.nextInt();}
    
    public static String inputSign() { return  sc.next();}
    
	public static float calc(int num1, String sign, int num2) {
		switch (sign) {
		case "+" :
			return num1 + num2;
		case "-" :
			return num1 - num2;
		case "*" :
			return num1 * num2;
		case "/" :
			return (float) num1 / num2;
		default:
			System.out.println("조건에 맞지 않는 연산기호 입니다.");
			return 0;
		}
	}
	public static void print1(float result) {
		System.out.println("결과 : " + result);
	}
	
	
	public static void main(String[] args) {
	    float result;
		int num1, num2;
		String sign,re;
		
		do {
		    num1 = method2.inputNum();
		    sign = method2.inputSign();
		    num2 = method2.inputNum();
		    result = method2.calc(num1,sign,num2);
	        method2.print1(result);
	        System.out.print("계속 하시겠습니까?(Y) : ");
	        re = sc.next();
		}while(re.equals("y")||re.equals("Y"));
		System.out.print("종료");
	}
}	
