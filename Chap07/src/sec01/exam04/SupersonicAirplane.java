package sec01.exam04;

public class SupersonicAirplane extends Airplane {

	// ��� ( public �������� )
	// NORMAL : �� 1 // SUPERSONIC : �� 2
	// �ʵ� ( public �������� )
	// flyMode : int Ÿ�� / �ʱⰪ�� NORMAL
	// �޼ҵ� ( public �������� )
	// fly() : ����Ÿ�� X / �Ű����� X /
	// + flyMode�� SUPERSONIC �� ��� �����Ӻ����մϴ�. �� ���
	// �ƴ� ��쿡�� �Ϲݺ����մϴٸ� ��� (�θ�Ŭ������ �޼ҵ� ȣ��)

	public static final int normal = 1;
	public static final int superSonic = 2;

	int flyMode = normal;

	@Override
	public void fly() {
		if (flyMode == superSonic) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			System.out.println("�Ϲݺ����մϴ�.");
		}
	}

}
