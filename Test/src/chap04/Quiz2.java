package chap04;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// 주민등록번호 판별하기
		// 1. 주민등록번호를 입력받아 2000년대생 이전인지 이후인지와 성별 판별
		// ex) 120101-3123456 : 2000년대 이후의 남자입니다
		// (String 클래스의 charAt() 메소드 이용)
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 주민번호를 입력하세요 : ");
		String a = sc.nextLine();
		char b = a.charAt(7);
		switch (b) {
		case '1': {
			System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
			break;
		}
		case '2': {
			System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
			break;
		}
		case '3': {
			System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
			break;
		}
		case '4': {
			System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
			break;
		}
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
