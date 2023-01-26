package dayTest;

import java.util.Scanner;

public class Test0711 {

	public static void main(String[] args) {

//		// 5. 가위바위보
//		Scanner s = new Scanner(System.in);
//		while (true) {
//			System.out.print("바위, 가위, 보 중 하나를 선택하세요. >> ");
//			String user = s.nextLine();
//			if(!user.equals("바위") && !user.equals("가위") && !user.equals("보")) {	// 바위,가위,보 이외의 글자 입력 시 다시입력
//				System.out.println("다시 입력하세요.");
//				continue;
//			}else {
//				int userNum = 0;			// 입력된 값을 숫자로 계산할 변수
//				if(user.equals("바위")) {		// 입력된 값이 바위 일 경우 1
//					userNum = 1;
//				}else if(user.equals("가위")) {	// 입력된 값이 바위 일 경우 2
//					userNum = 2;
//				}else {							// 입력된 값이 바위 일 경우 3
//					userNum = 3;
//				}
//				int comNum = (int)(Math.random() * 3 + 1);	// 컴퓨터의 수 랜덤생성
//				String com = "";				// 출력때 컴퓨터의 수 저장할 변수
//				if(comNum == 1) {				// 컴퓨터가 뽑은 값이 1이면 바위
//					com = "바위";
//				}else if(comNum == 2) {			// 컴퓨터가 뽑은 값이 2이면 가위
//					com = "가위";
//				}else {							// 컴퓨터가 뽑은 값이 3이면 보
//					com = "보";
//				}
//				System.out.println("사용자가 낸 것 : " + user);
//				System.out.println("컴퓨터가 낸 것 : " + com);
//				if((userNum == 1 && comNum == 3) || (userNum == 2 && comNum == 1) || (userNum == 3 && comNum == 2)) {
//					System.out.println("졌습니다...");	// 컴퓨터 승
//				}else if((userNum == 1 && comNum == 2) || (userNum == 2 && comNum == 3) || (userNum == 3 && comNum == 1)) {
//					System.out.println("이겼습니다!!!");	// 사용자 승(이겼을때 종료)
//					break;
//				}else {
//					System.out.println("비겼습니다.");		// 비겼을 때
//				}
//			}
//		}

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

//		Scanner s = new Scanner(System.in);
//		int com = (int)(Math.random() * 500 + 1);
//		int cnt = 0;
//		while(true) {
//			System.out.print("1~500까지의 숫자를 입력하세요.\n>> ");
//			int num = s.nextInt();
//			if(num <= 500 && num >= 1) {
//				if(num < com) {
//					System.out.println("더 큰 수를 입력하세요.");
//				}else if(num > com) {
//					System.out.println("더 작은 수를 입력하세요.");
//				}else {
//					System.out.println("정답입니다!");
//					break;
//				}
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//				continue;
//			}
//			cnt++;
//		}
//		System.out.println("시도횟수는 " + cnt + "번 입니다.");

	}

}
