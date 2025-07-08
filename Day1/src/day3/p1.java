package day3;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		
		int []num = new int[4];	//국어,영어,수학,총점
		String[] Sub  = { "국어", "영어", "수학" }; //안내문 출력할 때 쓸 거
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : "); //이름 입력 받음
		String name = sc.next();
		
		for(int i=0; i<3;i++) { //국영수 순차적으로 입력 받음
			System.out.printf(Sub[i]+"점수를 입력하세요 : ");
			num[i] = sc.nextInt();
			num[3] += num[i];
		}		
		avg = num[3]/3.f;
		
		System.out.printf("이름 : "+name+"\n국어점수 : "+ num[0] +"\n영어점수 : " + 
							num[1]+"\n수학점수 : "+ num[2]+"\n총점 : "+ num[3]+"\n평균 : " + avg); //결과 출력
	}
}
