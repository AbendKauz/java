package sec01.exam03;

public class BeepPrintExample {

	public static void main(String[] args) {

		// BeepPrintExample - ���ν�����
		// - BeepThread Ŭ������ �̿��ؼ� �۾� ������ ��ü�� ���� �� ����
		// - ������ "��"�̶�� ���ڸ� ����ϴ� �ڵ�
		// 0.5�� �ֱ�

//		BeepThread thread = new BeepThread();
		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}

}
