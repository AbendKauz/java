package sec01;

public class D0706_01_if��_Math {

	public static void main(String[] args) {

		// Math.random() -> 0.0�� 1.0 ���̿� ���ϴ� doubleŸ���� ���� �ϳ��� �����ϴ� �޼ҵ�
		// 0.0 <= Math.random() < 1.0
//		System.out.println(Math.random());

		// 0 ~ 10 ������ ��
		// 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//		System.out.println(Math.random() * 10);

		// 0.0 * 10 <= (int)Math.random() * 10 < 1.0 * 10
//		System.out.println((int)(Math.random() * 10));

		// 1 ~ 11 ������ ��
		// (int)0.0 * 10 + 1 <= Math.random() * 10 + 1 < 1.0 * 10 + 1
//		System.out.println((int)(Math.random() * 10) + 1);
//												----  ----
//												 ����  ���۰�
		// start ���� �����ϴ� n���� ���� �߿��� ������ ���� �ϳ� �̱�
		// int num = (int)(Math.random() * n) + start;

		// Q1)
		// num���ٰ� 1 ~ 6������ ���� �ϳ� �̰� ���� �� (1, 2, 3, 4, 5, 6)
		// if�� ��� -> ? ���� ���Խ��ϴ�.
		// int num = (int)(Math.random() * 6) + 1;

		int num = (int) (Math.random() * 6) + 1;

//		System.out.println(num + "���� ���Խ��ϴ�.");

		if (num == 1) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 2) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 3) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 4) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 5) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else {
			System.out.println(num + "���� ���Խ��ϴ�.");
		}

	}

}
