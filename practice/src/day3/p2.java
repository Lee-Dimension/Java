package day3;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 정보를 입력하시겠습니까? : ");
		int n = sc.nextInt();
		int [][]num = new int[n][4]; //국 영 수 총점 넣을 곳
		float [] avg = new float[n]; //평균 넣을 곳
		
		String [] name = new String[n];
		
		String[] Sub  = { "국어", "영어", "수학" };
		
		//사람 이름 입력받고, 각 과목 점수 입력받기
		for(int i=0; i<n;i++) {
			System.out.print("\n"+(i+1)+"번째 사람의 이름을 입력하세요 : ");
			name[i] = sc.next();
			for(int j=0;j<3 ;j++) {
				System.out.print(name[i]+"의 "+Sub[j]+" 점수를 입력하세요 : ");
				num[i][j] = sc.nextInt();
				num[i][3] += num[i][j];	 //총점 계산
			}	
			avg[i] = num[i][3]/3.f; //평균 계산
		}
		
		//결과 출력
		System.out.printf("\n이름\t국어\t영어\t수학\t총점\t평균\n");
		
		for(int a=0; a<n; a++) {
			System.out.printf(name[a]+"\t");
			for(int b=0; b<4; b++) {
				System.out.printf(num[a][b]+"\t");
			}
			System.out.printf(avg[a]+"\n");
		}	
	}
}
