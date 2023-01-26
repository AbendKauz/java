package sec01.exam03;

class TV {

	// computer -> �������̽��� �ۼ�
	// iptv -> tv�� ��ӹ���
	// tv -> computer ��������

	public void onTV() {
		System.out.println("TV�� �����־��.");
	}

}

interface Computer {
	// 1-1.
	static void dataReceive() {
		System.out.println("������ �������Դϴ�.");
	}

}

class IPTV extends TV implements Computer {

	public void powerOn() {
		// 1-2.
		Computer.dataReceive();
		onTV();

	}
}

public class Error1 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

	}

}
