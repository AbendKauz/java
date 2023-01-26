package chap05;

import java.util.Scanner;

public class Test_4조문제 {

	public static void main(String[] args) {

		// 1. id와 pw 설정 후 지정된 id와 pw 입력 성공 시
		// 주사위(육면체, 2개)가 굴러가게 할 것
		// (지정된 id : java, pw : dd)
		// 그 외 id면 로그인 실패 : 존재하지 않는 id
		// 총합 2가 나오면 대실패,
		// 12가 나오면 대성공,
		// 4 이하의 숫자가 나오면 실패,
		// 5이상의 숫자가 나오면 성공 출력
		// [출력 형태]:
		// 아이디 입력: ()
		// 패스워드 입력: ()
		// (로그인 성공 혹은 실패)
		//
		// 다이스 굴림
		// 다이스 결과: ()
		// 판정 결과: ()
		// ______________________________

//		Scanner s = new Scanner(System.in);
//		System.out.print("아이디 입력 : ");
//		String id = s.next();
//		System.out.print("패스워드 입력 : ");
//		String pw = s.next();
//		
//		if(id.equals("java") && pw.equals("dd")) {
//			System.out.println("로그인 성공");
//			System.out.println();
//			int a = (int)(Math.random() * 6) + 1;
//			int b = (int)(Math.random() * 6) + 1;
//			System.out.println("다이스 굴림");
//			System.out.println("다이스 결과 : " + (a + b));
//			System.out.print("판정결과 : ");
//			if((a + b) == 2) {
//				System.out.println("대실패");
//			}else if((a + b) == 12) {
//				System.out.println("대성공");
//			}else if ((a + b) <= 4) {
//				System.out.println("실패");
//			}else {
//				System.out.println("성공");
//			}
//		}else {
//			System.out.println("로그인 실패 : 존재하지 않는 id");
//		}

		// 2. 1 ~ 100 사이의 랜덤한 숫자가 소수인지 구분하고
		// 아니면 짝수와 홀수로 구분하기

//		int num = (int)(Math.random() * 100) + 1;
//		for (int i = 2; i < 100; i++) {
//			if(num % i == 0) {
//				System.out.println(num + "은(는) 소수입니다.");
//				break;
//			}
//			System.out.println(num + "은(는) 소수가 아닙니다.");
//			if(num % 2 == 0) {
//				System.out.println("짝수입니다.");
//				break;
//			}else {
//				System.out.println("홀수입니다.");
//				break;
//			}
//		}

		// 3. 9000원의 물건을 판매할 때 11부터 15사이의 수를 랜덤으로 뽑아
		// 11이 나오면 20%가 할인된 금액을,
		// 12가 나오면 10%가 할인된 금액을,
		// 13 ~ 15가 나오면 원래 금액을 적용하여 출력
		// 11~15사이 정수를 랜덤으로 뽑는 method를 num에 저장하여 초기화
		// price를 선언하여 값을 9000으로 초기화
		// switch를 사용하여 출력

//		int price = 9000;
//		int num = (int)(Math.random() * 5) + 11;
//		System.out.println("나온 수 : " + num);
//		switch (num) {
//		case 11:
//			System.out.println((price - (int)(price * 0.2)) + "원 입니다.");
//			break;
//		case 12:
//			System.out.println((price - (int)(price * 0.1)) + "원 입니다.");
//			break;
//		default:
//			System.out.println(price + "원 입니다.");
//		}

	}

}
