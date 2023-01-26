package sec02.exam02;

public class PrintThread extends Thread { // 작업 스레드
	// -> 메소드
	// - run 메소드
	// : 실행중 출력과 0.001 초 일시정지를 계속 반복
	// : "자원정리", "실행 종료" 를 출력

	@Override
	public void run() {

//		try {
//			while(true) {
//				System.out.println("실행중");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {}
//		
//		System.out.println("자원 정리\n실행 종료");

		while (true) {
			System.out.println("실행중");
			if (Thread.interrupted()) {
				break;
			}
		}

		System.out.println("자원 정리\n실행 종료");

		// 2-1. interrupt() 메소드 - interrupted(), isInterrupted()
		// : 굳이 일시정지 상태를 만들지 않고도 스레드를 안전하게 종료
		// interrupted() : 정적 메소드
		// isInterrupted() : 인스턴스 메소드
		// => interrupted()의 호출 여부를 확인 - 메소드가 호출되면 true를 리턴하는 메소드

	}

}
