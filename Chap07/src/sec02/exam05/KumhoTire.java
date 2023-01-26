package sec02.exam05;

public class KumhoTire extends Tire {

	// -> 생성자
	// : 타이어의 위치, 최대 회전수를 매개값으로 받아서 부모인 Tire 클래스의 생성자를 호출할 때 넘겨주기

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// -> roll() 메소드 재정의 (오버라이딩)
	// - 다른 코드는 다 똑같고 출력문에서 Tire 부분만 -> 각 클래스명으로 변경하기
	// ( 어떤 클래스의 roll 이 사용되었는지 확인하기 위해 출력내용만 변경 )
	// <console>
	// ex1) 앞오른쪽 KumhoTire 수명: 10회 // ex2) 뒤왼쪽 HankookTire 수명: 11회

	@Override
	public boolean roll() {
		++accumulatedRotation;
		// 누적 회전수가 최대회전수보다 작을 때 -> 남은 tire수명 출력
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;

			// 누적회전수가 최대회전수보다 작지 않을 때 -> tire의 최대수명만큼 회전을 해서 펑크
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}

}
