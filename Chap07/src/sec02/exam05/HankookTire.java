package sec02.exam05;

public class HankookTire extends Tire {

	// -> ������
	// : Ÿ�̾��� ��ġ, �ִ� ȸ������ �Ű������� �޾Ƽ� �θ��� Tire Ŭ������ �����ڸ� ȣ���� �� �Ѱ��ֱ�

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// -> roll() �޼ҵ� ������ (�������̵�)
	// - �ٸ� �ڵ�� �� �Ȱ��� ��¹����� Tire �κи� -> �� Ŭ���������� �����ϱ�
	// ( � Ŭ������ roll �� ���Ǿ����� Ȯ���ϱ� ���� ��³��븸 ���� )
	// <console>
	// ex1) �տ����� KumhoTire ����: 10ȸ // ex2) �ڿ��� HankookTire ����: 11ȸ

	@Override
	public boolean roll() {
		++accumulatedRotation;
		// ���� ȸ������ �ִ�ȸ�������� ���� �� -> ���� tire���� ���
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;

			// ����ȸ������ �ִ�ȸ�������� ���� ���� �� -> tire�� �ִ����ŭ ȸ���� �ؼ� ��ũ
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}

}
