package sec02;

import java.util.Scanner;

public class D0708_06_continue�� {

	public static void main(String[] args) {

		// continue��
		// -> �ݺ����� ���������ʰ� ��� �ݺ��� ����

		// 1���� 10 ������ �� �߿��� ¦���� ���
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}

		// 5���� ������ �Է¹ް� �� �� ����鸸 ���Ͽ� ����ϴ� ���α׷�
		// -> �Էµ� ���� 0�̳� �����̸� ������ �ʰ� ���� �ݺ����� �Ѿ
		// (continue�� Ȱ��)
		// [�ܼ����]
		// ������ 5�� �Է��ϼ���.
		// >> 5
		// >> -2
		// >> 6
		// >> 10
		// >> -4
		// ����� ���� 21�Դϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���.");

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("�����Է� " + i + " >> ");
			int num = sc.nextInt();
			if (num <= 0) {
				continue;
			}
			sum = sum + num;
		}
		System.out.println("����� ���� " + sum + "�Դϴ�.");

	}

}
