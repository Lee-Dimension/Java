package day1;

public class While {

	public static void main(String[] args) {
		
		
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i);
		}
		
		int j =0;
		
		while(j<2) {
			int k = 0;
			while(k<2) {
				System.out.println("Hello");
				k++;
			}
			j++;
		}
	}

}
