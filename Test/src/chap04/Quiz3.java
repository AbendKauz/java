package chap04;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		// 369 게임 프로그램 만들기
		// 1. 100 미만의 정수를 하나 키보드로 입력받아 변수에 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		// 2. 입력받은 수만큼 369게임을 출력
		// 3. 끝자리 수가 3, 6, 9일때는 "박수"를 출력
		// 4. 끝자리 수가 5일 때는 "으악" 출력
		// 5. 그 외의 나머지 수는 숫자를 출력
		// if, switch 2가지로 풀기
		for (int i = 1; i <= a; i++) {

			// 1. if
//			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("박수");
//			}else if(i % 10 == 5) {
//				System.out.println("으악");
//			}else {
//				System.out.println(i);
//			}// if

			// 2. switch
			switch (i % 10) {
			case 3: {
				System.out.println("박수");
				break;
			}
			case 6: {
				System.out.println("박수");
				break;
			}
			case 9: {
				System.out.println("박수");
				break;
			}
			case 5: {
				System.out.println("으악");
				break;
			}
			default:
				System.out.println(i);
			}// switch
		}

	}

}
