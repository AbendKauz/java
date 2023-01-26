package sec01.exam02;

public class Television implements RemoteControl {

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

	private int volume;

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
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	// 구현 클래스에서 인터페이스의 추상메소드에 대한 실체메소드 작성 시 주의
	// : 인터페이스의 모든 메소드는 기본적으로 public 접근제한자를 가짐
	// -> public보다 더 낮은 접근제한으로 작성할 수 없다. (에러 발생)

}
