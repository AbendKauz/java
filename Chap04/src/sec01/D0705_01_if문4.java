package sec01;

import java.util.Scanner;

public class D0705_01_if��4 {

	public static void main(String[] args) {

		// �� ������ ���� ������ intŸ���� ���� 3���� �����ϰ�
		// Ű����� ���� �Է� ��������.
		// �� �����̶� 6�� ������ ��� "���հ��Դϴ�!" ���
		// �� ������ 30�� �̻��̸� "�հ��Դϴ�!" ��� (if-else�� ���)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();

		int sum = kor + mat + eng;

		// 1)
//		if(kor <= 6 || mat <= 6 | eng <= 6 || sum < 30) {
//			System.out.println("���հ��Դϴ�!");
//		}else {
//			System.out.println("�հ��Դϴ�!");
//		}

		// 2)
		if (kor > 6 && mat > 6 && eng > 6 && sum >= 30) {
			System.out.println("�հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�!");
		}

		// 3)
//		if(kor <= 6 || mat <= 6 || eng <= 6) {
//			System.out.println("���հ��Դϴ�!");
//		}else {
//			if(sum >= 30) {
//				System.out.println("�հ��Դϴ�!");
//			}else {
//				System.out.println("���հ��Դϴ�!");
//			}
//		}

	}

}
