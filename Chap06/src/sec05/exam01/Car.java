package sec05.exam01;

public class Car {

	// 필드
	int gas = 5; // -> 인스턴스 필드

	static int gas1; // -> 정적 필드

	// 메소드
	void method1() { // -> 인스턴스 메소드
		System.out.println("안녕하세요. 인스턴스");
	}

	static void method2() { // -> 정적 메소드
		System.out.println("안녕하세요. 정적 메소드");
	}

}
