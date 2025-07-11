package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<>();

		while (true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = num1 + num2;
			if (sum == 0) break;
			result.add(sum);
		}

		for (int r : result) {
			System.out.println(r);
		}
	}
}
