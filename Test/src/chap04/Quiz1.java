package chap04;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		// ���̾�Ʈ ���α׷� �����
		// 1. ���� �����Կ� ��ǥ �����Ը� Ű����� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ : ");
		int weight1 = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int weight2 = sc.nextInt();
		// 2. ������ ���� �����Ը� �Է¹ޱ�
		int i = 1;
		// 3. ��ǥ �����԰� �޼��� �� ���� ������ ���� �����Դ� ��� �Է� �޾ƾ� �ϰ�,
		// ��ǥ �����Ը� �޼��ϸ� �Ʒ��� ���� ������ ��µǵ��� �ڵ� �ۼ�
		while (true) {
			System.out.print(i + "���� ���� ������ : ");
			int weight3 = sc.nextInt();
			weight1 = weight1 - weight3;
			if (weight1 <= weight2) {
				System.out.println(weight1 + "kg ��ǥ �޼�!! ���̾�Ʈ�� �����ϼ̽��ϴ�.");
				break;
			}
			i++;
		} // while

	}

}
