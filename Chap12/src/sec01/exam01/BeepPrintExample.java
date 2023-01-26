package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		// 0.5초 주기로 비프음을 발생시키면서 동시에 "띵" 이라는 글자 출력

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체를 얻어오기
		// toolkit.beep(); // 비프음을 출력하는 메소드

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음을 발생시키는 코드
			try {
				Thread.sleep(1000);
				// 1초 == 1000
				// 0.5초 == 500
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵"); // 비프음 "띵"을 콘솔에 출력
			try {
				Thread.sleep(1000);
				// 1초 == 1000
				// 0.5초 == 500
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 비프음이 5회 발생 후 "띵" 이 콘솔에 출력됨

	}

}
