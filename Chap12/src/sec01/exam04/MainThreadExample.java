package sec01.exam04;

public class MainThreadExample {

	public static void main(String[] args) {

		// -> Calculator ��ü�� �����ϱ�
		Calculator calculator = new Calculator(); // ������ü

		// -> User1 ������ ���� �� ������ ��ü�� setCalculator() �� �̿��Ͽ� Calculator ������ü ����
		// User1 ������ ����
		User1 th1 = new User1();
		th1.setCalculator(calculator);
		th1.start();

		// -> User2 ��������� �� ������ ��ü�� setCalculator() �� �̿��Ͽ� Calculator ������ü ����
		// User2 ������ ����
		User2 th2 = new User2();
		th2.setCalculator(calculator);
		th2.start();

	}

}
