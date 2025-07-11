package day4;

import java.util.Scanner;

public class method1 {
	
	 public static void main(String[] args) {
		
		 
		 int num1, num2;
		 char op;
		 
		 String str = "Superman";
		 
		 disp();
		 num1= method1.input();
		 dispNum1(num1);
		 
//		 System.out.println(num1);
		 dispStr(str);
	}
	public static void dispStr(String name) {
		System.out.println(name);
	}
	 
	public static void dispNum1(int num1) {
		System.out.println(num1);
	}
	 
	public static void disp() {
		System.out.println("입력하세요.");
	}
	public static int input() {
		return 100;
	}
}
