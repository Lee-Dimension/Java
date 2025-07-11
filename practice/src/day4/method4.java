package day4;

import java.util.Scanner;

public class method4 {
	static Scanner sc = new Scanner(System.in);

	//인원 수 입력 메서드
	public static int n() {
		System.out.print("몇 명의 정보를 입력하시겠습니까? : ");
		return sc.nextInt();
	}

	//이름, 점수 입력 메서드
	public static int[][] input(int[][] num, String[] name, int n) {
		String[] Sub = { "국어", "영어", "수학" };
		for (int i = 0; i < n; i++) {
			System.out.print("\n" + (i + 1) + "번째 사람의 이름을 입력하세요 : ");
			name[i] = sc.next();
			for (int j = 0; j < 3; j++) {
				System.out.print(name[i] + "의 " + Sub[j] + " 점수를 입력하세요 : ");
				num[i][j] = sc.nextInt();
				num[i][3] += num[i][j]; // 총점 계산
			}
		}
		return num;
	}
	
	//평균 구하는 메서드
	public static float[] average(int[][] num, int n, float[] avg) {
		for (int i = 0; i < n; i++) {
			avg[i] = num[i][3] / 3.f;
		}
		return avg;
	}

	//출력 메서드
	public static void output(String[] name, int[][] num, float[] avg, int n) {
		System.out.printf("\n이름\t국어\t영어\t수학\t총점\t평균\n");
		for (int a = 0; a < n; a++) {
			System.out.printf(name[a] + "\t");
			for (int b = 0; b < 4; b++) {
				System.out.printf(num[a][b] + "\t");
			}
			System.out.printf(avg[a] + "\n");
		}
	}

	public static void main(String[] args) {
		int n;
		n = method4.n(); //인원 수 입력 받기
		
		String[] name = new String[n]; //인원 수 만큼 이름 배열 공간 할당
		int[][] num = new int[n][4]; //인원수x4 만큼 성적 배열 공간 할당
		float[] avg = new float[n]; //평균값 넣을 곳 인원수 만큼 할당

		method4.input(num, name, n);//입력
		method4.average(num, n, avg);//평균계산
		
		method4.output(name, num, avg, n);//출력
	}
}
