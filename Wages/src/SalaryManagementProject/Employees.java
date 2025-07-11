package SalaryManagementProject;

public class Employees {
	private int MAX = 50;
	Cemployee[] cemp = new Cemployee[MAX];
	protected int count = 0;
	private final double OTP = 1.5;
	private final double NTP = 0.5;
	private final double HTP = 1.5;

    public Employees() {
        cemp[0] = new Cemployee(); 
        cemp[0].setName("이차원");
        cemp[0].setNum(1000);
        cemp[0].setDepartment("인사팀");
        cemp[0].setPosition("사원");
        cemp[0].setBasicSalary(4500000);
        cemp[0].setManager(true);
        count++;
    }
    public int getCount() {
    	return count;
    }
    
	public class CalcResult {
		Bonus bn = new Bonus();
		
		public void calcOverPay(int i){
			int timePay = cemp[i].getBasicSalary()/200;	//시급
			//연장 근무 급여 계산
			int overPay = bn.bonus(timePay, cemp[i].getOverTime(), OTP);
			cemp[i].setOverPay(overPay);
		}
		public void calcNightPay(int i) {
			int timePay = cemp[i].getBasicSalary()/200;	//시급
			//야간 근무 급여 계산
			int nightPay = bn.bonus(timePay, cemp[i].getNightTime(), NTP);
			cemp[i].setNightPay(nightPay);
		}
		public void calcHoliPay(int i) {
			int timePay = cemp[i].getBasicSalary()/200;	//시급
			//휴일 근무 급여 계산
			int holiPay = bn.bonus(timePay, cemp[i].getHoliTime(), HTP);
			cemp[i].setHoliPay(holiPay);
		}
		//세금 계산
		Tax tx = new Tax();
		public void calcTax(int i) {
			int amount = cemp[i].getBasicSalary() + cemp[i].getOverPay() + cemp[i].getNightPay() + cemp[i].getHoliPay();
			int tax = tx.tax(amount);
			cemp[i].setTax(tax);
		}
		//총 급여 계산
		public void totalSalary(int i) {
			int amount = cemp[i].getBasicSalary() + cemp[i].getOverPay() + cemp[i].getNightPay() + cemp[i].getHoliPay();
			int totalSalary = amount - cemp[i].getTax();
			cemp[i].setTotalPay(totalSalary);
		}	
	}
}
	


