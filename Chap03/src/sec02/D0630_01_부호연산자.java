package sec02;

public class D0630_01_부호연산자 {

	public static void main(String[] args) {

		// * 피연산자의 수에 따라 구분
		// 단항연산자 : 피연산자 1개
		// 이항연산자 : 피연산자 2개
		// 삼항연산자 : 피연산자 3개

		// 부호연산자 : +, - (양수 및 음수를 표시)
		// --> 하나의 피연산자만 필요한 단항연산자
		// --> 정수 및 실수 리터럴 앞에 붙여 양수 또는 음수를 표현함
//		int x = 100;
//		int y = -100;
//		System.out.println("x의 값 : " + x);			// 100
//		System.out.println("y의 값 : " + y);			// -100
//
//		// 정수 및 실수 타입 변수 앞에 붙이면
//		// + 연산자는 변수값의 부호를 유지
//		System.out.println("x의 값 + 부호: " + +x);	// 100
//		System.out.println("y의 값 + 부호: " + +y);	// -100
//		// - 연산자는 변수값의 부호를 변경
//		System.out.println("x의 값 - 부호 : " + -x);	// -100
//		System.out.println("y의 값 - 부호 : " + -y);	// 100

		byte a = 100;
//		byte result = -a;	// error - 부호연산자의 결과는 int 타입
		int result = -a;
		System.out.println(result);

	}

}
