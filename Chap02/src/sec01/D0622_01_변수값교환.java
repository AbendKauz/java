package sec01;

public class D0622_01_��������ȯ {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;

		// ��� => x : 3, y : 5
		// System.out.println("x : " + x + ", y : " + y);

//		y = x;
//		System.out.println("x : " + x + ", y : " + y);

		// Q1) x�� y�� ���� ��ȯ�غ��ô�.
		// x : 3, y : 5 ===> x : 5, y : 3

		// 1. x�� ���� ������ �� ����(temp) �߰� �� x�� ����
		int temp = x;
		System.out.println("x : " + x + ", y : " + y + ", " + "temp : " + temp);

		// 2. x�� y�� �� ����
		x = y;
		System.out.println("x : " + x + ", y : " + y + ", " + "temp : " + temp);

		// 3. y�� x ���� ������ �� ����(temp)�� ����Ͽ� x�� ����
		y = temp;
		System.out.println("x : " + x + ", y : " + y + ", " + "temp : " + temp);

	}

}
