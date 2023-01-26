package sec01.exam02;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		// Runnable 익명 구현 객체를 이용 => Thread 생성자를 호출(작업 스레드 생성)

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				// 작업 스레드가 실행할 코드 작성
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻어오기

				for (int i = 0; i < 5; i++) {
					// System.out.println("아");
					toolkit.beep(); // 비프음 발생 메소드

					try {
						Thread.sleep(500); // 0.5초간 일시정지
					} catch (InterruptedException e) {
					}
				}

			}

		});

		thread.start(); // start()메소드 호출 시 작업 스레드 실행

		for (int i = 0; i < 5; i++) {
			System.out.println("띵"); // "띵" 출력

			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch (InterruptedException e) {
			}

		}

	}

}
