package sec02.exam01;

public class PrintThread extends Thread { // �۾�������
	// -> �ʵ� : -> stop �÷��� �ʵ�
	// stop : �������� private / boolean Ÿ�� /
	// -> �޼ҵ�
	// 1. setter �޼ҵ�
	// : �ܺο��� �޾ƿ� �Ű����� stop �ʵ尪���� ����.
	// 2. run �޼ҵ�
	// : stop �ʵ��� ���� false �� ���, "������" �� �ݺ��ؼ� �ֿܼ� ���
	// true �� ���, "�ڿ�����", "���� ����" �� ���

	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("������");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
