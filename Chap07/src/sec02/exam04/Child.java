package sec02.exam04;

public class Child extends Parent {

	// �޼ҵ� �������� public / ����Ÿ�� X
	// method2 -> �θ�Ŭ������ �޼ҵ� ������
	// -> �ڽ�Ŭ������ method2 ȣ�� ���

	// �θ�Ŭ������ �޼ҵ� ������

	@Override
	public void method2() {
		System.out.println("�ڽ�Ŭ������ method2 ȣ��");
	}

	// method3 -> �ڽ�Ŭ������ method3 ȣ�� ���

	public void method3() {
		System.out.println("�ڽ�Ŭ������ method3 ȣ��");
	}

}
