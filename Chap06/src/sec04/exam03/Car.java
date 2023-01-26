package sec04.exam03;

public class Car {

	// 1. 필드 -> private / int타입의 gas

	private int gas;

	// 2. Getter, Setter 메소드

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	// 3. boolean 타입의 isLeftGas() -> 메소드
	// gas가 0이라면 -> "가스가 없음"을 출력하고 / false를 리턴
	// gas가 0이 아니라면 -> "가스가 " + gas의 남은양 + " 있음" / true를 리턴

	boolean isLeftGas() {
		if (gas <= 0) {
			System.out.println("가스가 없음");
			return false;
		} else {
			System.out.println("가스가 " + gas + " 있음");
			return true;
		}
	}

	// 4. 리턴타입 없는 run( ) 메소드
	// -> 실행 코드
	// gas가 0보다 크면 "달립니다. (가스 잔량 : 10)" 를 출력 후 gas 는 1씩 감소하는 코드 반복
	// "달립니다. (가스 잔량 : 9)"
	// gas가 0이 되면 "멈춥니다. (가스 잔량 : 0)" 를 출력 후 메소드 실행 종료.

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (가스 잔량 : " + gas-- + ")");
			} else {
				System.out.println("멈춥니다. (가스 잔량 : " + gas + ")");
				return; // void타입 메소드를 빠져나가기 위해서 break 대신 return을 사용
				// break; // while문 뒤에 실행문이 추가적으로 더 있을 경우 break문을 사용해야함

			}
		}
	}

}
