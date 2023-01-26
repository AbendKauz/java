package sec01.exam02;

public class RemoteControlExample {

	public static void main(String[] args) {

		// * 인터페이스로 구현객체를 사용하려면???
		// 다음과 같이 작성 (인터페이스 변수를 선언하고 구현객체를 대입)

		// 방법 1.
		// 인터페이스 변수 = 구현객체;

		// 방법 2.
		// 인터페이스 변수;
		// 변수 = 구현객체;

		// -> 위에서 만든 인터페이스와 구현 클래스를 사용하여 아래와 같이 출력하기
		//
		// <console >
		// TV를 켭니다.
		// 현재 TV 볼륨: 10 (매개값 15)
		// 현재 TV 볼륨: 5 (매개값 5)
		// TV를 끕니다.
		// ==========================
		// Audio를 켭니다.
		// 현재 Audio 볼륨: 0 (매개값 -8)
		// 현재 Audio 볼륨: 8 (매개값 8)
		// Audio를 끕니다.

		// 방법 1
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.setVolume(5);
		rc.turnOff();
		System.out.println("==========================");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-8);
		rc.setVolume(8);
		rc.turnOff();

//		// 방법 2
//		RemoteControl rc;
//		rc = new Television();
//		rc.turnOn();
//		rc.setVolume(15);
//		rc.setVolume(5);
//		rc.turnOff();
//		System.out.println("==========================");
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(-8);
//		rc.setVolume(8);
//		rc.turnOff();

	}

}
