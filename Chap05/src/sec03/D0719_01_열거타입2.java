package sec03;

import java.util.Calendar;

public class D0719_01_����Ÿ��2 {

	public static void main(String[] args) {

		Week today = null;

		// �ڹٿ��� ��ǻ���� ��¥ �� ����, �ð��� ������� Calendar Ŭ������ ����

		// Calendar Ŭ���� Ÿ���� ������ �����ϰ�
		// Calendar.getInstance() method�� Calendar ��ü�� ����
		Calendar now = Calendar.getInstance();

//		int year = now.get(Calendar.YEAR);	// ���� �⵵�� Ȯ��
//		System.out.println(year);	// 2022
//		
//		int month = now.get(Calendar.MONTH);// ���� ���� Ȯ�� (1�� : 0)
//		System.out.println(month);	// 6 -> 1�� : 0
//		
//		int date = now.get(Calendar.DATE);	// ���� ��¥�� Ȯ��
//		System.out.println(date);	// 19

		int week = now.get(Calendar.DAY_OF_WEEK); // ���� ���ϸ� Ȯ��
		// �Ͽ��� : 1, ����� : 7
		// ��(1), ��(2), ȭ(3), ��(4), ��(5), ��(6), ��(7)
		System.out.println(week); // 3 -> ȭ����

		switch (week) {
		case 1: {
			today = Week.SUNDAY;
			System.out.println("������ �Ͽ���");
			break;
		}
		case 2: {
			today = Week.MONDAY;
			System.out.println("������ ������");
			break;
		}
		case 3: {
			today = Week.TUESDAY;
			System.out.println("������ ȭ����");
			break;
		}
		case 4: {
			today = Week.WEDNESDAY;
			System.out.println("������ ������");
			break;
		}
		case 5: {
			today = Week.THURSDAY;
			System.out.println("������ �����");
			break;
		}
		case 6: {
			today = Week.FRIDAY;
			System.out.println("������ �ݿ���");
			break;
		}
		case 7:
			today = Week.SATURDAY;
			System.out.println("������ �����");
			break;
		}
		System.out.println(today);

	}

}
