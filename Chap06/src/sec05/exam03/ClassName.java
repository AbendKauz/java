package sec05.exam03;

public class ClassName {

	// 인스턴스 필드 / 인스턴스 메소드
	int field1;

	void method1() {

	}

	// 정적 필드 / 정적 메소드
	static int field2;

	static void method2() {

	}

	// * 정적 메소드 선언 시 주의할 점
	// 1. 메소드 내부에 인스턴스 필드나 인스턴스 메소드 사용 불가
	// 2. 객체 자신 참조하는 this 키워드 사용 불가

	// 정적 메소드
	static void method3() {
//		field1 = 10;	// 인스턴스 멤버 사용 시 error
//		method1();		// 인스턴스 메소드 사용 시 error

//		this.field2 = 20;	// this 키워드 사용 불가

		field2 = 20; // 정적 멤버 사용 가능
		method2(); // 정적 메소드 사용 가능

		// * 정적 메소드 안에서 인스턴스 멤버(필드, 메소드)를 사용하고 싶다면?
		// -> 객체를 먼저 생성하고 참조변수로 접근

		ClassName cla = new ClassName(); // 객체 생성
		cla.field1 = 10; // 참조변수로 접근
		cla.method1();

	}

}
