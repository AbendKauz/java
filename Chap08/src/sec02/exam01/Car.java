package sec02.exam01;

public class Car {

	// -> 필드 (Tire 인터페이스 타입의 필드 4개)
	// frontLeftTire : Tire 인터페이스 타입으로 HankookTire 객체를 생성 후 대입
	// frontRightTire : Tire 인터페이스 타입으로 HankookTire 객체를 생성 후 대입
	// backLeftTire : Tire 인터페이스 타입으로 HankookTire 객체를 생성 후 대입
	// backRightTire : Tire 인터페이스 타입으로 HankookTire 객체를 생성 후 대입
	//
	// -> 메소드
	// 1. run( ) : 4개의 타이어를 한번씩 1회전 시키는 메소드
	// 각 필드의 roll( ) 메소드를 호출

	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	public void run() {
		frontLeftTire.roll("앞왼쪽");
		frontRightTire.roll("앞오른쪽");
		backLeftTire.roll("뒤왼쪽");
		backRightTire.roll("뒤오른쪽");
	}

}
