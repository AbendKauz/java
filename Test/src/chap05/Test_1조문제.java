package chap05;

import java.util.Scanner;

public class Test_1조문제 {

	public static void main(String[] args) {

		// 1. 1부터 100 사이의 값을 입력해 무작위로 선정된 값을 맞추기
		// 사용자가 값을 입력하면 컴퓨터는 선정된 값과 비교해 더 큰 수를 입력하거나
		// 더 작은 수를 입력할 수 있게 알림 메세지를 보내줌
		// 무작위 값을 맞히면 프로그램이 종료되고 몇 번 만에 값을 맞혔는지 알려줌

//		Scanner s = new Scanner(System.in);
//		int com = (int)(Math.random() * 100 + 1);
//		int cnt = 0;
//		while(true) {
//			System.out.print("1과 100 사이의 값을 입력하세요.\n>> ");
//			int num = s.nextInt();
//			if(num <= 100 && num >= 1) {
//				if(num < com) {
//					System.out.println("더 큰 수를 입력하세요.");
//				}else if(num > com) {
//					System.out.println("더 작은 수를 입력하세요.");
//				}else {
//					System.out.println("맞췄습니다.");
//					break;
//				}
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//				continue;
//			}
//			cnt++;
//		}
//		System.out.println("시도횟수는 " + cnt + "번 입니다.");

		// 2. 키보드로 숫자를 입력받아 예시처럼 출력하기
		// 숫자 : ___
		// 나누는 수 : ___
		// 몫 : _____, 나머지 : _____

//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 : ");
//		int a = s.nextInt();
//		System.out.print("나누는 수 : ");
//		int b = s.nextInt();
//		System.out.println("몫 : " + (a / b) + ", 나머지 : " + (a % b));

		// 3. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를
		// 출력하는 프로그램 작성

//		System.out.println("합이 6이 되는 경우의 수 : ");
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++) {
//				if(i + j == 6) {
//					System.out.println("(" + i + ", " + j + ")");
//				}
//			}
//		}

		// 4. 시간, 분, 층을 정수로 각각 입력 받아서 각 변수에 저장
		// 시간, 분, 층을 입력 시 시간과 층에 맞는 결과 출력
		// (9~12시까지 2~5층 운행 제한 // 건물은 1~20층)

//		Scanner s = new Scanner(System.in);
//		System.out.print("시간 : ");
//		int hour = s.nextInt();
//		System.out.print("분 : ");
//		int min = s.nextInt();
//		System.out.print("층 : ");
//		int floor = s.nextInt();
//		
//		if(floor >= 1 && floor <= 20) {
//			if(hour >= 9 && hour < 12) {
//				if(floor >= 2 && floor <= 5) {
//					System.out.println(floor + "층은 운행시간이 아닙니다.");
//				}else {
//					System.out.println(floor + "층에 도착하였습니다.");
//				}
//			}else {
//				System.out.println(floor + "층에 도착하였습니다.");
//			}
//		}else {
//			System.out.println("층수를 잘못 입력하셨습니다.");
//		}

	}

}
