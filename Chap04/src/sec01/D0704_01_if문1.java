package sec01;

import java.util.Scanner;

public class D0704_01_if��1 {

	public static void main(String[] args) {

		// int Ÿ���� ���� score�� �����ϰ� Ű����� ���� �Է¹����ÿ�.
		// ���� score�� 50 �̻��̸� "�հ��Դϴ�.", 50 �̸��̸� "������Դϴ�." ���
		// if�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();

//		if(score >= 50) {
//			System.out.println("�հ��Դϴ�.");
//		}
//		if(score < 50) {
//			System.out.println("������� ������.");
//		}

		// int Ÿ���� ���� score�� �����ϰ� Ű����� ���� �Է¹����ÿ�.
		// ���� score�� 90 �̻��̸� "A ���", 90 �̸��̸� "B ���" ���
		// if-else�� ���
		if (score >= 90) {
			System.out.println("������ 90�� ���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else {
			System.out.println("������ 90�� ���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}

	}

}
