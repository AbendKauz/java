package sec01.exam04;

public class MyClass {

	// -> 필드
	// rc : RemoteControl 타입 / Television 객체를 초기값으로 대입
	//
	// -> 생성자
	// - 기본생성자 생성
	// - 매개변수 1개 선언 ( RemoteControl 타입 )
	// : 받아온 매개값으로 필드 초기화
	// : 매개값으로 받아온 구현 객체의 메소드 turnOn( ), setVolume( ) 호출하기
	// * setVolume( ) 의 매개값은 4
	// -> 메소드
	// - methodA( ) : 리턴타입 X / 매개변수 X
	// => 로컬변수 rc는 RemoteControl 인터페이스 타입으로 선언 / Audio 객체를 초기값으로 대입
	// Audio 구현 객체의 메소드 turnOn( ), setVolume( ) 호출하기
	// * setVolume( ) 의 매개값은 3
	// - methodB( ) : 리턴타입 X / 매개변수 1개 선언 ( RemoteControl 타입 )
	// => 외부로부터 매개값으로 받아온 구현 객체의메소드 turnOn( ), setVolume( ) 호출하기
	// * setVolume( ) 의 매개값은 2

	RemoteControl rc = new Television();

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(4);
	}

	public MyClass() {
	}

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(2);
	}

}
