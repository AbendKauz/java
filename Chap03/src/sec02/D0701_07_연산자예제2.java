package sec02;

import java.util.Scanner;

public class D0701_07_연산자예제2 {

	public static void main(String[] args) {

		// 정수를 하나 키보드로 입력받아
		// int 타입의 num 이라는 변수에 값을 저장
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// b라는 변수에 num이 5의 배수인지(true), 아닌지(false)
		// 값을 저장해서 b의 값을 출력하시오
		// num의 값이 5의 배수라면 -> num은(는) 5의 배수입니다.
		// num의 값이 5의 배수가 아니라면 -> num은(는) 5의 배수가 아닙니다.

		boolean b = (num % 5 == 0);
		if (b) {
			System.out.println(num + "은(는) 5의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 5의 배수가 아닙니다.");
		}

	}

}
