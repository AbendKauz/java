package chap04;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		// 지금까지 배운 내용들을 활용하여 문제 직접 만들기

		// 레이스 게임 만들기
		// 1을 누르면 "시작", 0을 누르면 "종료" 출력
		// 1, 0 이외의 글자를 입력하면 "잘못된 번호입니다" 출력 후 초기화면으로 이동

		// 1~4번중 하나의 번호(말) 입력받기
		// 1~4번 이외의 글자를 입력하면 "잘못된 번호입니다" 출력 후 초기화면으로 이동

		// 1~4번(말) 이동(1~4번이 랜덤한 숫자만큼 증가)
		// 현재 턴 표시
		// 1~4번의 현재 위치(수) 출력

		// 1~4중 하나라도 30 이상이 되면 종료
		// (do-while문 사용)
		// 가장 먼저 30이 된 번호 출력
		// 유저가 선택한 번호가 가장 먼저 들어온 번호를 비교 후
		// 선택한 번호가 먼저 들어왔다면 "예측한 번호가 우승했습니다!" 출력
		// 선택한 번호가 먼저 들어오지 못했다면 "예측한 번호가 우승하지 못했습니다..." 출력
		// 결과 출력 후 초기화면으로 이동

		// 추후 처리문제 : 동시에 30이상일 경우 가장 작은 번호가 최종우승되는 부분 수정 필요
		// ex) 1,3,4 번 동시도착 : 1번 우승
		// 2,4번 동시도착 : 2번 우승

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("시작하시려면 1, 종료하시려면 0을 입력하세요.");
			System.out.print(">> ");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("게임을 시작합니다.");
				System.out.print("1~4번 중 번호를 입력하세요 >> ");
				int user = sc.nextInt();
				if (user > 4 || user < 1) {
					System.out.println("잘못된 번호입니다. 초기화면으로 돌아갑니다.");
					System.out.println("====================================");
					continue;
				} else {
					System.out.println();
					System.out.println("레이스를 시작합니다!");
					System.out.println();
				}

				int com1 = 0;
				int com2 = 0;
				int com3 = 0;
				int com4 = 0;

				int com = 0; // 우승번호 저장
				int round = 0; // 현재 턴 수 표시

				do {

					com1 += (int) (Math.random() * 10) + 1;
					com2 += (int) (Math.random() * 10) + 1;
					com3 += (int) (Math.random() * 10) + 1;
					com4 += (int) (Math.random() * 10) + 1;

					round++;
					System.out.println("[" + round + "턴]");
					System.out.println("1 >> " + com1);
					System.out.println("2 >> " + com2);
					System.out.println("3 >> " + com3);
					System.out.println("4 >> " + com4);

					if (com1 >= 30 || com2 >= 30 || com3 >= 30 || com4 >= 30) {
						System.out.println("레이스가 종료되었습니다!");
						if (com1 >= 30) {
							System.out.println("가장 먼저 들어온 번호는 1번입니다!");
							com = 1;
						} else if (com2 >= 30) {
							System.out.println("가장 먼저 들어온 번호는 2번입니다!!");
							com = 2;
						} else if (com3 >= 30) {
							System.out.println("가장 먼저 들어온 번호는 3번입니다!!!");
							com = 3;
						} else {
							System.out.println("가장 먼저 들어온 번호는 4번입니다!!!!!");
							com = 4;
						}
					}

					System.out.println("");

				} while (com1 <= 30 && com2 <= 30 && com3 <= 30 && com4 <= 30);

				System.out.println("당신이 선택한 번호는 " + user + "번 입니다.");

				if (user == com) {
					System.out.println("예측한 번호가 우승했습니다!");
				} else {
					System.out.println("예측한 번호가 우승하지 못했습니다...");
				}
				System.out.println("====================================");

			} else if (a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("====================================");
			}

		} // while

	}// main

}// class
