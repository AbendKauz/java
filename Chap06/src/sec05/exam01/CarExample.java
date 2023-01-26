package sec05.exam01;

public class CarExample {

	public static void main(String[] args) {

		// 인스턴스 멤버
//		Car car1 = new Car();
//		System.out.println(car1.gas);	// 인스턴스 필드
//		
//		car1.method1();	// 인스턴스 메소드

		// 정적 멤버
		// System.out.println(car1.gas1); // 정적 필드 -> 경고

		// 정적 멤버 사용 방법 (객체를 생성하지 않음)
		// -> 클래스이름.필드
		// 클래스이름.메소드

		System.out.println(Car.gas1); // 정적 필드
		Car.method2(); // 정적 메소드

	}

}
