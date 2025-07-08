package project2;

//Employee.java
public class Employee {
 private Name name = new Name();
 private Number number = new Number();
 private Money money = new Money();
 private WorkingTime workingTime = new WorkingTime();

 public Name getName() { return name; }
 public Number getNumber() { return number; }
 public Money getMoney() { return money; }
 public WorkingTime getWorkingTime() { return workingTime; }
}
