package sec01.exam27;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// �������� ��ȭ�Ͻðڽ��ϱ�?(Y/N)
		// Y�� �ԷµǸ� ��ȭ ���� / N �Է½� "������ �̿��ϼ���"
		// Ȯ�� 3% -> ������ ��ȭ�� �����߽��ϴ�.
		// Ȯ�� 17% -> ������ ��ȭ�� �����߽��ϴ�. �������� �����˴ϴ�.
		// Ȯ�� ������ -> ������ ��ȭ�� �����߽��ϴ�. �������� �ı��Ǿ����ϴ�.

		Scanner s = new Scanner(System.in);
		System.out.print("�������� ��ȭ�Ͻðڽ��ϱ�? (Y/N) : ");
		String a = s.next();

		if (a.toUpperCase().equals("Y")) {
			int num = (int) (Math.random() * 100) + 1;
			if (num <= 3) {
				System.out.println("������ ��ȭ�� �����߽��ϴ�.");
			} else if (num <= 20) {
				System.out.println("������ ��ȭ�� �����߽��ϴ�. �������� �����˴ϴ�.");
			} else {
				System.out.println("������ ��ȭ�� �����߽��ϴ�. �������� �ı��Ǿ����ϴ�.");
			}
		} else if (a.toUpperCase().equals("N")) {
			System.out.println("������ �̿��ϼ���.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
