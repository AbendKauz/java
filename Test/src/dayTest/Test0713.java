package dayTest;

import java.util.Scanner;

public class Test0713 {

	public static void main(String[] args) {

		// 10 ~ 500 ������ ���ڰ� ���߱�
		// Q)
		// 1. ��ȿ�� �˻�(max, min)
		// 2. ������� ������� ��� (ī��Ʈ �߰�)
		// 3. ��ȸ ���� Ƚ�� ���� (���䵵 ���� ���)
		// : ����ڿ��� ����Ƚ���� ���� �� Ƚ����ŭ�� ����

//		Scanner s = new Scanner(System.in);
//		int min = 10;
//		int max = 500;
//		
//		int correct = (int)(Math.random() * (max - min + 1)) + min;
//		int cnt = 0;				// �õ�Ƚ��
//		System.out.print("����Ƚ���� �Է��ϼ���. >> ");
//		int limit = s.nextInt();	// ����Ƚ��
//		
//		while(true) {
//			if(limit > cnt) {
//				System.out.println("\n[���� ����Ƚ���� " + (limit - cnt) + "ȸ �Դϴ�.]\n");
//			}
//			System.out.print(min + "���� " + max + "���� ���� �Է� >> ");
//			int userNum = s.nextInt();
//			if(userNum < min || userNum > max) {
//				System.out.println(min + "���� " + max + "������ �Է��ϼ���");
//				continue;
//			}
//			if(correct == userNum) {
//				System.out.println("������ ������ϴ�.!!");
//				break;
//			}else if(correct > userNum) {
//				System.out.println("�� ū ���� �Է��ϼ���.");
//				cnt++;
//			}else {
//				System.out.println("�� ���� ���� �Է��ϼ���.");
//				cnt++;
//			}
//			if(limit == cnt) {
//				System.out.println("\n����Ƚ���� �ʰ��Ͽ����ϴ�.");
//				System.out.println("������ [" + correct + "]�Դϴ�.");
//				break;
//			}
//		} // while
//		
//		System.out.println("\n�õ��� Ƚ���� [" + cnt + "]�� �Դϴ�.");
//		System.out.println("������ �����մϴ�.");

//--------------------------------------------------------------------------------------------------------------------------

		// n�� �Է¹޾� * ���
		// ex) 5 �Է� ��
//		Scanner s = new Scanner(System.in);
//		System.out.print("�� �Է� : ");
//		int num = s.nextInt();

		// ex1)
		// *****
		// ****
		// ***
		// **
		// *

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();

		// ex2)
		// *
		// **
		// ***
		// ****
		// *****

//		for(int i = 0; i < num; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();

		// ex3)
		// *****
		// ****
		// ***
		// **
		// *

//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < num; j++) {
//				if(j >= i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();

		// ex4)
		// *
		// **
		// ***
		// ****
		// *****

		// 1)
//		for(int i = 0; i < num; i++) {
//			for(int j = 1; j <= num; j++) {
//				if(j >= num-i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// 2)
//		for(int i = 0; i < num; i++) {
//			for(int j = 1; j < num - i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = num; k >= num - i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	} // main()

} // class
