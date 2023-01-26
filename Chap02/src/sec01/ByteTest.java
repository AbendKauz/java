package sec01;

public class ByteTest {

	public static void main(String[] args) {

//		byte a = 50;
//		byte b = 100;
//		
////		byte sum = a + b;	//	Type mismatch: cannot convert from int to byte (연산 시 정수는 int 타입으로 강제전환)
//		int sum = a + b;
//		
//		System.out.println(sum);

//		byte a = -128;
////		byte b = 100;
//		
//		byte sum = (byte)(a - 1);	// casting 연산(타입을 변경하여 계산)
//		//	계산 시 초과나 미만 수는 사이클이 발생되어 표시됨
//		//	(129 = -127, 130 = -126, -129 = 127로 표시됨)
//		
//		System.out.println(sum);

//		int a = 2200000000;

		System.out.println("int 타입의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 타입의 최소값 : " + Integer.MIN_VALUE);

		System.out.println("byte 타입의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte 타입의 최대값 : " + Byte.MIN_VALUE);

		System.out.println("short 타입의 최대값 : " + Short.MAX_VALUE);
		System.out.println("short 타입의 최소값 : " + Short.MIN_VALUE);

		System.out.println("char 타입의 최대값 : " + (int) Character.MAX_VALUE); // 그냥 출력시 ?로 출력
		System.out.println("char 타입의 최소값 : " + (int) Character.MIN_VALUE); // 그냥 출력시 공백으로 출력

		System.out.println("long 타입의 최대값 : " + Long.MAX_VALUE);
		System.out.println("long 타입의 최소값 : " + Long.MIN_VALUE);

	}

}
