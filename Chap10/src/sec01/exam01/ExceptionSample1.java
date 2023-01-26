package sec01.exam01;

import java.util.Scanner;

public class ExceptionSample1 {

	public static void main(String[] args) {

		// 두 개의 숫자를 스캐너를 통해서 입력받음
		// 두번째 입력받은 숫자가 0인 경우 "0으로 나눌 수 없습니다."출력
		// 두 숫자가 모두 0 이상인 경우 나누기 결과값을 출력

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int b = s.nextInt();

		double c = (double) a / b;

//		System.out.println("나누기 결과값은 : " + c + " 입니다.");

		if (a == 0 || b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(a + " / " + b + " = " + c);
		}

	}

}
