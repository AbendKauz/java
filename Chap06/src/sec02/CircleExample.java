package sec02;

public class CircleExample {

	public static void main(String[] args) {

		// Circle Ŭ���� ������ �ʵ� radius �б� (���)

		Circle cir = new Circle();

		System.out.println("���� �� : " + cir.radius);

		// -> ���� 5�� ���� �� ���

		cir.radius = 5;

		System.out.println("���� �� : " + cir.radius);

		// �������� 5�� ���� ���� : 78.5
		// (���� ���� ���ϴ� ���� : ������ * ������ * 3.14)

//		double a = cir.radius * cir.radius * 3.14;
//		System.out.println("�������� "+ (int)cir.radius + "�� ���� ���� : " + a);

		cir.getArea();

		cir.getArea(3); // 3�� �Ű������� ������ �� getArea()�޼ҵ� ȣ��

	}

}
