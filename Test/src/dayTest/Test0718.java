package dayTest;

import java.util.Scanner;

public class Test0718 {

	public static void main(String[] args) {

		// �� ������ �迭 50���� �����ϰ� 20���� 1 ~ 100������ ������ �Է�,
		// �۾�����(1: ����, 2: ����) :
		// ������ ��ġ :
		// ������ �� :
		// ������ �Ŀ� ������ ���
		// ���� �۾��� ���������� �۾�

		Scanner s = new Scanner(System.in);
		int[] arr = new int[50];
		for (int i = 0; i < 20; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n�۾�����(1: ����, 2: ����) : ");
		int a = s.nextInt();

		if (a == 1) {
			System.out.print("������ ��ġ : ");
			int c = s.nextInt();
			System.out.print("������ �� : ");
			int d = s.nextInt();
			int t = 0;
			for (int i = c; i < arr.length; i++) {
				t = arr[i];
				arr[i] = d;
				d = t;
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		} else if (a == 2) {
			System.out.print("������ ��ġ : ");
			int e = s.nextInt();

			int t = 0;
			for (int i = arr.length - 1; i >= e; i--) {
				t = arr[i];
				arr[i] = arr[e];
				arr[e] = t;
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					break;
				}
				System.out.print(arr[i] + " ");

			}

		}

	}

}
