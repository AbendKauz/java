package sec03.exam02;

public abstract class Animal {

	// -> �ʵ�
	// kind : �������� public / String Ÿ��
	// -> �޼ҵ�
	// 1. breathe( ) : �������� public / ����Ÿ�� ���� / �Ű����� X /
	// -----> "���� ���ϴ�." �� ���
	// 2. sound( ) : �߻� �޼ҵ� / �������� public / ����Ÿ�� ���� / �Ű����� X

	public String kind;

	public void breathe() {
		System.out.println("���� ���ϴ�.");
	};

	// �߻�޼ҵ� -> ����κи� �ְ�, { } ����κ��� ���� �޼ҵ�
	// -> �Ϲ� Ŭ���������� ���� �Ұ� // �߻� Ŭ���������� ��� ����
	public abstract void sound();

}
