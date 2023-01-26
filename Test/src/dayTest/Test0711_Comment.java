package dayTest;

import java.util.Scanner;

public class Test0711_Comment {

	public static void main(String[] args) {

//		// 5. 가위바위보 (숫자로 처리)
		// 가위(1), 바위(2), 보(3) 입력 :
		// 컴퓨터가 이겼습니다.!!

//		Scanner s = new Scanner(System.in);
//		int total = 0;	// 전체 시도횟수
//		int win = 0;	// 사용자가 이긴 횟수
//		
//		while(true) {
//			int comp = (int)(Math.random() * 3) + 1;
//			int user;
//			while(true) {
//				System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
//				user = s.nextInt();
//				if(user >= 1 && user <= 3) {
//					break;
//				}
//				System.out.println("정신차리고 입력해라. 1~3까지만 입력할 수 있습니다.");
//			} // end while
//			
////			// 1. 가위	2. 바위	3. 보
//			int result = comp - user;
//			// comp	user	com win
//			// 1 - 3 = -2
//			// 2 - 1 = 1
//			// 3 - 2 = 1
//			total++;
//			if(result == 0) {
//				System.out.println("비겼습니다.");
//			}else if(result == -2 || result == 1) {
//				System.out.println("컴퓨터가 이겼습니다.!!");
//			}else {
//				System.out.println("사용자가 이겼습니다.!!");
//				win++;
//			}
//
//			// 게임을 계속 하시겠습니까?(y/n) :
//			// n 또는 N을 누르면 종료 / 그 이외에는 계속 되도록
//			
//			System.out.print("게임을 계속 하시겠습니까?(y/n) : ");
//			char ch = s.next().charAt(0);
//			
//			if(ch == 'n' || ch == 'N') {
//				break;
//			}
//			
//		} // end while
//		
//		//사용자의 승률은 00.0%입니다. 출력
////		DecimalFormat df = new DecimalFormat("##.0%");
//		System.out.println("총 게임 횟수 : " + total);
//		System.out.println("사용자가 이긴 횟수 : " + win);
////		System.out.println("사용자의 승률은 " + df.format((win / (double)total)) + " 입니다.");
//		System.out.printf("사용자의 승률은 %3.1f%% 입니다.\n",(win / (double)total) * 100);
//		System.out.println("게임을 종료합니다.");

//		double n1 = 17/7;		// 정수 / 정수 = 정수라 2만 남고 실수타입이 됨(2.0)
//		System.out.println(n1);	// 2.0
//		
//		double n2 = 17/7.;		// .만 붙여도 실수타입이 됨
//		System.out.println(n2);	// 2.4285714285714284

//		double n = (int)(4/7. * 1000);
//		System.out.println(n);			// 571.0

//		double n = (int)(4/7. * 1000) / 10.;
//		System.out.println(n);			// 57.1

//		double n = (int)(4/(double)7 * 1000) / (double)10;	// .을 안찍고 double로 형변환 시켜 작업해도 가능
//		System.out.println(n);			// 57.1

//		// 6. 숫자 맞추기(1~500까지의 수) high low game
//		// ex) 컴퓨터 정답 : 200
//		// 숫자 입력 : 300
//		// => 더 작은 수를 입력하세요
//		// 숫자 입력 : 150
//		// => 더 큰 수를 입력하세요
//		// 숫자 입력 : 201
//		// => 더 작은 수를 입력하세요
//		// 숫자 입력 : 200
//		// => 정답입니다!!!
//		// 도전횟수는 3회 입니다.

//		// (int)(Math.random() * 범위값) + 값;
//		// 값 => 최소값, 범위값 => 최대값 - 최소값 + 1

//		// 1 ~ 30
//		(int)(Math.random() * 30) + 1;

//		// 5 ~ 15
//		(int)(Math.random() * 11) + 5;

		// 10 ~ 500 사이의 숫자값 맞추기

//		Scanner s = new Scanner(System.in);
//		
//		int correct = (int)(Math.random() * 491) + 10;
//		
//		while(true) {
//			System.out.print("10부터 500까지 정수 입력 : ");
//			int userNum = s.nextInt();
//			
//			if(correct == userNum) {
//				System.out.println("정답을 맞췄습니다.!!");
//				break;
//			}else if(correct > userNum) {
//				System.out.println("더 큰 값을 입력하세요.");
//			}else {
//				System.out.println("더 작은 값을 입력하세요.");
//			}
//		} // while
//		
//		System.out.println("게임을 종료합니다.");

		// 38 ~ 777
//		int max = 500;
//		int min = 10;
//		
//		max++;		// max의 값을 증가
//		min--;		// min의 값을 감소
//		System.out.println(min + "부터 " + max + "까지 계산");

//		final int MAX = 500;	// final을 붙이면 사용은 가능하나 값을 변경할 수 없다
//		final int MIN = 10;		// final(상수)은 전부 대문자로 사용
//		
//		MAX++;		// final을 붙이면 값 변경 불가
//		MIN--;		//           ""
//		System.out.println(MIN + "부터 " + MAX + "까지 계산");

	}

}
