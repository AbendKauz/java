package sec03;

public class D0627_02_����Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		// ���� Ÿ�� ��ȯ
		// ���� ������ Ÿ�� = (���� ������ Ÿ��)ū ������ Ÿ��
		int b = 145;
//		byte a = b;						// Type mismatch: cannot convert from int to byte
		byte a = (byte) b;
		System.out.println(a);

		int intValue = 65;
//		char charValue = intValue;		//Type mismatch: cannot convert from int to char
		char charValue = (char) intValue;
		System.out.println(intValue);
		System.out.println(charValue);

		double doubleValue = 3.14;
//		int intValue1 = doubleValue;	//Type mismatch: cannot convert from double to int
		int intValue1 = (int) doubleValue;
		System.out.println(doubleValue);
		System.out.println(intValue1);

	}

}
