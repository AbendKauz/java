package chap11;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 이름을 입력하세요 : 예) 홍길동
		// 학교 이름을 입력하세요 : 예) 제일중학교
		// 총 3명분의 이름을 입력받기 -> 반복문 활용(변수 6개 활용)

		// 예) 이름이 홍길동이고 제일중학교이면
		// 홍길동 학생은 중학생입니다.
		// 예) 이름이 장동건이고 광주고등학교이면
		// 장동건 학생은 고등학생입니다.
		// 예) 이름이 고소영이고 광주대학교이면
		// 고소영 학생은 대학생입니다.
		// 중, 고, 대학생

		Scanner s = new Scanner(System.in);
		String[][] strArr = new String[3][2];
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				if (j == 0) {
					System.out.print("이름을 입력하세요 : ");
					strArr[i][j] = s.next();
				} else if (j == 1) {
					System.out.print("학교이름을 입력하세요 : ");
					strArr[i][j] = s.next();
				}
			}
		}

		System.out.println();

		for (int i = 0; i < strArr.length; i++) {

			switch (strArr[i][1].charAt(2)) {
			case '중':
				System.out.println(strArr[i][0] + "학생은 중학생 입니다.");
				break;
			case '고':
				System.out.println(strArr[i][0] + "학생은 고등학생 입니다.");
				break;
			case '대':
				System.out.println(strArr[i][0] + "학생은 대학생 입니다.");
				break;
			}

//			for (int j = 0; j < strArr[i][1].length(); j++) {
//				switch (strArr[i][1].charAt(j)) {
//				case '중':
//					System.out.println(strArr[i][0] + "학생은 중학생 입니다.");
//					break;
//				case '고':
//					System.out.println(strArr[i][0] + "학생은 고등학생 입니다.");
//					break;
//				case '대':
//					System.out.println(strArr[i][0] + "학생은 대학생 입니다.");
//					break;
//				default:
//					break;
//				}
//			}

//			switch (strArr[i][1].substring(strArr[i][1].length() - 3, strArr[i][1].length())) {
//			case "중학교":
//				System.out.println(strArr[i][0] + "학생은 중학생 입니다.");
//				break;
//			case "등학교":
//				System.out.println(strArr[i][0] + "학생은 고등학생 입니다.");
//				break;
//			case "대학교":
//				System.out.println(strArr[i][0] + "학생은 대학생 입니다.");
//				break;
//			default:
//				break;
//			}

		}

	}

}
