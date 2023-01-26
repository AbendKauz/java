package sec04;

import java.util.Scanner;

public class D0629_03_스캐너 {

	public static void main(String[] args) {

		// Scanner 클래스 생성하는 방법
		// 클래스의 타입 변수명 = new 클래스타입(System.in);

		// 키코드로 글자를 읽음 -> 너무 복잡함
		// Scanner 를 사용함(통문자열 읽을 수 있다.)

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		System.out.println(str);

		String str1 = sc.nextLine();
		System.out.println(str1);

	}

}
