package sec02.exam01;

public class PrintThread extends Thread { // 작업스레드
	// -> 필드 : -> stop 플래그 필드
	// stop : 접근제한 private / boolean 타입 /
	// -> 메소드
	// 1. setter 메소드
	// : 외부에서 받아온 매개값을 stop 필드값으로 설정.
	// 2. run 메소드
	// : stop 필드의 값이 false 일 경우, "실행중" 을 반복해서 콘솔에 출력
	// true 일 경우, "자원정리", "실행 종료" 를 출력

	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
