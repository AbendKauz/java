package chap05;

import java.util.Iterator;

public class Quiz01 {

	public static void main(String[] args) {

		// Q1) 3�� 3���� �迭 �ΰ��� �����ϰ� �Ʒ��� ���� ���� ����,
		// �� �迭�� ���� ���Ͽ� �ٸ� �迭�� ���� �� �� �迭�� ���

		// <console>
		// ù��° �迭 ��
		// 1 2 3
		// 4 5 6
		// 7 8 9

		// �ι�° �迭 ��
		// 9 6 3
		// 8 5 2
		// 7 4 1

		// �� �迭�� ��
		// 10 8 6
		// 12 10 8
		// 14 12 10

		// 1.
//		int[][] a = new int[3][3];
//		int[][] b = new int[3][3];
//		int aa = 1;
//		int bb = 9;
//		
//		System.out.println("ù��° �迭 ��");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = aa++;
//				System.out.print(a[i][j] + "\t");
//				b[j][i] = bb--;
//			}
//			System.out.println();
//		}
//		
//		System.out.println("�ι�° �迭 ��");
//		for (int i = 0; i < b.length; i++) {
//			for (int j = 0; j < b[i].length; j++) {
//				System.out.print(b[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("�� �迭�� ��");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + b[i][j] + "\t");
//			}
//			System.out.println();
//		}
//
		// 2.
//		int[][] arr1 = new int[3][3];
//		int[][] arr2 = new int[3][3];
//		int[][] sumArr = new int[3][3];
//		
//		int cnt1 = 1;
//		int cnt2 = 9;
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				arr1[i][j] = cnt1++;
//				arr2[j][i] = cnt2--;
//			}
//		}
//		
//		for (int i = 0; i < sumArr.length; i++) {
//			for (int j = 0; j < sumArr[i].length; j++) {
//				sumArr[i][j] = arr1[i][j] + arr2[i][j];
//			}
//		}
//		
//		System.out.println("ù��° �迭 ��");
//		printArray(arr1);
//		
//		System.out.println("�ι�° �迭 ��");
//		printArray(arr2);
//		
//		System.out.println("�� �迭�� ��");
//		printArray(sumArr);
//		
	}

//	private static void printArray(int[][] arr1) {
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print(arr1[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	}

}
