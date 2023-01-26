package sec02;

public class D0713_02_2차원배열1 {

	public static void main(String[] args) {

		// 1차원 배열
		// 타입[] 배열이름 = new 타입[배열길이];

		// 2차원 배열
		// 타입[][] 배열이름 = new 타입[행][열];
		// int[][] arr = new int[2][3];

		// 열0 열1 열2
		// 행0 ㅁ ㅁ ㅁ
		// 행1 ㅁ ㅁ ㅁ

		// int[][] arr = new int[2][3];

//		int[][] arr = {{1, 2, 3}, {4, 5, 6}};

//		System.out.print(arr[0][0] + "\t");	// 1
//		System.out.print(arr[0][1] + "\t");	// 2
//		System.out.println(arr[0][2]);		// 3
//		System.out.print(arr[1][0] + "\t");	// 4
//		System.out.print(arr[1][1] + "\t");	// 5
//		System.out.print(arr[1][2]);		// 6

		// 배열 index 출력
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print("(" + i + ", " + j + ")" + "\t");
//			}
//			System.out.println();
//		}

		// 배열 안의 값 출력
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

//----------------------------------------------------------------------		

		// Q1) 4행 4열 2차원 배열 -> 출력
		// {10, 11, 12, 13}
		// {14, 15, 16, 17}
		// {18, 19, 20, 21}
		// {22, 23, 24, 25}

		// 1)
//		int[][] arr1 = {
//			{10, 11, 12, 13}, 
//			{14, 15, 16, 17},
//			{18, 19, 20, 21},
//			{22, 23, 24, 25}
//		};

		// 2)
		int[][] arr1 = new int[4][4];
		int a = 10;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				arr1[i][j] = a;
				a++;
			}
		}

		// Q1 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		// Q1-1) 출력문으로 출력하기
		// [console]
		// 15 + 23 = 38

		System.out.println(arr1[1][1] + " + " + arr1[3][1] + " = " + (arr1[1][1] + arr1[3][1]));

		// [console]
		// 18 + 25 = 43

		System.out.println(arr1[2][0] + " + " + arr1[3][3] + " = " + (arr1[2][0] + arr1[3][3]));

	}

}
