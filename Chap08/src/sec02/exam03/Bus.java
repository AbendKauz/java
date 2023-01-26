package sec02.exam03;

public class Bus implements Vehicle {

	// -> 메소드
	// run( ) : "버스가 달립니다." 를 출력
	// checkFare( ) : 접근제한 public / 리턴타입 X / 매개변수 X
	// "승차요금을 체크합니다" 를 출력

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
