package sec02.exam04;

public class Driver {
	// -> �޼ҵ�
	// drive( ) : �������� public / ����Ÿ�� ���� / �Ű����� - Vehicle �������̽� Ÿ������ �ϳ� ���� /
	// -----> Vehicle �������̽��� run �޼ҵ� ȣ��
	// -----> ���࿡ ���� �Ű����� Bus ��ü��� checkFare( ) �޼ҵ带 ȣ��
	// -----> run( ) �޼ҵ� ȣ��

	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
