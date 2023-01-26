package chap02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Q1)
//		String name = "감자바";
//		int age = 25;
//		String tel1 = "010", tel2 = "123", tel3 = "4567";
//		
//		System.out.println("이름 : " + name);
//		System.out.print("나이 : " + age + "\n");
//		System.out.printf("전화 : %1$s-%2$s-%3$s", tel1, tel2, tel3);

		// Q2)
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫번째 수 : ");
//		String strNum1 = scanner.nextLine();
//		System.out.print("두번째 수 : ");
//		String strNum2 = scanner.nextLine();
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " + result);

		// 간단한 방법
//		System.out.print("첫번째 수 : ");
//		int strNum1 = scanner.nextInt();	// nextInt() : int타입의 자료형 값 입력
//		System.out.print("두번째 수 : ");
//		int strNum2 = scanner.nextInt();
//		int result = strNum1 + strNum2;
//		System.out.println(result);

//		System.out.print("글자입력 : ");
////		String a = scanner.next();		// 문자열 -> 띄어쓰기 불가
////		System.out.println(a);
//		String a = scanner.nextLine();	// 문자열 -> 띄어쓰기 가능	// enter 치기 전까지 문자 다 나옴
//		System.out.println(a);

		// 여러가지 타입으로 입력 가능
		// 입력하고자 하는 타입 -> next.타입();

		// Q3)
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		String ssn = sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String tel = sc.nextLine();
		System.out.println("\n[입력한 내용]\n" + name + "\n" + ssn + "\n" + tel);

	}

}
