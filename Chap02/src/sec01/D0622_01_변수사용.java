package sec01;

public class D0622_01_������� {
	public static void main(String[] args) {

		// ���� p.53

		// Q1) int Ÿ���� hour ������ ����� ���ÿ� 3�̶�� �ʱⰪ �ο�
		int hour = 3;

		// Q2) int Ÿ���� minute ������ ����� ���ÿ� 5�̶�� �ʱⰪ �ο�
		int minute = 5;

		// Q3) ��¹� �����ϴ� ���� ���� ���
		// �ܼ�â�� 3�ð� 5�� �̶�� ��µǵ��� ��¹� �ۼ��ϱ�
		System.out.println(hour + "�ð� " + minute + "��");

		String name = "���ؿ�";
		String a = "���� ����";

		// Q4) �ܼ�â�� ���� ���� ���ؿ��Դϴ�. �� ���
		// System.out.println("���� ���� ���ؿ��Դϴ�.");
		System.out.println(a + " " + name + "�Դϴ�.");

		// Q5) �ð� -> ������ �ٲٱ�
		// 1�ð� -> 60�� -> hour = 3�ð� = (3*60)180��

		System.out.println(hour); // 3�� ���
		System.out.println(hour * 60); // 3�ð��� 180������ �������� ���

		System.out.println(minute); // 5��

		// Q6) hour = 3, minute = 5 ---> �� �������
		// 3�ð� 5�� ==> �� �������????
		// ���� : "�� 000��"

		// int totalMinute = (�ð�*60) + ��;
		int totalMinute = (hour * 60) + minute;
		System.out.println("\"" + "�� " + totalMinute + "��" + "\"");

	}
}
