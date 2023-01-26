package sec01;

import java.util.Scanner;

public class D0705_01_if문6 {

    public static void main(String[] args) {

	// int 타입의 변수 score를 선언하고 키보드로 값을 입력받으세요
	// 아래와 같은 실행결과가 나오도록 프로그램을 만들어보세요
	// (if else if- else문 사용)

	// <등급기준>
	// 91~100이면 A등급
	// 81~90이면 B등급
	// 71~80이면 C등급
	// 70이하면 F등급

	Scanner sc = new Scanner(System.in);
	System.out.print("점수 입력 : ");
	int score = sc.nextInt();

	// 1)
//		if(score >= 91 && score <= 100) {
//			System.out.println("점수가 91~100 입니다.\n등급은 A입니다.");
//		}else if(score >= 81) {
//			System.out.println("점수가 81~90 입니다.\n등급은 B입니다.");
//		}else if(score >= 71) {
//			System.out.println("점수가 71~80 입니다.\n등급은 C입니다.");
//		}else {
//			System.out.println("점수가 70이하 입니다.\n등급은 F입니다.");
//		}

	// 2)
//		if(score > 90 && score <= 100) {
//			System.out.println("점수가 91~100 입니다.");
//			System.out.println("등급은 A입니다.");
//		}else if(score > 80) {
//			System.out.println("점수가 81~90 입니다.");
//			System.out.println("등급은 B입니다.");
//		}else if(score > 70) {
//			System.out.println("점수가 71~80 입니다.");
//			System.out.println("등급은 C입니다.");
//		}else {
//			System.out.println("점수가 70이하 입니다.");
//			System.out.println("등급은 F입니다.");
//		}

	// 3)
	if (score <= 100 && score >= 91) {
	    System.out.println("점수가 91~100 입니다.");
	    System.out.println("등급은 A입니다.");
	} else if (score <= 90 && score >= 81) {
	    System.out.println("점수가 81~90 입니다.");
	    System.out.println("등급은 B입니다.");
	} else if (score <= 80 && score >= 71) {
	    System.out.println("점수가 71~80 입니다.");
	    System.out.println("등급은 C입니다.");
	} else if (score <= 70 && score >= 0) {
	    System.out.println("점수가 70이하 입니다.");
	    System.out.println("등급은 F입니다.");
	} else {
	    System.out.println("잘못된 값을 입력하셨습니다.");
	}

	// 4)
//		if(score >= 0 && score <= 100) {
//			if(score >= 91) {
//				System.out.println("점수가 91~100 입니다.");
//				System.out.println("등급은 A입니다.");
//			}else if(score >= 81) {
//				System.out.println("점수가 81~90 입니다.");
//				System.out.println("등급은 B입니다.");
//			}else if(score >= 71) {
//				System.out.println("점수가 71~80 입니다.");
//				System.out.println("등급은 C입니다.");
//			}else{
//				System.out.println("점수가 70이하 입니다.");
//				System.out.println("등급은 F입니다.");
//			}
//		}else {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//		}

	// 5) (삼항연산자 사용)
//		System.out.println((score > 90 && score <= 100) ? "점수가 91~100입니다.\n등급은 A입니다." : ((score > 80) ? "점수가 81~90입니다.\n등급은 B입니다." : ((score > 70) ? "점수가 71~80입니다.\n등급은 C입니다" : "점수가 70이하입니다.\n등급은 F입니다.")));

    }

}
