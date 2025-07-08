package day1;
import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 값을 입력하세요: ");
		int num = sc.nextInt();
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
