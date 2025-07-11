package day1;
import java.util.Scanner;

public class Loop5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double result;
		String sign, re;
		
		do{
			System.out.printf("숫자1 입력 : ");
			num1 = sc.nextInt();
			System.out.printf("수식 입력 : ");
			sign = sc.next();
			System.out.printf("숫자2 입력 : ");
			num2 = sc.nextInt();
			result = 0;
			
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
				result =(float)num1 / num2;
				break;
			default:
				System.out.println("조건에 맞지 않는 연산기호 입니다.");
			}
			System.out.println("결과 : " + result);
			System.out.println("계속하시겠습니까? (Y)");
			re = sc.next();
		}while(re.equals("y")||re.equals("Y"));
	}
}
