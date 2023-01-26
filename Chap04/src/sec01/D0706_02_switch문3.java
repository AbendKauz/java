package sec01;

import java.util.Scanner;

public class D0706_02_switch문3 {

	public static void main(String[] args) {

		// string 타입의 변수 grade를 선언하고 키보드로 값을 입력받기
		// grade에 따른 문구를 출력하여 아래와 같은 실행 결과가 나오도록
		// 프로그램 만들기
		// 단, 알파벳 대소문자에 관계없이 동일하게 처리해야 함
		// (switch문 사용)

		// <회원 등급>
		// A등급 : 우수회원입니다.
		// B등급 : 일반회원입니다.
		// 그 외 : 손님입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("등급 : ");
		String grade = sc.nextLine();

//		// 1)
//		switch (grade) {
//			case "A" : 
//				System.out.println("우수 회원입니다.");
//				break;
//			case "a" :
//				System.out.println("우수 회원입니다.");
//				break;
//			case "B" :
//				System.out.println("일반 회원입니다.");
//				break;
//			case "b" :
//				System.out.println("일반 회원입니다.");
//				break;
//			default :
//				System.out.println("손님입니다.");
//				break;
//		}

//		// 2)
//		switch (grade) {
//			case "A" :
//			case "a" :
//				System.out.println("우수 회원입니다.");
//				break;
//			case "B" :
//			case "b" :
//				System.out.println("일반 회원입니다.");
//				break;
//			default :
//				System.out.println("손님입니다.");
//				break;
//		}

		// 3)
		switch (grade) {
		case "A", "a":
			System.out.println("우수 회원입니다.");
			break;
		case "B", "b":
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			break;
		}

	}

}
