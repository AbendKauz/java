package sec01.exam03;

// 2-0
interface TV2 {

	// computer -> 인터페이스로 작성
	// iptv -> tv를 상속받음
	// tv -> computer 구현받음

	public void onTV();
}

class TV3 {
	public void onTV() {
		System.out.println("TV가 켜져있어요.");
	}
}

interface Computer2 {
	// 2-1.
	public void dataReceive();
}

// 2-2.
class Computer3 {
	public void dataReceive() {
		System.out.println("데이터 수신중입니다.");
	}

	public void onTV() {
		System.out.println("TV가 켜져있어요.");
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
