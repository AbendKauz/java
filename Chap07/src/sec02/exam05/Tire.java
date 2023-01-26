package sec02.exam05;

public class Tire { // 일반 타이어의 기능, 특성만 선언

	// -> 필드
	// maxRotation : public / int 타입 / 초기값 X -----> 최대 회전수(최대 수명)의 데이터를 저장할 필드
	// * 최대 회전수만큼 회전하게 되면 타이어가 펑크난다고 가정( 타이어의 수명)
	// accumulatedRotation : public / int 타입 / 초기값 X -----> 누적 회전수의 데이터를 저장할 필드
	// * 타이어가 1회전할 때마다 1씩 증가되는 필드
	// * 누적 회전수가 최대 회전수만큼 도달하면 타이어는 펑크가 남
	// location : public / String 타입 / 초기값 X -----> 타이어의 위치의 데이터를 저장할 필드
	// * 앞오른쪽, 앞왼쪽, 뒤오른쪽, 뒤왼쪽을 구분하는 데이터

	public int maxRotation; // 최대회전수(최대수명)
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치

	// -> 생성자
	// -> 접근제한 public / 매개변수 - 타이어의 위치와 최대 회전수
	// -> 매개값으로 필드 초기화

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// -> 메소드
	// roll( ) : 리턴타입 boolean / 매개변수 X /
	// -----> 타이어를 1회전 시키는 메소드로 1번 실행할 때마다 누적 회전수를 1씩 증가
	//
	// (회전이 가능하면 아래와 같이 남은 회전수를 출력 후 true 리턴
	// <console>
	// ex1) 앞왼쪽 Tire 수명: 3회 // ex2) 뒤오른쪽 Tire 수명: 2회
	//
	// 펑크가 나서 회전 불가라면 아래와 같이 펑크를 출력 후 false 리턴
	// <console>
	// ex1) *** 뒤왼쪽 Tire 펑크 *** // ex2) *** 앞오른쪽 Tire 펑크 ***

	public boolean roll() {
		++accumulatedRotation;
		// 누적 회전수가 최대회전수보다 작을 때 -> 남은 tire수명 출력
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;

			// 누적회전수가 최대회전수보다 작지 않을 때 -> tire의 최대수명만큼 회전을 해서 펑크
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
