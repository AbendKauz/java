package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {

		// -> 추상클래스의 객체를 생성해보기
		// -> 만들어둔 turnOn( ), turnOff( ), internetSearch( ) 메소드를 호출하기

		// * Phone클래스는 추상클래스
		// : new 연산자로 직접적으로 생성자 호출 불가
		// -> 상속을 통해 자식클래스를 만들 수 있도록 부모 역할만 수행
//		Phone phone1 = new Phone();	// error
		// ->Cannot instantiate the type Phone

		SmartPhone phone = new SmartPhone("aaa");

		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();

	}

}
