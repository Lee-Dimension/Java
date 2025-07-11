package day6;

import java.util.Scanner;

class Student{ //데이터 클래스
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total = kor + eng + mat;
	}
	public float getAvg() {
		return avg = getTotal()/3.f;
	}
}

public class Main {
	Scanner sc = new Scanner(System.in);
	private Student []stu;
	int count,n;
	
	public Main() {}
	public void setName(String name) {
		stu[n].setName(name);
	}
	public void setKor(int kor) {
		stu[n].setKor(kor);
	}
	public void setEng(int eng) {
		stu[n].setEng(eng);
	}
	public void setMat(int mat) {
		stu[n].setMat(mat);
	}
	public String getName() {
		return stu[n].getName();
	}
	public int getKor() {
		return stu[n].getKor();
	}
	public int getEng() {
		return stu[n].getEng();
	}
	public int getMat() {
		return stu[n].getMat();
	}
	public int getTotal() {
		return stu[n].getTotal();
	}
	public float getAvg() {
		return stu[n].getAvg();
	}
	public void setNumber() {
		count = sc.nextInt();
		stu = new Student[count];
		for (int i = 0; i < count; i++) 
			stu[i] = new Student();
	}
	
	public static void main(String[] args) {
		Main stu = new Main();	
		
		System.out.print("인원 수 : ");	
		stu.setNumber();

		for(int i = 0; i<stu.count; i++) {
			stu.n=i;
			System.out.print("이름 : ");
			stu.setName(stu.sc.next());
			System.out.print("국어점수 : ");
			stu.setKor(stu.sc.nextInt());
			System.out.print("영어점수 : ");
			stu.setEng(stu.sc.nextInt());
			System.out.print("수학점수 : ");
			stu.setMat(stu.sc.nextInt());
		}
		for(int i=0; i<stu.count; i++) {
			stu.n=i;
			System.out.println(stu.getName());
			System.out.println(stu.getKor());
			System.out.println(stu.getEng());
			System.out.println(stu.getMat());
			
			System.out.println(stu.getTotal());
			System.out.println(stu.getAvg());
		}
	}
}
