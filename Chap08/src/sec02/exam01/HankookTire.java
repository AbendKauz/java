package sec02.exam01;

public class HankookTire implements Tire {

	// -> �޾ƿ� �Ű����� Ȱ���Ͽ� �Ʒ��� �Ȱ��� ����ϴ� �޼ҵ� ����
	// <console> <console>
	// �տ��� : �ѱ� Ÿ�̾ �������ϴ�. �ڿ��� : �ѱ� Ÿ�̾ �������ϴ�.

	@Override
	public void roll(String roll) {
		System.out.println(roll + " : �ѱ� Ÿ�̾ �������ϴ�.");
	}

}
