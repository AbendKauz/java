package sec02.exam01;

public class Anonymous {

	// ù��° : �ʵ� �ʱⰪ���� ����
	Person field = new Person() {

		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}

	}; // field

	void method1() {

		// �ι�° : ���� ���� ������ �͸� ��ü ����
		Person localVar = new Person() {

			// ���� ���� ������ �͸� ��ü ����
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}

		}; // new Person()

		// ���� ���� ���
		localVar.wake();

	} // localVar

	void method2(Person person) {
		person.wake();
	}

} // class
