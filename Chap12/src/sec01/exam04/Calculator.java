package sec01.exam04;

public class Calculator {

	// -> 필드 :
	// memory : 접근제한 private / int 타입 /
	private int memory;

	// -> getter, setter 메소드
	// - getter 메소드
	public int getMemory() {
		return memory;
	}
	// - setter 메소드
	// : 외부에서 받아온 매개값을 memory 필드값으로 설정.
	// : 스레드를 2초간 일시정지 시킴 (try-catch)
	// : 콘솔창에 출력 -> 스레드명 : memory값
	// <console>
	// User1: 50 User2: 50

	public synchronized void setMemory(int memory) {
		// synchronized : 동기화
		// 한군데에서 실행할 때 다른 동기화 메소드들은 실행 못하게 잠금
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
