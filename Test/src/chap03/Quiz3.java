package chap03;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		// 1. Ŭ������ Quiz3 ���� ����
		// 2. ������ Ű����� �Է¹޾� int Ÿ���� ���� num �� �����ÿ�.
		// 3. int Ÿ�� a�� �����Ͽ� num �� �߿��� ���� �ڸ��� 1�� �ٲٴ� ������ �ʱ�ȭ�� �Ͻÿ�.
		// (��������ڸ� Ȱ��)
		// 4. a �� ���� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

//		// 1)
		int a = num / 10 * 10 + 1;

//		// 2)
//		int a = num - (num % 10) + 1;
		System.out.println(num + "���� ���� �ڸ��� 1�� �ٲٸ�? : " + a);

	}

}
