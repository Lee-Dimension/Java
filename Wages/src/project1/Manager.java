package project1;

import java.util.Scanner;


public class Manager{ //배열 생성 후 객체 저장
	   //private int max = 500; //최대 회사원 숫자 500명 임의 지정.
	   int number; int max = 10;
	   private int count=0;
	   private String answer = "y";
	   
	   Employee[] emp= new Employee[max];
	   
	   //emp[i] = new Employee[maxMember];
	   public void print(String num) {
	      System.out.print(num);
	   }
	   public void print(int num) {
		      System.out.print(num);
		   }
	   public  int intin() {
		   Scanner sc = new Scanner(System.in);
		   return sc.nextInt();
	   }
	   public String Strin() {
		   Scanner sc = new Scanner(System.in);
		   return sc.next();
	   }
	   public Employee getEmployee(int num) {
		   //this.number = num;
		   //Employee equal;
		   for(int i=0; i<max; i++) {
			   if(num == emp[i].number.getMyNumber()) {
				   return emp[i];
			   }
		   }return null;
	   }
	   public String getName(Employee emp) {  return emp.name.getName();  }
	   public int getNumber(Employee emp) {  return emp.number.getMyNumber();  }
	   public int getMoney(Employee emp) {  return emp.money.getMoney();  }
	   public int getoverPay(Employee emp) { return emp.money.getoverPay();}
	   public int getholiPay(Employee emp) { return emp.money.getholiPay();}
	   public int getBonusMoney(Employee emp) { return emp.money.getBonusMoney();}
	   public int getTotalMoney(Employee emp) { return emp.money.getTotalMoney();}
	   public void inputsetting() { 
		   for (int i = count; i<max; i++) {
	    	  Scanner sc = new Scanner(System.in);
	    	  print("입력하시겠습니까? (네/아니오)\n");
	    	  answer = sc.next();
	    	  if(answer.equals("네")) {
	    		  print(i+1);print("번째 사람의 정보를 입력하세요\n");
	 	         emp[i] = new Employee();
	 	         print("사번 : ");
	 	         emp[i].number.setMyNumber(intin()); 
	 	         print("이름 : ");
	 	         emp[i].name.setName(Strin());
	 	         print("기본금 : ");
	 	         emp[i].money.setMoney(intin());
	 	         print("야간시간 :");
	 	         emp[i].money.setNightTime(intin());
	 	         print("초과시간 : ");
	 	         emp[i].money.setOverTime(intin());
	 	         print("휴일시간 :");
	 	         emp[i].money.setHoliTime(intin());
	 	        count+=1;

	    	  }
	    	  else {
	    		  print("입력을 종료합니다.");
	    		  break;
	    	  } }}
	   

	   

	}
