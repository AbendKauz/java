package sec01.exam02;

class OuterClass {
	// �ܺ�Ŭ���� OuterClass
	// �ν��Ͻ� ��� Ŭ���� InstanceA
	// ����
	// �޼ҵ�
	// ��� : �ν��Ͻ� Ŭ������ �����Ǿ����ϴ�.
	// ��� : ������ ���
	// ex) ���� t = 5;
	// �������� 5�Դϴ�.

	// ���� ��� Ŭ���� StaticA
	// ����
	// �޼ҵ�
	// ��� : ���� Ŭ������ �����Ǿ����ϴ�.
	// ��� : ������ ���

	// ���� Ŭ����(LocalA)
	// ��¹� : ���� Ŭ������ �����Ǿ����ϴ�.

	class InstanceA { // �ν��Ͻ� Ŭ����
		int a = 5;

//		int a;
		void method1() {
		}

		InstanceA() {
			System.out.println("�ν��Ͻ� Ŭ������ �����Ǿ����ϴ�.");
			System.out.println("�������� " + a + "�Դϴ�.");
		}
	}

	static class StaticA { // ���� Ŭ����
		static int b = 3;

//		static int b;
		static void method2() {
		};

		StaticA() {
			System.out.println("���� Ŭ������ �����Ǿ����ϴ�.");
			System.out.println("�������� " + b + "�Դϴ�.");
		}
	}

	void method() {
		class LocalA { // ���� Ŭ���� ȣ��
			LocalA() {
				System.out.println("���� Ŭ������ �����Ǿ����ϴ�.");
			}
		}
		LocalA lo = new LocalA();
	}

}
