package day1;

public class p5 {

	public static void main(String[] args) {

		int num = 5;
		int i,j;
		int mid = num/2;
				
		for(i=0; i<num ; i++ ) {
			for(j=0; j<num; j++) {
				if (i <= mid) {
					if (j >= mid - i && j <= mid + i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= i - mid && j < num - (i - mid)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
