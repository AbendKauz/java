package sec03;

public class D0627_03_���������ڵ�Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		byte x = 15;
		byte y = 34;
//		byte result = x + y;	// byte + byte -> int
		// byte result ���� ������
		int result = x + y;
		System.out.println(result);

		long a = 1245L;
		int b = 14;
//		int result1 = a + b; 	// Type mismatch: cannot convert from long to int
		long result1 = a + b;
		System.out.println(result1);

		byte c = 10;
		long result2 = a + b + c;
		System.out.println(result2);

	}

}
