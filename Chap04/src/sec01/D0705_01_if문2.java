package sec01;

import java.util.Scanner;

public class D0705_01_if��2 {

	public static void main(String[] args) {

//		// int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է¹�������.
		// ���� num�� 2�� ����̸鼭 5�� ������ "2�� 5�� ����Դϴ�."
		// ��� ����ϴ� ���α׷��� ��������.(if�� ���)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		// 1)
		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("2�� 5�� ����Դϴ�.");
		} else {
			System.out.println("2�� 5�� ����� �ƴմϴ�.");
		}

//		// 2)
//		if(num % 2 == 0) {
//			if(num % 5 == 0) {
//				System.out.println("2�� 5�� ����Դϴ�.");
//			}else {
//				System.out.println("5�� ����� �ƴմϴ�.");
//			}
//		}else {
//			System.out.println("2�� ����� �ƴմϴ�.");
//		}

//		// 3)
//		System.out.println((num % 2 == 0) ? ((num % 5 == 0) ? "2�� 5�� ����Դϴ�" : "5�� ����� �ƴմϴ�." ) : "2�� ����� �ƴմϴ�.");

	}

}
