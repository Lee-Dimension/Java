package day3;

public class array1 {

	public static void main(String[] args) {
		
		int []arr;
		arr = new int[4];
		
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		for(int i:arr) {
			System.out.print(i);
		}
	}
}
//		int [][] arr2 = new int[2][3];
//		
//		for(int i=0; i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.println(arr2[i][j]);
//			}
//		}
//		
//		int [][] arr3 = new int[2][];
//		
//		arr3[0] = new int[2];
//		arr3[1] = new int[4];
//		
//		for(int i=0; i<arr3.length;i++) {
//			for(int j=0;j<arr3[i].length;j++) {
//				System.out.println(arr3[i][j]);
//			}
//			System.out.println();
//		}
		
//		String[] str = new String[3];
//		
//		str[0] = new String("hi_1");
//		str[1] = new String("hi_2");
//		str[2] = new String("hi_3");
//		
//		for(int i=0; i<str.length;i++){
//			System.out.println(str[i]);
//		}
