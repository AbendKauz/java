package sec02;

public class D0701_06_비교연산자1 {

	public static void main(String[] args) {

		// 비교연산자
		// : 피연산자의 대소 또는 동등 비교 -> true, false 산출
		// -> 대소 연산자 : boolean을 제외한 기본타입에서 사용
		// -> 동등 연산자 : 모든 타입에 사용 가능

		// ====> 비교연산자는 흐름 제어문 (조건문_ if, 반복문_ for, while) 에서
		// 이용되어 실행 흐름을 제어할 때 사용함

		// 1. 동등비교 (==, !=)
		// a == b : 두 값이 같은지 검사
		// a != b : 두 값이 다른지 검사

		// 2. 크기(대소)비교 (>, >=, <, <=)
		// a > b : a의 값이 b보다 큰지를 검사
		// a >= b : a의 값이 b보다 크거나 같은지를 검사
		// a < b : a의 값이 b보다 작은지를 검사
		// a <= b : a의 값이 b보다 작거나 같은지를 검사

		int x = 10;
		int y = 13;
		System.out.println(x > y); // 10 > 13 (false)
		System.out.println(x < y); // 10 < 13 (true)

		int z = 13;
		System.out.println(y > z); // 13 > 13 (false)
		System.out.println(y >= z); // 13 >= 13 (true)

		System.out.println(x < z); // 10 < 13 (true)
		System.out.println(x > z); // 10 > 13 (false)

		System.out.println(!(x < z)); // !(10 < 13) (!true) -> false
		System.out.println(!(!(x < z))); // !(!(10 < 13)) (!(!true)) -> true

	}

}
