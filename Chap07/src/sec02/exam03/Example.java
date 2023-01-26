package sec02.exam03;

public class Example {

	public static void main(String[] args) {

		// 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// * 바로 위 부모가 아니더라도 상속 계층에서 상위 타입인 경우
		// 자동 타입 변환 일어날 수 있음

		// A 클래스 타입으로 자동 타입 변환
		A a1 = b; // 가능
		A a2 = c; // 가능
		A a3 = d; // 가능
		A a4 = e; // 가능

		// B 클래스 타입으로 자동 타입 변환
		B b1 = d; // 가능
//		B b2 = e; // 불가능 (상속 관계에 있지 않기 때문 자동 타입변환 시 에러 발생)

		// C 클래스 타입으로 자동 타입 변환
		C c1 = e; // 가능
//		C c2 = d; // 불가능 (상속 관계에 있지 않기 때문 자동 타입변환 시 에러 발생)

	}

}
