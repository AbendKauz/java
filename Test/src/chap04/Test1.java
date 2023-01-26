package chap04;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

//		Q1) 자바, 파이썬, 데이터 베이스 점수를 키보드로 입력받아
//	    java, python, database  라는 변수에 값을 저장하기.

		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int python = sc.nextInt();
		System.out.print("데이터베이스 점수 입력 : ");
		int database = sc.nextInt();

//	    3 과목의 합계와 평균을 출력해라.
		int sum = java + python + database;
		System.out.println("합계 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

//	    +  3 과목 중에 1 과목이라도 40점 이하라면 --> 재시험을 보세요. 를 출력해라
//	   [console]
//	   Java 점수 입력 : _______                   	10
//	   Python 점수 입력 : _______                 	10
//	   데이터베이스 점수 입력 : _______          		12
//	   합계 : ( 3 과목의 합)                           32
//	   평균 : ( 3 과목의 평균)                        	10.66666666666
//	   평가 등급 : ( )                                재시험을 보세요.
		if (java <= 40 || python <= 40 || database <= 40) {
			System.out.println("재시험을 보세요.");
		} else {
			if (avg >= 100 && avg <= 91) {
				System.out.println("평가 등급 : A등급");
			} else if (avg >= 90 && avg <= 81) {
				System.out.println("평가 등급 : B등급");
			} else if (avg >= 80 && avg <= 71) {
				System.out.println("평가 등급 : C등급");
			} else {
				System.out.println("평가 등급 : F등급");
			}
		}

	}

}
