package Project;

import java.util.Scanner;

class Employee{
	private Name name;
	private Number num;
	Calculator money;


	//private WorkingTime nightTime;
	///private WorkingTime overTime;
	//private WorkingTime holiTime;


	public Employee(){	
		name = new Name();
		num= new Number();
		money= new Calculator();
		
		
	}
	public void setName(String name) {
		this.name.setName(name);}
	public String getName(){
		return name.getName();}

	public void setNum(int num){
		this.num.setNumber(num); }
	public int getNum(){
		return num.getNumber();}

	

	public void setNightTime(int nightTime){
		this.money.setNightTime(nightTime); }
	public int getNightTime(){
		return money.getNightTime();}

	public void setOverTime(int overTime){
		this.money.setOverTime(overTime); }
	public int getOverTime(){
		return money.getOverTime();}

	public void setHoliTime(int holiTime){
		this.money.setHoliTime(holiTime); }
	public int getHoliTime(){
		return money.getHoliTime();
	
	}

	

		
}



class Manager{ //배열 생성 후 객체 저장
	   private int max = 500; //최대 회사원 숫자 500명 임의 지정.
	   private int number;
	   Employee[] emp = new Employee[max];

	   
	   //emp[i] = new Employee[maxMember];
	   public void print(String num) {
	      System.out.print(num);
	   }
	   public void print(int num) {
		      System.out.print(num);
		   }
	   public int intin() {
		   Scanner sc = new Scanner(System.in);
		   return sc.nextInt();
	   }
	   public String Strin() {
		   Scanner sc = new Scanner(System.in);
		   return sc.next();
	   }
	   public Employee getEmployee(int num) {
		   //this.number = num;
		   return emp[num]; 
	   }

	   
	   public String getName() {  return getName();  }
	   public int getNumber() {  return emp[number].getNum();  }
	   public int getMoney() {  return emp[number].money.getMoney();  }
	   public int getoverPay() { return emp[number].money.getoverPay();}
	   public int getholiPay() { return emp[number].money.getholiPay();}
	   public int getBonusMoney() { return emp[number].money.getBonusMoney();}
	   public int getTotalMoney() { return emp[number].money.getTotalMoney();}
		   
	   
	   

	   public Manager(){ // 최대 인원수를 같이 받아올것.
		   
	      for (int i = 0; i<max; i++) {
	         print(i);print("번째 사람의 정보를 입력하세요\n");
	         print("이름 : ");
	         emp[i].setName(Strin());
	         print("사번 : ");
	         emp[i].setNum(intin());
	         print("기본금 : ");
	         emp[i].money.setMoney(intin());
	         print("야간시간 :");
	         emp[i].money.setNightTime(intin());
	         print("초과시간 : ");
	         emp[i].money.setOverTime(intin());
	         print("휴일시간 :");
	         emp[i].money.setHoliTime(intin());
	         
	   }
	      
	   }
	   
	
	         
	         
	}