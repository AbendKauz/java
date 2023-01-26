package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		// 다른 외부 클래스에서 메소드를 호출 시
		// -> 객체를 생성하고, 변수명.메소드명 -> 메소드 호출
		Calculator cal = new Calculator();

		cal.powerOn();
		cal.powerOff();

		int num1 = cal.add(5, 6);
		double num2 = cal.div(10, 4);
		System.out.println("add : 5 + 6 = " + num1);
		System.out.println("div : 10 / 4 = " + num2);

	}

}
