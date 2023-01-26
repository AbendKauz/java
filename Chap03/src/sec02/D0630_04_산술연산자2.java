package sec02;

import java.util.Scanner;

public class D0630_04_산술연산자2 {

	public static void main(String[] args) {

		// 키보드로 2개의 값을 입력받아
		// int 타입 a, b 변수에 값을 저장한 후
		// 아래의 값을 출력해라

		// 정수입력 1 : _____
		// 정수입력 2 : _____
		// a + b : ____
		// a - b : ____
		// a * b : ____
		// a / b : ____
		// a % b : ____

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int a = sc.nextInt();
		System.out.print("두번째 값 : ");
		int b = sc.nextInt();

		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + (a * b));
		System.out.println("a / b : " + (a / b));
		System.out.println("a % b : " + (a % b));

	}

}
