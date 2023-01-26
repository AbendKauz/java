package sec02.exam02;

public class PrintThread extends Thread { // �۾� ������
	// -> �޼ҵ�
	// - run �޼ҵ�
	// : ������ ��°� 0.001 �� �Ͻ������� ��� �ݺ�
	// : "�ڿ�����", "���� ����" �� ���

	@Override
	public void run() {

//		try {
//			while(true) {
//				System.out.println("������");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {}
//		
//		System.out.println("�ڿ� ����\n���� ����");

		while (true) {
			System.out.println("������");
			if (Thread.interrupted()) {
				break;
			}
		}

		System.out.println("�ڿ� ����\n���� ����");

		// 2-1. interrupt() �޼ҵ� - interrupted(), isInterrupted()
		// : ���� �Ͻ����� ���¸� ������ �ʰ� �����带 �����ϰ� ����
		// interrupted() : ���� �޼ҵ�
		// isInterrupted() : �ν��Ͻ� �޼ҵ�
		// => interrupted()�� ȣ�� ���θ� Ȯ�� - �޼ҵ尡 ȣ��Ǹ� true�� �����ϴ� �޼ҵ�

	}

}
