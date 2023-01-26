package sec01.exam01;

class A { // 외부(바깥) 클래스(Outer class)

	A() {
		System.out.println("A객체가 생성되었습니다.");
	}

	class B { // 인스턴스 멤버 클래스
		// A 객체를 생성해야만 사용할 수 있는 B 클래스

		B() {
			System.out.println("B객체가 생성되었습니다.");
		} // 생성자

		int field1; // 인스턴스 필드
//		static int field2;	// 정적 필드(사용불가)

		void method1() {
		} // 인스턴스 메소드
//		static void method2() {}	// 정적 메소드(사용불가)
	}

	static class C { // 정적 멤버 클래스
		// A 클래스로 바로 접근할 수 있는 C 클래스
		C() {
			System.out.println("C객체가 생성되었습니다.");
		} // 생성자

		int field1; // 인스턴스 필드
		static int field2; // 정적 필드

		void method1() {
		} // 인스턴스 메소드

		static void method2() {
		} // 정적 메소드
	}

	void method() {

		class D { // 로컬 클래스
			// method()가 실행할 때만 사용할 수 있는 B 클래스
			D() {
				System.out.println("D객체가 생성되었습니다.");
			} // 생성자

			int field1; // 인스턴스 필드
//			static int field2;	// 정적 필드(사용불가)

			void method1() {
			} // 인스턴스 메소드
//			static void method2() {}	// 정적 메소드(사용불가)
		}

		D d = new D();
		// └> D객체가 생성되었습니다. 출력
		// -> Main.java에서 method() 호출 시 출력됨

	}

}
