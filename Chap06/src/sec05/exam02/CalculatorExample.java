package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {

		// * ���� ��� ���
		// -> ��ü�� �������� �ʰ� Ŭ����.�ʵ� // Ŭ����.�޼ҵ�()

		// 1. ���� �ʵ� pi
		// -> �������� 10�� ���� ���̸� ���
		System.out.println(Calculator.pi * 10 * 10);

		// 2. ���� �޼ҵ� plus()
		// -> 7, 14�� ���� ���
		System.out.println(Calculator.plus(7, 14));

		// * �ν��Ͻ� ��� -> ��ü���� ���� �� ����
		Calculator cal = new Calculator();
		System.out.println(cal.color);

	}

}
