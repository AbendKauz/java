package sec03;

public class D0628_01_실수연산자동타입변환2 {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte a = byteValue1 + byteValue2;	// error
		int a = byteValue1 + byteValue2; // int 타입으로 자동변환
		System.out.println(a);

		char charValue1 = 'A';
		char charValue2 = 2;
//		char charValue3 = charValue1 + charValue2;	// error
		int intValue1 = charValue1 + charValue2; // int 타입으로 자동변환
		System.out.println("A의 유니코드 + 2 : " + intValue1);
		// 67의 문자를 뽑고싶을 때
		System.out.println((char) intValue1);

		int intValue2 = 10;
		int intValue3 = 4;
		int intValue4 = intValue2 / intValue3;
		System.out.println(intValue4); // 출력하면 2가 나옴

		// Q) 10/4 => 2.5 가 나오도록 ??
		// 1.
//		double doubleValue1 = (double)intValue2 / intValue3;
//		System.out.println(doubleValue1);
		// or
//		System.out.println((double)intValue2 / intValue3);
		// 2.
//		double doubleValue2 = intValue2 / (double)intValue3;
//		System.out.println(doubleValue2);
		// 3.
		double doubleValue3 = (double) intValue2 / (double) intValue3;
		System.out.println(doubleValue3);

		// (double)(intValue2 / intValue3) 나눠서 정수/정수 = 정수값이 나옴
		// 10/4 => 2.5 -> 0.5 버려지고 2만 남아서 double 강제변환 2.0 저장
		double doubleValue4 = (double) (intValue2 / intValue3);
		System.out.println(doubleValue4); // 2.0이 나옴

	}

}
