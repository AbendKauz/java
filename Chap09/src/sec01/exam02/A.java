package sec01.exam02;

public class A { // �ܺ� Ŭ����(outer Class)

	// �ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();

	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	// ���� �ʵ� �ʱ�ȭ
//	static B field3 = new B();	// ���� �Ұ���
	// -> �ν��Ͻ� ��� Ŭ������ ���� �ʵ��� �ʱⰪ �Ұ���
	static C field4 = new C();

	// ���� �޼ҵ�
	static void method2() {
//		B var1 = new B();	// ���� �Ұ���
		// -> �ν��Ͻ� ��� Ŭ������ ���� �޼ҵ忡���� ��ü ������ �Ұ���
		C var2 = new C();
	}

	class B {
	} // �ν��Ͻ� ��� Ŭ����

	static class C {
	} // ���� ��� Ŭ����

}
