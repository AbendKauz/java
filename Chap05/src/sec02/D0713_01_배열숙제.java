package sec02;

import java.util.Scanner;

public class D0713_01_�迭���� {

	public static void main(String[] args) {

		// Q1) 10, 20, 30, 40, 50, 60
		// index�� 3�� ���� ������� ����
		// [console]
		// 10, 20, 30, 50, 60

//		int[] arr = {10, 20, 30, 40, 50, 60};
//		for (int i = 0; i < arr.length; i++) {
//			if(i != 3) {
//				if(i == 5) {
//					System.out.print(arr[i]);
//				}else {
//					System.out.print(arr[i] + ", ");
//				}
//			}
//		}

		// Q2) index�� ��ȣ�� 2�� �Է¹޾�, �� ���� ���� �ٲ㺸��
		// {10, 20, 30, 40, 50, 60}
		// {10, 20, 50, 40, 30, 60}
		// [console]
		// 10, 20, 50, 40, 30, 60

//		int[] arr1 = {10, 20, 30, 40, 50, 60};
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��ȣ 1 �Է� : ");
//		int num1 = sc.nextInt();
//		System.out.print("��ȣ 2 �Է� : ");
//		int num2 = sc.nextInt();
//		
//		int temp = arr1[num1];
//		arr1[num1] = arr1[num2];
//		arr1[num2] = temp;
//		
//		for (int i = 0; i < arr1.length; i++) {
//			if(i == 5) {
//				System.out.print(arr1[i]);
//			}else {
//				System.out.print(arr1[i] + ", ");
//			}
//		}

		// Q3) �迭�� �� �߿��� �ִ밪�� �ּҰ��� ���ϱ�
		// {75, 65, 48, 71, 35, 26, 94, 81}
		// [console]
		// �ִ밪 : 94, �ּҰ� : 26

//		int[] arr2 = {75, 65, 48, 71, 35, 26, 94, 81};
//		int max = arr2[0];
//		int min = arr2[0];
//		for (int i = 1; i < arr2.length; i++) {
//			if(max < arr2[i]) {
//				max = arr2[i];
//			}else if(min > arr2[i]) {
//				min = arr2[i];
//			}
//		}
//		System.out.println("�ִ밪 : " + max + ", �ּҰ� : " + min);

		// Q4) �迭�� ���̰� 10�� int �迭 new �����ڸ� �̿��ؼ� ����
		// �ݺ����� ���ؼ� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100��
		// �迭�� ���� ����
		// �迭�� ���� ���� ���

//		int[] arr3 = new int[10];
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] = (i + 1) * 10;
//		}
//		for (int i = 0; i < arr3.length; i++) {
//			if(i == arr3.length-1) {
//				System.out.print(arr3[i]);
//			}else {
//				System.out.print(arr3[i] + ", ");
//			}
//		}

		// Q5) char �迭�� �����Ͽ� ���ĺ� A~Z���� ���� �� ���(���ĺ��� 26��)
		// (new �����ڸ� Ȱ���Ͽ� �迭 ����)
		// [console]
		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

		char[] arr5 = new char[26];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = (char) (65 + i);
			System.out.print(arr5[i] + " ");
		}
		System.out.println();

		// Q6) 5������ ���� �迭�� �������� ���
		// [console]
		// Z Y X W V U T S R Q P O N M L K J I H G F E D C B A

		for (int i = arr5.length - 1; i >= 0; i--) {
			System.out.print(arr5[i] + " ");
		}

	}

}
