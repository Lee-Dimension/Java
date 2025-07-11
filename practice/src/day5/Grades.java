package day5;

import java.util.Scanner;

class Student{
	private int [][][] grad; //1. 반 개수 만큼의 길이. 2. 학생 수 만큼의 길이 3. 과목만큼의 길이. 그안에 과목 점수 집어넣기
	private String [][] name; //학생 이름 1. 반 개수 만큼의 길이. 2. 학생 수 만큼의 길이, 각 항목에 이름 집어넣기
	private int [][] total; //총합 1. 반 개수 만큼의 길이. 2. 학생 수 만큼의 길이, 각 항목에 총합 집어넣기
	private float [][] avg; //평균
	private String [] sub = { "국어", "영어", "수학" }; //과목 이름 집어넣을 곳
	private int classCount;
	private int [] stuCount;
	
	public void inputClassCount(Scanner sc) {
		System.out.print("반 개수 : ");
		classCount = sc.nextInt();
		stuCount = new int[classCount];
	}
	public void inputStuCount(Scanner sc) { //학생 수 입력받고 배열들 길이 정하기.
		grad = new int[classCount][][];
		name = new String[classCount][];
		total = new int[classCount][];
		avg = new float[classCount][];
		
		for(int i=0; i<classCount; i++) {
			System.out.print(i+1+"반의 학생 수 :");
			stuCount[i] = sc.nextInt();
			
			grad[i] = new int[stuCount[i]][sub.length]; //student[][][]의 길이 정하기
			name[i] = new String[stuCount[i]]; //name[][]의 길이 정하기
			total[i] = new int[stuCount[i]]; //total[][]의 길이 정하기
			avg[i] = new float[stuCount[i]]; //avg[][]의 길이 정하기
		}
	}
	public void inputName(Scanner sc) { //학생 수 만큼의 공간에 학생 이름 집어넣기
		for(int i=0; i<classCount;i++) {
			System.out.print((i+1)+"반\n");
			for(int j=0; j<stuCount[i]; j++) {
			System.out.print((j+1)+"번째 학생 이름 : ");
			name[i][j] = sc.next(); 
			}
			System.out.println();
		}
	}
	public void inputGrad(Scanner sc) { //과목 수 만큼의 공간에 성적 집어넣기
		for(int i=0; i<classCount;i++) {
			for(int j=0; j<stuCount[i]; j++) {
				for(int k=0; k<sub.length; k++) {
					System.out.print(name[i][j]+"의 "+sub[k]+" 점수를 입력하세요 : ");
					grad[i][j][k] = sc.nextInt();
				}
				System.out.println();
			}
		}
	}
	public void calculate() {// 총합, 평균 구하기
		for(int i=0; i<classCount; i++) {
			for(int j=0; j<stuCount[i]; j++) {
				for(int k=0; k<sub.length; k++) {
					total[i][j] += grad[i][j][k];
				}
				avg[i][j] = total[i][j]/(float)sub.length;
			}
		}
	}
	public void output() { //출력하기
		System.out.print("\n반\t이름\t");//속성	
		for(int i=0; i<sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}
		System.out.print("총점\t평균\n");
		
		for(int i = 0; i < classCount; i++) {
		    for(int j = 0; j<stuCount[i]; j++) {
		    	System.out.printf("%d\t%s\t",i+1, name[i][j]);
		    	for(int k=0; k< sub.length; k++) {
		    		System.out.printf("%d\t",grad[i][j][k]);
		    	}
		    	System.out.printf("%d\t%.2f\n",total[i][j],avg[i][j]);
		    }
		}
	}
	public void GradeCalculator(){ //반, 학생 수,이름, 과목별 성적 입력받고 계산 후 출력
		Scanner sc = new Scanner(System.in);
		this.inputClassCount(sc);
		this.inputStuCount(sc);
		this.inputName(sc);
		this.inputGrad(sc);
		this.calculate();
		this.output();
	}
}

public class Grades {
	public static void main(String[] args) {
		Student st = new Student();
		st.GradeCalculator();
	}
}
