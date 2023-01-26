package sec01;

import java.util.Scanner;

public class D0705_01_if문2 {

	public static void main(String[] args) {

//		// int 타입의 변수 num를 선언하고 키보드로 값을 입력받으세요.
		// 만약 num이 2의 배수이면서 5의 배수라면 "2와 5의 배수입니다."
		// 라고 출력하는 프로그램을 만들어보세요.(if문 사용)
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		// 1)
		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("2와 5의 배수입니다.");
		} else {
			System.out.println("2와 5의 배수가 아닙니다.");
		}

//		// 2)
//		if(num % 2 == 0) {
//			if(num % 5 == 0) {
//				System.out.println("2와 5의 배수입니다.");
//			}else {
//				System.out.println("5의 배수가 아닙니다.");
//			}
//		}else {
//			System.out.println("2의 배수가 아닙니다.");
//		}

//		// 3)
//		System.out.println((num % 2 == 0) ? ((num % 5 == 0) ? "2와 5의 배수입니다" : "5의 배수가 아닙니다." ) : "2의 배수가 아닙니다.");

	}

}
