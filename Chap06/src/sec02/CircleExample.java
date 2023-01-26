package sec02;

public class CircleExample {

	public static void main(String[] args) {

		// Circle 클래스 내부의 필드 radius 읽기 (출력)

		Circle cir = new Circle();

		System.out.println("변경 전 : " + cir.radius);

		// -> 값을 5로 변경 후 출력

		cir.radius = 5;

		System.out.println("변경 후 : " + cir.radius);

		// 반지름이 5인 원의 넓이 : 78.5
		// (원의 넓이 구하는 공식 : 반지름 * 반지름 * 3.14)

//		double a = cir.radius * cir.radius * 3.14;
//		System.out.println("반지름이 "+ (int)cir.radius + "인 원의 넓이 : " + a);

		cir.getArea();

		cir.getArea(3); // 3을 매개값으로 지정한 후 getArea()메소드 호출

	}

}
