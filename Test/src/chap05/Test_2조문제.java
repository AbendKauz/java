package chap05;

import java.util.Scanner;

public class Test_2������ {

	public static void main(String[] args) {

		// 1. int Ÿ���� ���� �ϳ��� �Է¹ް� 1���� �Է¹��� ������
		// ������ ���� �������� ����ϴ� ���
		// ex) �Էµ� ������ 10�� ���, ��°� : 220
		// 1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 10)

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int num = s.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <= i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println("������ : " + sum);

		// 2. for���� printf�� �̿��Ͽ� �׸� ���
		// *
		// **
		// ***
		// ****
		// ***
		// **
		// *

//		int num = 1;
//		for(int i = 0; i < 7; i++) {
//			for(int j = 0; j < num; j++) {
//				System.out.printf("*");
//			}
//			if(i <= 2) {
//				num++;
//			}else {
//				num--;
//			}
//			System.out.printf("\n");
//		}

		// 3. 50���� ���� �ڿ��� �߿��� 3 �Ǵ� 7�� ����� ��� ���ϸ�?

//		int sum = 0;
//		for(int i = 1; i < 50; i++) {
//			if(i % 3 == 0 || i % 7 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

		// 4. ���̽� ���� �����
		// 1�� ������ "����", 0�� ������ "����" ���
		// 1, 0 �̿��� ��ȣ�� �Է��ϸ� "�߸��� ��ȣ�Դϴ�" ��� �� �ʱ�ȭ������ �̵�
		// 1~4�� �ϳ��� ��ȣ �Է¹ޱ�
		// 1~4 �̿��� ��ȣ�� �Է��ϸ� "�߸��� ��ȣ�Դϴ�" ��� �� �ʱ�ȭ������ �̵�

		// 1~4�� �̵�(1~4���� ������ ���ڸ�ŭ ����)
		// ���� �� ǥ��
		// 1~4���� ���� ��ġ(��) ���

		// 1~4�� �ϳ��� 30 �̻��� �Ǹ� ����
		// (do-while�� ���)
		// ���� ���� 30�� �� ��ȣ ���
		// ������ ������ ��ȣ�� ���� ���� ���� ��ȣ�� �� ��
		// ������ ��ȣ�� ���� ���Դٸ� "������ ��ȣ�� ����߽��ϴ�!" ���
		// ������ ��ȣ�� ���� ������ ���ߴٸ� "������ ��ȣ�� ������� ���߽��ϴ�..." ���
		// ��� ��� �� �ʱ�ȭ������ �̵�

//		Scanner s = new Scanner(System.in);
//		while(true) {
//			System.out.print("1�� ������ ����, 0�� ������ �����մϴ� >> ");
//			String a = s.nextLine();
//			if(a.equals("1")) {
//				System.out.print("\n1 ~ 4�� �� ��ȣ�� �Է��ϼ���. >> ");
//				String select = s.nextLine();
//				if(!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4")) {
//					System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.\n�ʱ�ȭ������ ���ư��ϴ�.\n");
//				}else {
//					System.out.println("\n���̽��� �����մϴ�!\n");
//					int a1 = 0;
//					int a2 = 0;
//					int a3 = 0;
//					int a4 = 0;
//					int win = 0;
//					int turn = 1;
//					
//					do {
//						System.out.println("[" + turn + "��]");
//						a1 += (int)(Math.random() * 10) + 1;
//						a2 += (int)(Math.random() * 10) + 1;
//						a3 += (int)(Math.random() * 10) + 1;
//						a4 += (int)(Math.random() * 10) + 1;
//						
//						System.out.println("1 >> " + a1);
//						System.out.println("2 >> " + a2);
//						System.out.println("3 >> " + a3);
//						System.out.println("4 >> " + a4);
//						System.out.println();
//						if(a1 >= 30 || a2 >= 30 || a3 >= 30 || a4 >= 30) {
//							System.out.println("���̽��� ����Ǿ����ϴ�!");
//							if(a1 >= 30) {
//								win = 1;
//								System.out.println("���� ���� ���� ��ȣ�� " + win +"�� �Դϴ�!!!");
//								break;
//							}else if(a2 >= 30) {
//								win = 2;
//								System.out.println("���� ���� ���� ��ȣ�� " + win +"�� �Դϴ�!!!");
//								break;
//							}else if(a3 >= 30) {
//								win = 3;
//								System.out.println("���� ���� ���� ��ȣ�� " + win +"�� �Դϴ�!!!");
//								break;
//							}else {
//								win = 4;
//								System.out.println("���� ���� ���� ��ȣ�� " + win +"�� �Դϴ�!!!");
//								break;
//							}
//						}
//						turn++;
//					}while(a1 <= 30 || a2 <= 30 || a3 <= 30 || a4 <= 30);
//					
//					System.out.println("\n����� ������ ��ȣ�� " + select + "�� �Դϴ�.");
//					if(select.equals(win)) {
//						System.out.println("������ ��ȣ�� ����߽��ϴ�!!!");
//					}else {
//						System.out.println("������ ��ȣ�� ������� ���߽��ϴ�...");
//					}
//					System.out.println("==================================");
//				}
//				
//			}else if(a.equals("0")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}else {
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}

	}

}
