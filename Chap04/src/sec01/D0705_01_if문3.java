package sec01;

import java.util.Scanner;

public class D0705_01_if��3 {

	public static void main(String[] args) {

		// 7000��¥�� ���ἱ����Ʈ�� �������� �� �����ؾ� �ϴ� �ݾ���
		// ����ϴ� ���α׷��� ��������.
		// ��, 8�� �̻� ���Žÿ��� 10% ������ �˴ϴ�.(if-else�� ���)
		// ��ǰ���� : x
		// ������ xxxxx�� �Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ���� : ");
		int num = sc.nextInt();

		// 1)
//		if(num >= 8) {
//			System.out.println("������ " + (num * (7000 - (7000 / 100 * 10))) + "�� �Դϴ�.");
//		}else {
//			System.out.println("������ " + (num * 7000) + "�� �Դϴ�.");
//		}

		// 2)
		int price = 7000;

		if (num >= 8) {
			System.out.println("������ " + ((num * price) - (int) (price / 0.1)) + "�� �Դϴ�.");
		} else {
			System.out.println("������ " + (num * price) + "�� �Դϴ�.");
		}

	}

}
