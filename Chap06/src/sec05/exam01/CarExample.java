package sec05.exam01;

public class CarExample {

	public static void main(String[] args) {

		// �ν��Ͻ� ���
//		Car car1 = new Car();
//		System.out.println(car1.gas);	// �ν��Ͻ� �ʵ�
//		
//		car1.method1();	// �ν��Ͻ� �޼ҵ�

		// ���� ���
		// System.out.println(car1.gas1); // ���� �ʵ� -> ���

		// ���� ��� ��� ��� (��ü�� �������� ����)
		// -> Ŭ�����̸�.�ʵ�
		// Ŭ�����̸�.�޼ҵ�

		System.out.println(Car.gas1); // ���� �ʵ�
		Car.method2(); // ���� �޼ҵ�

	}

}
