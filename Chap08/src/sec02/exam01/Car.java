package sec02.exam01;

public class Car {

	// -> �ʵ� (Tire �������̽� Ÿ���� �ʵ� 4��)
	// frontLeftTire : Tire �������̽� Ÿ������ HankookTire ��ü�� ���� �� ����
	// frontRightTire : Tire �������̽� Ÿ������ HankookTire ��ü�� ���� �� ����
	// backLeftTire : Tire �������̽� Ÿ������ HankookTire ��ü�� ���� �� ����
	// backRightTire : Tire �������̽� Ÿ������ HankookTire ��ü�� ���� �� ����
	//
	// -> �޼ҵ�
	// 1. run( ) : 4���� Ÿ�̾ �ѹ��� 1ȸ�� ��Ű�� �޼ҵ�
	// �� �ʵ��� roll( ) �޼ҵ带 ȣ��

	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	public void run() {
		frontLeftTire.roll("�տ���");
		frontRightTire.roll("�տ�����");
		backLeftTire.roll("�ڿ���");
		backRightTire.roll("�ڿ�����");
	}

}
