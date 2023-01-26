package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {

		// * 정적 멤버 사용
		// -> 객체를 생성하지 않고 클래스.필드 // 클래스.메소드()

		// 1. 정적 필드 pi
		// -> 반지름이 10인 원의 넓이를 출력
		System.out.println(Calculator.pi * 10 * 10);

		// 2. 정적 메소드 plus()
		// -> 7, 14의 합을 출력
		System.out.println(Calculator.plus(7, 14));

		// * 인스턴스 멤버 -> 객체부터 생성 후 접근
		Calculator cal = new Calculator();
		System.out.println(cal.color);

	}

}
