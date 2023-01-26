package sec03.exam09;

public class Circle {

	private int radius; // 반지름

	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}

	// 원의 넓이를 구하는 메소드
	double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "원의 반지름 : " + radius + ", 원의 넓이 : " + this.getArea();
	}

}
