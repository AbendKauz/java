package sec02;

public class Test1Example {

	public static void main(String[] args) {

		// Ŭ���� �ܺο��� �ʵ带 ����ϴ� ���
		// 1. Ŭ�����κ��� ��ü�� ����
		Test1 a = new Test1(); // ��ü ����

		// 2. ���� �аų� ������ �� -> ��Ʈ������(.)�� Ȱ��
		// ������.�ʵ�
		System.out.println(a.num); // �ʵ� �о����
		System.out.print("�ʵ� ���� ���� : ");
		a.num = 10; // �ʵ尪 ����
		System.out.println(a.num);

		System.out.println(a.method());

	}

}
