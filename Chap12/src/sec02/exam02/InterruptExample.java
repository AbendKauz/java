package sec02.exam02;

public class InterruptExample { // 실행 클래스

	public static void main(String[] args) {

		// -> PrintThread 객체를 생성 후 작업스레드를 실행시키기.
		// -> 스레드를 1초동안 일시정지 시킨 후
		// interrupt( ) 메소드 호출
		PrintThread thread = new PrintThread();

		thread.start(); // 작업 스레드 실행

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		thread.interrupt(); // 스레드가 일시정지 상태에 있을 때
		// interruptedException을 발생시킴

	}

}
