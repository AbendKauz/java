package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		anony.field.wake(); // 첫번째 : 익명 객체 필드를 사용

		anony.method1(); // 두번째 : 익명 객체 로컬 변수를 사용

		anony.method2( // 익명 객체 매개값을 사용

				new Person() { // 세번째 : 매개값으로 익명 객체 대입

					void study() {
						System.out.println("공부합니다.");
					}

					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}

				} // Person()

		); // method2()

	} // main()

}
