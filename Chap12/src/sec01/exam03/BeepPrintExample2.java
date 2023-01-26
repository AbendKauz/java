package sec01.exam03;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Thread thread = new Thread() { // Thread �͸� �ڽİ�ü ����

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

		};

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		// setName, getName => Thread Ŭ������ �ν��Ͻ� �޼ҵ��̹Ƿ�
		// ������ ��ü�� ������ �ʿ���
		System.out.println("�۾� ������ �� : " + thread.getName()); // ������ �̸� �о����
		// Thread-0

		thread.setName("beepThread"); // ������ �̸� ����
		System.out.println("�۾� ������ �� ���� : " + thread.getName());
		// beepThread

		// * ���� ������ ��ü�� ������ ������ ���� �ʴٸ�,
		// Thread Ŭ������ �����޼ҵ��� currentThread()�޼ҵ带 �̿�
		// => ���� �������� ������ ���� �� ����
		Thread mainThread = Thread.currentThread();
		System.out.println("���� ������ �� : " + mainThread.getName());
		// main

	}

}
