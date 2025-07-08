package day6;

import java.util.Scanner;

class Name1 { //이름 클래스
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Subject1 { //점수 클래스
    private int subject;

    public int getSubject() {
        return subject;
    }
    public void setSubject(int subject) {
        this.subject = subject;
    }
}

public class haxExam21 {
    Scanner sc = new Scanner(System.in);

    private Name1 name;
    private Subject1 kor;
    private Subject1 eng;
    private Subject1 mat;

    private int total;
    private float avg;

    public haxExam21() {
        name = new Name1();
        kor = new Subject1();
        eng = new Subject1();
        mat = new Subject1();
    }

    public void setName(String name) {
        this.name.setName(name);
    }

    public String getName() {
        return name.getName();
    }

    public void input() {
        System.out.print("이름 입력: ");
        setName(sc.next());

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
        System.out.println(getName());
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

        haxExam21[] students = new haxExam21[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n" + (i+1) + "번째 학생");
            students[i] = new haxExam21();
            students[i].input();
        }

        System.out.println("\n결과");
        for (int i = 0; i < n; i++) {
            students[i].output();
        }
    }
}
