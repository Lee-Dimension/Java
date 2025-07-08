package Project;

class Calculator { //계산 기능 계산식만
		private int money;
		private int nightTime;
		private int overTime;
		private int holiTime;
		private int hourPay;
		private int overPay;
		private int nightPay;
		private int holiPay;
	   //private Employee ep = new Employee();
	   
	   public int hourPay(int money) {
		   return money/200;
		  
	   }
	   
	   public int getoverPay(int hourPay, int overTime) {
		   return overPay = (int)(overTime * hourPay * 1.5);
	   }
	   
	   public int getnightPay(int hourPay, int nightTime) {
		   return (int)(overTime* hourPay * 0.5);
	   }
	   
	   public int getholiPay(int hourPay, int holiPay) {
		   return (int)(holiPay* hourPay * 1.5);
	   }
	   public int getBonusMoney() {
		   return overPay + nightPay + holiPay;
	   }
	   public int getTotalMoney() {
		   return wt.getMoney()+getholiPay() + getnightPay() + getholiPay();
	   }
	   public void setMoney(int num) {
		   wt.setMoney(num);
	   }
	   public int getMoney() {
		   return wt.getMoney();
	   }
	 
	}