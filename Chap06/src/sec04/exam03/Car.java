package sec04.exam03;

public class Car {

	// 1. �ʵ� -> private / intŸ���� gas

	private int gas;

	// 2. Getter, Setter �޼ҵ�

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	// 3. boolean Ÿ���� isLeftGas() -> �޼ҵ�
	// gas�� 0�̶�� -> "������ ����"�� ����ϰ� / false�� ����
	// gas�� 0�� �ƴ϶�� -> "������ " + gas�� ������ + " ����" / true�� ����

	boolean isLeftGas() {
		if (gas <= 0) {
			System.out.println("������ ����");
			return false;
		} else {
			System.out.println("������ " + gas + " ����");
			return true;
		}
	}

	// 4. ����Ÿ�� ���� run( ) �޼ҵ�
	// -> ���� �ڵ�
	// gas�� 0���� ũ�� "�޸��ϴ�. (���� �ܷ� : 10)" �� ��� �� gas �� 1�� �����ϴ� �ڵ� �ݺ�
	// "�޸��ϴ�. (���� �ܷ� : 9)"
	// gas�� 0�� �Ǹ� "����ϴ�. (���� �ܷ� : 0)" �� ��� �� �޼ҵ� ���� ����.

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�. (���� �ܷ� : " + gas-- + ")");
			} else {
				System.out.println("����ϴ�. (���� �ܷ� : " + gas + ")");
				return; // voidŸ�� �޼ҵ带 ���������� ���ؼ� break ��� return�� ���
				// break; // while�� �ڿ� ���๮�� �߰������� �� ���� ��� break���� ����ؾ���

			}
		}
	}

}
