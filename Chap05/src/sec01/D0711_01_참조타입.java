package sec01;

public class D0711_01_����Ÿ�� {

	public static void main(String[] args) {

		// �⺻Ÿ��(����_byte, short, char, int, long, �Ǽ�_float, double, ��_boolean)
		// : ����, �Ǽ�, ����, �� ���ͷ� ���� // �������� ���� �ȿ� ����
		// ����Ÿ��(�迭Ÿ��, ����Ÿ��, Ŭ����, �������̽�)
		// : ��ü�� ������ �����ϴ� Ÿ�� // �޸��� ������ ���� �ȿ� ����
		// -> ������ ���� ��ü�� ����

		// * �޸𸮻�뿵��
		// 1. �޼ҵ念�� : Ŭ���� �ڵ���� Ŭ�����ڵ庰�� ����
		// 2. �� ���� : ��ü�� �迭�� �����Ǵ� ����
		// 3. JVM ���ÿ���: �޼ҵ带 ȣ���� �� �������� �߰�, ����Ǹ� �������� ������

		// NullPointerException
		// : ���������� ����ϸ鼭 ���� ���� �߻��ϴ� ���� �� �ϳ�
		// : ����Ÿ�� ������ null ���¿��� �������� �ʴ� ��ü�� �����ͳ� �޼ҵ� ���� �߻�
		// -> �ذ�� : �ش����������� ��ü�� �����ϵ��� �����Ͽ� �ذ�

//		int[] intArr = null;
//		intArr[0] = 10;	// NullPointerException �߻�
		// null�� ������ �ִ� ���� (������ü�� ���� ����)
		// -> ������ ���� ���� ��ü�� �����ͳ� �޼ҵ带 ���� �߻�

//		String str = null;
//		System.out.println(str.length());	// NullPointerException �߻�

//		String str1 = "String";
//		System.out.println(str1.length());	// .length : ���ڿ��� ���̸� return

		String a = "ȥ����";
		String b = "ȥ����";
		String c = new String("ȥ����");

		// == : ������ ��
		if (a == b) { // ���� ������ ����.
			System.out.println("���� ������ ����.");
		} else {
			System.out.println("���� ������ �ٸ���.");
		}

		if (a == c) { // ���� ������ �ٸ���.
			System.out.println("���� ������ ����.");
		} else {
			System.out.println("���� ������ �ٸ���.");
		}

		// .equals() : ���ڿ��� ��
		if (a.equals(c)) { // ���ڿ��� ����.
			System.out.println("���ڿ��� ����.");
		} else {
			System.out.println("���ڿ��� �ٸ���.");
		}

	}

}
