package chap04;

public class Ex03 {

	public static void main(String[] args) {

		// 2���� �ֻ����� ������ �� ������ �� ���
		// (��1, ��2)
		// ���� ���� 5�� �ƴϸ� ��� ������
		// ���� ���� 5�� ������ ���ߴ� �ڵ� �ۼ�
		// (while���� Math.random() �޼ҵ� ���)

		while (true) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			System.out.println("(" + num1 + ", " + num2 + ")");
			if (num1 + num2 == 5) {
				break;
			}
		}

	}

}
