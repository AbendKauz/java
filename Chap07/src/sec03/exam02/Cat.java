package sec03.exam02;

public class Cat extends Animal {

	// -> �߻�Ŭ���� Animal ����ϰ�
	// �⺻������ - �Ű����� ����, kind �ʵ常 "������" ��� ������ �ʱ�ȭ
	// -> �߻� �޼ҵ� ������
	// - Cat Ŭ���� -> �߻� �޼ҵ� ���� �ڵ� -> "�߿�" �� ���

	public Cat() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�߿�");
	}

}
