package sec02;

public class Circle {

	// �ʵ� double�� radius // �ʱⰪ X

	// class �������

	double radius; // 1. �ʵ� - ������

	// 2. method
	void getArea() {
		System.out.println(radius * radius * 3.14);
	}

	// method overloading
	// --> ���� �̸��� method�� ������ ����
	// ���� : �Ű����� �پ��ϰ� �޾Ƽ� ó���ϱ� ����
	// ��� : �Ű������� Ÿ��, ����, ���� �� �ϳ��� �޶����

	// CircleExample���� 3�� �Ű����� ���� ȣ���� �̰����� �޾���
	// -> ���� getArea()���� ���� �� �ִ� �Ű����� ������ �ȵǾ��־
	void getArea(double rad) { // ���� getArea()�� �̸��� ������ �Ű����� �ޱ� ������ ������ ������ ���� -> �����ε�
		System.out.println(rad * rad * 3.14);
	}

}
