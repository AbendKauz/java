package sec01.exam02;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		// Runnable �͸� ���� ��ü�� �̿� => Thread �����ڸ� ȣ��(�۾� ������ ����)

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				// �۾� �����尡 ������ �ڵ� �ۼ�
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ������

				for (int i = 0; i < 5; i++) {
					// System.out.println("��");
					toolkit.beep(); // ������ �߻� �޼ҵ�

					try {
						Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
					} catch (InterruptedException e) {
					}
				}

			}

		});

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
