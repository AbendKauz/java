package sec01;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;	//	error(�ʱ�ȭ �ÿ��� Ÿ�Կ� �ʰ��ϴ� ���� ���� �ʴ´�)

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		byte var7 = 127;
		var7 = (byte) (var7 + 1);
//		var7 = (byte)(var7 - 1);
		System.out.println(var7); // -128

		byte var8 = -128;
		var8 = (byte) (var8 - 1);
		System.out.println(var8); // 127

		char a = '��';
		int b = '��'; // ''�� ���θ� �����ڵ�� ��ȯ�Ǽ� int�� ���� �� ��� ����
		System.out.println(a); // �� ���
		System.out.println((int) a); // �����ڵ� : 44608�� ���
		System.out.println(b); // 44608

	}

}
