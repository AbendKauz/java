package sec02.exam01;

public class StopFlagExample { // 실행클래스

	public static void main(String[] args) {

		// -> PrintThread 객체를 생성 후 작업스레드를 실행시키기.
		// -> 스레드를 1초동안 일시정지 시킨 후
		// -> PrintThread 클래스에 만들어둔 setStop( ) 메소드와 stop 필드를 이용하여 스레드를 종료시키기.

		PrintThread printThread = new PrintThread();
		printThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		printThread.setStop(true); // 스레드를 안전하게 종료하기 위해 true로 변경
		// run() 안의 반복문을 빠져나가고, 그 뒤의 내용을 출력 후 run() 종료
		// ==> 스레드까지 종료

	}

}
