package sec01.exam04;

public class User2 extends Thread {

	// -> 필드 :
	// calculator : 접근제한 private / Calculator 타입 /
	private Calculator calculator;

	// -> 메소드
	// 1. setter 메소드
	// : 스레드 이름을 User2 로 변경하는 코드
	// : 외부에서 받아온 매개값을 calculator 필드값으로 설정.
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User2");
	}

	// 2. run 메소드
	// : calculator 의 memory 값을 50으로 변경
	@Override
	public void run() {
		calculator.setMemory(50);
	}

}
