package sec01.exam16;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String a = s.next();
		if (a.length() == 3) {
			System.out.println("당신의 이름은 " + a + "입니다.");
		} else {
			System.out.println("이름을 다시 입력해 주세요.");
		}

	}

}
