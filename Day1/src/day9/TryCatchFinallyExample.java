package day9;

public class TryCatchFinallyExample {
	@SuppressWarnings("rawtypes")
	public static void mian(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("쿨래스가 존재하지 않습니다.");
		} catch()
	}
}
