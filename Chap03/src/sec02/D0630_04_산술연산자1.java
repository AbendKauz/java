package sec02;

public class D0630_04_산술연산자1 {

	public static void main(String[] args) {

		// 이항연산자 -> 피연산자가 2개인 연산자
		// -> 산술연산자, 문자열결합연산자, 비교연산자, 논리연산자, 대입연산자

		// * 산술연산자
		// + : 덧셈
		// - : 뺄셈
		// * : 곱셈
		// / : 나눗셈
		// % : 나눈 나머지를 구하는 연산

		int a = 7;
		int b = 3;

		System.out.println("a + b의 값 : " + (a + b));
		System.out.println("a - b의 값 : " + (a - b));
		System.out.println("a * b의 값 : " + (a * b));
		System.out.println("a / b의 값 : " + (a / b)); // int 타입으로 2만 출력
		System.out.println("a / b의 값 : " + ((double) a / b)); // 실수연산 -> 2.333333
		System.out.println("a % b의 값 : " + (a % b));

	}

}
