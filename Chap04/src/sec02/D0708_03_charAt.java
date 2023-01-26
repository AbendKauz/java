package sec02;

import java.util.Scanner;

public class D0708_03_charAt {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자 입력 : ");
//		String str = sc.nextLine();

		// char -> 문자 하나만 ''
		// String -> 문자열 ""

		// String타입 변수.charAt(숫자); -> 숫자는 문자열의 인덱스
//		char c = str.charAt(3);
//		System.out.println(c);
//		
//		// 안녕하세요 입력시
//		System.out.println(str.charAt(0));	// 안
//		System.out.println(str.charAt(1));	// 녕
//		System.out.println(str.charAt(4));	// 요
//		
//		// 자바는 재밌어 입력시
//		System.out.println(str.charAt(3));	//  (공백)

		// String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//		// APPLE
		char a = str.charAt(0);
		char p = str.charAt(15);
		char l = str.charAt(11);
		char e = str.charAt(4);

		// a + p + p + l + e -> 그냥 출력시 정수타입으로 변환됨 => 문자열을 붙여 문자로 바꿔줌
		String apple = "" + a + p + p + l + e;
		System.out.println(apple);
//		System.out.print(str.charAt(0));
//		System.out.print(str.charAt(15));
//		System.out.print(str.charAt(15));
//		System.out.print(str.charAt(11));
//		System.out.println(str.charAt(4));

//		// BUS
		char b = str.charAt(1);
		char u = str.charAt(20);
		char s = str.charAt(18);
		// String을 기본타입으로 변환하는 메소드
		// -> .valueOf()
		String bus = String.valueOf(b) + String.valueOf(u) + String.valueOf(s);
		System.out.println(bus);
//		System.out.print(str.charAt(1));
//		System.out.print(str.charAt(20));
//		System.out.println(str.charAt(18));

//		// JAVA
		char j = str.charAt(9);
		char v = str.charAt(21);
		String java = String.valueOf(j) + a + v + a;
		System.out.println(java);
//		System.out.print(str.charAt(9));
//		System.out.print(str.charAt(0));
//		System.out.print(str.charAt(21));
//		System.out.println(str.charAt(0));

	}

}
