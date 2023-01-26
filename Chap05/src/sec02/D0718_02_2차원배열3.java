package sec02;

public class D0718_02_2차원배열3 {

	public static void main(String[] args) {

		// 0 0 1 0 0
		// 0 2 3 4 0
		// 5 6 7 8 9
		// 0 10 11 12 0
		// 0 0 13 0 0

		int num = 1;
		int[][] arr = new int[5][5];
		int start = 2;
		int end = 3;

//		// 			2			3
//		for (int i = start; i < end; i++) {	// 0번째 행 2
//			arr[0][i] = num++;
//		}
//		// 			2		3		// s--, e++
//		for (int i = 1; i < 4; i++) {	// 1번째 행 1, 2, 3
//			arr[1][i] = num++;
//		}
//		// 			1		4		// s--, e++
//		for (int i = 0; i < 5; i++) {	// 2번째 행 0, 1, 2, 3, 4
//			arr[2][i] = num++;
//		}
//		// 			0		5		// s++, e--
//		for (int i = 1; i < 4; i++) {	// 3번째 행 1, 2, 3
//			arr[3][i] = num++;
//		}
//		// 			1		4		// s++, e--
//		for (int i = 2; i < 3; i++) {	// 4번째 행 2
//			arr[4][i] = num++;
//		}

		for (int a = 0; a < arr.length; a++) {
			for (int i = start; i < end; i++) {
				arr[a][i] = num++;
			}
			if (a < 2) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if(i == 0 || i == 4) {
//					if(j == 2) {
//						arr[i][j] = num++;
//					}
//				}else if(i == 1 || i == 3) {
//					if(j >= 1 && j <= 3) {
//						arr[i][j] = num++;
//					}
//				}else {
//					arr[i][j] = num++;
//				}
//			}
//		}

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
