package day4;

import java.util.Scanner;

public class method3 {
//성적 산출 프로그램 메서드로 만들기
	static Scanner sc = new Scanner(System.in);
	
	//이름 입력 받는 메서드
	public static String name(){
		System.out.print("이름을 입력하세요 : ");
		return sc.next();
	}
	
	public static int[] input(int[]num) {
		String[] Sub = {"국어", "영어", "수학"};
		for(int i=0; i<3;i++) { //국영수 순차적으로 입력 받음
			System.out.printf(Sub[i]+"점수를 입력하세요 : ");
			num[i] = sc.nextInt();
			num[3] += num[i];
			}
		return num;
		}
	public static void output(String name, int[]num, float avg) {
		System.out.printf("\n이름 : "+name+"\n국어점수 : "+ num[0] +"\n영어점수 : " + 
				num[1]+"\n수학점수 : "+ num[2]+"\n총점 : "+ num[3]+"\n평균 : " + avg); //결과 출력
	}
	public static void main(String[] args) {
		int [] num = new int[4];
		float avg;
		String name;
		
		name = method3.name();
		num = method3.input(num);
		avg = num[3]/3.f;
		output(name,num,avg);
	}
}
