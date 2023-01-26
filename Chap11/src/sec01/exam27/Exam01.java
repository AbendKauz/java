package sec01.exam27;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 아이템을 강화하시겠습니까?(Y/N)
		// Y가 입력되면 강화 시작 / N 입력시 "다음에 이용하세요"
		// 확률 3% -> 아이템 강화에 성공했습니다.
		// 확률 17% -> 아이템 강화에 실패했습니다. 아이템은 유지됩니다.
		// 확률 나머지 -> 아이템 강화에 실패했습니다. 아이템이 파괴되었습니다.

		Scanner s = new Scanner(System.in);
		System.out.print("아이템을 강화하시겠습니까? (Y/N) : ");
		String a = s.next();

		if (a.toUpperCase().equals("Y")) {
			int num = (int) (Math.random() * 100) + 1;
			if (num <= 3) {
				System.out.println("아이템 강화에 성공했습니다.");
			} else if (num <= 20) {
				System.out.println("아이템 강화에 실패했습니다. 아이템은 유지됩니다.");
			} else {
				System.out.println("아이템 강화에 실패했습니다. 아이템이 파괴되었습니다.");
			}
		} else if (a.toUpperCase().equals("N")) {
			System.out.println("다음에 이용하세요.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
