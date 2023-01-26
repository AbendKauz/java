package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		// - Car 객체 생성후 아래와 똑같이 출력.
		// <console>
		// 앞왼쪽 : 한국 타이어가 굴러갑니다.
		// 앞오른쪽 : 한국 타이어가 굴러갑니다.
		// 뒤왼쪽 : 한국 타이어가 굴러갑니다.
		// 뒤오른쪽 : 한국 타이어가 굴러갑니다.
		// ==============================
		// 앞왼쪽 : 금호 타이어가 굴러갑니다.
		// 앞오른쪽 : 금호 타이어가 굴러갑니다.
		// 뒤왼쪽 : 한국 타이어가 굴러갑니다.
		// 뒤오른쪽 : 한국 타이어가 굴러갑니다.

		Car car = new Car();
		// 필드의 초기값 -> 한국타이어 객체의 roll() 메소드가 호출
		car.run();
		System.out.println("==============================");
		// 앞바퀴 2개를 다른 구현클래스인 금호타이어의 객체로 교체
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		// -> 앞바퀴는 금호타이어 객체로 교체를 해서
		// 금호타이어에 재정의한 roll() 메소드가 호출됨
		car.run();

		// car 클래스의 run() 메소드를 수정하지 않아도
		// 다양한 roll() 메소드의 실행결과를 얻을 수 있다 => 필드의 다형성

	}

}
