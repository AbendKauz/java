package sec01.exam04;

public class MyClass {

	// -> �ʵ�
	// rc : RemoteControl Ÿ�� / Television ��ü�� �ʱⰪ���� ����
	//
	// -> ������
	// - �⺻������ ����
	// - �Ű����� 1�� ���� ( RemoteControl Ÿ�� )
	// : �޾ƿ� �Ű������� �ʵ� �ʱ�ȭ
	// : �Ű������� �޾ƿ� ���� ��ü�� �޼ҵ� turnOn( ), setVolume( ) ȣ���ϱ�
	// * setVolume( ) �� �Ű����� 4
	// -> �޼ҵ�
	// - methodA( ) : ����Ÿ�� X / �Ű����� X
	// => ���ú��� rc�� RemoteControl �������̽� Ÿ������ ���� / Audio ��ü�� �ʱⰪ���� ����
	// Audio ���� ��ü�� �޼ҵ� turnOn( ), setVolume( ) ȣ���ϱ�
	// * setVolume( ) �� �Ű����� 3
	// - methodB( ) : ����Ÿ�� X / �Ű����� 1�� ���� ( RemoteControl Ÿ�� )
	// => �ܺηκ��� �Ű������� �޾ƿ� ���� ��ü�Ǹ޼ҵ� turnOn( ), setVolume( ) ȣ���ϱ�
	// * setVolume( ) �� �Ű����� 2

	RemoteControl rc = new Television();

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(4);
	}

	public MyClass() {
	}

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(2);
	}

}
