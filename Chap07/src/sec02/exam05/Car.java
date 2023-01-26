package sec02.exam05;

public class Car {

	// -> 필드 (4개의 Tire 필드) -> 타이어의 위치와 최대 회전수 매개값
	// frontLeftTire : Tire 클래스 타입으로 객체를 생성 후 대입 / 매개값 - 앞왼쪽, 6
	// frontRightTire : Tire 클래스 타입으로 객체를 생성 후 대입 / 매개값 - 앞오른쪽, 2
	// backLeftTire : Tire 클래스 타입으로 객체를 생성 후 대입 / 매개값 - 뒤왼쪽, 3
	// backRightTire : Tire 클래스 타입으로 객체를 생성 후 대입 / 매개값 - 뒤오른쪽, 4

	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);

	// -> 메소드
	// 1. run( ) : 4개의 타이어를 한번씩 1회전 시키는 메소드
	// 각각의 Tire 객체의 roll( ) 메소드를 호출해서 리턴값이 false라면(펑크)
	// -> stop( ) 메소드를 호출 하고 해당 위치의 타이어 번호를 리턴
	// : 리턴 타입 int // "[자동차가 달립니다.]" 를 출력 후

	// * run() 의 리턴값은 펑크가 난 타이어의 번호를 리턴하도록 함 -> Tire 클래스의 roll() 활용
	// -> 각각의 타이어를 1회전 시킨 후의 결과를 비교
	// frontLeftTire 타이어가 펑크가 남 --> 리턴값 1
	// frontRightTire 타이어가 펑크가 남 --> 리턴값 2
	// backLeftTire 타이어가 펑크가 남 --> 리턴값 3
	// backRightTire 타이어가 펑크가 남 --> 리턴값 4
	// 어떠한 타이어도 펑크가 나지 않음 --> 리턴값 0

	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if (!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if (!backLeftTire.roll()) {
			stop();
			return 3;
		}
		if (!backRightTire.roll()) {
			stop();
			return 4;
		}
//		if(frontLeftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		if(frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if(backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if(backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
		return 0;
	}

	// 2. stop( ) : 타이어에 펑크가 날 때 자동차를 멈추는 메소드
	// : 리턴 타입 X / "[자동차가 멈춥니다.]" 를 출력

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
