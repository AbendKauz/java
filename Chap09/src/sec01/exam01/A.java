package sec01.exam01;

class A { // �ܺ�(�ٱ�) Ŭ����(Outer class)

	A() {
		System.out.println("A��ü�� �����Ǿ����ϴ�.");
	}

	class B { // �ν��Ͻ� ��� Ŭ����
		// A ��ü�� �����ؾ߸� ����� �� �ִ� B Ŭ����

		B() {
			System.out.println("B��ü�� �����Ǿ����ϴ�.");
		} // ������

		int field1; // �ν��Ͻ� �ʵ�
//		static int field2;	// ���� �ʵ�(���Ұ�)

		void method1() {
		} // �ν��Ͻ� �޼ҵ�
//		static void method2() {}	// ���� �޼ҵ�(���Ұ�)
	}

	static class C { // ���� ��� Ŭ����
		// A Ŭ������ �ٷ� ������ �� �ִ� C Ŭ����
		C() {
			System.out.println("C��ü�� �����Ǿ����ϴ�.");
		} // ������

		int field1; // �ν��Ͻ� �ʵ�
		static int field2; // ���� �ʵ�

		void method1() {
		} // �ν��Ͻ� �޼ҵ�

		static void method2() {
		} // ���� �޼ҵ�
	}

	void method() {

		class D { // ���� Ŭ����
			// method()�� ������ ���� ����� �� �ִ� B Ŭ����
			D() {
				System.out.println("D��ü�� �����Ǿ����ϴ�.");
			} // ������

			int field1; // �ν��Ͻ� �ʵ�
//			static int field2;	// ���� �ʵ�(���Ұ�)

			void method1() {
			} // �ν��Ͻ� �޼ҵ�
//			static void method2() {}	// ���� �޼ҵ�(���Ұ�)
		}

		D d = new D();
		// ��> D��ü�� �����Ǿ����ϴ�. ���
		// -> Main.java���� method() ȣ�� �� ��µ�

	}

}
