package sec02;

public class D0627_04_float_double {

	public static void main(String[] args) {

		// ���� p.66

		// �Ǽ��� -> 1. �Ҽ��� 2. ���ĺ� e, E

		// �Ǽ��� ����
		// float (4byte) / double (8byte)

//		float var1 = 31.4;	// java�� �Ǽ� �⺻Ÿ�� : double �̶� error
//		float var1 = 31.4f;	// f �Ǵ� F �� float �ν�
//		double var2 = 31.4;	// ������ Ÿ���� double �� ����

		// ���е�
		float var3 = 0.1234567890123456789f;
		double var4 = 0.1234567890123456789;

		System.out.println("var3�� ���� : " + var3); // 0.12345679
		System.out.println("var4�� ���� : " + var4); // 0.12345678901234568

		// e �Ǵ� E ����ϱ�
		double var5 = 3e4; // 3 x 10�� = 30000.0
		System.out.println("var5�� ���� : " + var5);

	}

}
