package sec02.exam01;

public class KumhoTire implements Tire {

	// -> �޾ƿ� �Ű����� Ȱ���Ͽ� �Ʒ��� �Ȱ��� ����ϴ� �޼ҵ� ����
	// <console> <console>
	// �տ��� : ��ȣ Ÿ�̾ �������ϴ�. �տ����� : ��ȣ Ÿ�̾ �������ϴ�.

	@Override
	public void roll(String roll) {
		System.out.println(roll + " : ��ȣ Ÿ�̾ �������ϴ�.");
	}

}
