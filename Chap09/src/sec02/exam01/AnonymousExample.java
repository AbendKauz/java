package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		anony.field.wake(); // ù��° : �͸� ��ü �ʵ带 ���

		anony.method1(); // �ι�° : �͸� ��ü ���� ������ ���

		anony.method2( // �͸� ��ü �Ű����� ���

				new Person() { // ����° : �Ű������� �͸� ��ü ����

					void study() {
						System.out.println("�����մϴ�.");
					}

					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}

				} // Person()

		); // method2()

	} // main()

}
