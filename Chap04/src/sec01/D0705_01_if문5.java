package sec01;

import java.util.Scanner;

public class D0705_01_if��5 {

	public static void main(String[] args) {

		// �ñ��̶� ���� �ð��� Ű����� �Է¹޾� hourPay, hour ������ ���� ����
		// ���� �ð��� 8�ð��� �ʰ��ϰ� �Ǹ� 8�ð���ŭ�� ���� �ӱݸ�ŭ �־�����
		// �ʰ��� �ð��� �ñ��� 1.5��� ����� �ȴ�.
		// �ϱ��� ����ϴ� �ڵ带 �ۼ�

		// [console]
		// �ñ� : ______ 10000 10000
		// ���� �ð� : _____ 7 9
		// �ϱ� : 70000 95000

		Scanner sc = new Scanner(System.in);
		System.out.print("�ñ� : ");
		int hourPay = sc.nextInt();
		System.out.print("���� �ð� : ");
		int hour = sc.nextInt();

		// 1)
//		if(hour > 8) {
//			System.out.println("�ϱ� : " + ((hourPay * 8) + (int)(hourPay * 1.5 * (hour - 8))) + "��");
//		}else {
//			System.out.println("�ϱ� : " + (hourPay * hour) + "��");
//		}

		// 2)
		if (hour > 8) {
			System.out.println("�ϱ� : " + ((hourPay * hour) + (int) (hourPay * 0.5 * (hour - 8))) + "��");
		} else {
			System.out.println("�ϱ� : " + (hourPay * hour) + "��");
		}

	}

}
