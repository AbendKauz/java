package sec01.exam18;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 가운데 글자 추출하는 방식을 substring을 활용하여 풀이
		Scanner s = new Scanner(System.in);
		System.out.print("글자 입력 : ");
		String a = s.next();

		if (a.length() % 2 == 0) {
			System.out.println(a.substring((a.length() / 2) - 1, (a.length() / 2) + 1));
		} else {
			System.out.println(a.substring(a.length() / 2, (a.length() / 2) + 1));
		}

	}

}
