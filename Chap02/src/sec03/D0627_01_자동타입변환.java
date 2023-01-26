package sec03;

public class D0627_01_�ڵ�Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		byte a = 10;
		byte b = a;
		int c = a; // �ڵ� Ÿ�� ��ȯ

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// �ڵ�Ÿ�Ժ�ȯ : ���α׷� ���� ���߿� �ڵ����� Ÿ�� ��ȯ�� �Ͼ�� ��
		// ū ��� ���� Ÿ�� = ���� ��� ���� Ÿ��

		// byte < short < int < long < float < double
		// char(����� �����Ƿ�), boolean(true, false)

		// int Ÿ���� byte Ÿ�Ժ��� Ŀ�� �ڵ� Ÿ�� ��ȯ�� �߻�
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		// float, double Ÿ���� long Ÿ�Ժ��� Ŀ�� �ڵ� Ÿ�� ��ȯ�� �߻�
		long longValue = 5000000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);

		// int Ÿ���� char Ÿ�Ժ��� Ŀ�� �ڵ� Ÿ�� ��ȯ�� �߻�
		// --> 'A'�� �����ڵ� ���� int Ÿ�Կ� ������ ��
		char charValue = 'A';
		System.out.println(charValue);

		int intValue1 = charValue;
		System.out.println(intValue1);

		// byte -> -128 ~ 127
		// char -> 0 ~ 65535
		// char Ÿ�Ժ��� �������� ���� byte Ÿ���� char Ÿ������ �ڵ� Ÿ�� ��ȯ X
		// why? char Ÿ���� ������ �������� ������, byte Ÿ���� ������ �����ϱ� ����
//		byte byteValue1 = 65;
//		char charValue1 = byteValue1;	// ������ ����

		// char Ÿ�� ���� a1�� �����ؼ�
		// �ʱⰪ���� �� �� ����
		// int Ÿ�� ���� b1�� �̿��ϱ�
		// �ܼ�â�� ���� �����ڵ� : _____
		char a1 = '��';
		System.out.println(a1);
		int b1 = a1;
		System.out.println("���� �����ڵ� : " + b1);

	}

}
