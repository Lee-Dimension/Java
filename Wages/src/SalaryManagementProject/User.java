package SalaryManagementProject;

import java.util.Scanner;

public class User extends Manager{

	public void inquireUser() {
		System.out.println("\n========== 일반 사원 모드 ==========");
		while(true) {
			System.out.print("사원 번호를 입력하세요: ");
			int num = sc.nextInt();
			boolean isExist = false;
			for(int i = 0; i <count; i++) {
				if(cemp[i].getNum() == num) {
					System.out.println("이름 : "+cemp[i].getName()+"\t급여 : "+cemp[i].getTotalPay());
					System.out.println("추가근무수당 : "+cemp[i].getOverPay()+"\t야간근무수당 : "+cemp[i].getNightPay()+"\t일근무수당 : "+cemp[i].getHoliPay());
					System.out.println("세금 : "+cemp[i].getTax());
					isExist = true;
					break;
				}
			}
			if (isExist) break;
			System.out.println("해당 사원을 찾을 수 없습니다. 다시 입력해주세요.\n");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User manager = new User(); // 사원 목록 관리용 객체 생성

		// 사원번호 입력 반복
		while (true) {
			System.out.println("\n========== 임금 관리 시스템 ==========");
			System.out.print("사원 번호를 입력하세요: ");
			int inputNum = sc.nextInt();
			boolean found = false; //없는 사원번호일때 쓸 거
			for (int i = 0; i < manager.getCount(); i++) {
				if (manager.cemp[i].getNum() == inputNum) {
					if(manager.cemp[i].getManager()) {
						manager.runManagerMode(); // 관리자 모드 실행
					}else {
						manager.inquireUser(); // 일반 사용자 조회
					}
					found = true;
				}
			}
			if (!found) {
				System.out.println("해당 사원을 찾을 수 없습니다.다시 입력해주세요.\n");
			}
		}
	}
}
