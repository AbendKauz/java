package sec01.exam02;

public class BeepPrintExample {

	public static void main(String[] args) { // ���� ������ ("��" ���)

		// 1. Thread Ŭ�����κ��� ���� ����
		// => �۾� ������ ��ü�� ���� �����Ϸ��� Thread�� �����ڸ� ȣ�� (�Ű��� Runnable)
		// Runnable�� �������̽� Ÿ���̾ ���� ��ü�� ����� �����ؾ���
		// => run() �޼ҵ尡 ���ǵǾ� �����Ƿ� ���� Ŭ�������� �������ؾ���

		Runnable beepTask = new BeepTask(); // Runnable ������ü ����

		// Runnable ������ü�� �Ű������� ������ ȣ�� => �۾������� ����
		Thread thread = new Thread(beepTask);

		thread.start(); // start()�޼ҵ� ȣ�� �� �۾� ������ ����

		for (int i = 0; i < 5; i++) {
			System.out.println("��"); // "��" ���

			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
			} catch (InterruptedException e) {
			}

		}

	}

}
