package dayTest;

import java.util.Scanner;

public class Test0719 {

	public static void main(String[] args) {

		// ������ 1900 ~ 2004���� 30�� ����
		// ������ ar�迭��, ������ �ƴ� ���� br�迭�� ���� ��
		// ar�迭�� br�迭 ���(��, 0���� ���X)
		// (����for�� ������)

		// ����?
		// 4�� ����̸鼭, 100�� ����� �ƴ� ��
		// �Ǵ� 400�� ����� ��

//		int[] ar = new int[30];
//		int[] br = new int[30];
//		int a = 0;
//		int b = 0;
//		boolean c = true;
//		
//		// ���׿����� ���
//		for(int i = 0; i < 30; i++) {
//			int year = (int)(Math.random() * 105) + 1900;
//			c = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
//			ar[i] = (c) ? year : 0;
//			br[i] = (!c) ? year : 0;
//		}
//		
//		// ���׿����� ���x
//		for (int i = 0; i < 30; i++) {
//			int year = (int)(Math.random() * 105) + 1900;
//			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//				ar[a++] = year;
//			}else {
//				br[b++] = year;
//			}
//			
//		}
//		
//		// ���
//		System.out.print("���� : ");
//		for(int i = 0; i < ar.length; i++) {
//			if(ar[i] == 0) {
////				break;
//				continue;
//			}
//			System.out.print(ar[i] + " ");
//		}
//		System.out.print("\n���� �ƴ� : ");
//		for (int i = 0; i < br.length; i++) {
//			if(br[i] == 0) {
////				break;
//				continue;
//			}
//			System.out.print(br[i] + " ");
//		}

		// ��� 2000���� ���� 2000������ ���� �� 20���� �迭�� ������ ��
		// �迭�� ����� �� 20���� ������ ����غ�����

//		int[] ar = new int[20];
//		int[] rr = new int[20];
//		int max = 2000;
//		int min = -2000;
//		int rank;
//		for (int i = 0; i < ar.length; i++) {
//			int a = (int)(Math.random() *  (max - min + 1)) + min;
//			ar[i] = a;
//		}
//
//		for (int i = 0; i < rr.length; i++) {
//			rank = 1;
//			for (int j = 0; j < rr.length; j++) {
//				if(ar[i] < ar[j]) {
//					rank++;
//				}
//			}
//			rr[i] = rank;
//		}
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print((i + 1) + " ��° �� : " + ar[i]
//					+ ", ���� : (" + rr[i] + "��) ");
//			for (int j = rr[i]; j <= 20; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 1.
		// 1 ~ 9 ������ 3���� ������ �������� �̴µ� ���� 3���� ���� �ߺ����� �ʾƾ� ��
		// -> �� ������ ������ �ߺ����� ���� ���� �������� ���
		// �������� ���� ���� ���ڸ� ����� �ϴµ� ��ġ���� ��Ȯ�� �¾ƾ� ��.
		// 3���� ���ڸ� Ű����� �Է¹޾� ��.

		// ���ڿ� ������ ��ġ���� ��ġ�ϸ� ��Ʈ����ũ(strike)
		// ���ڴ� ������ ��ġ�� Ʋ�ȴٸ� ��(ball)
		// ���� 3���� ��� ��ġ���� ������ �ƿ�(out)���� ����
		// 3strike�� �Ǹ� ���� ����
		// �õ��� Ƚ�� ǥ��
		// ������� �������� ���θ� ����� ���� ������ �Ѵ�.

//		int[] num = new int[9];
//		
//		Scanner s = new Scanner(System.in);
//		int[] user = new int[3];
//		int round = 1;
//		int strike, ball, cnt = 0;
//		
//		while(true) {
//			for (int i = 0; i < num.length; i++) {
//				num[i] = i + 1; 
//			}
//			for (int i = 0; i < 200; i++) {
//				int n1 = (int)(Math.random() * (num.length));
//				int n2 = (int)(Math.random() * (num.length));
//				
//				int t = num[n1];
//				num[n1] = num[n2];
//				num[n2] = t;
//			}
//			System.out.print(round + "ȸ : ");
//			for (int i = 0; i < 3; i++) {
//				System.out.print(num[i] + " ");
//			}
//			
//			do {
//				cnt++;
//				strike = 0;
//				ball = 0;
//				System.out.println("\n3���� ������ �Է��ϼ���(1~9)\n�����̽��� �����Ͻð� �������� Enter�� �����ּ���");
//				for (int i = 0; i < user.length; i++) {
//					user[i] = s.nextInt();
//				}
//				
//				for (int i = 0; i < 3; i++) {
//					for (int j = 0; j < user.length; j++) {
//						if(num[i] == user[j]) {
//							if(i == j) {
//								strike++;
//							}else {
//								ball++;
//							}
//						}
//					}
//				}
//				if(strike == 3) {
//					System.out.println(strike + "��Ʈ����ũ ��������");
//					System.out.println(cnt + "������ ���߼̽��ϴ�.");
//					System.out.println("�Ѱ��� �� �Ͻðڽ��ϱ�?(0:����, 1:�����)");
//					int select = s.nextInt();
//					if(select == 1) {
//						round++;
//						break;
//					}else {
//						System.out.println("==������ ����Ǿ����ϴ�.==");
//						System.exit(0);
//					}
//				}else {
//					if(strike >= 1 || ball >= 1) {
//						System.out.println(strike + "��Ʈ����ũ, " + ball + "��");
//					}else {
//						System.out.println("�ƿ��Դϴ�.");
//					}
//				}
//			}while(true);
//			
//		}// while

	}

}
