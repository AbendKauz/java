package sec03;

public class D0628_01_�Ǽ������ڵ�Ÿ�Ժ�ȯ2 {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte a = byteValue1 + byteValue2;	// error
		int a = byteValue1 + byteValue2; // int Ÿ������ �ڵ���ȯ
		System.out.println(a);

		char charValue1 = 'A';
		char charValue2 = 2;
//		char charValue3 = charValue1 + charValue2;	// error
		int intValue1 = charValue1 + charValue2; // int Ÿ������ �ڵ���ȯ
		System.out.println("A�� �����ڵ� + 2 : " + intValue1);
		// 67�� ���ڸ� �̰���� ��
		System.out.println((char) intValue1);

		int intValue2 = 10;
		int intValue3 = 4;
		int intValue4 = intValue2 / intValue3;
		System.out.println(intValue4); // ����ϸ� 2�� ����

		// Q) 10/4 => 2.5 �� �������� ??
		// 1.
//		double doubleValue1 = (double)intValue2 / intValue3;
//		System.out.println(doubleValue1);
		// or
//		System.out.println((double)intValue2 / intValue3);
		// 2.
//		double doubleValue2 = intValue2 / (double)intValue3;
//		System.out.println(doubleValue2);
		// 3.
		double doubleValue3 = (double) intValue2 / (double) intValue3;
		System.out.println(doubleValue3);

		// (double)(intValue2 / intValue3) ������ ����/���� = �������� ����
		// 10/4 => 2.5 -> 0.5 �������� 2�� ���Ƽ� double ������ȯ 2.0 ����
		double doubleValue4 = (double) (intValue2 / intValue3);
		System.out.println(doubleValue4); // 2.0�� ����

	}

}
