package SalaryManagementProject;

public class Femployee {
	private String name;
	private int num;
	private int basicSalary;
	private String department;
	private String position;
	private boolean manager;

	public String getName(){
		return name;
	}
	public int getNum(){
		return num;
	}
	public int getBasicSalary(){
		return basicSalary;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}
	public boolean getManager() {
		return manager;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setBasicSalary(int salary) {
		this.basicSalary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setManager(boolean manager) {
		this.manager = manager;
	}
	
}
