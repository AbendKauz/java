package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 5;

		Calculator cal1 = new Calculator();
		System.out.println("���� ���� : " + cal1.areaCircle(r));
		System.out.println("===================================");

		Computer com = new Computer();
		System.out.println("���� ���� : " + com.areaCircle(r));

	}

}
