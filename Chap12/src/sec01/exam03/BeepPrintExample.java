package sec01.exam03;

public class BeepPrintExample {

	public static void main(String[] args) {

		// BeepPrintExample - 메인스레드
		// - BeepThread 클래스를 이용해서 작업 스레드 객체를 생성 후 실행
		// - 비프음 "띵"이라는 글자를 출력하는 코드
		// 0.5초 주기

//		BeepThread thread = new BeepThread();
		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}

}
