package sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {

		// -> ������ �������̽�, Ŭ�������� Ȱ���ؼ� �Ʒ��� ���� ��µǴ� �ڵ带 �ۼ��Ͻÿ�.
		//
		// -> <console>
		// ������ �޸��ϴ�.
		// �ýð� �޸��ϴ�.

		Driver driver = new Driver();
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		driver.drive(bus);
//		driver.drive(taxi);
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
