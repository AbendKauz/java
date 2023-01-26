package sec02.exam02;

public class InsectExample {

	public static void main(String[] args) {
		// 1 : 익명객체 필드 사용
		Anonymous anony = new Anonymous();
		anony.spider1.attack();

		// 2 : 로컬변수로 익명객체 대입
		anony.method1();

		// 3 : 매개변수로 익명객체 사용
		anony.method2(new Insect() {
			String name = "타란튤라";

			void cobweb() {
				System.out.println("바닥에 거미줄을 친다.");
			}

			@Override
			void attack() {
				System.out.println(name + " 독니로 깨문다.");
				cobweb();
			}
		});

		// 익명객체에 새롭게 정의된 필드는 사용이 불가능하다.
//		anony.spider1.name = "왕거미";	// 사용 불가  
//		anony.spider1.cobweb();	// 사용 불가
		anony.spider1.attack(); // 사용 가능

	}

}
