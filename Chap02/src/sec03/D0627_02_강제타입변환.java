package sec03;

public class D0627_02_강제타입변환 {

	public static void main(String[] args) {

		// 강제 타입 변환
		// 작은 허용범위 타입 = (작은 허용범위 타입)큰 허용범위 타입
		int b = 145;
//		byte a = b;						// Type mismatch: cannot convert from int to byte
		byte a = (byte) b;
		System.out.println(a);

		int intValue = 65;
//		char charValue = intValue;		//Type mismatch: cannot convert from int to char
		char charValue = (char) intValue;
		System.out.println(intValue);
		System.out.println(charValue);

		double doubleValue = 3.14;
//		int intValue1 = doubleValue;	//Type mismatch: cannot convert from double to int
		int intValue1 = (int) doubleValue;
		System.out.println(doubleValue);
		System.out.println(intValue1);

	}

}
