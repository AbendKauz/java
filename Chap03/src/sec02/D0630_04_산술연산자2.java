package sec02;

import java.util.Scanner;

public class D0630_04_���������2 {

	public static void main(String[] args) {

		// Ű����� 2���� ���� �Է¹޾�
		// int Ÿ�� a, b ������ ���� ������ ��
		// �Ʒ��� ���� ����ض�

		// �����Է� 1 : _____
		// �����Է� 2 : _____
		// a + b : ____
		// a - b : ____
		// a * b : ____
		// a / b : ____
		// a % b : ____

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int b = sc.nextInt();

		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + (a * b));
		System.out.println("a / b : " + (a / b));
		System.out.println("a % b : " + (a % b));

	}

}
