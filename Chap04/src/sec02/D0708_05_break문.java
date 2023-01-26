package sec02;

import java.util.Scanner;

public class D0708_05_break문 {

	public static void main(String[] args) {

		// 1~6 까지 주사위 번호가 나오는 코드 작성
		// 6이 나오면 반복 종료

//		while(true) {
//			int num = (int)(Math.random() * 6) + 1;
//			System.out.println(num);
//			// num 값이 6일때, break문 활용하여 종료
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");

		// "종료"가 입력되면 while문을 벗어나도록 하는 코드를 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("종료를 입력하면 프로그램을 종료합니다.");
		while (true) {
			System.out.print(">> ");
			String a = sc.nextLine();
			if (a.equals("종료")) {
				System.out.println("프로그램을 종료합니다......");
				break;
			}
		}

	}

}
