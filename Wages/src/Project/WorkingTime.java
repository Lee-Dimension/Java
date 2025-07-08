package Project;

class WorkingTime{
	   private int overTime;
	   private int nightTime;
	   private int holiTime;
	   private Money money;

	   public void setMoney(int money){
			this.money.setMoney(money); }
		public int getMoney(){
			return money.getMoney();}
	   public int getOverTime() {
	       return overTime;
	   }
	   public void setOverTime(int overTime) {
	       this.overTime = overTime;
	   }
	   public int getNightTime() {
	       return nightTime;
	   }
	   public void setNightTime(int nightTime) {
	       this.nightTime = nightTime;
	   }
	   public int getHoliTime() {
	       return holiTime;
	   }
	   public void setHoliTime(int holiTime) {
	       this.holiTime = holiTime;
	   }
	   
	   
	   
	}
