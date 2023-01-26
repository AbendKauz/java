package chap05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// Q2) �л� 3���� ����, ����, ���� ������ �Է¹޾�
		// �л��� ������ ���� �հ踦 �Ʒ��� ���� ���
		// (�迭�� ũ�� 4 * 4)

		// <console>
		// 1��° �л��� ���� : 95 100 88
		// 2��° �л��� ���� : 85 60 93
		// 3��° �л��� ���� : 66 99 88

		// ���� ���� ���� ����
		// 1�� 95 100 88 283
		// 2�� 85 60 93 238
		// 3�� 66 99 88 253
		// �հ� 246 259 269 774

		int[][] arr = new int[4][4];

		// ���1.

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("����, ����, ���� ������ ������ ���� �Է��ϼ���\n");
//		
//		for (int i = 0; i < arr.length - 1; i++) {			// �л�
//
//			System.out.print((i + 1) + "��° �л��� ���� : ");
//
//			for (int j = 0; j < arr[i].length - 1; j++) {	// ����
//				arr[i][j] = sc.nextInt();
//				arr[i][arr[arr.length - 1].length - 1] += arr[i][j];				// �ش� ������ �л��� ���� ������ ([i][3])
//				arr[arr.length - 1][j] += arr[i][j];								// �ش� ������ ���� ������ ([3][j])
//				arr[arr.length - 1][arr[arr.length - 1].length - 1] += arr[i][j];	// ��� ������ ������ ([3][3])
//			}
//		}
//		System.out.println("\n\t����\t����\t����\t����");	// �迭 ��ܿ� ���� ���� ���� ���� ���
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (i < arr.length - 1) {		// i���� 3 �̸��̸� �迭 ����ϱ� �� �� ���ʿ�
//				System.out.print((i + 1) + "��\t");	// i + 1�� ǥ��
//			}else {
//				System.out.print("�հ�\t");			// �� �Ʒ�(3,0)�� �հ� ���
//			}
//
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// ���2.

//		Scanner sc = new Scanner(System.in);
//		int kor = 0;
//		int eng = 0;
//		int mat = 0;
//		int[][] arr = new int[4][4];
//		String[] t = new String[5];
//		t[0] = " ";
//		t[1] = "����";
//		t[2] = "����";
//		t[3] = "����";
//		t[4] = "����";
//		String[] num = new String[4];
//		num[0] = "1��";
//		num[1] = "2��";
//		num[2] = "3��";
//		num[3] = "�հ�";
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			System.out.print(i + 1 + "��° �л��� ���� : ");
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

		// ���3.

		Scanner sc = new Scanner(System.in);

		// �л��� ���� ������ 3�� 3���� �־��ִ� for��
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print((i + 1) + "��° �л��� ���� : ");
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// ������ �հ�κ��� ����ؼ� �ִ� for��
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j]; // �л��� ���� ������
				arr[3][j] += arr[i][j]; // ������ �հ� ������
				arr[3][3] += arr[i][j]; // ���� �� �հ� ������
			}
		}

		System.out.println("\n\t����\t����\t����\t����"); // �迭 ��ܿ� ���� ���� ���� ���� ���

		for (int i = 0; i < arr.length; i++) {

			if (i < arr.length - 1) { // i���� 3 �̸��̸� �迭 ����ϱ� �� �� ���ʿ�
				System.out.print((i + 1) + "��\t"); // i + 1�� ǥ��
			} else {
				System.out.print("�հ�\t"); // �� �Ʒ�(3,0)�� �հ� ���
			}

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
