package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		// �ڽ� ��ü ����
		// <console>
		// �̷��մϴ�.
		// �Ϲݺ����մϴ�.
		// �����Ӻ����մϴ�.
		// �Ϲݺ����մϴ�.
		// �����մϴ�.

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
