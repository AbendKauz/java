package sec01.exam04;

public interface RemoteControl {

	// -> ���
	// MAX_VOLUME : �� 10 // MIN_VOLUME : �� 0
	//
	// -> �߻� �޼ҵ�
	// 1. turnOn( ) : ����Ÿ�� ���� / �Ű����� X
	// 2. turnOff( ) : ����Ÿ�� ���� / �Ű����� X
	// 3. setVolume( ) : ����Ÿ�� ���� / �Ű����� - int Ÿ�� volume

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

//	public abstract void turnOn();
	void turnOn();

	void turnOff();

	void setVolume(int volume);

}
