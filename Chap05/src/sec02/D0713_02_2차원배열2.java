package sec02;

import java.util.Scanner;

public class D0713_02_2�����迭2 {

	public static void main(String[] args) {

		// Q1) �迭�� ���̸� Ű����� ���� �Է¹޾� �迭�� ����
		// �迭���� ���� 2, 4, 8, 16, 32, 64, 128, 256, 512,....��
		// �� �� �ֵ��� �ڵ带 �ۼ� �� �迭�� ���
		// [console]
		// 2 4 8 16 32 64 128 256 512....
		// [console]
		// �����Է� : 12
		// 2 4 8 16 32 64 128 256 512 1024 2048 4096

//		Scanner sc = new Scanner(System.in);
//		System.out.print("�迭�� ���� : ");
//		int length = sc.nextInt();
//		
//		int num = 2;
//		int[] arr = new int[length];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = num;
//			num *= 2;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// Q2) 1���� ������ �迭�� ������ �� "��","��"�� �ʱ�ȭ(�迭ũ�� = 2)
		// ���ڸ� �Է¹޾� �Է¹��� ���� 5�� ��� "�ڹ��ڹ���",
		// 8�� ��� "�ڹ��ڹ��ڹ��ڹ�"��
		// ����ϴ� ���α׷� �ۼ�
		// [console]
		// ====�ڹ� ���====
		// �����Է� >> 5
		// �ڹ��ڹ���

		// [console]
		// ====�ڹ� ���====
		// �����Է� >> 8
		// �ڹ��ڹ��ڹ��ڹ�

//		String[] arr1 = new String[2];
//		arr1 = new String[] {"��", "��"};
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("====�ڹ� ���====");
//		System.out.print("���� �Է� >> ");
//		int cnt = sc.nextInt();
//		for (int i = 0; i < cnt; i++) {
//			if(i % 2 != 0) {
//				System.out.print(arr1[1]);
//			}else {
//				System.out.print(arr1[0]);
//			}
//		}

		// Q3) �Ʒ��� ���� name �迭�� �����ϰ� ������ �̸����� �ʱ�ȭ
		// Scanner�� �о���� �̸��� �� ��° index�� ����Ǿ� �ִ���
		// �˻��ϴ� ���α׷� �ۼ�
		// ȥ�ڹ�, ȫ�浿, �̹���, ��쿵, �Ӽ���, ������

		// [console]
		// �˻��� �̸��� �Է� >> �����
		// ��������� 3��° index�� ����Ǿ� �ֽ��ϴ�.

		// [console]
		// �˻��� �̸��� �Է� >> ȫ�浿
		// ȫ�浿���� 1��° index�� ����Ǿ� �ֽ��ϴ�.

//		String[] name = new String[6];
//		name = new String[] {"ȥ�ڹ�", "ȫ�浿", "�̹���", "��쿵", "�Ӽ���", "������"};
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�˻��� �̸��� �Է� >> ");
//		String user = sc.nextLine();
//		
//		for (int i = 0; i < name.length; i++) {
//			if(user.equals(name[i])) {
//				System.out.println(name[i] + "���� "+ i +"��° index�� ����Ǿ� �ֽ��ϴ�.");
//			}
//		}

		// Q4) ������ ���� ������ ���� �� ����ڷκ��� ���� �Է¹޾� ����� ����ϰ�
		// ������ ����ض�(������ �� 20��)
		// �� : 2, 4, 3, 5, 1
		// [console]
		// ====ä���ϱ�====
		// 1���� >> 2
		// 2���� >> 3
		// 3���� >> 3
		// 4���� >> 5
		// 5���� >> 4
		// ����Ȯ��
		// O X O O X -> ���� : 60��
//		Scanner sc = new Scanner(System.in);
////		int[] arr = {2, 4, 3, 5, 1};
//		
//		// ��ȵ� �Է¹�����...��>-��
//		
//		System.out.println("====����ۼ�====");
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "��° �� >> ");
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("====ä���ϱ�====");
//		int[] user = new int[5];
//		String[] cnt = new String[5];
//		
//		for (int i = 0; i < user.length; i++) {
//			System.out.print((i + 1) + "��° �� >> ");
//			user[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] == user[i]) {
//				cnt[i] = "O";
//			}else {
//				cnt[i] = "X";
//			}
//		}
//		System.out.println("����Ȯ��");
//		int sum = 0;
//		for (int i = 0; i < cnt.length; i++) {
//			System.out.print(cnt[i] + " ");
//			if(cnt[i].equals("O")) {
//				sum += 20;
//			}
//		}
//		System.out.println("���� : " + sum + "��");

//------------------------------------------------------------------------------------

		// 0714 �߰�����

		// Q5) �迭�� �� �ε����� ����� �� ��ŭ ���� ���
		// �迭 : 3, 4, 2, 5, 7
		// [console]
		// index 0 - ***
		// index 1 - ****
		// index 2 - **
		// index 3 - *****
		// index 4 - *******

//		int[] arr = new int[] {3, 4, 2, 5, 7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i + "index - " + arr[i] + " : ");
//		
//			for(int j = 1; j <= arr[i]; j++) {
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}

		// Q5.1)
		// ���ϴ� ���̸�ŭ �迭 ����
		// ������ random����(1~15)
		// ������ ������ �Ѿ �� �˾Ҵµ� ��>-��

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 ���� : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 15) + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " index - " + arr[i] + " : ");

			for (int j = 1; j <= arr[i]; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
