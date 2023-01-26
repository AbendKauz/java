package sec01.exam02;

import java.awt.Toolkit;

public class BeepTask implements Runnable { // �۾� ������(������ �߻�)

	@Override
	public void run() {
		// �۾� �����尡 ������ �ڵ� �ۼ�
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ������

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ �߻� �޼ҵ�

			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
			} catch (InterruptedException e) {
			}
		}

	}

}
