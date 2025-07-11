package DesignGrade;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String stuId;
    int korean;
    int english;
    int math;

    public Student(String name, String stuId, int korean, int english, int math) {
        this.name = name;
        this.stuId = stuId;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
