package sec01;

public class D0622_01_����2 {
	public static void main(String[] args) {

		// ���� p.51

		int value; // int Ÿ���� value ���� ����

		int result; // int Ÿ���� result ���� ����

		// result��� ������ value + 10 �����ϰ� �ʹٸ�???
		// -> value�� ���� ���� �ʱ�ȭ����� ��
		// �׷��� ������ ������ ���� �߻�
		value = 4; // value �ʱ�ȭ
		result = value + 10;

		// �Ʒ� �� �ڵ�� ���� ��(14)�� ���
		System.out.println(result);
		System.out.println(value + 10);

		// �������� �������� ���� �� �� �ֳ���???
		int num = 14; // int Ÿ���� num ���� ���� �� 14��� ������ �ʱ�ȭ

		num = 74;
		num = 45;
		num = 65;
		System.out.println(num);

	}
}
