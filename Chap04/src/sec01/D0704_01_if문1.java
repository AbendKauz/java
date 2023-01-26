package sec01;

import java.util.Scanner;

public class D0704_01_if문1 {

	public static void main(String[] args) {

		// int 타입의 변수 score를 선언하고 키보드로 값을 입력받으시오.
		// 만약 score가 50 이상이면 "합격입니다.", 50 미만이면 "재시험입니다." 출력
		// if문 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();

//		if(score >= 50) {
//			System.out.println("합격입니다.");
//		}
//		if(score < 50) {
//			System.out.println("재시험을 보세요.");
//		}

		// int 타입의 변수 score를 선언하고 키보드로 값을 입력받으시오.
		// 만약 score가 90 이상이면 "A 등급", 90 미만이면 "B 등급" 출력
		// if-else문 사용
		if (score >= 90) {
			System.out.println("점수가 90점 보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90점 보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
