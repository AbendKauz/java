package sec01.exam02;

public class Television implements RemoteControl {

	// -> �ʵ� :
	// volume : �������� private / int Ÿ�� /
	//
	// -> �޼ҵ�
	// 1. turnOn( ) : "TV�� �մϴ�." �� ���
	// 2. turnOff( ) : "TV�� ���ϴ�." �� ���
	// 3. setVolume( ) : ������ �����ϴ� �޼ҵ� (�ܺηκ��� �������� �޾Ƽ� �����ؾ���)
	// -> ��, �ܺηκ��� �޾ƿ� �������� �ִ뺼������ ũ�ų�, ���� �������� �۴ٸ�
	// �������� �ִ뺼�� �Ǵ� ���� �������� �����ϱ�
	// : ���纼���� �Ʒ��� ���� ���
	// <console >
	// ���� TV ����: 5 // ���� TV ����: 10

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ���� : " + this.volume);
	}

	// ���� Ŭ�������� �������̽��� �߻�޼ҵ忡 ���� ��ü�޼ҵ� �ۼ� �� ����
	// : �������̽��� ��� �޼ҵ�� �⺻������ public ���������ڸ� ����
	// -> public���� �� ���� ������������ �ۼ��� �� ����. (���� �߻�)

}
