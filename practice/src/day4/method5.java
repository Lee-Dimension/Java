package day4;

import java.util.Scanner;

public class method5 {
	static Scanner sc = new Scanner(System.in);
	//반 개수 입력 메서드
	public void cla(int[] cla, int a){
		for(int i=0; i<a; i++) {
			System.out.print(i+1+"반에는 몇 명의 정보를 입력하시겠습니까? : ");
			cla[i] = sc.nextInt();
		}
	}
	
	//입력 메서드
	public void input(int[][][] num, String[][] name, float[][] avg, int[] cla, int c) {
		String[] Sub = { "국어", "영어", "수학" };
		for(int i=0; i<c;i++) {//학생이름, 성적 입력받고 총점, 평균 계산해서 배열에 넣음
			num[i]  = new int[cla[i]][4];
			avg[i]  = new float[cla[i]];
			name[i] = new String[cla[i]];	
			System.out.print("\n"+(i+1)+"반");
			for(int j=0; j<cla[i];j++) {
				System.out.print("\n"+(j+1)+"번째 사람의 이름을 입력하세요 : ");
				name[i][j] = sc.next();
				for(int k=0; k<3;k++) {
					System.out.print(name[i][j]+"의 "+Sub[k]+" 점수를 입력하세요 : ");
					num[i][j][k] = sc.nextInt();
					num[i][j][3] += num[i][j][k];	 //총점 계산
				}
				avg[i][j] = num[i][j][3]/3.f;//평균
			}	
		}
	}
	
	//출력 메서드
	public void output(int[][][] num,String[][] name,  float[][] avg, int[] cla, int c) {
		System.out.printf("\n반\t이름\t국어\t영어\t수학\t총점\t평균\n");//속성	
		for(int i = 0; i < c; i++) {
		    for(int j = 0; j < cla[i]; j++) {
		        System.out.printf(
		            "%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
		            i + 1,               // 반 번호
		            name[i][j],          // 학생 이름
		            num[i][j][0],        // 국어
		            num[i][j][1],        // 영어
		            num[i][j][2],        // 수학
		            num[i][j][3],        // 총점
		            avg[i][j]            // 평균
		        );
		    }
		}
	}
	
	public void main(String[] args) {
		System.out.print("몇 반의 정보를 입력하시겠습니까? : ");
		int c = sc.nextInt(); //반 개수 입력받기
		int[]cla = new int[c]; // 반 별 인원 수 배열
		this.cla(cla, c); //각 반의 인원 수 넣기
		
		int [][][]num = new int[c][][]; //국 영 수 총점 넣을 곳
		float [][] avg = new float[c][]; //평균 넣을 곳		
		String [][] name = new String[c][];	//이름 넣을 곳
		
		this.input(num,  name,  avg, cla, c);//입력
		this.output(num, name, avg, cla,c);//출력 
	}
}
