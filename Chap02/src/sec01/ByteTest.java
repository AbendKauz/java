package sec01;

public class ByteTest {

	public static void main(String[] args) {

//		byte a = 50;
//		byte b = 100;
//		
////		byte sum = a + b;	//	Type mismatch: cannot convert from int to byte (���� �� ������ int Ÿ������ ������ȯ)
//		int sum = a + b;
//		
//		System.out.println(sum);

//		byte a = -128;
////		byte b = 100;
//		
//		byte sum = (byte)(a - 1);	// casting ����(Ÿ���� �����Ͽ� ���)
//		//	��� �� �ʰ��� �̸� ���� ����Ŭ�� �߻��Ǿ� ǥ�õ�
//		//	(129 = -127, 130 = -126, -129 = 127�� ǥ�õ�)
//		
//		System.out.println(sum);

//		int a = 2200000000;

		System.out.println("int Ÿ���� �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("int Ÿ���� �ּҰ� : " + Integer.MIN_VALUE);

		System.out.println("byte Ÿ���� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("byte Ÿ���� �ִ밪 : " + Byte.MIN_VALUE);

		System.out.println("short Ÿ���� �ִ밪 : " + Short.MAX_VALUE);
		System.out.println("short Ÿ���� �ּҰ� : " + Short.MIN_VALUE);

		System.out.println("char Ÿ���� �ִ밪 : " + (int) Character.MAX_VALUE); // �׳� ��½� ?�� ���
		System.out.println("char Ÿ���� �ּҰ� : " + (int) Character.MIN_VALUE); // �׳� ��½� �������� ���

		System.out.println("long Ÿ���� �ִ밪 : " + Long.MAX_VALUE);
		System.out.println("long Ÿ���� �ּҰ� : " + Long.MIN_VALUE);

	}

}
