package SalaryManagementProject;

public class Cemployee extends Femployee {
	private int nightPay;
	private int overPay;
	private int holiPay;
	private int tax;
	private int nightTime;
	private int holiTime;
	private int overTime;
	private int totalPay;
	
	public int getNightPay(){
		return nightPay;
	}
	public int getOverPay() {
		return overPay;
	}
	public int getHoliPay() {
		return holiPay;
	}
	public int getTax() {
		return tax;
	}
	public int getNightTime() {
		return nightTime;
	}
	public int getHoliTime() {
		return holiTime;
	}
	public int getOverTime() {
		return overTime;
	}
	public int getTotalPay() {
		return totalPay;
	}
	public void setNightPay(int nightPay) {
		this.nightPay = nightPay;
	}
	public void setOverPay(int overPay) {
		this.overPay = overPay;
	}
	public void setHoliPay(int holiPay) {
		this.holiPay = holiPay;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public void setNightTime(int nightTime) {
		this.nightTime = nightTime;
	}
	public void setHoliTime(int holiTime) {
		this.holiTime = holiTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}
	
}