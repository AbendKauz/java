package sec01.exam04;

public interface RemoteControl {

	// -> 상수
	// MAX_VOLUME : 값 10 // MIN_VOLUME : 값 0
	//
	// -> 추상 메소드
	// 1. turnOn( ) : 리턴타입 없음 / 매개변수 X
	// 2. turnOff( ) : 리턴타입 없음 / 매개변수 X
	// 3. setVolume( ) : 리턴타입 없음 / 매개변수 - int 타입 volume

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

//	public abstract void turnOn();
	void turnOn();

	void turnOff();

	void setVolume(int volume);

}
