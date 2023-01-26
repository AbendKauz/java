package sec03;

public class D0628_02_문자열결합연산 {

	public static void main(String[] args) {

		// + 연산 기호의 2가지 기능
		// 1. 숫자 + 숫자 (덧셈)
		int a = 5 + 4 + 7;
		System.out.println(a);

		// 2. 문자열 + 숫자 = "문자열숫자" (결합연산자)
		String s = "4" + 5 + 3; // "45" + 3
		System.out.println(s); // "453"

		String s0 = 5 + "4" + 3; // "54" + 3
		System.out.println(s0); // "543"

		String s1 = 5 + 3 + "4"; // 8 + "4"
		System.out.println(s1); // "84"

		String s2 = "4" + (5 + 3); // "4" + 8
		System.out.println(s2); // "48"

		System.out.println('A' + 'B'); // char + char
		// 65 + 66 = 131 (유니코드)
		// : (연산자가 있어 int 타입으로 자동 전환)

		System.out.println('A' + 2); // char + int
		// 67

		System.out.println('J' + "ava"); // char + 문자열
		// Java

	}

}
