package sec02.exam02;

public class InsectExample {

	public static void main(String[] args) {
		// 1 : �͸�ü �ʵ� ���
		Anonymous anony = new Anonymous();
		anony.spider1.attack();

		// 2 : ���ú����� �͸�ü ����
		anony.method1();

		// 3 : �Ű������� �͸�ü ���
		anony.method2(new Insect() {
			String name = "Ÿ��ƫ��";

			void cobweb() {
				System.out.println("�ٴڿ� �Ź����� ģ��.");
			}

			@Override
			void attack() {
				System.out.println(name + " ���Ϸ� ������.");
				cobweb();
			}
		});

		// �͸�ü�� ���Ӱ� ���ǵ� �ʵ�� ����� �Ұ����ϴ�.
//		anony.spider1.name = "�հŹ�";	// ��� �Ұ�  
//		anony.spider1.cobweb();	// ��� �Ұ�
		anony.spider1.attack(); // ��� ����

	}

}
