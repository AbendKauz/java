package chap04;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		// 369 ���� ���α׷� �����
		// 1. 100 �̸��� ������ �ϳ� Ű����� �Է¹޾� ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		// 2. �Է¹��� ����ŭ 369������ ���
		// 3. ���ڸ� ���� 3, 6, 9�϶��� "�ڼ�"�� ���
		// 4. ���ڸ� ���� 5�� ���� "����" ���
		// 5. �� ���� ������ ���� ���ڸ� ���
		// if, switch 2������ Ǯ��
		for (int i = 1; i <= a; i++) {

			// 1. if
//			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("�ڼ�");
//			}else if(i % 10 == 5) {
//				System.out.println("����");
//			}else {
//				System.out.println(i);
//			}// if

			// 2. switch
			switch (i % 10) {
			case 3: {
				System.out.println("�ڼ�");
				break;
			}
			case 6: {
				System.out.println("�ڼ�");
				break;
			}
			case 9: {
				System.out.println("�ڼ�");
				break;
			}
			case 5: {
				System.out.println("����");
				break;
			}
			default:
				System.out.println(i);
			}// switch
		}

	}

}
