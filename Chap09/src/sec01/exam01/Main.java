package sec01.exam01;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		// ��> A��ü�� �����Ǿ����ϴ�. ���

		A.B b = a.new B(); // �ν��Ͻ� ��� Ŭ���� ��ü ����
		// ��> B��ü�� �����Ǿ����ϴ�. ���
		b.field1 = 3;
		b.method1();

		A.C c = new A.C(); // ���� ��� Ŭ���� ��ü ����
		// ��> C��ü�� �����Ǿ����ϴ�. ���
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		a.method(); // ���� Ŭ������ �޼ҵ� ȣ��

	}

}
