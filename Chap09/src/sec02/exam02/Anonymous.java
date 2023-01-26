package sec02.exam02;

public class Anonymous {

	// ��� 1 : �ʵ尪���� �͸� ��ü ����
	Insect spider1 = new Insect() {
		String name = "����Ź�";

		void cobweb() {
			System.out.println("�簢������ �Ź����� ģ��.");
		}

		void attack() {
			System.out.println(name + " ���� �߻��Ѵ�.");
			cobweb();
		}
	};

	// ��� 2 : ���ú��������� �͸� ��ü ����
	void method1() {
		Insect spider2 = new Insect() {
			String name = "����Ź�";

			void cobweb() {
				System.out.println("���������� �Ź����� ģ��.");
			}

			@Override
			void attack() {
				System.out.println(name + " �մϷ� ����.");
				cobweb();
			}
		};
		spider2.attack();
	}

	// ��� 3 : ���ú����̱� ������ �޼��忡�� �ٷ� ���
	void method2(Insect spider) {
		spider.attack();
	}

}
