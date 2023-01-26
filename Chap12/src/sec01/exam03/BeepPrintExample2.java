package sec01.exam03;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Thread thread = new Thread() { // Thread 익명 자식객체 생성

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

		};

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		// setName, getName => Thread 클래스의 인스턴스 메소드이므로
		// 스레드 객체의 참조가 필요함
		System.out.println("작업 스레드 명 : " + thread.getName()); // 스레드 이름 읽어오기
		// Thread-0

		thread.setName("beepThread"); // 스레드 이름 변경
		System.out.println("작업 스레드 명 변경 : " + thread.getName());
		// beepThread

		// * 만약 스레드 객체의 참조를 가지고 있지 않다면,
		// Thread 클래스의 정적메소드인 currentThread()메소드를 이용
		// => 현재 스레드의 참조를 얻을 수 있음
		Thread mainThread = Thread.currentThread();
		System.out.println("메인 스레드 명 : " + mainThread.getName());
		// main

	}

}
