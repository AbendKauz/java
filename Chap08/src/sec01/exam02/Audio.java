package sec01.exam02;

public class Audio implements RemoteControl {

	// -> �ʵ� :
	// volume : �������� private / int Ÿ�� /
	//
	// -> �޼ҵ�
	// 1. turnOn( ) : "Audio�� �մϴ�." �� ���
	// 2. turnOff( ) : "Audio�� ���ϴ�." �� ���
	// 3. setVolume( ) : ������ �����ϴ� �޼ҵ� (�ܺηκ��� �������� �޾Ƽ� �����ؾ���)
	// ���࿡ �Ű������� �޾ƿ� ������ �ִ뺼�� ��������� ũ�ٸ�
	// -> ���� �ʵ��� ���� �ִ뺼������ ����
	// �Ű������� �޾ƿ� ������ �������� ��������� ũ�ٸ�
	// -> ���� �ʵ��� ���� ������������ ����
	// �� �ܿ��� �޾ƿ� �Ű������� ���� ��
	// : ���纼���� �Ʒ��� ���� ���
	// <console >
	// ���� Audio ����: 5 // ���� Audio ����: 10

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
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
		System.out.println("���� Audio ���� : " + this.volume);
	}
}
