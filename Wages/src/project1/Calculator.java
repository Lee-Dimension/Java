package project1;

public class Calculator {
	private WorkingTime wt;
	   //private Employee ep = new Employee();
	   
	public Calculator() {
		wt= new WorkingTime();
	}
	   
	   
	   public void setNightTime(int num) {  wt.setNightTime(num);}
	   public int getNightTime() { return this.wt.getNightTime();  }
	   
	   public void setOverTime(int num) {  this.wt.setOverTime(num);   }
	   public int getOverTime() { return this.wt.getOverTime();  }
	   
	   public void setHoliTime(int num) {  this.wt.setHoliTime(num);   }
	   public int getHoliTime() { return this.wt.getHoliTime();  }
	   
	   
	   public int getoverPay() {
		   return (int)(this.wt.getOverTime() * gethourPay()  * 1.5);
	   }
	   
	   public int getnightPay() {
		   return (int)(this.wt.getNightTime()* gethourPay()  * 0.5);
	   }
	   
	   public int getholiPay() {
		   return (int)(this.wt.getHoliTime()* gethourPay() * 1.5);
	   }
	   public int getBonusMoney() {
		   return (getholiPay() + getnightPay() + getoverPay());
	   }
	   public int getTotalMoney() {
		   return (getMoney()+getBonusMoney());
	   }
	   public int gethourPay() {
		  return this.wt.gethourPay();
	   }
	   
	   public void setMoney(int num) {
		   this.wt.setMoney(num);
	   }
	   public int getMoney() {
		   return this.wt.getMoney();
	   }
	   

}
