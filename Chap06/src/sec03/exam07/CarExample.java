package sec03.exam07;

public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();

		System.out.println("���� �� : " + car1.getSpeed()); // ���� ������
		car1.setSpeed(-40); // ���� ������
		System.out.println("���� �� : " + car1.getSpeed());

	}

}
