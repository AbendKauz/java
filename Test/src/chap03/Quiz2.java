package chap03;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// 1. Ŭ������ Quiz2 �� ����
		// 2. ������ Ű����� �Է¹޾� int Ÿ���� ���� num �� �����ÿ�.
		// 3. int Ÿ�� a�� �����Ͽ� num �� �߿��� ���� �ڸ� ���ϸ� ���� ������ �ʱ�ȭ�� �Ͻÿ�.
		// (��������ڸ� Ȱ��)
		// 4. a �� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
//		// 1)
//		int a = (num / 100) * 100;

//		// 2)
		int a = num - (num % 100);
		System.out.println(num + "���� ���� �ڸ� ���ϸ� ������? : " + a);

	}

}
