package project1;

public class WorkingTime {
	private MyNumber overTime;
	private MyNumber nightTime;
	private MyNumber holiTime;
	private Money money;
	private MyNumber hourPay;
	   public WorkingTime() {
		   money = new Money();
		   overTime = new MyNumber();
		   nightTime = new MyNumber();
		   holiTime = new MyNumber();
		   hourPay = new MyNumber();
		   
	   }
	   public void sethourPay() {
		   hourPay.setMyNumber((int)(money.getMoney() /200));
	   }
	   public int gethourPay() {
		   return hourPay.getMyNumber();
	   }
	   public void setMoney(int money){
			this.money.setMoney(money); 
			sethourPay();
	   }
		public int getMoney(){
			return money.getMoney();}
	   public int getOverTime() {
	       return overTime.getMyNumber();
	   }
	   public void setOverTime(int overTime) {
	       this.overTime.setMyNumber(overTime);
	   }
	   public int getNightTime() {
	       return this.nightTime.getMyNumber();
	   }
	   public void setNightTime(int nightTime) {
	       this.nightTime.setMyNumber(nightTime);
	   }
	   public int getHoliTime() {
	       return this.holiTime.getMyNumber(); 
	   }
	   public void setHoliTime(int holiTime) {
	       this.holiTime.setMyNumber(holiTime);
	   }
}
