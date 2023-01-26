package chap05;

import java.util.Scanner;

public class Test_3조문제 {

	public static void main(String[] args) {

		// 1. 두 정수를 입력받아 그 정수 사이값 중에 짝수의 갯수를 출력
		// (입력받은 정수 제외)

//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 1 : ");
//		int a = s.nextInt();
//		System.out.print("정수 입력 2 : ");
//		int b = s.nextInt();
//		
//		if(a > b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
//		
//		int cnt = 0;
//		for(int i = a; i < b; i++) {
//			if(i % 2 == 0) {
//				cnt++;
//			}
//		}
//		System.out.println("짝수의 갯수 : " + cnt + "개");

		// 2.
		// Up & Down 게임 프로그램 만들기
		// 1. 프로그램이 실행되면 컴퓨터는 난수를 통해 1~20사이의 정수 하나를 생성 및 저장
		// 2. 20 미만의 정수를 키보드로 입력하기
		// 3. 입력받은 숫자가 컴퓨터가 생성한 숫자보다 높은지(up) 낮은지(down) 판단하여 출력
		// 4. 5번의 기회가 주어지며 그중에 성공, 실패 판별 후 종료

//		Scanner s = new Scanner(System.in);
//		int num = (int)(Math.random() * 20) + 1;
//		int cnt = 5;
//		System.out.println("5번의 도전기회가 있습니다 >> 게임시작");
//		while(true) {
//			if(cnt == 0) {
//				System.out.println("5번 모두 실패!!! 답은 " + num + "입니다.");
//				break;
//			}
//			System.out.print(cnt + " < 정수 입력 : ");
//			int user = Integer.parseInt(s.nextLine());
//			if(user > num) {
//				System.out.println("Down");
//				cnt--;
//			}else if(user < num) {
//				System.out.println("Up");
//				cnt--;
//			}else {
//				System.out.println((5 - cnt + 1) + "번만에 성공! 답은 " + num + "입니다.");
//				break;
//			}
//		}

		// 3. 에이와 비이가 가위, 바위, 보를 하였을 때, 이긴사람 출력

//		Scanner s = new Scanner(System.in);
//		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
//		System.out.print("에이 >> ");
//		String a = s.next();
//		System.out.print("비이 >> ");
//		String b = s.next();
//		
//		if(a.equals("바위") && b.equals("가위") || a.equals("가위") && b.equals("보") || a.equals("보") && b.equals("바위")) {
//			System.out.println("에이가 이겼습니다.");
//		}else if(a.equals("바위") && b.equals("보") || a.equals("가위") && b.equals("바위") || a.equals("보") && b.equals("가위")) {
//			System.out.println("비이가 이겼습니다.");
//		}else {
//			System.out.println("비겼습니다.");
//		}

	}

}
