package day1;

public class Loop {

	public static void main(String[] args) {
	
		int foldCount= 0;
		int rectCount = 1;
		
		for(;rectCount<=500; foldCount++) {
//			rectCount *= 2;
			rectCount <<= 1;
		    
		}
			System.out.println("접은 횟수 : " + foldCount + "\n사각형 개수 : " + rectCount);
	}

}
