package sec02;

import java.util.Scanner;

public class D0701_07_�����ڿ���2 {

	public static void main(String[] args) {

		// ������ �ϳ� Ű����� �Է¹޾�
		// int Ÿ���� num �̶�� ������ ���� ����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// b��� ������ num�� 5�� �������(true), �ƴ���(false)
		// ���� �����ؼ� b�� ���� ����Ͻÿ�
		// num�� ���� 5�� ������ -> num��(��) 5�� ����Դϴ�.
		// num�� ���� 5�� ����� �ƴ϶�� -> num��(��) 5�� ����� �ƴմϴ�.

		boolean b = (num % 5 == 0);
		if (b) {
			System.out.println(num + "��(��) 5�� ����Դϴ�.");
		} else {
			System.out.println(num + "��(��) 5�� ����� �ƴմϴ�.");
		}

	}

}
