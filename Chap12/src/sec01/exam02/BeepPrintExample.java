package sec01.exam02;

public class BeepPrintExample {

	public static void main(String[] args) { // 메인 스레드 ("띵" 출력)

		// 1. Thread 클래스로부터 직접 생성
		// => 작업 스레드 객체를 직접 생성하려면 Thread의 생성자를 호출 (매개값 Runnable)
		// Runnable은 인터페이스 타입이어서 구현 객체를 만들어 대입해야함
		// => run() 메소드가 정의되어 있으므로 구현 클래스에서 재정의해야함

		Runnable beepTask = new BeepTask(); // Runnable 구현객체 생성

		// Runnable 구현객체를 매개값으로 생성자 호출 => 작업스레드 생성
		Thread thread = new Thread(beepTask);

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
