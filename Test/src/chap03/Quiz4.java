package chap03;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		// ������ �ϳ� Ű����� �Է¹޾� -> ��ĳ��
		// int Ÿ���� num �̶�� ������ ���� ����
		// b ��� ������ num �� 5�� �������, �ƴ��� (ture, false)
		// ���� �����ؼ�
		// b�� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = (num % 5 == 0);
		if (b) {
			System.out.println(num + "��(��) 5�� ����Դϴ�.");
		} else {
			System.out.println(num + "��(��) 5�� ����� �ƴմϴ�.");
		}

	}

}
