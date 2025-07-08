package project2;

//Calculator.java
public class Calculator {
 private static final double OVERTIME_RATE = 1.5;
 private static final double NIGHT_RATE    = 1.5;
 private static final double HOLIDAY_RATE  = 2.0;

 // Employee 내부의 WorkingTime을 사용
 public double calculate(Employee emp) {
     double base = emp.getMoney().getBaseSalary();
     double hourly = base / 200.0;
     WorkingTime wt = emp.getWorkingTime();

     double otPay = wt.getOvertimeHours() * hourly * OVERTIME_RATE;
     double nhPay = wt.getNightHours()    * hourly * NIGHT_RATE;
     double hdPay = wt.getHolidayHours()  * hourly * HOLIDAY_RATE;

     return base + otPay + nhPay + hdPay;
 }
}
