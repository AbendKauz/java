package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		// 0.5�� �ֱ�� �������� �߻���Ű�鼭 ���ÿ� "��" �̶�� ���� ���

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü�� ������
		// toolkit.beep(); // �������� ����ϴ� �޼ҵ�

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // �������� �߻���Ű�� �ڵ�
			try {
				Thread.sleep(1000);
				// 1�� == 1000
				// 0.5�� == 500
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("��"); // ������ "��"�� �ֿܼ� ���
			try {
				Thread.sleep(1000);
				// 1�� == 1000
				// 0.5�� == 500
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// �������� 5ȸ �߻� �� "��" �� �ֿܼ� ��µ�

	}

}
