package sec02.exam02;

public class Anonymous {

	// 방법 1 : 필드값으로 익명 객체 대입
	Insect spider1 = new Insect() {
		String name = "무당거미";

		void cobweb() {
			System.out.println("사각형으로 거미줄을 친다.");
		}

		void attack() {
			System.out.println(name + " 독을 발사한다.");
			cobweb();
		}
	};

	// 방법 2 : 로컬변수값으로 익명 객체 대입
	void method1() {
		Insect spider2 = new Insect() {
			String name = "늑대거미";

			void cobweb() {
				System.out.println("육각형으로 거미줄을 친다.");
			}

			@Override
			void attack() {
				System.out.println(name + " 앞니로 문다.");
				cobweb();
			}
		};
		spider2.attack();
	}

	// 방법 3 : 로컬변수이기 때문에 메서드에서 바로 사용
	void method2(Insect spider) {
		spider.attack();
	}

}
