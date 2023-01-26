package sec02;

import java.util.Scanner;

public class D0707_02_while문1 {

	public static void main(String[] args) {

		// while 문
		// -> 조건식에 따라 반복 여부를 결정할 경우
		// true : 계속 반복 / false : 반복 종료

		// while(조건식) {
		// 반복할 코드
		// }

		// for문
		// -> 정해진 횟수만큼 반복

		// 1~10까지 출력
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;	// i의 증감값이 없으면 계속 1만 반복되서 출력
//		}

		// int 타입의 변수 num을 선언하고 키보드로 값을 입력받으세요.
		// 1 ~ 변수 num까지 합을 출력하는 프로그램 작성(while문 사용)

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= num) {
//			sum = sum + i;
//			System.out.println("초기 i : " + i);
			sum += i;
			i++; // num까지 돌리기 위해 i의 값을 1씩 증가
//			System.out.println("증감 후 i : " + i + ", sum : " + sum);
		}
		System.out.println("1 ~ " + num + "의 합 : " + sum);
	}

}
