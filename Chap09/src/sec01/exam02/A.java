package sec01.exam02;

public class A { // 외부 클래스(outer Class)

	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();

	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	// 정적 필드 초기화
//	static B field3 = new B();	// 접근 불가능
	// -> 인스턴스 멤버 클래스는 정적 필드의 초기값 불가능
	static C field4 = new C();

	// 정적 메소드
	static void method2() {
//		B var1 = new B();	// 접근 불가능
		// -> 인스턴스 멤버 클래스는 정적 메소드에서의 객체 생성이 불가능
		C var2 = new C();
	}

	class B {
	} // 인스턴스 멤버 클래스

	static class C {
	} // 정적 멤버 클래스

}
