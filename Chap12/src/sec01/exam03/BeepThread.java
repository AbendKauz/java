package sec01.exam03;

import java.awt.Toolkit;

public class BeepThread extends Thread { // �۾�������
	// BeepThread - �۾������� (Thread ��ӹ���)
	// - run() �޼ҵ� ������
	// : �������� �߻��ϴ� �ڵ�
	// 0.5�� �ֱ�

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("��"); // ���������� �߰���
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
