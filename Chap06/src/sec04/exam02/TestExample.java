package sec04.exam02;

public class TestExample {

	public static void main(String[] args) {

		Test a = new Test();

		// 1. �Ű� ������ �迭 Ÿ������ ����

		int[] arr = { 1, 2, 3 };
//		System.out.println(a.sum1(arr));
		int result = a.sum1(arr);
		System.out.println("result�� �� : " + result);

		int result2 = a.sum1(new int[] { 4, 5, 6 });
		System.out.println("result2�� �� : " + result2);

		// 2. �迭�� �������� �ʰ� ���� ��ϸ� �Ѱ��ִ� ���

		int result3 = a.sum2(1, 2, 4, 5);
		System.out.println("result3�� �� : " + result3);

		int result4 = a.sum2(1, 2, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5);
		System.out.println("result4�� �� : " + result4);

	}

}
