package Project;

import java.util.Scanner;

class User{ // 사번 입력시 등등 출력
	
	public static void main(String[] args)  {
		
		Manager user;
		user = new Manager();	

		
		System.out.println("사번 입력 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		Employee employees = user.getEmployee(num);
		System.out.print(employees.getName());
		
		
}
}