package sec01;

import java.util.Scanner;

public class D0705_01_if문4 {

	public static void main(String[] args) {

		// 각 과목의 정답 개수를 int타입의 변수 3개를 선언하고
		// 키보드로 값을 입력 받으세요.
		// 한 과목이라도 6개 이하인 경우 "불합격입니다!" 출력
		// 총 개수가 30개 이상이면 "합격입니다!" 출력 (if-else문 사용)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();

		int sum = kor + mat + eng;

		// 1)
//		if(kor <= 6 || mat <= 6 | eng <= 6 || sum < 30) {
//			System.out.println("불합격입니다!");
//		}else {
//			System.out.println("합격입니다!");
//		}

		// 2)
		if (kor > 6 && mat > 6 && eng > 6 && sum >= 30) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}

		// 3)
//		if(kor <= 6 || mat <= 6 || eng <= 6) {
//			System.out.println("불합격입니다!");
//		}else {
//			if(sum >= 30) {
//				System.out.println("합격입니다!");
//			}else {
//				System.out.println("불합격입니다!");
//			}
//		}

	}

}
