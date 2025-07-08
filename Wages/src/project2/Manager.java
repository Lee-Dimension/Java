package project2;

//Manager.java
import java.util.ArrayList;
import java.util.List;

public class Manager {
 private List<Employee> employees = new ArrayList<>();

 // 최초 사원 등록
 public void addEmployee(Employee e) {
     employees.add(e);
 }

 // 사번으로 사원 조회
 public Employee getEmployeeByNumber(int num) {
     for (Employee e : employees) {
         if (e.getNumber().getNumber() == num) return e;
     }
     return null;
 }

 // 기존 사원에 근무시간 업데이트
 public boolean updateWorkingTime(int num, WorkingTime wt) {
     Employee e = getEmployeeByNumber(num);
     if (e == null) return false;
     e.getWorkingTime().setOvertimeHours(wt.getOvertimeHours());
     e.getWorkingTime().setNightHours(wt.getNightHours());
     e.getWorkingTime().setHolidayHours(wt.getHolidayHours());
     return true;
 }
}
