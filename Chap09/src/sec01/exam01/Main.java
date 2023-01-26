package sec01.exam01;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		// └> A객체가 생성되었습니다. 출력

		A.B b = a.new B(); // 인스턴스 멤버 클래스 객체 생성
		// └> B객체가 생성되었습니다. 출력
		b.field1 = 3;
		b.method1();

		A.C c = new A.C(); // 정적 멤버 클래스 객체 생성
		// └> C객체가 생성되었습니다. 출력
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();

		a.method(); // 로컬 클래스의 메소드 호출

	}

}
