package sec02;

public class D0712_01_�迭����1 {

	public static void main(String[] args) {

		// Q1)
		// 2200, 1400, 3200, 2900, 4500, 3000, 800, 3400
		// �� ���� ���� �迭���� 2000 ������ �ݾ��� �հ踦 ���� �� ���

		int[] money = { 2200, 1400, 3200, 2900, 4500, 3000, 800, 3400 };
		int sum = 0;
		for (int i = 0; i < money.length; i++) {
			if (money[i] <= 2000) {
				sum += money[i];
			}
		}
		System.out.println(sum);

		// Q2)
		// �ѱ�, ����, ����, �λ�, �ϱ�, ����, ����, �����, ��ġ��
		// �� ���� ���� �迭���� �Ʒ��� ���� ���
		String[] arr = { "�ѱ�", "����", "����", "�λ�", "�ϱ�", "����", "����", "�����", "��ġ��" };

//		[console ���]
//		�ѱ� - ���� �ϱ� �����
		System.out.println(arr[0] + " - " + arr[1] + " " + arr[4] + " " + arr[7]);

		// Q2-2)
		// �ϱ��� ���걸�� �ٲ㺸��
		arr[4] = "���걸";
		System.out.println(arr[4]);

		// Q2-3)
		// �迭�� ����ִ� ������ ���� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
