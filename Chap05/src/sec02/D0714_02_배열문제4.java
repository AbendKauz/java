package sec02;

import java.util.Scanner;

public class D0714_02_�迭����4 {

	public static void main(String[] args) {

		// Q1) �迭�� ���̸� Ű����� ���� �Է¹޾� �迭�� ����
		// �迭���� ���� 2, 4, 8, 16, 32, 64, 128, 256, 512,....��
		// �� �� �ֵ��� �ڵ带 �ۼ� �� �迭�� ���

		Scanner sc = new Scanner(System.in);

//		System.out.print("�迭�� ���� : ");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		int a = 1;
//		for (int i = 0; i < arr.length; i++) {
//			a *= 2;		//		2			4			8
//			arr[i] = a;	// arr[0] = 2;	arr[1] = 4;	arr[2] = 8;
//			System.out.print(arr[i] + " ");
//		}

		// Q2) 1���� ������ �迭�� ������ �� "��","��"�� �ʱ�ȭ(�迭ũ�� = 2)
		// ���ڸ� �Է¹޾� �Է¹��� ���� 5�� ��� "�ڹ��ڹ���",
		// 8�� ��� "�ڹ��ڹ��ڹ��ڹ�"��
		// ����ϴ� ���α׷� �ۼ�

//		char[] arr = {'��', '��'};
//		
//		System.out.println("====�ڹ� ���====");
//		System.out.print("���� �Է� >> ");
//		int num = sc.nextInt();
//		
//		// num�� 1 -> ��
//		// num�� 3 -> �ڹ���
//		// num�� 5 -> �ڹ��ڹ���
//		
//		// num�� 6 -> �ڹ��ڹ��ڹ�
//		// num�� 8 -> �ڹ��ڹ��ڹ��ڹ�
//		
//		for (int i = 1; i <= num; i++) {
//			if(i % 2 == 1) {
//				System.out.print(arr[0]);
//			}else {
//				System.out.print(arr[1]);
//			}
//		}

		// Q3) �Ʒ��� ���� name �迭�� �����ϰ� ������ �̸����� �ʱ�ȭ
		// Scanner�� �о���� �̸��� �� ��° index�� ����Ǿ� �ִ���
		// �˻��ϴ� ���α׷� �ۼ�
		// ȥ�ڹ�, ȫ�浿, �̹���, ��쿵, �Ӽ���, ������

//		String[] name = {"ȥ�ڹ�", "ȫ�浿", "�̹���", "��쿵", "�Ӽ���", "������"};
//		System.out.print("�˻��� �̸��� �Է� >> ");
//		String a = sc.nextLine();
//		
//		boolean c = true;
////		int cnt = 0;
//		
//		for (int i = 0; i < name.length; i++) {
//			if(a.equals(name[i])) {
//				System.out.println(a + "���� " + i + "��° index�� ����ֽ��ϴ�.");
//				c = false;
////				cnt++;
//			}
//		}
//		
//		if(c) {
////		if(cnt == 0) {
//			System.out.println(a + "���� ����Ǿ� ���� �ʽ��ϴ�.");
//		}

		// Q4) ������ ���� ������ ���� �� ����ڷκ��� ���� �Է¹޾� ����� ����ϰ�
		// ������ ����ض�(������ �� 20��)
		// �� : 2, 4, 3, 5, 1

//		int[] arr = {2, 4, 3, 5, 1};
//		int[] answer = new int[arr.length];
//		System.out.println("====ä���ϱ�====");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "���� : ");
//			answer[i] = sc.nextInt();
////			System.out.print(answer[i] + " ");
//		}
//		
//		int cnt = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == answer[i]) {
//				System.out.print("O" + " ");
//				cnt++;
//			}else {
//				System.out.print("X" + " ");
//			}
//		}
//		System.out.println("-> ���� : " + (cnt * 20) + "��");

		// Q5) �迭�� �� �ε����� ����� �� ��ŭ ���� ���
		// �迭 : 3, 4, 2, 5, 7

		// �߰�����
		// -> �迭�� ���̸� Ű����� �Է��� �޾Ƽ� �迭�� ����
		// �迭�� ���� �����ϰ� ����(1 ~ 15)
		// ���� ���� ���

//		int[] arr = {3, 4, 2, 5, 7};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i + "�ε��� - " + arr[i] + " : ");
//			for (int j = 0; j < arr[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
