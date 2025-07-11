package DesignGrade;

import java.util.*;

public class StudentManager {
    public static ArrayList<Student> students = new ArrayList<>();
    public static void addStudent(Student s) {
        students.add(s);
    }
    //파일 불러올때 씀
    public static ArrayList<Student> getStudents(){
    	return students;
    }
}
