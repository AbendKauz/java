package sec02;

import java.util.Scanner;

public class D0708_05_break�� {

	public static void main(String[] args) {

		// 1~6 ���� �ֻ��� ��ȣ�� ������ �ڵ� �ۼ�
		// 6�� ������ �ݺ� ����

//		while(true) {
//			int num = (int)(Math.random() * 6) + 1;
//			System.out.println(num);
//			// num ���� 6�϶�, break�� Ȱ���Ͽ� ����
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("���α׷� ����");

		// "����"�� �ԷµǸ� while���� ������� �ϴ� �ڵ带 �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ḧ �Է��ϸ� ���α׷��� �����մϴ�.");
		while (true) {
			System.out.print(">> ");
			String a = sc.nextLine();
			if (a.equals("����")) {
				System.out.println("���α׷��� �����մϴ�......");
				break;
			}
		}

	}

}
