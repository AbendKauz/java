package sec03.exam11;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		// Student 객체배열 생성 -> 배열 크기는 3.
		// 키보드로 학생 정보를 입력받아 객체 배열에 데이터 저장하기

//		Student stu1 = new Student("홍길동", "20220123", 20, 40, 50, 60);
//		System.out.println(stu1);

		Student[] stuArr = new Student[3];
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("학생 등록>>1 || 모든 학생 조회>>2 || 특정 학생 조회>>3 || 프로그램 종료>>4");
			int select = sc.nextInt();

			if (select == 1) { // 학생 등록
				int i = 0;
				for (i = 0; i < stuArr.length; i++) {
					if (stuArr[i] == null) {
						System.out.print("이름 입력 : ");
						String name = sc.next();
						System.out.print("학번 입력 : ");
						String number = sc.next();
						System.out.print("나이 입력 : ");
						int age = sc.nextInt();
						System.out.print("Java 점수 입력 : ");
						int javaScore = sc.nextInt();
						System.out.print("Web 점수 입력 : ");
						int webScore = sc.nextInt();
						System.out.print("Python 점수 입력 : ");
						int pythonScore = sc.nextInt();
						stuArr[i] = new Student(name, number, age, javaScore, webScore, pythonScore);
						break;
					}
				}
				if (i >= stuArr.length) {
					System.out.println("등록할 수 있는 인원수를 초과하였습니다.");
				}
				System.out.println();
			} else if (select == 2) { // 모든 학생 정보 조회
				System.out.println("모든 학생 정보 조회 : ");
				for (int i = 0; i < stuArr.length; i++) {
					System.out.println(stuArr[i]);
				}
				System.out.println();
			} else if (select == 3) { // 특정 학생 정보 조회
				System.out.println("특정 학생 정보 조회 : ");
				String name = sc.next();
				int i = 0;
//				for (i = 0; i < stuArr.length; i++) {
//					if(stuArr[i] != null) {
//						if(stuArr[i].getName().equals(name)) {
//							System.out.println(stuArr[i]);
//							break;
//						}
//					}
//				}
//				if(i > stuArr.length) {
//					System.out.println(name + "의 정보가 없습니다.");
//				}
				for (i = 0; i < stuArr.length; i++) {
					if (stuArr[i] == null) {
						continue;
					}
					if (stuArr[i].getName().equals(name)) {
						break;
					}
				}
				if (i < stuArr.length) {
					System.out.println(stuArr[i]);
				} else {
					System.out.println(name + "의 정보가 없습니다.");
				}
				System.out.println();
			} else if (select == 4) { // 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else { // 1 ~ 4가 아닌 숫자 입력 시
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

}
