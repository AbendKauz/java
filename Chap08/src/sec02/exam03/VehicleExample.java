package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {

		// -> Vehicle �������̽� Ÿ���� ������ Bus ��ü�� ������ ��
		// run( ) , checkFare( ) �޼ҵ� ȣ���ϱ�

		Vehicle vehicle = new Bus(); // �ڵ� Ÿ�� ��ȯ
		vehicle.run();
//		vehicle.checkFare();	// Vehicle �������̽����� checkFare()�� ���� 

		// �ڵ�Ÿ�Ժ�ȯ �Ǿ��� vehicle ������ ����Ÿ�Ժ�ȯ(Bus ���� Ŭ���� Ÿ������)
		// * ���� Ÿ�� ��ȯ
		// ����Ŭ���� ���� = (����Ŭ����) �������̽� ����;
		Bus bus = (Bus) vehicle; // ���� Ÿ�� ��ȯ
		bus.checkFare(); // ���� Ÿ�� ��ȯ�� �������� ������ checkFare() ȣ��

	}

}
