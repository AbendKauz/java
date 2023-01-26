package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {

		// ������ 4���� ������ ��ü 4���� ������

		// ��ü 1 : �׳� ���
		Car car1 = new Car();
		System.out.println("��ü1");
		System.out.println("ȸ��� : " + car1.company);
		System.out.println("�𵨸� : " + car1.model);
		System.out.println("���� : " + car1.color);
		System.out.println("�ִ�ӵ� : " + car1.maxSpeed);
		System.out.println();

		// ��ü 2
		// �𵨸� : ����
		Car car2 = new Car("����");
		System.out.println("��ü2");
		System.out.println("�𵨸� : " + car2.model);
		System.out.println();

		// ��ü 3
		// �𵨸� : �ý�
		// ���� : ���
		Car car3 = new Car("�ý�", "���");
		System.out.println("��ü3");
		System.out.println("�𵨸� : " + car3.model);
		System.out.println("���� : " + car3.color);
		System.out.println();

		// ��ü 4
		// �𵨸� : �ڰ���
		// ���� : ����
		// �ִ�ӵ� : 300
		Car car4 = new Car("�ڰ���", "����", 300);
//		System.out.println("��ü4");
//		System.out.println("�𵨸� : " + car4.model);
//		System.out.println("���� : " + car4.color);
//		System.out.println("�ִ�ӵ� : " + car4.maxSpeed);

		// �Ʒ� �� �ڵ�� ���� �ڵ�
		// -> car4�� ����ϸ� �ڵ����� .toString()���� ��ȯ��
		System.out.println(car4);
		System.out.println(car4.toString());

		// �ڹٿ��� Object Ŭ������ �ڹ� Ŭ������ �ֻ��� Ŭ������
		// -> �ڹ��� ��� Ŭ�������� Object Ŭ������ ��ӹ���

		// toString() : Object Ŭ������ ���� �ִ� �޼ҵ�
		// -> ��� : ��ü�� ���������� class��@16������ �ؽ��ڵ�� ���
		// ===> �ʿ信 ���� �������̵� �Ͽ� �ʿ��� ������ ���� ���� ����� �� ����
		// (������)

		// �����ε� VS �������̵� ������
		// 1. �����ε�(�޼ҵ� �����ε� / ������ �����ε�) - �ߺ�����
		// - ���� �̸��� �޼ҵ带 ������ ����
		// - �Ű������� Ÿ��, ����, ������ �޶�� ��
		// - ����Ÿ���� �������

		// 2. �������̵�(������)
		// - ����Ŭ������ �޼ҵ带 ����Ŭ�������� ������(�ٽ� ����)�ϴ� ��
		// - �޼ҵ��� �̸�, �Ű����� Ÿ��, ���� ��� �����ؾ� ��.
		// - �޼ҵ� �ȿ� �ִ� ����(�ڵ�)�� �����ϴ� ��

		// ���� | �����ε� | �������̵�
		// ___________|__________|_____________
		// �޼ҵ� �̸� | ���� | ����
		// �Ű�����, Ÿ��| �ٸ� | ����
		// ����Ÿ�� | ������� | ����

	}

}
