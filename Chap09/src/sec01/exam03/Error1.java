package sec01.exam03;

class TV {

	// computer -> 인터페이스로 작성
	// iptv -> tv를 상속받음
	// tv -> computer 구현받음

	public void onTV() {
		System.out.println("TV가 켜져있어요.");
	}

}

interface Computer {
	// 1-1.
	static void dataReceive() {
		System.out.println("데이터 수신중입니다.");
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
