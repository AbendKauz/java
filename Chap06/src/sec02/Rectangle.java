package sec02;

public class Rectangle {

	// �ʵ� double�� width // �ʱⰪ X
	// height // �ʱⰪ X

	double width;
	double height;

	// �簢���� ���̸� �����ִ� �޼ҵ� ����� -> getArea()
	void getArea() {
		System.out.println(width * height);
	}

	// ����Ÿ���� ���� double Ÿ���� �Ű����� 2���� �ִ� getArea() �޼ҵ� �����
	void getArea(double w, double h) {
		System.out.println(w * h);
	}

//	** �޼ҵ� �����ε�(overloading)
//	- ���� �̸��� �޼ҵ带 ������ ����
//	- �Ű����� �پ��ϰ� �޾� ó���� �� �ֵ��� �ϱ� ����
//		-> �Ű������� Ÿ��, ����, ���� �� �ϳ��� �޶�� ��

	// RectangleExample���� 14�� 3�� �Ű������� ���� ȣ���� �̰����� ����
	// ������ �Ű����� �̸��� ������� ������ �� ����(�������� �������� ����õ��)
	double getArea2(double w, double h) {
		return w * h;
	}

}
