package sec02;

public class D0630_04_���������1 {

	public static void main(String[] args) {

		// ���׿����� -> �ǿ����ڰ� 2���� ������
		// -> ���������, ���ڿ����տ�����, �񱳿�����, ��������, ���Կ�����

		// * ���������
		// + : ����
		// - : ����
		// * : ����
		// / : ������
		// % : ���� �������� ���ϴ� ����

		int a = 7;
		int b = 3;

		System.out.println("a + b�� �� : " + (a + b));
		System.out.println("a - b�� �� : " + (a - b));
		System.out.println("a * b�� �� : " + (a * b));
		System.out.println("a / b�� �� : " + (a / b)); // int Ÿ������ 2�� ���
		System.out.println("a / b�� �� : " + ((double) a / b)); // �Ǽ����� -> 2.333333
		System.out.println("a % b�� �� : " + (a % b));

	}

}
