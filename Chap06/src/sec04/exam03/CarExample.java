package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {

		// ��ü �����ؼ�
		// CarŬ������ �ʵ� gas�� ���� 10���� ����

		Car car = new Car();

		car.setGas(10);

		// isLeftGas() �޼ҵ� ȣ��

//		car.isLeftGas();

		// 2. isLeftGas() �޼ҵ��� ���ϰ� Ȱ��
		// ������ �ִٸ� "����մϴ�" ��� �� run()�޼ҵ� ����.
		if (car.isLeftGas()) {
			System.out.println("����մϴ�.");
			car.run();
		}

		// 3. ������ �ִٸ� "������ ������ �ʿ䰡 �����ϴ�." ���
		// ���ٸ� "������ �����ϼ���"�� ���
		if (car.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}

	}

}
