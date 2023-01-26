package sec05.exam02;

public class Calculator {

	// 인스턴스 필드
	// -> String 타입의 color
	String color;

	// 정적 필드
	// -> double 타입의 pi (3.14159)
	static double pi = 3.14159;

	// 정적 메소드
	// 1. plus(int x, int y) -> 합계를 리턴하는 메소드
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}

}
