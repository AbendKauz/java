package sec01.exam01;

import java.util.Scanner;

public class ExceptionSample1 {

	public static void main(String[] args) {

		// �� ���� ���ڸ� ��ĳ�ʸ� ���ؼ� �Է¹���
		// �ι�° �Է¹��� ���ڰ� 0�� ��� "0���� ���� �� �����ϴ�."���
		// �� ���ڰ� ��� 0 �̻��� ��� ������ ������� ���

		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int a = s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int b = s.nextInt();

		double c = (double) a / b;

//		System.out.println("������ ������� : " + c + " �Դϴ�.");

		if (a == 0 || b == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} else {
			System.out.println(a + " / " + b + " = " + c);
		}

	}

}
