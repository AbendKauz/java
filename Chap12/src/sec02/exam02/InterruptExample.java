package sec02.exam02;

public class InterruptExample { // ���� Ŭ����

	public static void main(String[] args) {

		// -> PrintThread ��ü�� ���� �� �۾������带 �����Ű��.
		// -> �����带 1�ʵ��� �Ͻ����� ��Ų ��
		// interrupt( ) �޼ҵ� ȣ��
		PrintThread thread = new PrintThread();

		thread.start(); // �۾� ������ ����

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		thread.interrupt(); // �����尡 �Ͻ����� ���¿� ���� ��
		// interruptedException�� �߻���Ŵ

	}

}
