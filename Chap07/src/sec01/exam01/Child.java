package sec01.exam01;

// extends Parent : ��ӹ��� �θ�Ŭ���� ����
public class Child extends Parent {

	// �ʵ�
	int chField = 5;

	// ������
	public Child(int paField, int chField) {
		super(paField); // �θ������ ȣ��
		this.chField = chField;
	}

	// �θ� Ŭ������ ���� �����ڸ� ������� ���
	// -> �ڽ� �����ڿ��� �ݵ�� �θ� ������ ȣ�� -> ȣ�� ���� �� error
	// ------------------------------
	// super(�θ� Ŭ������ �������� �Ű���, ...);
	// * �ݵ�� �ڽ� ������ �� ù�ٿ� ��ġ�ؾ� ��
	// -> ������ �ٲ� ��� error �߻�

}
