package sec03;

public class D0627_01_자동타입변환 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = a;
		int c = a; // 자동 타입 변환

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// 자동타입변환 : 프로그램 실행 도중에 자동으로 타입 변환이 일어나는 것
		// 큰 허용 범위 타입 = 작은 허용 범위 타입

		// byte < short < int < long < float < double
		// char(양수만 있으므로), boolean(true, false)

		// int 타입이 byte 타입보다 커서 자동 타입 변환이 발생
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		// float, double 타입이 long 타입보다 커서 자동 타입 변환이 발생
		long longValue = 5000000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);

		// int 타입이 char 타입보다 커서 자동 타입 변환이 발생
		// --> 'A'의 유니코드 값이 int 타입에 저장이 됨
		char charValue = 'A';
		System.out.println(charValue);

		int intValue1 = charValue;
		System.out.println(intValue1);

		// byte -> -128 ~ 127
		// char -> 0 ~ 65535
		// char 타입보다 허용범위가 적은 byte 타입은 char 타입으로 자동 타입 변환 X
		// why? char 타입은 음수를 포함하지 않은데, byte 타입은 음수를 포함하기 때문
//		byte byteValue1 = 65;
//		char charValue1 = byteValue1;	// 컴파일 에러

		// char 타입 변수 a1을 선언해서
		// 초기값으로 가 를 저장
		// int 타입 변수 b1을 이용하기
		// 콘솔창에 가의 유니코드 : _____
		char a1 = '가';
		System.out.println(a1);
		int b1 = a1;
		System.out.println("가의 유니코드 : " + b1);

	}

}
