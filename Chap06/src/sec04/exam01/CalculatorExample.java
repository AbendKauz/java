package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		// �ٸ� �ܺ� Ŭ�������� �޼ҵ带 ȣ�� ��
		// -> ��ü�� �����ϰ�, ������.�޼ҵ�� -> �޼ҵ� ȣ��
		Calculator cal = new Calculator();

		cal.powerOn();
		cal.powerOff();

		int num1 = cal.add(5, 6);
		double num2 = cal.div(10, 4);
		System.out.println("add : 5 + 6 = " + num1);
		System.out.println("div : 10 / 4 = " + num2);

	}

}
