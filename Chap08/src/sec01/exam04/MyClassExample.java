package sec01.exam04;

public class MyClassExample {

	public static void main(String[] args) {

		// -> ������ ���� �������̽��� Ŭ������ ����Ͽ� �Ʒ��� ���� ����ϱ�
		// 1) �ʵ�� ������ rc�� ����ϱ� (�������̽��� �ʵ� Ÿ������ ���) -> setVolume( ) �� �Ű����� 5
		// 2) �������� �Ű����� Ÿ���� RemoteControl �� �����ڸ� ����ϱ� (�������̽��� �������� �Ű� ���� Ÿ������ ���)
		// 3) methodA ����ϱ� (�������̽��� ���� ���� Ÿ������ ����� �޼ҵ�)
		// 4) methodB ����ϱ� (�������̽��� �޼ҵ��� �Ű� ���� Ÿ������ ����� �޼ҵ�)
		//
		// <console >
		// 1)----------------
		// TV�� �մϴ�.
		// ���� TV ����: 5
		// 2)----------------
		// Audio�� �մϴ�.
		// ���� Audio ����: 4
		// 3)----------------
		// Audio�� �մϴ�.
		// ���� Audio ����: 3
		// 4)----------------
		// TV�� �մϴ�.
		// ���� TV ����: 2

		MyClass my1 = new MyClass();
		System.out.println("1)----------------");
		my1.rc.turnOn();
		my1.rc.setVolume(5);

		System.out.println("2)----------------");
		MyClass my2 = new MyClass(new Audio());

		System.out.println("3)----------------");
		MyClass my3 = new MyClass();
		my3.methodA();

		System.out.println("4)----------------");
		MyClass my4 = new MyClass();
		my4.methodB(new Television());

	}

}
