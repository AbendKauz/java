package sec03;

public class D0628_03_���ڿ�����Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		// * �⺻Ÿ��(8��)
		// ���� (5��) : byte, short, char, int, long
		// �Ǽ� (2��) : float, double
		// �� (1��) : boolean
		// char �����ϰ� ���� ��ȯ ����

//		String str = "10";
//		byte a = Byte.parseByte(str);			// String -> byte
//		short a = Short.parseShort(str);		// String -> short
//		int a = Integer.parseInt(str);			// String -> int
//		long a = Long.parseLong(str);			// String -> long
//		float a = Float.parseFloat(str);		// String -> float
//		double a = Double.parseDouble(str);		// String -> double
//		System.out.println(str);
		String b = "true";
		boolean b1 = Boolean.parseBoolean(b); // String -> boolean

		System.out.println(b1);

		// ���ڿ��� ���ڰ� �ƴ� ���ĺ��̳� Ư������, �ѱ� �� ������ ���
		// -> ����Ÿ������ ��ȯ �õ� �� ������������(NumberFormatException)�߻�
//		String str1 = "10a";
//		int value = Integer.parseInt(str1);
//		System.out.println(value);	// ���� �߻�

		// �ݴ�� �⺻Ÿ��(byte, short, char, int, long, float, double, boolean)
		// �� ���� ���ڿ��� ������ ����???

		// String.valueOf() �޼ҵ带 ���
		int a = 3;
		System.out.println(a + 3); // 6 -> ����
		String str2 = String.valueOf(a);
		System.out.println(str2 + 3); // 33 -> ���ڿ�

	}

}
