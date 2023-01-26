package sec01.exam04;

public class Calculator {

	// -> �ʵ� :
	// memory : �������� private / int Ÿ�� /
	private int memory;

	// -> getter, setter �޼ҵ�
	// - getter �޼ҵ�
	public int getMemory() {
		return memory;
	}
	// - setter �޼ҵ�
	// : �ܺο��� �޾ƿ� �Ű����� memory �ʵ尪���� ����.
	// : �����带 2�ʰ� �Ͻ����� ��Ŵ (try-catch)
	// : �ܼ�â�� ��� -> ������� : memory��
	// <console>
	// User1: 50 User2: 50

	public synchronized void setMemory(int memory) {
		// synchronized : ����ȭ
		// �ѱ������� ������ �� �ٸ� ����ȭ �޼ҵ���� ���� ���ϰ� ���
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
