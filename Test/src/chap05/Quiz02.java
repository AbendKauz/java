package chap05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// Q2) 학생 3명의 국어, 영어, 수학 점수를 입력받아
		// 학생별 총점과 과목별 합계를 아래와 같이 출력
		// (배열의 크기 4 * 4)

		// <console>
		// 1번째 학생의 점수 : 95 100 88
		// 2번째 학생의 점수 : 85 60 93
		// 3번째 학생의 점수 : 66 99 88

		// 국어 영어 수학 총점
		// 1번 95 100 88 283
		// 2번 85 60 93 238
		// 3번 66 99 88 253
		// 합계 246 259 269 774

		int[][] arr = new int[4][4];

		// 방법1.

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("국어, 영어, 수학 점수를 순서에 따라 입력하세요\n");
//		
//		for (int i = 0; i < arr.length - 1; i++) {			// 학생
//
//			System.out.print((i + 1) + "번째 학생의 점수 : ");
//
//			for (int j = 0; j < arr[i].length - 1; j++) {	// 과목
//				arr[i][j] = sc.nextInt();
//				arr[i][arr[arr.length - 1].length - 1] += arr[i][j];				// 해당 번지의 학생의 총점 누적합 ([i][3])
//				arr[arr.length - 1][j] += arr[i][j];								// 해당 과목의 총점 누적합 ([3][j])
//				arr[arr.length - 1][arr[arr.length - 1].length - 1] += arr[i][j];	// 모든 총점의 누적합 ([3][3])
//			}
//		}
//		System.out.println("\n\t국어\t영어\t수학\t총점");	// 배열 상단에 국어 영어 수학 총점 출력
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (i < arr.length - 1) {		// i값이 3 미만이면 배열 출력하기 전 맨 왼쪽에
//				System.out.print((i + 1) + "번\t");	// i + 1번 표시
//			}else {
//				System.out.print("합계\t");			// 맨 아래(3,0)에 합계 출력
//			}
//
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// 방법2.

//		Scanner sc = new Scanner(System.in);
//		int kor = 0;
//		int eng = 0;
//		int mat = 0;
//		int[][] arr = new int[4][4];
//		String[] t = new String[5];
//		t[0] = " ";
//		t[1] = "국어";
//		t[2] = "영어";
//		t[3] = "수학";
//		t[4] = "총점";
//		String[] num = new String[4];
//		num[0] = "1번";
//		num[1] = "2번";
//		num[2] = "3번";
//		num[3] = "합계";
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			System.out.print(i + 1 + "번째 학생의 점수 : ");
//			int sum = 0;
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][j] = sc.nextInt();
//				sum += arr[i][j];
//			}
//			kor += arr[i][0];
//			eng += arr[i][1];
//			mat += arr[i][2];
//			arr[i][3] = sum;
//			arr[3][0] = kor;
//			arr[3][1] = eng;
//			arr[3][2] = mat;
//			arr[3][3] = kor + eng + mat;
//		}
//	
//		for (int i = 0; i < t.length; i++) {
//			System.out.print(t[i] + "\t");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(j == 0) {
//					System.out.print(num[i] + "\t");
//				}
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// 방법3.

		Scanner sc = new Scanner(System.in);

		// 학생의 과목별 점수를 3행 3열에 넣어주는 for문
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print((i + 1) + "번째 학생의 점수 : ");
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 총점과 합계부분을 계산해서 넣는 for문
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j]; // 학생의 총점 누적합
				arr[3][j] += arr[i][j]; // 과목의 합계 누적합
				arr[3][3] += arr[i][j]; // 총점 및 합계 누적합
			}
		}

		System.out.println("\n\t국어\t영어\t수학\t총점"); // 배열 상단에 국어 영어 수학 총점 출력

		for (int i = 0; i < arr.length; i++) {

			if (i < arr.length - 1) { // i값이 3 미만이면 배열 출력하기 전 맨 왼쪽에
				System.out.print((i + 1) + "번\t"); // i + 1번 표시
			} else {
				System.out.print("합계\t"); // 맨 아래(3,0)에 합계 출력
			}

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
