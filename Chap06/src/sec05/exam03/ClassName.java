package sec05.exam03;

public class ClassName {

	// �ν��Ͻ� �ʵ� / �ν��Ͻ� �޼ҵ�
	int field1;

	void method1() {

	}

	// ���� �ʵ� / ���� �޼ҵ�
	static int field2;

	static void method2() {

	}

	// * ���� �޼ҵ� ���� �� ������ ��
	// 1. �޼ҵ� ���ο� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ� ��� �Ұ�
	// 2. ��ü �ڽ� �����ϴ� this Ű���� ��� �Ұ�

	// ���� �޼ҵ�
	static void method3() {
//		field1 = 10;	// �ν��Ͻ� ��� ��� �� error
//		method1();		// �ν��Ͻ� �޼ҵ� ��� �� error

//		this.field2 = 20;	// this Ű���� ��� �Ұ�

		field2 = 20; // ���� ��� ��� ����
		method2(); // ���� �޼ҵ� ��� ����

		// * ���� �޼ҵ� �ȿ��� �ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� ����ϰ� �ʹٸ�?
		// -> ��ü�� ���� �����ϰ� ���������� ����

		ClassName cla = new ClassName(); // ��ü ����
		cla.field1 = 10; // ���������� ����
		cla.method1();

	}

}
