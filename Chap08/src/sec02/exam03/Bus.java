package sec02.exam03;

public class Bus implements Vehicle {

	// -> �޼ҵ�
	// run( ) : "������ �޸��ϴ�." �� ���
	// checkFare( ) : �������� public / ����Ÿ�� X / �Ű����� X
	// "��������� üũ�մϴ�" �� ���

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}

}
