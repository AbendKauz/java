package sec01.exam03;

public class SmartTelevision implements RemoteControl, Searchable {
	// ���� �������̽� ���� Ŭ����

	private int volume;

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
	// 4. search( ) : "(�Ű������� �޾ƿ� �ּ�) �� �˻��մϴ�." �� ���
	// <console >
	// www.naver.com �� �˻��մϴ�.

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
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + " �� �˻��մϴ�.");
	}

}
