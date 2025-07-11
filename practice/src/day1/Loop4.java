package day1;

public class Loop4 {

	public static void main(String[] args) {
		
		int numBehind = 2;
		while(numBehind<=9) {
			int numFront = 1;
			while(numFront<=9) {
			System.out.print(numFront +"X"+ numBehind + "=" + numFront * numBehind + "\t");
			numFront++;
			}
			System.out.println();
			numBehind++;
		}

	}

}
