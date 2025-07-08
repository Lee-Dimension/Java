package day1;

public class p4 {

	public static void main(String[] args) {
		
		int i,j;
		int num = 5;
		
		for( i=0 ;i <= num/2; i++) 
		{
			for( j=0; j<= num; j++) {
				if(j >= num/2-i && j <= num/2 + i) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
				
			}
			System.out.println();
			
		}
    }

}
