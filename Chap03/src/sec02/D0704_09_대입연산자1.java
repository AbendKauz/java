package sec02;

public class D0704_09_대입연산자1 {

	public static void main(String[] args) {

		// 대입연산자
		// => 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장함

		// 1. 단순 대입연산자 ( = )
		// 2. 복합 대입연산자
		// (+=, -=, *=, /=, %=, &=, |=, ^=)

		// x += 5; --> x = x + 5;
		// x -= 5; --> x = x - 5;

		int result = 0;
		result += 10; // result = result + 10;
		// = 0 + 10
		System.out.println(result); // = 10

		result -= 3; // result = 10 - 3;
		System.out.println(result); // = 7

		result *= 4; // result = 7 * 4;
		System.out.println(result); // = 28

		result /= 7; // result = 28 / 7
		System.out.println(result); // = 4

	}

}
