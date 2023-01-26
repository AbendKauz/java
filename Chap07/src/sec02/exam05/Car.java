package sec02.exam05;

public class Car {

	// -> �ʵ� (4���� Tire �ʵ�) -> Ÿ�̾��� ��ġ�� �ִ� ȸ���� �Ű���
	// frontLeftTire : Tire Ŭ���� Ÿ������ ��ü�� ���� �� ���� / �Ű��� - �տ���, 6
	// frontRightTire : Tire Ŭ���� Ÿ������ ��ü�� ���� �� ���� / �Ű��� - �տ�����, 2
	// backLeftTire : Tire Ŭ���� Ÿ������ ��ü�� ���� �� ���� / �Ű��� - �ڿ���, 3
	// backRightTire : Tire Ŭ���� Ÿ������ ��ü�� ���� �� ���� / �Ű��� - �ڿ�����, 4

	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);

	// -> �޼ҵ�
	// 1. run( ) : 4���� Ÿ�̾ �ѹ��� 1ȸ�� ��Ű�� �޼ҵ�
	// ������ Tire ��ü�� roll( ) �޼ҵ带 ȣ���ؼ� ���ϰ��� false���(��ũ)
	// -> stop( ) �޼ҵ带 ȣ�� �ϰ� �ش� ��ġ�� Ÿ�̾� ��ȣ�� ����
	// : ���� Ÿ�� int // "[�ڵ����� �޸��ϴ�.]" �� ��� ��

	// * run() �� ���ϰ��� ��ũ�� �� Ÿ�̾��� ��ȣ�� �����ϵ��� �� -> Tire Ŭ������ roll() Ȱ��
	// -> ������ Ÿ�̾ 1ȸ�� ��Ų ���� ����� ��
	// frontLeftTire Ÿ�̾ ��ũ�� �� --> ���ϰ� 1
	// frontRightTire Ÿ�̾ ��ũ�� �� --> ���ϰ� 2
	// backLeftTire Ÿ�̾ ��ũ�� �� --> ���ϰ� 3
	// backRightTire Ÿ�̾ ��ũ�� �� --> ���ϰ� 4
	// ��� Ÿ�̾ ��ũ�� ���� ���� --> ���ϰ� 0

	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if (!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if (!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if (!backLeftTire.roll()) {
			stop();
			return 3;
		}
		if (!backRightTire.roll()) {
			stop();
			return 4;
		}
//		if(frontLeftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		if(frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if(backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if(backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
		return 0;
	}

	// 2. stop( ) : Ÿ�̾ ��ũ�� �� �� �ڵ����� ���ߴ� �޼ҵ�
	// : ���� Ÿ�� X / "[�ڵ����� ����ϴ�.]" �� ���

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}
