package SalaryManagementProject;

public class Tax{
	public int tax(int amount) {
      if (amount <= 14000000) {
         return (int)(amount * 0.06);
      }
      else if(amount > 14000000 || amount <= 50000000) {
         return (int)(amount * 0.15);
      }
      else if (amount > 50000000 || amount <= 88000000) {
    	  return (int)(amount * 0.24);
      }
      else if (amount > 88000000 || amount <= 150000000) {
    	  return (int)(amount * 0.35);
      }
      else if (amount > 150000000 || amount <= 300000000) {
    	  return (int)(amount * 0.38);
      }
      else if (amount > 300000000 || amount <= 500000000) {
    	  return (int)(amount * 0.40);
      }
      else if (amount > 500000000 || amount <= 1000000000) {
    	  return (int)(amount * 0.42);
      }
      else {
    	  return (int)(amount * 0.45);
      }
   }
}
