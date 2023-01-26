package sec01.exam02;

public class Audio implements RemoteControl {

	// -> 필드 :
	// volume : 접근제한 private / int 타입 /
	//
	// -> 메소드
	// 1. turnOn( ) : "Audio를 켭니다." 를 출력
	// 2. turnOff( ) : "Audio를 끕니다." 를 출력
	// 3. setVolume( ) : 볼륨을 변경하는 메소드 (외부로부터 볼륨값을 받아서 저장해야함)
	// 만약에 매개값으로 받아온 볼륨이 최대볼륨 상수값보다 크다면
	// -> 볼륨 필드의 값을 최대볼륨으로 설정
	// 매개값으로 받아온 볼륨이 최저볼륨 상수값보다 크다면
	// -> 볼륨 필드의 값을 최저볼륨으로 설정
	// 그 외에는 받아온 매개값으로 설정 후
	// : 현재볼륨을 아래와 같이 출력
	// <console >
	// 현재 Audio 볼륨: 5 // 현재 Audio 볼륨: 10

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}
