package chap04;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		// 숫자 출력 프로그램
		// 1. 정수를 하나 키보드로 입력받아 변수에 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		// 2. 1에서 입력받은 숫자까지 아래와 같은 순서로 출력하는 코드 작성
		// 짝수는 앞에 -

		// 1. (for, if)
//		for(int i = 1; i <= a; i++) {
//			if(i % 2 == 0) {
//				System.out.print("-" + i + " ");
//			}else {
//				System.out.print(i + " ");
//			}
//		}

		int i = 1;
		// 2. (while, 삼항연산식)
//		while(i <= a) {
//			System.out.print( (i % 2 == 0) ? "-" + i + " " : i + " " );
//			i++;
//		}

		// 3. (for, switch)
//		for(int i = 1; i <= a; i++) {
//			switch (i % 2) {
//			case 0: {
//				System.out.print("-" + i + " ");
//				break;
//			}
//			default:
//				System.out.print(i + " ");
//			}
//		}

		// 4. (do-while, if)
		do {
			if (i % 2 == 0) {
				System.out.print("-" + i + " ");
			} else {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= a);

	}

}
