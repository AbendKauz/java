package sec03.exam09;

public class Circle {

	private int radius; // ������

	// ������
	public Circle(int radius) {
		this.radius = radius;
	}

	// ���� ���̸� ���ϴ� �޼ҵ�
	double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "���� ������ : " + radius + ", ���� ���� : " + this.getArea();
	}

}
