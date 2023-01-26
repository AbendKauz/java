package sec02;

import java.util.Scanner;

public class D0714_03_주말과제풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Q1)
		// 다이어트 프로그램 만들기

//		System.out.print("현재 몸무게 : ");
//		int weight1 = sc.nextInt();
//		System.out.print("목표 몸무게 : ");
//		int weight2 = sc.nextInt();
//		
//		int week = 1;
//		// 반복문
//		while(true) {
//			System.out.print(week + "주차 감량 몸무게 : ");
//			int weight3 = sc.nextInt();
//			weight1 -= weight3;
//			if(weight1 <= weight2) {
//				System.out.println(weight1 + "kg 목표 달성!! 다이어트 성공");
//				break;
//			}
//			week++;
//		}

		// Q2)
		// 주민등록번호 판별하기
		// 120101-3123456 -> 7번째 index에 있는 값을 가져와야 됨
		// charAt();

//		System.out.println("당신의 주민번호를 입력하세요 : ");
//		String a = sc.nextLine();
//		char gender = a.charAt(7);

		// 1. switch
//		switch(gender) {
//			case '1':
//				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
//				break;
//			
//			case '2':
//				System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
//				break;
//			
//			case '3':
//				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
//				break;
//			
//			case '4':
//				System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
//				break;
//				
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//		}

		// 2. if문
//		if(gender == '1') {
//			System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
//		}else if(gender == '2') {
//			System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
//		}else if(gender == '3') {
//			System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
//		}else if(gender == '4') {
//			System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}

		// 3. 다중if문
//		if(gender == '1' || gender == '2') {
//			System.out.print("당신은 2000년 이전에 출생한 ");
//			if(gender == '1') {
//				System.out.println("남자입니다.");
//			}else {
//				System.out.println("여자입니다.");
//			}
//		}else if(gender == '3' || gender == '4') {
//			System.out.print("당신은 2000년 이후에 출생한 ");
//			if(gender == '3') {
//				System.out.println("남자입니다.");
//			}else {
//				System.out.println("여자입니다.");
//			}
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}

		// Q3)
		// 369 게임 프로그램 만들기

//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();

		// 1. if문
//		
//		for(int i = 1; i <= num; i++) {
//			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("박수");
//			}else if(i % 10 == 5 ) {
//				System.out.println("점프");
//			}else {
//				System.out.println(i);
//			}
//		}

		// 2. switch문
		// 2.1 char
//		for(int i = 1; i <= num; i++) {
//			// 입력받은 숫자를 문자로 변환, 10 이상이면 뒷자리만 가져옴
//			char a = (i > 10) ? String.valueOf(i).charAt(1) : String.valueOf(i).charAt(0);
//			switch (a) {
//				case '3', '6', '9':
//					System.out.println("박수");
//					continue;
//				case '5':
//					System.out.println("점프");
//					continue;
//				default:
//					System.out.println(i);
//			}
//		}

		// 2.2 int
//		for(int i = 1; i <= num; i++) {
//			switch (i % 10) {
//			case 3, 6, 9:
//				System.out.println("박수");
//			continue;
//			case 5:
//				System.out.println("점프");
//				continue;
//			default:
//				System.out.println(i);
//			}
//		}

		// Q4)
		// 숫자 출력 프로그램

		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();

		// 1. if문
//		for(int i = 1; i <= num; i++) {
//			if(i % 2 == 0) {
//				System.out.print("-" + i + " ");
//			}else {
//				System.out.print(i + " ");
//			}
//		}

		// 2. switch문
//		for(int i = 1; i <= num; i++) {
//			switch(i % 2) {
//			case 1 :
//				System.out.print(i + " ");
//				break;
//			default :
//				System.out.print("-" + i + " ");
//			}
//		}

		// 3. while문
//		int i = 1;
//		while(i <= num) {
//			System.out.print( (i % 2 == 0) ? "-" + i + " " : i + " " );
//			i++;
//		}

	}

}
