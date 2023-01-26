package sec02;

import java.util.Arrays;

public class D0714_02_�迭����ϱ� {

	public static void main(String[] args) {

		// 1. �迭 ��� -> for������
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// 2. �迭 ��� -> ���� for�� (foreach)
		// : �迭�� �� �� ���� ó���ϱ� ���� ����
		// �ݺ������� �ϱ� ���� ����ī���� ����, �������� ���X

		// ����
		// for(Ÿ�� ������ : �迭){
		// ���๮;
		// }

		// for���� ��ȣ()�ȿ� �迭���� ���� �׸��� ������ ���� ����, �ݷ�(:), �迭 ����
		// -> �迭�� ������ŭ �ݺ��ϰ� �ڵ����� for���� ����

//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

		// 3. �迭 ��� -> Arrays�� toString() method
		// Arrays.toString(�迭������);
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		System.out.println(Arrays.toString(arr));

		// 2���� �迭 ���
//		int[][] arr = {
//				{1, 2, 3, 4, 5},
//				{6, 7, 8, 9, 10},
//				{11, 12, 13, 14, 15},
//				{16, 17, 18, 19, 20}
//		};

//		// 1. ��ø for������ ���
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// 2���� �迭 : �ݺ������� �ֱ�(��������)
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

		// 2. �迭 ��� : ���� for��(foreach)
//		System.out.println(arr);	// �迭�̸��� ����ϸ� -> �迭�� �ּҰ� ����
//									// arr�� 2���� �迭 [[I@1ddc4ec2
//									//					Ÿ��@�ּ�(16������ ǥ��)
//		System.out.println(arr[0]);	// [I@1ddc4ec2
//		for (int[] a : arr) {	// Ÿ��[] ����1 : �迭
//			for (int b : a) {	// ����2 : ����1
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// 3. �迭 ��� : Arrays�� toString method
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}

		// 2���� �迭 -> �ѹ��� ���� ��� : Arrays.deepToString method
//		System.out.println(Arrays.deepToString(arr));

		// Q1) �迭�� new �����ڷ� �����ؼ�
		// ���� �ݺ������� �־��� �� ���
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

//		int num = 1;
//		int[][] arr = new int[5][5];

		// �Է� ex)
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[j][i] = num;	// 0,0	1,0 ������ �� �ֱ�
//				num += arr.length;	// ���� length(5)�� ����
//			}
//			num = num - (arr.length * arr[i].length) + 1;	// ������ num�� ���󺹱� + 1
//		}

		// �Է� 1.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}

		// �Է� 2.
//		for (int[] a : arr) {
//			for (int b : a) {
//				b = num;
//				num++;
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// ��� 1.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

//		// ��� 2.
//		for (int[] a : arr) {
//			for (int b : a){
//				System.out.print(b + "\t");
//			}
//			System.out.println();
//		}

		// ��� 3.
//		System.out.println(Arrays.deepToString(arr));

		// Q2) �迭�� new �����ڷ� �����ؼ�
		// ���� �ݺ������� �־��� �� ���
		// 21 26 31 36 41
		// 22 27 32 37 42
		// 23 28 33 38 43
		// 24 29 34 39 44
		// 25 30 35 40 45

//		int num = 21;
//		int[][] arr = new int[5][5];

		// 1. ������� ���(?!)
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;		// �ִ� ������ ����
//				num += arr.length;		// ���� length(5)�� ����
//			}
//			num = num - (arr.length * arr[i].length) + 1;	// ������ num�� ���󺹱� + 1
//		}

		// 2.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}

		// ���
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
