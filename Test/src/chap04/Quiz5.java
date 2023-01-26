package chap04;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		// ���ݱ��� ��� ������� Ȱ���Ͽ� ���� ���� �����

		// ���̽� ���� �����
		// 1�� ������ "����", 0�� ������ "����" ���
		// 1, 0 �̿��� ���ڸ� �Է��ϸ� "�߸��� ��ȣ�Դϴ�" ��� �� �ʱ�ȭ������ �̵�

		// 1~4���� �ϳ��� ��ȣ(��) �Է¹ޱ�
		// 1~4�� �̿��� ���ڸ� �Է��ϸ� "�߸��� ��ȣ�Դϴ�" ��� �� �ʱ�ȭ������ �̵�

		// 1~4��(��) �̵�(1~4���� ������ ���ڸ�ŭ ����)
		// ���� �� ǥ��
		// 1~4���� ���� ��ġ(��) ���

		// 1~4�� �ϳ��� 30 �̻��� �Ǹ� ����
		// (do-while�� ���)
		// ���� ���� 30�� �� ��ȣ ���
		// ������ ������ ��ȣ�� ���� ���� ���� ��ȣ�� �� ��
		// ������ ��ȣ�� ���� ���Դٸ� "������ ��ȣ�� ����߽��ϴ�!" ���
		// ������ ��ȣ�� ���� ������ ���ߴٸ� "������ ��ȣ�� ������� ���߽��ϴ�..." ���
		// ��� ��� �� �ʱ�ȭ������ �̵�

		// ���� ó������ : ���ÿ� 30�̻��� ��� ���� ���� ��ȣ�� ������µǴ� �κ� ���� �ʿ�
		// ex) 1,3,4 �� ���õ��� : 1�� ���
		// 2,4�� ���õ��� : 2�� ���

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("�����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��ϼ���.");
			System.out.print(">> ");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("������ �����մϴ�.");
				System.out.print("1~4�� �� ��ȣ�� �Է��ϼ��� >> ");
				int user = sc.nextInt();
				if (user > 4 || user < 1) {
					System.out.println("�߸��� ��ȣ�Դϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
					System.out.println("====================================");
					continue;
				} else {
					System.out.println();
					System.out.println("���̽��� �����մϴ�!");
					System.out.println();
				}

				int com1 = 0;
				int com2 = 0;
				int com3 = 0;
				int com4 = 0;

				int com = 0; // ��¹�ȣ ����
				int round = 0; // ���� �� �� ǥ��

				do {

					com1 += (int) (Math.random() * 10) + 1;
					com2 += (int) (Math.random() * 10) + 1;
					com3 += (int) (Math.random() * 10) + 1;
					com4 += (int) (Math.random() * 10) + 1;

					round++;
					System.out.println("[" + round + "��]");
					System.out.println("1 >> " + com1);
					System.out.println("2 >> " + com2);
					System.out.println("3 >> " + com3);
					System.out.println("4 >> " + com4);

					if (com1 >= 30 || com2 >= 30 || com3 >= 30 || com4 >= 30) {
						System.out.println("���̽��� ����Ǿ����ϴ�!");
						if (com1 >= 30) {
							System.out.println("���� ���� ���� ��ȣ�� 1���Դϴ�!");
							com = 1;
						} else if (com2 >= 30) {
							System.out.println("���� ���� ���� ��ȣ�� 2���Դϴ�!!");
							com = 2;
						} else if (com3 >= 30) {
							System.out.println("���� ���� ���� ��ȣ�� 3���Դϴ�!!!");
							com = 3;
						} else {
							System.out.println("���� ���� ���� ��ȣ�� 4���Դϴ�!!!!!");
							com = 4;
						}
					}

					System.out.println("");

				} while (com1 <= 30 && com2 <= 30 && com3 <= 30 && com4 <= 30);

				System.out.println("����� ������ ��ȣ�� " + user + "�� �Դϴ�.");

				if (user == com) {
					System.out.println("������ ��ȣ�� ����߽��ϴ�!");
				} else {
					System.out.println("������ ��ȣ�� ������� ���߽��ϴ�...");
				}
				System.out.println("====================================");

			} else if (a == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("====================================");
			}

		} // while

	}// main

}// class
