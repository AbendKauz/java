package chap04;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// �ֹε�Ϲ�ȣ �Ǻ��ϱ�
		// 1. �ֹε�Ϲ�ȣ�� �Է¹޾� 2000���� �������� ���������� ���� �Ǻ�
		// ex) 120101-3123456 : 2000��� ������ �����Դϴ�
		// (String Ŭ������ charAt() �޼ҵ� �̿�)
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ��� : ");
		String a = sc.nextLine();
		char b = a.charAt(7);
		switch (b) {
		case '1': {
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		}
		case '2': {
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		}
		case '3': {
			System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
			break;
		}
		case '4': {
			System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
			break;
		}
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

}
