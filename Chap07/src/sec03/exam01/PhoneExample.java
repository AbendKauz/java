package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {

		// -> �߻�Ŭ������ ��ü�� �����غ���
		// -> ������ turnOn( ), turnOff( ), internetSearch( ) �޼ҵ带 ȣ���ϱ�

		// * PhoneŬ������ �߻�Ŭ����
		// : new �����ڷ� ���������� ������ ȣ�� �Ұ�
		// -> ����� ���� �ڽ�Ŭ������ ���� �� �ֵ��� �θ� ���Ҹ� ����
//		Phone phone1 = new Phone();	// error
		// ->Cannot instantiate the type Phone

		SmartPhone phone = new SmartPhone("aaa");

		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();

	}

}
