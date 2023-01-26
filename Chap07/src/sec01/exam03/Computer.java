package sec01.exam03;

public class Computer extends Calculator {

	// 메소드 재정의(오버라이딩)
	double areaCircle(double r) {
		System.out.println("Computer(자식클래스)의 메소드 실행");
		System.out.println(Math.PI);
		return Math.PI * r * r;
	}

}
