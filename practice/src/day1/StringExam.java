package day1;

public class StringExam {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		
//		String s1 = "Hello";
//		String s2 = "Hello";


		if(s1 == s2) { // 위치 비교
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}
		
		if(s1.equals(s2)) { //값 비교
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}
		
		s1 = "BatMan";
		
		if(s1 == s2) { // 위치 비교
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}
		
		if(s1.equals(s2)) { //값 비교
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}

	}
}
