package chap04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		// 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능 코드 작성
		// (while문과 Scanner 사용, Scanner의 nextLine() 사용)

		boolean run = true;
		int balance = 0; // 잔고
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택 >> ");

			String num = scanner.next();

			if (num.equals("1")) {
				System.out.print("예금액 >");
				balance += scanner.nextInt();
			} else if (num.equals("2")) {
				System.out.print("출금액 >");
				balance -= scanner.nextInt();
			} else if (num.equals("3")) {
				System.out.print("잔고 > ");
				System.out.println(balance);
			} else if (num.equals("4")) {
				System.out.println("");
				run = false;
			}
			if (!run) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
