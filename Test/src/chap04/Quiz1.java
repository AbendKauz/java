package chap04;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		// 다이어트 프로그램 만들기
		// 1. 현재 몸무게와 목표 몸무게를 키보드로 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int weight1 = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int weight2 = sc.nextInt();
		// 2. 주차별 감량 몸무게를 입력받기
		int i = 1;
		// 3. 목표 몸무게가 달성할 때 까지 주차별 감량 몸무게는 계속 입력 받아야 하고,
		// 목표 몸무게를 달성하면 아래와 같은 내용이 출력되도록 코드 작성
		while (true) {
			System.out.print(i + "주차 감량 몸무게 : ");
			int weight3 = sc.nextInt();
			weight1 = weight1 - weight3;
			if (weight1 <= weight2) {
				System.out.println(weight1 + "kg 목표 달성!! 다이어트를 성공하셨습니다.");
				break;
			}
			i++;
		} // while

	}

}
