package day6;

import java.util.Scanner;

class Name2 { //이름 클래스
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Subject { //과목 점수 클래스
    private int subject;

    public int getSubject() {
        return subject;
    }
    public void setSubject(int subject) {
        this.subject = subject;
    }
}

public class hasExam2 {
    Scanner sc = new Scanner(System.in);

    private Name2 name;
    private Subject kor;
    private Subject eng;
    private Subject mat;

    private int total;
    private float avg;

    public hasExam2() {
        name = new Name2();
        kor = new Subject();
        eng = new Subject(); 
        mat = new Subject(); 
    }

    public void input() {
        System.out.print("이름 입력: ");
        name.setName(sc.next()); 

        System.out.print("국어 점수 입력: ");
        kor.setSubject(sc.nextInt());

        System.out.print("영어 점수 입력: ");
        eng.setSubject(sc.nextInt());

        System.out.print("수학 점수 입력: ");
        mat.setSubject(sc.nextInt()); 

        total = kor.getSubject() + eng.getSubject() + mat.getSubject();
        avg = total / 3.f;
    }

    public void output() {
        System.out.println(name.getName());
        System.out.println("국어 점수 : "+kor.getSubject());
        System.out.println("영어 점수 : "+eng.getSubject());
        System.out.println("수학 점수 : "+mat.getSubject());
        System.out.println("총합 : "+total);
        System.out.println("평균 : "+avg);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수: ");
        int n = sc.nextInt();

        hasExam2[] students = new hasExam2[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n" + (i+1) + "번째 학생");
            students[i] = new hasExam2();
            students[i].input();
        }

        System.out.println("\n결과");
        for (int i = 0; i < n; i++) {
            students[i].output();
        }
    }
}
