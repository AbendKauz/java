package sec01.exam02;

public class RemoteControlExample {

	public static void main(String[] args) {

		// * �������̽��� ������ü�� ����Ϸ���???
		// ������ ���� �ۼ� (�������̽� ������ �����ϰ� ������ü�� ����)

		// ��� 1.
		// �������̽� ���� = ������ü;

		// ��� 2.
		// �������̽� ����;
		// ���� = ������ü;

		// -> ������ ���� �������̽��� ���� Ŭ������ ����Ͽ� �Ʒ��� ���� ����ϱ�
		//
		// <console >
		// TV�� �մϴ�.
		// ���� TV ����: 10 (�Ű��� 15)
		// ���� TV ����: 5 (�Ű��� 5)
		// TV�� ���ϴ�.
		// ==========================
		// Audio�� �մϴ�.
		// ���� Audio ����: 0 (�Ű��� -8)
		// ���� Audio ����: 8 (�Ű��� 8)
		// Audio�� ���ϴ�.

		// ��� 1
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.setVolume(5);
		rc.turnOff();
		System.out.println("==========================");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-8);
		rc.setVolume(8);
		rc.turnOff();

//		// ��� 2
//		RemoteControl rc;
//		rc = new Television();
//		rc.turnOn();
//		rc.setVolume(15);
//		rc.setVolume(5);
//		rc.turnOff();
//		System.out.println("==========================");
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(-8);
//		rc.setVolume(8);
//		rc.turnOff();

	}

}
