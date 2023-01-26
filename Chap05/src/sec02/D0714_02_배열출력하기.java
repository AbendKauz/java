package sec02;

import java.util.Arrays;

public class D0714_02_배열출력하기 {

	public static void main(String[] args) {

		// 1. 배열 출력 -> for문으로
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// 2. 배열 출력 -> 향상된 for문 (foreach)
		// : 배열을 좀 더 쉽게 처리하기 위해 제공
		// 반복실행을 하기 위해 루프카운터 변수, 증감식을 사용X

		// 구조
		// for(타입 변수명 : 배열){
		// 실행문;
		// }

		// for문의 괄호()안에 배열에서 꺼낸 항목을 저장할 변수 선언, 콜론(:), 배열 나열
		// -> 배열의 개수만큼 반복하고 자동으로 for문을 나감

//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		// 3. 배열 출력 -> Arrays의 toString() method
		// Arrays.toString(배열변수명);
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(Arrays.toString(arr));

		// 2차원 배열 출력
//		int[][] arr = {
//				{1, 2, 3, 4, 5},
//				{6, 7, 8, 9, 10},
//				{11, 12, 13, 14, 15},
//				{16, 17, 18, 19, 20}
//		};

//		// 1. 중첩 for문으로 출력
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// 2차원 배열 : 반복문으로 넣기(ㅂㄷㅂㄷ)
//		int[][] arr = new int[4][5];
//		int num = 1;
//		for(int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// 2. 배열 출력 : 향상된 for문(foreach)
//		System.out.println(arr);	// 배열이름을 출력하면 -> 배열의 주소가 나옴
//									// arr이 2차원 배열 [[I@1ddc4ec2
//									//					타입@주소(16진수로 표기)
//		System.out.println(arr[0]);	// [I@1ddc4ec2
//		for (int[] a : arr) {	// 타입[] 변수1 : 배열
//			for (int b : a) {	// 변수2 : 변수1
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// 3. 배열 출력 : Arrays의 toString method
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}

		// 2차원 배열 -> 한번에 전부 출력 : Arrays.deepToString method
//		System.out.println(Arrays.deepToString(arr));

		// Q1) 배열은 new 연산자로 생성해서
		// 값을 반복문으로 넣어준 후 출력
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

//		int num = 1;
//		int[][] arr = new int[5][5];

		// 입력 ex)
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[j][i] = num;	// 0,0	1,0 순으로 값 넣기
//				num += arr.length;	// 값을 length(5)씩 증가
//			}
//			num = num - (arr.length * arr[i].length) + 1;	// 증가된 num을 원상복귀 + 1
//		}

		// 입력 1.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}

		// 입력 2.
//		for (int[] a : arr) {
//			for (int b : a) {
//				b = num;
//				num++;
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// 출력 1.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

//		// 출력 2.
//		for (int[] a : arr) {
//			for (int b : a){
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// 출력 3.
//		System.out.println(Arrays.deepToString(arr));

		// Q2) 배열은 new 연산자로 생성해서
		// 값을 반복문으로 넣어준 후 출력
		// 21 26 31 36 41
		// 22 27 32 37 42
		// 23 28 33 38 43
		// 24 29 34 39 44
		// 25 30 35 40 45

//		int num = 21;
//		int[][] arr = new int[5][5];

		// 1. 내맘대로 방식(?!)
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;		// 넣는 순서는 고정
//				num += arr.length;		// 값을 length(5)씩 증가
//			}
//			num = num - (arr.length * arr[i].length) + 1;	// 증가된 num을 원상복귀 + 1
//		}

		// 2.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}

		// 출력
//		for (int[] a : arr) {
//			for (int b : a){
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// 25 24 23 22 21
		// 30 29 28 27 26
		// 35 34 33 32 31
		// 40 39 38 37 36
		// 45 44 43 42 41

//		int[][] arr = new int[5][5];
//		int num = 21;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr[i].length - 1; j >= 0; j--) {
//				arr[i][j] = num++;
//			}
//		}
//		int[][] arr2 = {{1,2,3},{4,5,6}};
//		printArray(arr2);
//		printArray(arr);

		// 41 36 31 26 21
		// 42 37 32 27 22
		// 43 38 33 28 23
		// 44 39 34 29 24
		// 45 40 35 30 25

//		int[][] arr = new int[5][5];
//		int num = 21;
//		for (int i = arr.length - 1; i >= 0 ; i--) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[j][i] = num++;
//			}
//		}
//		printArray(arr);

		// 21 22 23 24 25
		// 30 29 28 27 26
		// 31 32 33 34 35
		// 40 39 38 37 36
		// 41 42 43 44 45

		int[][] arr = new int[5][5];
		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}
			} else {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = num++;
				}
			}
		}
		printArray(arr);

	}

	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
