package sec02;

import java.util.Scanner;

public class D0708_06_continue문 {

	public static void main(String[] args) {

		// continue문
		// -> 반복문을 종료하지않고 계속 반복을 실행

		// 1에서 10 사이의 수 중에서 짝수만 출력
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}

		// 5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램
		// -> 입력된 수가 0이나 음수이면 합하지 않고 다음 반복으로 넘어감
		// (continue문 활용)
		// [콘솔출력]
		// 정수를 5개 입력하세요.
		// >> 5
		// >> -2
		// >> 6
		// >> 10
		// >> -4
		// 양수의 합은 21입니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("정수입력 " + i + " >> ");
			int num = sc.nextInt();
			if (num <= 0) {
				continue;
			}
			sum = sum + num;
		}
		System.out.println("양수의 합은 " + sum + "입니다.");

	}

}
