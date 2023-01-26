package sec01.exam03;

public class SmartTelevision implements RemoteControl, Searchable {
	// 다중 인터페이스 구현 클래스

	private int volume;

	// -> 필드 :
	// volume : 접근제한 private / int 타입 /
	//
	// -> 메소드
	// 1. turnOn( ) : "TV를 켭니다." 를 출력
	// 2. turnOff( ) : "TV를 끕니다." 를 출력
	// 3. setVolume( ) : 볼륨을 변경하는 메소드 (외부로부터 볼륨값을 받아서 저장해야함)
	// -> 단, 외부로부터 받아온 볼륨값이 최대볼륨보다 크거나, 최저 볼륨보다 작다면
	// 볼륨값은 최대볼륨 또는 최저 볼륨으로 설정하기
	// : 현재볼륨을 아래와 같이 출력
	// <console >
	// 현재 TV 볼륨: 5 // 현재 TV 볼륨: 10
	// 4. search( ) : "(매개값으로 받아온 주소) 을 검색합니다." 를 출력
	// <console >
	// www.naver.com 을 검색합니다.

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}

}
