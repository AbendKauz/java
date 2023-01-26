package sec01.exam03;

public class SmartTelevisionExample {

	public static void main(String[] args) {

		// -> 위에서 만든 인터페이스와 구현 클래스를 사용하여 아래와 같이 출력하기
		//
		// <console >
		// TV를 켭니다.
		// 현재 TV 볼륨: 5
		// TV를 끕니다.
		// www.naver.com 을 검색합니다.

		// 인터페이스명 변수 = 구현객체;
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
//		rc.search("www.naver.com");	// Searchable 인터페이스에 선언된 메소드 -> 호출불가

		Searchable sa = new SmartTelevision();
		// Searchable 인터페이스 안에 있는 search() 메소드 호출
		sa.search("www.naver.com");

		// 하나의 객체(SmartTelevision)를 가지고
		// 2개의 인터페이스(RemoteControl, Searchable)로 사용을 가능

	}

}
