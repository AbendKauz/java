package sec01;

public class D0706_02_switch��2 {

	public static void main(String[] args) {

		// int Ÿ���� ���� time�� �ʱⰪ���� 8~11�߿��� �ϳ��� ����
		// �������� �̰�, ����� ���ÿ� �ʱ�ȭ�ϼ���.
		// �� �ð��� ���ص� ������ ����Ͽ� ��� ���� ���� ����� ��������
		// ���α׷��� ��������(switch�� ���)

		// <��������>
		// 8 : "����մϴ�."
		// 9 : "ȸ�Ǹ� �մϴ�."
		// 10 : "������ ���ϴ�."
		// �� �� : "�ܱ��� �����ϴ�."

		int time = (int) (Math.random() * 4) + 8;

		System.out.println("[����ð� : " + time + "��]");

		switch (time) {
		case 8:
			System.out.println("����մϴ�.");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10:
			System.out.println("������ ���ϴ�.");
			break;
		default:
			System.out.println("�ܱ��� �����ϴ�.");
			break;
		}

	}

}
