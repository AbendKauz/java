package sec01.exam03;

public class SmartTelevisionExample {

	public static void main(String[] args) {

		// -> ������ ���� �������̽��� ���� Ŭ������ ����Ͽ� �Ʒ��� ���� ����ϱ�
		//
		// <console >
		// TV�� �մϴ�.
		// ���� TV ����: 5
		// TV�� ���ϴ�.
		// www.naver.com �� �˻��մϴ�.

		// �������̽��� ���� = ������ü;
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
//		rc.search("www.naver.com");	// Searchable �������̽��� ����� �޼ҵ� -> ȣ��Ұ�

		Searchable sa = new SmartTelevision();
		// Searchable �������̽� �ȿ� �ִ� search() �޼ҵ� ȣ��
		sa.search("www.naver.com");

		// �ϳ��� ��ü(SmartTelevision)�� ������
		// 2���� �������̽�(RemoteControl, Searchable)�� ����� ����

	}

}
