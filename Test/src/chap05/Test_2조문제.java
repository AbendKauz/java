package chap05;

import java.util.Scanner;

public class Test_2조문제 {

	public static void main(String[] args) {

		// 1. int 타입의 정수 하나를 입력받고 1부터 입력받은 수까지
		// 예제와 같은 누적합을 계산하는 출력
		// ex) 입력된 정수가 10일 경우, 출력값 : 220
		// 1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 10)

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = s.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <= i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println("누적합 : " + sum);

		// 2. for문과 printf를 이용하여 그림 출력
		// *
		// **
		// ***
		// ****
		// ***
		// **
		// *

//		int num = 1;
//		for(int i = 0; i < 7; i++) {
//			for(int j = 0; j < num; j++) {
//				System.out.printf("*");
//			}
//			if(i <= 2) {
//				num++;
//			}else {
//				num--;
//			}
//			System.out.printf("\n");
//		}

		// 3. 50보다 작은 자연수 중에서 3 또는 7의 배수를 모두 더하면?

//		int sum = 0;
//		for(int i = 1; i < 50; i++) {
//			if(i % 3 == 0 || i % 7 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

		// 4. 레이스 게임 만들기
		// 1을 누르면 "시작", 0을 누르면 "종료" 출력
		// 1, 0 이외의 번호를 입력하면 "잘못된 번호입니다" 출력 후 초기화면으로 이동
		// 1~4중 하나의 번호 입력받기
		// 1~4 이외의 번호를 입력하면 "잘못된 번호입니다" 출력 후 초기화면으로 이동

		// 1~4번 이동(1~4번이 랜덤한 숫자만큼 증가)
		// 현재 턴 표시
		// 1~4번의 현재 위치(수) 출력

		// 1~4중 하나라도 30 이상이 되면 종료
		// (do-while문 사용)
		// 가장 먼저 30이 된 번호 출력
		// 유저가 선택한 번호가 가장 먼저 들어온 번호를 비교 후
		// 선택한 번호가 먼저 들어왔다면 "예측한 번호가 우승했습니다!" 출력
		// 선택한 번호가 먼저 들어오지 못했다면 "예측한 번호가 우승하지 못했습니다..." 출력
		// 결과 출력 후 초기화면으로 이동

//		Scanner s = new Scanner(System.in);
//		while(true) {
//			System.out.print("1을 누르면 시작, 0을 누르면 종료합니다 >> ");
//			String a = s.nextLine();
//			if(a.equals("1")) {
//				System.out.print("\n1 ~ 4번 중 번호를 입력하세요. >> ");
//				String select = s.nextLine();
//				if(!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4")) {
//					System.out.println("번호를 잘못 입력하셨습니다.\n초기화면으로 돌아갑니다.\n");
//				}else {
//					System.out.println("\n레이스를 시작합니다!\n");
//					int a1 = 0;
//					int a2 = 0;
//					int a3 = 0;
//					int a4 = 0;
//					int win = 0;
//					int turn = 1;
//					
//					do {
//						System.out.println("[" + turn + "턴]");
//						a1 += (int)(Math.random() * 10) + 1;
//						a2 += (int)(Math.random() * 10) + 1;
//						a3 += (int)(Math.random() * 10) + 1;
//						a4 += (int)(Math.random() * 10) + 1;
//						
//						System.out.println("1 >> " + a1);
//						System.out.println("2 >> " + a2);
//						System.out.println("3 >> " + a3);
//						System.out.println("4 >> " + a4);
//						System.out.println();
//						if(a1 >= 30 || a2 >= 30 || a3 >= 30 || a4 >= 30) {
//							System.out.println("레이스가 종료되었습니다!");
//							if(a1 >= 30) {
//								win = 1;
//								System.out.println("가장 먼저 들어온 번호는 " + win +"번 입니다!!!");
//								break;
//							}else if(a2 >= 30) {
//								win = 2;
//								System.out.println("가장 먼저 들어온 번호는 " + win +"번 입니다!!!");
//								break;
//							}else if(a3 >= 30) {
//								win = 3;
//								System.out.println("가장 먼저 들어온 번호는 " + win +"번 입니다!!!");
//								break;
//							}else {
//								win = 4;
//								System.out.println("가장 먼저 들어온 번호는 " + win +"번 입니다!!!");
//								break;
//							}
//						}
//						turn++;
//					}while(a1 <= 30 || a2 <= 30 || a3 <= 30 || a4 <= 30);
//					
//					System.out.println("\n당신이 선택한 번호는 " + select + "번 입니다.");
//					if(select.equals(win)) {
//						System.out.println("예측한 번호가 우승했습니다!!!");
//					}else {
//						System.out.println("예측한 번호가 우승하지 못했습니다...");
//					}
//					System.out.println("==================================");
//				}
//				
//			}else if(a.equals("0")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}

	}

}
