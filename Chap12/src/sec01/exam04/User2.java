package sec01.exam04;

public class User2 extends Thread {

	// -> �ʵ� :
	// calculator : �������� private / Calculator Ÿ�� /
	private Calculator calculator;

	// -> �޼ҵ�
	// 1. setter �޼ҵ�
	// : ������ �̸��� User2 �� �����ϴ� �ڵ�
	// : �ܺο��� �޾ƿ� �Ű����� calculator �ʵ尪���� ����.
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User2");
	}

	// 2. run �޼ҵ�
	// : calculator �� memory ���� 50���� ����
	@Override
	public void run() {
		calculator.setMemory(50);
	}

}
