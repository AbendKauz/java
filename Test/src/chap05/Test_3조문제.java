package chap05;

import java.util.Scanner;

public class Test_3������ {

	public static void main(String[] args) {

		// 1. �� ������ �Է¹޾� �� ���� ���̰� �߿� ¦���� ������ ���
		// (�Է¹��� ���� ����)

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� 1 : ");
//		int a = s.nextInt();
//		System.out.print("���� �Է� 2 : ");
//		int b = s.nextInt();
//		
//		if(a > b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
//		
//		int cnt = 0;
//		for(int i = a; i < b; i++) {
//			if(i % 2 == 0) {
//				cnt++;
//			}
//		}
//		System.out.println("¦���� ���� : " + cnt + "��");

		// 2.
		// Up & Down ���� ���α׷� �����
		// 1. ���α׷��� ����Ǹ� ��ǻ�ʹ� ������ ���� 1~20������ ���� �ϳ��� ���� �� ����
		// 2. 20 �̸��� ������ Ű����� �Է��ϱ�
		// 3. �Է¹��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������(up) ������(down) �Ǵ��Ͽ� ���
		// 4. 5���� ��ȸ�� �־����� ���߿� ����, ���� �Ǻ� �� ����

//		Scanner s = new Scanner(System.in);
//		int num = (int)(Math.random() * 20) + 1;
//		int cnt = 5;
//		System.out.println("5���� ������ȸ�� �ֽ��ϴ� >> ���ӽ���");
//		while(true) {
//			if(cnt == 0) {
//				System.out.println("5�� ��� ����!!! ���� " + num + "�Դϴ�.");
//				break;
//			}
//			System.out.print(cnt + " < ���� �Է� : ");
//			int user = Integer.parseInt(s.nextLine());
//			if(user > num) {
//				System.out.println("Down");
//				cnt--;
//			}else if(user < num) {
//				System.out.println("Up");
//				cnt--;
//			}else {
//				System.out.println((5 - cnt + 1) + "������ ����! ���� " + num + "�Դϴ�.");
//				break;
//			}
//		}

		// 3. ���̿� ���̰� ����, ����, ���� �Ͽ��� ��, �̱��� ���

//		Scanner s = new Scanner(System.in);
//		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
//		System.out.print("���� >> ");
//		String a = s.next();
//		System.out.print("���� >> ");
//		String b = s.next();
//		
//		if(a.equals("����") && b.equals("����") || a.equals("����") && b.equals("��") || a.equals("��") && b.equals("����")) {
//			System.out.println("���̰� �̰���ϴ�.");
//		}else if(a.equals("����") && b.equals("��") || a.equals("����") && b.equals("����") || a.equals("��") && b.equals("����")) {
//			System.out.println("���̰� �̰���ϴ�.");
//		}else {
//			System.out.println("�����ϴ�.");
//		}

	}

}
