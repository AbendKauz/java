package sec02.exam01;

public class Anonymous {

	// 첫번째 : 필드 초기값으로 대입
	Person field = new Person() {

		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	}; // field

	void method1() {

		// 두번째 : 로컬 변수 값으로 익명 객체 대입
		Person localVar = new Person() {

			// 로컬 변수 값으로 익명 객체 대입
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}

		}; // new Person()

		// 로컬 변수 사용
		localVar.wake();

	} // localVar

	void method2(Person person) {
		person.wake();
	}

} // class
