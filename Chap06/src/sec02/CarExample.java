package sec02;

public class CarExample {

	public static void main(String[] args) {

		// Car Ŭ������ �ִ� �ʵ� 5�� -> �ʵ尪�� �о��
		// -> ��ü�� ����
		Car car1 = new Car(); // car1 ��ü ����

		// �ڵ���1
		// ����ȸ�� : �����ڵ���
		// �𵨸� : �׷���
		// ���� : ����
		// �ִ�ӵ� : 350
		// ����ӵ� : 0

		System.out.println("����ȸ�� : " + car1.company);
		System.out.println("�𵨸� : " + car1.model);
		System.out.println("���� : " + car1.color);
		System.out.println("�ִ�ӵ� : " + car1.maxSpeed);
		System.out.println("����ӵ� : " + car1.speed);

		System.out.println("-----------------------------");

		// �ڵ���2
		// ����ȸ�� : ����ڵ���
		// �𵨸� : ī�Ϲ�
		// ���� : ����
		// �ִ�ӵ� : 380
		// ����ӵ� : 100

		Car car2 = new Car();
		System.out.println("�ڵ���2");

		System.out.println("�ʵ尪 ���� �� : " + car2.company);
		car2.company = "����ڵ���";
		System.out.println("����ȸ�� : " + car2.company);

		car2.model = "ī�Ϲ�";
		System.out.println("�𵨸� : " + car2.model);

		car2.color = "����";
		System.out.println("���� : " + car2.color);

		car2.maxSpeed = 380;
		System.out.println("�ְ�ӵ� : " + car2.maxSpeed);

		car2.speed = 100;
		System.out.println("����ӵ� : " + car2.speed);

	}

}
