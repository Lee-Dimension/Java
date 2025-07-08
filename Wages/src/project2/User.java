package project2;
//User.java
import java.util.Scanner;

public class User {
 public static void main(String[] args) {
     Manager manager = new Manager();
     Scanner sc = new Scanner(System.in);

     while (true) {
         System.out.println("\n=== 급여관리 메뉴 ===");
         System.out.println("1. 사원 기본정보 등록");
         System.out.println("2. 근무시간 업데이트");
         System.out.println("3. 월급 조회");
         System.out.println("0. 종료");
         System.out.print("선택> ");

         int choice = sc.nextInt();
         sc.nextLine();

         if (choice == 0) {
             System.out.println("프로그램 종료");
             break;
         }

         switch (choice) {
             case 1:
                 registerEmployees(manager, sc);
                 break;
             case 2:
                 updateWorkingTime(manager, sc);
                 break;
             case 3:
                 viewSalary(manager, sc);
                 break;
             default:
                 System.out.println("잘못된 선택입니다.");
         }
     }

     sc.close();
 }

 private static void registerEmployees(Manager manager, Scanner sc) {
     System.out.print("등록할 사원 수: ");
     int count = sc.nextInt();
     sc.nextLine();
     for (int i = 0; i < count; i++) {
         System.out.printf("\n--- 사원 %d 기본정보 입력 ---\n", i + 1);
         System.out.print("이름: ");
         String name = sc.nextLine();
         System.out.print("사번: ");
         int num = sc.nextInt();
         System.out.print("기본월급: ");
         double base = sc.nextDouble();
         sc.nextLine();

         Employee e = new Employee();
         e.getName().setName(name);
         e.getNumber().setNumber(num);
         e.getMoney().setBaseSalary(base);
         manager.addEmployee(e);
     }
     System.out.println("기본정보 등록 완료");
 }

 private static void updateWorkingTime(Manager manager, Scanner sc) {
     System.out.print("업데이트할 사번: ");
     int num = sc.nextInt();
     System.out.print("초과근무시간: ");
     int ot = sc.nextInt();
     System.out.print("야간근무시간: ");
     int nh = sc.nextInt();
     System.out.print("휴일근무시간: ");
     int hh = sc.nextInt();

     WorkingTime wt = new WorkingTime();
     wt.setOvertimeHours(ot);
     wt.setNightHours(nh);
     wt.setHolidayHours(hh);

     if (manager.updateWorkingTime(num, wt)) {
         System.out.println("업데이트 완료");
     } else {
         System.out.println("사번을 찾을 수 없습니다.");
     }
 }

 private static void viewSalary(Manager manager, Scanner sc) {
     System.out.print("조회할 사번: ");
     int num = sc.nextInt();

     Employee e = manager.getEmployeeByNumber(num);
     if (e != null) {
         double salary = new Calculator().calculate(e);
         System.out.printf("최종 월급: %.2f\n", salary);
     } else {
         System.out.println("사번을 찾을 수 없습니다.");
     }
 }
}
