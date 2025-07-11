package day1;
import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 값을 입력하세요: ");
		int num = sc.nextInt();
		if (num % 2 == 0) 
		{
			System.out.print(num + "은(는) 짝수입니다");
			return;
		}
		int i,j,star;
		int mid = num/2+1;
		for( i=1 ;i <= num; i++) 
		{
			star = i <= mid ? i : (2*mid - i);
			for( j=1; j<=num; j++) {
				if(j >= mid - star+1 && j <= mid + star-1) { 
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}
