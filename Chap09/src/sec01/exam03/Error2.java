package sec01.exam03;

// 2-0
interface TV2 {

	// computer -> �������̽��� �ۼ�
	// iptv -> tv�� ��ӹ���
	// tv -> computer ��������

	public void onTV();
}

class TV3 {
	public void onTV() {
		System.out.println("TV�� �����־��.");
	}
}

interface Computer2 {
	// 2-1.
	public void dataReceive();
}

// 2-2.
class Computer3 {
	public void dataReceive() {
		System.out.println("������ �������Դϴ�.");
	}

	public void onTV() {
		System.out.println("TV�� �����־��.");
	}
}

class IPTV2 implements TV2, Computer2 {
	// 2-3.
	Computer3 com2 = new Computer3();
	TV3 tv2 = new TV3();

	public void dataReceive() {
		com2.dataReceive();
	}

	public void powerOn() {
		tv2.onTV();

	}

	public void onTV() {
		tv2.onTV();
	}

}

public class Error2 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

	}

}
