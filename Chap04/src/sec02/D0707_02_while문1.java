package sec02;

import java.util.Scanner;

public class D0707_02_while��1 {

	public static void main(String[] args) {

		// while ��
		// -> ���ǽĿ� ���� �ݺ� ���θ� ������ ���
		// true : ��� �ݺ� / false : �ݺ� ����

		// while(���ǽ�) {
		// �ݺ��� �ڵ�
		// }

		// for��
		// -> ������ Ƚ����ŭ �ݺ�

		// 1~10���� ���
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;	// i�� �������� ������ ��� 1�� �ݺ��Ǽ� ���
//		}

		// int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է¹�������.
		// 1 ~ ���� num���� ���� ����ϴ� ���α׷� �ۼ�(while�� ���)

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= num) {
//			sum = sum + i;
//			System.out.println("�ʱ� i : " + i);
			sum += i;
			i++; // num���� ������ ���� i�� ���� 1�� ����
//			System.out.println("���� �� i : " + i + ", sum : " + sum);
		}
		System.out.println("1 ~ " + num + "�� �� : " + sum);
	}

}
