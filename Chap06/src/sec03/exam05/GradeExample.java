package sec03.exam05;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {

		// 3과목의 점수를 입력받아 Grade 객체 생성
		// (직접 선언한 생성자로 객체를 생성)
		// 만든 toString()을 통해 모든 필드의 값 출력
		// 만든 메소드를 통해 평균값 출력

		Scanner sc = new Scanner(System.in);

		// 키보드로 점수를 먼저 입력받기
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("과학 점수 : ");
		int science = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();

		System.out.println();

		// 객체 생성
		Grade grade = new Grade(math, science, english); // 객체 생성

		// toString() 사용
//		System.out.println(grade.toString());
		System.out.println(grade.toString());

		// average() 사용
//		System.out.println("평균은 " + grade.average(grade.math, grade.science, grade.english) + "점 입니다.");
		System.out.println("평균은 " + grade.average() + "점 입니다.");

	}

}
