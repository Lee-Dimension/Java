package day1;

public class Loop3 {

	public static void main(String[] args) {
		
		int foldCount = 0;
		int rectCount = 1;
		while(rectCount<=500){
			foldCount += 1;
			rectCount<<= 1;
		}
		System.out.println("접은 횟수 : " + foldCount + "\n사각형 개수 : " + rectCount);		
	}
}

