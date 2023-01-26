package sec01.exam02;

class OuterClass {
	// 외부클래스 OuterClass
	// 인스턴스 멤버 클래스 InstanceA
	// 변수
	// 메소드
	// 출력 : 인스턴스 클래스가 생성되었습니다.
	// 출력 : 변수값 출력
	// ex) 변수 t = 5;
	// 변수값은 5입니다.

	// 정적 멤버 클래스 StaticA
	// 변수
	// 메소드
	// 출력 : 정적 클래스가 생성되었습니다.
	// 출력 : 변수값 출력

	// 로컬 클래스(LocalA)
	// 출력문 : 로컬 클래스가 생성되었습니다.

	class InstanceA { // 인스턴스 클래스
		int a = 5;

//		int a;
		void method1() {
		}

		InstanceA() {
			System.out.println("인스턴스 클래스가 생성되었습니다.");
			System.out.println("변수값은 " + a + "입니다.");
		}
	}

	static class StaticA { // 정적 클래스
		static int b = 3;

//		static int b;
		static void method2() {
		};

		StaticA() {
			System.out.println("정적 클래스가 생성되었습니다.");
			System.out.println("변수값은 " + b + "입니다.");
		}
	}

	void method() {
		class LocalA { // 로컬 클래스 호출
			LocalA() {
				System.out.println("로컬 클래스가 생성되었습니다.");
			}
		}
		LocalA lo = new LocalA();
	}

}
