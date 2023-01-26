package sec01.exam04;

public class SupersonicAirplane extends Airplane {

	// 상수 ( public 접근제한 )
	// NORMAL : 값 1 // SUPERSONIC : 값 2
	// 필드 ( public 접근제한 )
	// flyMode : int 타입 / 초기값은 NORMAL
	// 메소드 ( public 접근제한 )
	// fly() : 리턴타입 X / 매개변수 X /
	// + flyMode가 SUPERSONIC 일 경우 초음속비행합니다. 를 출력
	// 아닐 경우에는 일반비행합니다를 출력 (부모클래스의 메소드 호출)

	public static final int normal = 1;
	public static final int superSonic = 2;

	int flyMode = normal;

	@Override
	public void fly() {
		if (flyMode == superSonic) {
			System.out.println("초음속비행합니다.");
		} else {
			System.out.println("일반비행합니다.");
		}
	}

}
