package sec03;

public class D0628_01_�Ǽ������ڵ�Ÿ�Ժ�ȯ1 {

	public static void main(String[] args) {

//		int x = 1;
//		int y = 2;
//		int result = x / y;		// int Ÿ�Կ��� �Ҽ����� ���� �ʴ´�
//		System.out.println(result);		// 0

		// ������ -> 1/2 -> 0.5�� ��������
		// �ڹ� -> 1/2 -> 0�� ���� (����������� ==> ������� ����)
		// 1/2 = 0.5 -> .5�� ������ 0�� ���Ƽ� �����
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result); // 0.5

		// Q) 1/2�� 0.5�� ������ �Ϸ���???
		// x, y �� �� �ϳ��� doubleŸ������ ���� ��ȯ �� ������ ����
		// --> �Ǽ� / ���� => �Ǽ�

		// ��� 1
//		int x1 = 1;
//		int y1 = 2;
//		double result1 = (double) x1 / y1;
//		System.out.println(result1);

		// ��� 2
//		int x1 = 1;
//		int y1 = 2;
//		double result1 = x1 / (double) y1;
//		System.out.println(result1);

		// ��� 3
		int x1 = 1;
		int y1 = 2;
		double result1 = (double) x1 / (double) y1;
		System.out.println(result1);

	}

}
