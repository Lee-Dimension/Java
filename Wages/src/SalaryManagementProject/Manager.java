package SalaryManagementProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager extends Employees implements Adip{
	Scanner sc = new Scanner(System.in);
	CalcResult inner = new CalcResult();
	public void runManagerMode() {
		while (true) {
			System.out.println("\n========== 관리자 모드 ==========");
			System.out.println("1. 사원 등록");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 조회");
			System.out.println("4. 사원 정보 수정");
			System.out.println("5. 관리자 모드 종료");
			System.out.print("선택 >> ");

			int select = sc.nextInt();
			if (select == 1) {
				add();
			} else if (select == 2) {
				delete();
			} else if (select == 3) {
				inquire();
			} else if (select == 4) {
				patch();
			} else if (select == 5) {
				System.out.println("관리자 모드를 종료합니다.");
				break; // while 탈출
			} else {
				System.out.println("1~5 사이의 번호를 입력하세요.");
			}
		}
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("1.신규사원정보 \t2.추가근로시간");
		System.out.print("추가하실 정보는 무엇입니까? : ");
		int select = sc.nextInt();
		if(select == 1) {
			cemp[count] = new Cemployee();
			System.out.println("====================================");
			System.out.print("이름을 입력하세요 : ");
        	cemp[count].setName(sc.next());
			while(true){
				System.out.print("사원 번호를 입력하세요 : ");
	            try {
	            	cemp[count].setNum(sc.nextInt());
	                break;
	            } catch (InputMismatchException e) {
	                sc.nextLine();
	                System.out.println("[ERROR] 숫자를 입력해주세요.");
	            }
			}
			System.out.print("부서를 입력하세요 : ");
			cemp[count].setDepartment(sc.next());
			System.out.print("직급을 입력하세요 : ");
			cemp[count].setPosition(sc.next());
			while(true){
				System.out.print("관리자 여부를 입력하세요(true/false) : ");
	            try {
	    			cemp[count].setManager(sc.nextBoolean());
	                break;
	            } catch (InputMismatchException e) {
	                sc.nextLine();
	                System.out.println("[ERROR] (true/false)를 입력해주세요.");
	            }
			}
			while(true){
				System.out.print("기본 임금을 입력하세요 : ");
	            try {
	    			cemp[count].setBasicSalary(sc.nextInt());
	                break;
	            } catch (InputMismatchException e) {
	                sc.nextLine();
	                System.out.println("[ERROR] 숫자를 입력해주세요.");
	            }
			}
			inner.calcTax(count);
			inner.totalSalary(count);
			count++;
		}else if(select == 2) {
			System.out.println("====================================");
			System.out.print("근로 시간을 입력할 사원 번호를 입력하세요 : ");
			int num = sc.nextInt();
			for(int i = 0; i<count; i++) {
				if(cemp[i].getNum()==num) {
					while(true){
						System.out.print("연장근로시간을 입력하세요 : ");
			            try {
							cemp[i].setOverTime(sc.nextInt());
			                break;
			            } catch (InputMismatchException e) {
			                sc.nextLine();
			                System.out.println("[ERROR] 숫자를 입력해주세요.");
			            }
					}
					while(true){
						System.out.print("야간근로시간을 입력하세요 : ");
			            try {
							cemp[i].setNightTime(sc.nextInt());
			                break;
			            } catch (InputMismatchException e) {
			                sc.nextLine();
			                System.out.println("[ERROR] 숫자를 입력해주세요.");
			            }
					}
					while(true){
						System.out.print("휴일근로시간을 입력하세요 : ");
			            try {
							cemp[i].setHoliTime(sc.nextInt());
			                break;
			            } catch (InputMismatchException e) {
			                sc.nextLine();
			                System.out.println("[ERROR] 숫자를 입력해주세요.");
			            }
					}
					inner.calcOverPay(i);
					inner.calcNightPay(i);
					inner.calcHoliPay(i);
					inner.calcTax(i);
					inner.totalSalary(i);
				}
			}
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		while(true) {
			System.out.print("삭제 할 사원의 사원 번호를 입력하세요 : ");
			int num = sc.nextInt();
			boolean isExist = false;
			for(int i = 0; i <count; i++) {
				if(cemp[i].getNum() == num) {
					for (int j = i; j < count - 1; j++) { //한 칸 씩 당겨서 덮어쓰기
						cemp[j] = cemp[j + 1];
					}
					cemp[count - 1] = null; // 마지막 칸 null로 정리
					count--;
					System.out.println("사원 삭제 완료!");
					isExist = true;
				}
			}
			if (isExist) break;
			System.out.println("해당 사원을 찾을 수 없습니다. 다시 입력해주세요.");
		}
	}

	@Override
	public void inquire() { //사원 정보 조회
		// TODO Auto-generated method stub
		System.out.println("====================================");
		while(true) {
			System.out.print("조회 할 사원 번호를 입력하세요 : ");
			int num = sc.nextInt();
			boolean isExist = false;
			for(int i = 0; i <count; i++) {
				if(cemp[i].getNum() == num) {
					System.out.print("사원이름 : "+cemp[i].getName()+", 사원번호 : "+cemp[i].getNum()+", 부서 : "+cemp[i].getDepartment()+", 직급 : "+cemp[i].getPosition()
							+",\n관리자여부 : "+cemp[i].getManager()+", 기본임금 : "+cemp[i].getBasicSalary()
							+",\n연장근로시간 : "+cemp[i].getOverTime()+", 야간근로시간 : "+cemp[i].getNightTime()+", 휴일근로시간 : "+cemp[i].getHoliTime()
							+",\n연장근로수당 : "+cemp[i].getOverPay()+", 야간근로수당 : "+cemp[i].getNightPay()+", 휴일근로수당 : "+cemp[i].getHoliPay()
							+",\n세금 : "+cemp[i].getTax()+", 급여 : "+cemp[i].getTotalPay());
					isExist = true;
				}
			}
			if (isExist) break;
			System.out.println("해당 사원을 찾을 수 없습니다. 다시 입력해주세요.");
		}
	}

	@Override
	public void patch() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		while(true) {
			System.out.print("수정 할 사원 번호를 입력하세요 : ");
			int num = sc.nextInt();
			boolean isExist = false;
			for(int i = 0; i <count; i++) {
				if(cemp[i].getNum() == num) {
					System.out.println("------------------------------------");
					System.out.println("사원이름 사원번호 부서 직급 관리자여부 기본임금");
					System.out.println("연장근로시간 야간근로시간 휴일근로시간");
					System.out.println("------------------------------------");
					System.out.print("목록 중 수정 할 정보를 입력하세요 : ");
					String patch = sc.next();
					if (patch.equals("사원이름")) {
						System.out.println("기존 사원이름 : "+cemp[i].getName());
						System.out.print("변경하실 이름 : ");
						String input = sc.next();
						cemp[i].setName(input);
						System.out.print("사원 이름을 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("사원번호")) {
						System.out.println("기존 사원번호 : "+cemp[i].getNum());
						System.out.print("변경하실 사원번호 : ");
						int input = sc.nextInt();
						cemp[i].setNum(input);
						System.out.print("사원번호룰 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("부서")) {
						System.out.println("기존 부서 : "+cemp[i].getDepartment());
						System.out.print("변경하실 부서 : ");
						String input = sc.next();
						cemp[i].setDepartment(input);
						System.out.print("부서를 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("직급")) {
						System.out.println("기존 직급 : "+cemp[i].getPosition());
						System.out.print("변경하실 직급 : ");
						String input = sc.next();
						cemp[i].setPosition(input);
						System.out.print("직급을 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("관리자여부")) {
						System.out.println("기존 관리자여부 : "+cemp[i].getManager());
						System.out.print("변경하시겠습니까?(Y) : ");
						String input = sc.next();
						if((input.equalsIgnoreCase("y"))|| (input.equalsIgnoreCase("Y"))) {
							if(cemp[i].getManager() == true) {
								cemp[i].setManager(false);
							}else {
								cemp[i].setManager(true);
							}
						System.out.print("관리자 권한을 변경하였습니다.");
						}else {
						System.out.print("관리자 권한을 변경하지 않았습니다.");
						}
						isExist = true;
					}else if (patch.equals("기본임금")) {
						System.out.println("기존 기본임금 : "+cemp[i].getBasicSalary());
						System.out.print("변경하실 기본임금 : ");
						int input = sc.nextInt();
						cemp[i].setBasicSalary(input);
						inner.calcOverPay(i);
						inner.calcNightPay(i);
						inner.calcHoliPay(i);
						inner.calcTax(i);
						inner.totalSalary(i);
						System.out.print("기본임금을 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("연장근로시간")) {
						System.out.println("기존 연장근로시간 : "+cemp[i].getOverTime());
						System.out.print("변경하실 연장근로시간 : ");
						int input = sc.nextInt();
						cemp[i].setOverTime(input);
						inner.calcOverPay(i);
						inner.calcTax(i);
						inner.totalSalary(i);
						System.out.print("연장근로시간을 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("야간근로시간")) {
						System.out.println("기존 야간근로시간 : "+cemp[i].getNightTime());
						System.out.print("변경하실 야간근로시간 : ");
						int input = sc.nextInt();
						cemp[i].setNightTime(input);
						inner.calcNightPay(i);
						inner.calcTax(i);
						inner.totalSalary(i);
						System.out.print("야간근로시간을 변경하였습니다.");
						isExist = true;
					}else if (patch.equals("휴일근로시간")) {
						System.out.println("기존 휴일근로시간 : "+cemp[i].getHoliTime());
						System.out.print("변경하실 휴일근로시간 : ");
						int input = sc.nextInt();
						cemp[i].setHoliTime(input);
						inner.calcHoliPay(i);
						inner.calcTax(i);
						inner.totalSalary(i);
						System.out.print("휴일근로시간을 변경하였습니다.");
						isExist = true;
					}
				}
			}
			if (isExist) break;
			System.out.println("해당 사원을 찾을 수 없습니다. 다시 입력해주세요.");
		}	
	}
}
