package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {

		// -> ������ �������̽�, Ŭ�������� Ȱ���ؼ� �Ʒ��� ���� ��µǴ� �ڵ带 �ۼ��Ͻÿ�.
		// -> Driver Ŭ������ drive �޼ҵ带 ȣ��
		// -> <console>
		// ��������� üũ�մϴ�.
		// ������ �޸��ϴ�.
		// �ýð� �޸��ϴ�.

		Driver driver = new Driver();

		driver.drive(new Bus());
		System.out.println("=================");
		driver.drive(new Taxi());

	}

}
