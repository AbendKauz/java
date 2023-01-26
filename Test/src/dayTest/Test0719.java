package dayTest;

import java.util.Scanner;

public class Test0719 {

	public static void main(String[] args) {

		// 랜덤값 1900 ~ 2004까지 30개 생성
		// 윤년은 ar배열에, 윤년이 아닌 것은 br배열에 담은 뒤
		// ar배열과 br배열 출력(단, 0값은 출력X)
		// (이중for문 사용금지)

		// 윤년?
		// 4의 배수이면서, 100의 배수가 아닌 값
		// 또는 400의 배수일 때

//		int[] ar = new int[30];
//		int[] br = new int[30];
//		int a = 0;
//		int b = 0;
//		boolean c = true;
//		
//		// 삼항연산자 사용
//		for(int i = 0; i < 30; i++) {
//			int year = (int)(Math.random() * 105) + 1900;
//			c = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
//			ar[i] = (c) ? year : 0;
//			br[i] = (!c) ? year : 0;
//		}
//		
//		// 삼항연산자 사용x
//		for (int i = 0; i < 30; i++) {
//			int year = (int)(Math.random() * 105) + 1900;
//			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//				ar[a++] = year;
//			}else {
//				br[b++] = year;
//			}
//			
//		}
//		
//		// 출력
//		System.out.print("윤년 : ");
//		for(int i = 0; i < ar.length; i++) {
//			if(ar[i] == 0) {
////				break;
//				continue;
//			}
//			System.out.print(ar[i] + " ");
//		}
//		System.out.print("\n윤년 아님 : ");
//		for (int i = 0; i < br.length; i++) {
//			if(br[i] == 0) {
////				break;
//				continue;
//			}
//			System.out.print(br[i] + " ");
//		}

		// 양수 2000부터 음수 2000까지의 랜덤 수 20개를 배열에 저장한 뒤
		// 배열에 저장된 수 20개의 순위를 출력해보세요

//		int[] ar = new int[20];
//		int[] rr = new int[20];
//		int max = 2000;
//		int min = -2000;
//		int rank;
//		for (int i = 0; i < ar.length; i++) {
//			int a = (int)(Math.random() *  (max - min + 1)) + min;
//			ar[i] = a;
//		}
//
//		for (int i = 0; i < rr.length; i++) {
//			rank = 1;
//			for (int j = 0; j < rr.length; j++) {
//				if(ar[i] < ar[j]) {
//					rank++;
//				}
//			}
//			rr[i] = rank;
//		}
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print((i + 1) + " 번째 값 : " + ar[i]
//					+ ", 순위 : (" + rr[i] + "등) ");
//			for (int j = rr[i]; j <= 20; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 1.
		// 1 ~ 9 사이의 3개의 정수를 랜덤으로 뽑는데 뽑은 3개의 수는 중복되지 않아야 함
		// -> 몇 번만에 난수가 중복되지 않은 수가 뽑히는지 출력
		// 랜덤으로 뽑은 위의 숫자를 맞춰야 하는데 위치까지 정확히 맞아야 함.
		// 3개의 숫자를 키보드로 입력받아 비교.

		// 숫자와 숫자의 위치까지 일치하면 스트라이크(strike)
		// 숫자는 맞지만 위치가 틀렸다면 볼(ball)
		// 숫자 3개가 모두 일치하지 않으면 아웃(out)으로 판정
		// 3strike가 되면 게임 종료
		// 시도한 횟수 표시
		// 계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

//		int[] num = new int[9];
//		
//		Scanner s = new Scanner(System.in);
//		int[] user = new int[3];
//		int round = 1;
//		int strike, ball, cnt = 0;
//		
//		while(true) {
//			for (int i = 0; i < num.length; i++) {
//				num[i] = i + 1; 
//			}
//			for (int i = 0; i < 200; i++) {
//				int n1 = (int)(Math.random() * (num.length));
//				int n2 = (int)(Math.random() * (num.length));
//				
//				int t = num[n1];
//				num[n1] = num[n2];
//				num[n2] = t;
//			}
//			System.out.print(round + "회 : ");
//			for (int i = 0; i < 3; i++) {
//				System.out.print(num[i] + " ");
//			}
//			
//			do {
//				cnt++;
//				strike = 0;
//				ball = 0;
//				System.out.println("\n3개의 정수를 입력하세요(1~9)\n스페이스로 구분하시고 마지막에 Enter를 눌러주세요");
//				for (int i = 0; i < user.length; i++) {
//					user[i] = s.nextInt();
//				}
//				
//				for (int i = 0; i < 3; i++) {
//					for (int j = 0; j < user.length; j++) {
//						if(num[i] == user[j]) {
//							if(i == j) {
//								strike++;
//							}else {
//								ball++;
//							}
//						}
//					}
//				}
//				if(strike == 3) {
//					System.out.println(strike + "스트라이크 게임종료");
//					System.out.println(cnt + "번만에 맞추셨습니다.");
//					System.out.println("한게임 더 하시겠습니까?(0:종료, 1:재시작)");
//					int select = s.nextInt();
//					if(select == 1) {
//						round++;
//						break;
//					}else {
//						System.out.println("==게임이 종료되었습니다.==");
//						System.exit(0);
//					}
//				}else {
//					if(strike >= 1 || ball >= 1) {
//						System.out.println(strike + "스트라이크, " + ball + "볼");
//					}else {
//						System.out.println("아웃입니다.");
//					}
//				}
//			}while(true);
//			
//		}// while

	}

}
