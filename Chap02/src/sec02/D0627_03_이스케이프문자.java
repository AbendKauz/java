package sec02;

public class D0627_03_�̽����������� {

	public static void main(String[] args) {

		System.out.println("���� \"�ڹ�\"��\t����\n�Ѵ�.");

		// * �̽������� ����
		// -> ���ڿ� ���ο� Ư�����ڸ� ���Խ�Ű�ų�, ���ڸ� ��������ϴ� ���

		// 1. \" -> " ū����ǥ���
		// \' -> ' ��������ǥ���
		// \\ -> \ ���

		// 2. \t -> �Ǹ�ŭ ���
		// \n -> ����(�ٹٲ�)

		// ��ȣ ��¥ �̸�
		// 01 06.23 �ؿ�
		// 02 06.23 �浿
		// ���� "����"��
		// �ÿ��մϴ�.
		// \���� ����\ ���

		String a = "��ȣ";
		String b = "��¥";
		String c = "�̸�";
		System.out.println(a + "\t" + b + "\t" + c);
//		System.out.println("��ȣ\t��¥\t�̸�");
		System.out.println("01\t06.23\t�ؿ�");
		String date = "06.23";
		System.out.println("02\t" + date + "\t�浿");
		System.out.println("���� \"����\" ��\n�ÿ��մϴ�.");
		System.out.println("\\���� ����\\");

	}

}
