package chap05;

import java.util.Scanner;

public class Test_4������ {

	public static void main(String[] args) {

		// 1. id�� pw ���� �� ������ id�� pw �Է� ���� ��
		// �ֻ���(����ü, 2��)�� �������� �� ��
		// (������ id : java, pw : dd)
		// �� �� id�� �α��� ���� : �������� �ʴ� id
		// ���� 2�� ������ �����,
		// 12�� ������ �뼺��,
		// 4 ������ ���ڰ� ������ ����,
		// 5�̻��� ���ڰ� ������ ���� ���
		// [��� ����]:
		// ���̵� �Է�: ()
		// �н����� �Է�: ()
		// (�α��� ���� Ȥ�� ����)
		//
		// ���̽� ����
		// ���̽� ���: ()
		// ���� ���: ()
		// ______________________________

//		Scanner s = new Scanner(System.in);
//		System.out.print("���̵� �Է� : ");
//		String id = s.next();
//		System.out.print("�н����� �Է� : ");
//		String pw = s.next();
//		
//		if(id.equals("java") && pw.equals("dd")) {
//			System.out.println("�α��� ����");
//			System.out.println();
//			int a = (int)(Math.random() * 6) + 1;
//			int b = (int)(Math.random() * 6) + 1;
//			System.out.println("���̽� ����");
//			System.out.println("���̽� ��� : " + (a + b));
//			System.out.print("������� : ");
//			if((a + b) == 2) {
//				System.out.println("�����");
//			}else if((a + b) == 12) {
//				System.out.println("�뼺��");
//			}else if ((a + b) <= 4) {
//				System.out.println("����");
//			}else {
//				System.out.println("����");
//			}
//		}else {
//			System.out.println("�α��� ���� : �������� �ʴ� id");
//		}

		// 2. 1 ~ 100 ������ ������ ���ڰ� �Ҽ����� �����ϰ�
		// �ƴϸ� ¦���� Ȧ���� �����ϱ�

//		int num = (int)(Math.random() * 100) + 1;
//		for (int i = 2; i < 100; i++) {
//			if(num % i == 0) {
//				System.out.println(num + "��(��) �Ҽ��Դϴ�.");
//				break;
//			}
//			System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
//			if(num % 2 == 0) {
//				System.out.println("¦���Դϴ�.");
//				break;
//			}else {
//				System.out.println("Ȧ���Դϴ�.");
//				break;
//			}
//		}

		// 3. 9000���� ������ �Ǹ��� �� 11���� 15������ ���� �������� �̾�
		// 11�� ������ 20%�� ���ε� �ݾ���,
		// 12�� ������ 10%�� ���ε� �ݾ���,
		// 13 ~ 15�� ������ ���� �ݾ��� �����Ͽ� ���
		// 11~15���� ������ �������� �̴� method�� num�� �����Ͽ� �ʱ�ȭ
		// price�� �����Ͽ� ���� 9000���� �ʱ�ȭ
		// switch�� ����Ͽ� ���

//		int price = 9000;
//		int num = (int)(Math.random() * 5) + 11;
//		System.out.println("���� �� : " + num);
//		switch (num) {
//		case 11:
//			System.out.println((price - (int)(price * 0.2)) + "�� �Դϴ�.");
//			break;
//		case 12:
//			System.out.println((price - (int)(price * 0.1)) + "�� �Դϴ�.");
//			break;
//		default:
//			System.out.println(price + "�� �Դϴ�.");
//		}

	}

}
