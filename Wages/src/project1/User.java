package project1;

import java.util.Scanner;

public class User {

public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String mode;
		
		Manager user;
		user = new Manager();	
		
		while(true) {
			System.out.println("모드를 고르세요 (관리자/사용자)");
			mode = sc.next();
			if(mode.equals("관리자")) {
				user.inputsetting();
			}
			else if(mode.equals("사용자")) {
				System.out.println("사원 정보를 조회하려면 사번을 입력하세요 :");
				int num = sc.nextInt();
				Employee emp = user.getEmployee(num);
				if(emp == null) {
					System.out.print("해당 사번의 직원이 없습니다");
				}else {
				System.out.printf("이름: %s 총액: %d 야간,초과,휴일수당 : %d\n", user.getName(emp), user.getTotalMoney(emp), user.getBonusMoney(emp));}
			}else {
				System.out.println("종료합니다");
				break;
			}
		}
		
		

}}
