package sec02;

import java.util.Scanner;

public class D0704_10_삼항연산자2 {

	public static void main(String[] args) {

		// 키보드로 값을 정수 하나 입력 받아 변수 a에 값을 저장
		// a의 값이 양수인지, 음수인지 판별하는 코드 작성
		// (a의 값이 양수라면? 양수입니다.
		// 0이라면? 0입니다.
		// 음수라면? 음수입니다 를 출력)
		// --> 삼항연산자 // if문 실습

		// [console 창]
		// 정수 입력 : 42 정수 입력 : 0 정수 입력 : -14
		// 양수입니다. 0입니다. 음수입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
//		System.out.println((a > 0) ? "양수입니다." : (a == 0) ? "0입니다." : "음수입니다.");

//		if(a > 0) {
//			System.out.println("양수입니다.");
//		}else if(a < 0) {
//			System.out.println("음수입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}

//		if(a > 0) {
//			System.out.println("양수입니다.");
//		}else {
//			if(a == 0){
//				System.out.println("0입니다.");
//			}else {
//				System.out.println("음수입니다.");
//			}
//		}

	}

}
