package sec03.exam11;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {

		// Student 객체배열 생성 -> 배열 크기는 3.
		// 키보드로 학생 정보를 입력받아 객체 배열에 데이터 저장하기

//		Student stu1 = new Student("홍길동", "20220123", 20, 40, 50, 60);
//		System.out.println(stu1);

		Student[] stuArr = new Student[3];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		while (true) {

			System.out.println("학생 등록>>1 || 모든 학생 조회>>2 || 특정 학생 조회>>3 || 프로그램 종료>>4");
			int num = sc.nextInt();

			if (num == 1) { // 학생 등록
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("학번 입력 : ");
				String number = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("Java 점수 입력 : ");
				int java = sc.nextInt();
				System.out.print("Web 점수 입력 : ");
				int web = sc.nextInt();
				System.out.print("Python 점수 입력 : ");
				int python = sc.nextInt();

				// 각 키보드로 입력받은 값들을 이용해서 객체를 만들고 -> 객체 배열에 넣기
				stuArr[cnt++] = new Student(name, number, age, java, web, python);
				System.out.println();
			} else if (num == 2) { // 모든 학생 정보 조회
				System.out.println("모든 학생 정보 조회 : ");
				for (int i = 0; i < stuArr.length; i++) {
					System.out.println(stuArr[i]);
				}
				System.out.println();
			} else if (num == 3) { // 특정 학생 정보 조회
				System.out.println("특정 학생 정보 조회 : ");
				String name = sc.next();
				int arrNum = 0;
				boolean nameChk = false;
				for (int i = 0; i < cnt; i++) {
					if (stuArr[i].getName().equals(name)) {
						nameChk = true; // 특정학생 이름이 있음
						arrNum = i;
						break;
					} else {
						nameChk = false; // 특정학생 이름이 없음
					}
				}
				if (nameChk) {
					System.out.println(stuArr[arrNum]);
				} else {
					System.out.println(name + "의 정보가 없습니다.");
				}
				System.out.println();
			} else if (num == 4) { // 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else { // 1 ~ 4가 아닌 숫자 입력 시
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

}
