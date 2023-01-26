package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		// 자식 객체 생성
		// <console>
		// 이륙합니다.
		// 일반비행합니다.
		// 초음속비행합니다.
		// 일반비행합니다.
		// 착륙합니다.

		SupersonicAirplane ssa = new SupersonicAirplane();
		ssa.takeOff();
		ssa.fly();

		ssa.flyMode = SupersonicAirplane.superSonic;
		ssa.fly();

		ssa.flyMode = SupersonicAirplane.normal;
		ssa.fly();

		ssa.land();

	}

}
