package sec01.exam03;

import java.awt.Toolkit;

public class BeepThread extends Thread { // 작업스레드
	// BeepThread - 작업스레드 (Thread 상속받음)
	// - run() 메소드 재정의
	// : 비프음을 발생하는 코드
	// 0.5초 주기

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("꽥"); // 임의적으로 추가함
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
