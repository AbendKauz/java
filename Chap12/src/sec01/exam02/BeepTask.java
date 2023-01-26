package sec01.exam02;

import java.awt.Toolkit;

public class BeepTask implements Runnable { // 작업 스레드(비프음 발생)

	@Override
	public void run() {
		// 작업 스레드가 실행할 코드 작성
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻어오기

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생 메소드

			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch (InterruptedException e) {
			}
		}

	}

}
