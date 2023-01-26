package sec01;

import java.util.Scanner;

public class D0705_01_if문7 {

	public static void main(String[] args) {

		// 정수1, 연산기호, 정수2를 키보드로 입력받아 num1, z, num2 변수에 저장
		// num1, z, num2을 활용하여 +, -, *, / 를 하는 코드 작성
		// (if - else if - else문 사용)

		// [console]
		// 정수1 입력 : 10 15
		// 연산기호 입력 : + /
		// 정수2 입력 : 2 4
		// _________ 10+2=12 15/4=3.75

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("연산기호 입력 : ");
		// nextLine() 사용시 Enter값이 남아있어 메소드 강제종료됨(주의)
		// next() : 공백 전까지 입력받은 문자열을 return
		// nextLine() : Enter를 치기 전까지 쓴 문자열을 모두 return
		String z = sc.next();
		// nextLine()사용하려면 아래에서 enter값을 없애야 함
		// - enter값까지 저장되서 원하는 답이 안나옴(주의)
//		String z = sc.nextLine();
//		sc.nextLine();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();

		if (z.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (z.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (z.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if (z.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
		} else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}

	}

}
