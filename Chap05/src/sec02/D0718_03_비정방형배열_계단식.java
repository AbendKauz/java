package sec02;

import java.util.Iterator;

public class D0718_03_비정방형배열_계단식 {

	public static void main(String[] args) {

		// 정방형 배열 -> 각 행의 열 개수가 모두 동일한 배열을 말함
		// 비정방형 배열 -> 행마다 열의 개수가 서로 다른 배열을 말함
		// (계단식 배열)

//		int[][] arr = new int[3][];
//		arr[0] = new int[5];
//		arr[1] = new int[2];
//		arr[2] = new int[4];
//		
//		int a = 1;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = a++;
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println(arr.length);		// 3
//		System.out.println(arr[0].length);	// 5
//		System.out.println(arr[1].length);	// 2
//		System.out.println(arr[2].length);	// 4
//		
//		System.out.println(arr[1][0]);	// 6
//		System.out.println(arr[2][1]);	// 9

		// 10 11 12
		// 20 21
		// 30 31 32
		// 40 41 42 43

//		int[][] arr = new int[4][];
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		arr[3] = new int[4];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i + 1) * 10 + j;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

}
