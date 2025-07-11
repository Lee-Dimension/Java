package day1;
import java.util.Scanner;

public class Hello extends Object{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		String sign = sc.next();
		int num2 = sc.nextInt();
		
		int result = 0;
		
//		if(sign.equals("+")) {
//			result = num1 + num2;
//		} else  if(sign.equals("-")) {
//			result = num1 - num2;
//		} else  if(sign.equals("*")) {
//			result = num1 * num2;
//		} else  if(sign.equals("/")) {
//			result = num1 / num2;
//		} else{
//			System.out.println("조건에 맞지 않는 연산기호 입니다.");
//		}
		
		switch (sign) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
		case "/" :
			result = num1 / num2;
			break;
		default:
			System.out.println("조건에 맞지 않는 연산기호 입니다.");
		}
		
		System.out.println("결과 : " + result);
		}

	}

