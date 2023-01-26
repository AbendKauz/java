package dayTest;

import java.util.Scanner;

public class Test0713 {

	public static void main(String[] args) {

		// 10 ~ 500 사이의 숫자값 맞추기
		// Q)
		// 1. 유효성 검사(max, min)
		// 2. 몇번만에 맞췄는지 출력 (카운트 추가)
		// 3. 기회 제공 횟수 지정 (정답도 같이 출력)
		// : 사용자에게 도전횟수를 묻고 그 횟수만큼만 돌림

//		Scanner s = new Scanner(System.in);
//		int min = 10;
//		int max = 500;
//		
//		int correct = (int)(Math.random() * (max - min + 1)) + min;
//		int cnt = 0;				// 시도횟수
//		System.out.print("도전횟수를 입력하세요. >> ");
//		int limit = s.nextInt();	// 제한횟수
//		
//		while(true) {
//			if(limit > cnt) {
//				System.out.println("\n[남은 도전횟수는 " + (limit - cnt) + "회 입니다.]\n");
//			}
//			System.out.print(min + "부터 " + max + "까지 정수 입력 >> ");
//			int userNum = s.nextInt();
//			if(userNum < min || userNum > max) {
//				System.out.println(min + "부터 " + max + "까지만 입력하세요");
//				continue;
//			}
//			if(correct == userNum) {
//				System.out.println("정답을 맞췄습니다.!!");
//				break;
//			}else if(correct > userNum) {
//				System.out.println("더 큰 값을 입력하세요.");
//				cnt++;
//			}else {
//				System.out.println("더 작은 값을 입력하세요.");
//				cnt++;
//			}
//			if(limit == cnt) {
//				System.out.println("\n도전횟수를 초과하였습니다.");
//				System.out.println("정답은 [" + correct + "]입니다.");
//				break;
//			}
//		} // while
//		
//		System.out.println("\n시도한 횟수는 [" + cnt + "]번 입니다.");
//		System.out.println("게임을 종료합니다.");

//--------------------------------------------------------------------------------------------------------------------------

		// n값 입력받아 * 출력
		// ex) 5 입력 시
//		Scanner s = new Scanner(System.in);
//		System.out.print("값 입력 : ");
//		int num = s.nextInt();

		// ex1)
		// *****
		// ****
		// ***
		// **
		// *

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();

		// ex2)
		// *
		// **
		// ***
		// ****
		// *****

//		for(int i = 0; i < num; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();

		// ex3)
		// *****
		// ****
		// ***
		// **
		// *

//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < num; j++) {
//				if(j >= i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();

		// ex4)
		// *
		// **
		// ***
		// ****
		// *****

		// 1)
//		for(int i = 0; i < num; i++) {
//			for(int j = 1; j <= num; j++) {
//				if(j >= num-i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// 2)
//		for(int i = 0; i < num; i++) {
//			for(int j = 1; j < num - i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = num; k >= num - i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	} // main()

} // class
