package sec01.exam04;

public class User1 extends Thread {

	// -> �ʵ� :
	// calculator : �������� private / Calculator Ÿ�� /
	private Calculator calculator;

	// -> �޼ҵ�
	// 1. setter �޼ҵ�
	// : ������ �̸��� User1 �� �����ϴ� �ڵ�
	// : �ܺο��� �޾ƿ� �Ű����� calculator �ʵ尪���� ����.
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User1");
	}

	// 2. run �޼ҵ�
	// : calculator �� memory ���� 100���� ����
	@Override
	public void run() {
		calculator.setMemory(100);
	}

}
