package sec04;

public class D0629_01_printf3 {

	public static void main(String[] args) {

		// int Ÿ�� ���� ���� �� 123 �ʱ�ȭ
		int value = 123;
		// double Ÿ�� ���� ���� �� 314.159 �ʱ�ȭ
		double value2 = 314.159;
		// ��ǰ�� ����:123��
		System.out.printf("��ǰ�� ����:%d��\n", value);
		// ��ǰ�� ����: 123�� // ��ü�ڸ��� 6
		System.out.printf("��ǰ�� ����:%6d��\n", value);
		// ��ǰ�� ����:123 �� // ��ü�ڸ��� 6
		System.out.printf("��ǰ�� ����:%-6d��\n", value);
		// ��ǰ�� ����:000123�� // ��ü�ڸ��� 6
		System.out.printf("��ǰ�� ����:%06d��\n", value);
		// �������� 10�� ���� ����:314.16 // ��ü�ڸ��� 10 �Ҽ��ڸ��� 2
		System.out.printf("�������� %2$d�� ���� ����:%1$10.2f\n", value2, 10);

		String name = "������";
		String str = "����";
		System.out.printf("�̸� : %s\t, �п� : %s\n", name, str);

	}

}
