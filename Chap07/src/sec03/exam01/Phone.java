package sec03.exam01;

public abstract class Phone {

	// -> �ʵ�
	// owner : �������� public / String Ÿ�� (���� ������)
	// -> ������ :
	// -> �������� public / �Ű����� - ���� ������
	// -> �Ű������� �ʵ� �ʱ�ȭ
	// -> �޼ҵ�
	// 1. turnOn( ) : �������� public / ����Ÿ�� ���� / �Ű����� X /
	// -----> "�� ������ �մϴ�." �� ���
	// 2. turnOff( ) : �������� public / ����Ÿ�� ���� / �Ű����� X /
	// -----> "�� ������ ���ϴ�." �� ���

	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
