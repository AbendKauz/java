package sec02.exam01;

public class StopFlagExample { // ����Ŭ����

	public static void main(String[] args) {

		// -> PrintThread ��ü�� ���� �� �۾������带 �����Ű��.
		// -> �����带 1�ʵ��� �Ͻ����� ��Ų ��
		// -> PrintThread Ŭ������ ������ setStop( ) �޼ҵ�� stop �ʵ带 �̿��Ͽ� �����带 �����Ű��.

		PrintThread printThread = new PrintThread();
		printThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		printThread.setStop(true); // �����带 �����ϰ� �����ϱ� ���� true�� ����
		// run() ���� �ݺ����� ����������, �� ���� ������ ��� �� run() ����
		// ==> ��������� ����

	}

}
