package sec02;

public class D0713_02_2�����迭1 {

	public static void main(String[] args) {

		// 1���� �迭
		// Ÿ��[] �迭�̸� = new Ÿ��[�迭����];

		// 2���� �迭
		// Ÿ��[][] �迭�̸� = new Ÿ��[��][��];
		// int[][] arr = new int[2][3];

		// ��0 ��1 ��2
		// ��0 �� �� ��
		// ��1 �� �� ��

		// int[][] arr = new int[2][3];

//		int[][] arr = {{1, 2, 3}, {4, 5, 6}};

//		System.out.print(arr[0][0] + "\t");	// 1
//		System.out.print(arr[0][1] + "\t");	// 2
//		System.out.println(arr[0][2]);		// 3
//		System.out.print(arr[1][0] + "\t");	// 4
//		System.out.print(arr[1][1] + "\t");	// 5
//		System.out.print(arr[1][2]);		// 6

		// �迭 index ���
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print("(" + i + ", " + j + ")" + "\t");
//			}
//			System.out.println();
//		}

		// �迭 ���� �� ���
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

//----------------------------------------------------------------------		

		// Q1) 4�� 4�� 2���� �迭 -> ���
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

		// Q1 ���
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		// Q1-1) ��¹����� ����ϱ�
		// [console]
		// 15 + 23 = 38

		System.out.println(arr1[1][1] + " + " + arr1[3][1] + " = " + (arr1[1][1] + arr1[3][1]));

		// [console]
		// 18 + 25 = 43

		System.out.println(arr1[2][0] + " + " + arr1[3][3] + " = " + (arr1[2][0] + arr1[3][3]));

	}

}
