package sec02;

import java.util.Scanner;

public class D0706_01_for��2 {

	public static void main(String[] args) {

		// 1���� 100������ ���� ����ϴ� ���α׷��� �ۼ�
//		int a = 0;
//		for(int i = 1; i <= 100; i++) {
//			a = a + i;
//		}
//		System.out.println("1���� 100������ �� : " + a);

		// Ű����� ������ �Է¹޾�
		// 1���� �Է��� ��ŭ ���� ���ϴ� ���α׷�
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int b = sc.nextInt();
//		int c = 0;
//		for(int j = 1; j <= b; j++) {
//			c = c + j;
//		}
//		System.out.println("1���� " + b + "������ �� = " + c );

		// 87���� 34���� ����ϴ� ���α׷� �ۼ�
//		for(int k = 87; k >= 34; k--) {
//			System.out.println(k);
//		}

		// 87���� 34���� ¦���� ����ϴ� ���α׷� �ۼ�
//		for(int l = 87; l >= 34; l--) {
//			if(l % 2 == 0) {
//				System.out.println(l);
//			}
//		}

		// 100������ �ٸ� ���� 2���� �Է¹޾�
		// Ȧ���� ���� ���� �� ���� ū �� ���� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� 1 : ");
		int m = sc.nextInt();
		System.out.print("���� �Է� 2 : ");
		int n = sc.nextInt();

//		// 1)
//		if(m < n) {
//			for(m = m; m <= n; m++) {
//				if(m % 2 == 1) {
//					System.out.println(m);
//				}
//			}
//		}else {
//			for(n = n; n <= m; n++) {
//				if(n % 2 == 1) {
//					System.out.println(n);
//				}
//			}
//		}

//		// 2)(if - for�� �ִ��� ���� ���)
//		int temp = 0;
//		if(m > n) {			// ex) m = 20	n = 10
//			temp = m;	// temp = 20, m = 20, n = 10
//			m = n;			// temp = 20, m = 10, n = 10
//			n = temp;		// temp = 20, m = 10, n = 20
//		}
//		
//		for(m = m; m <= n; m++) {
//			if(m % 2 != 0) {
//				System.out.println(m);
//			}
//		}

//		// 3)(���׿��� �̿�) -> ū ���ڴ� large, ���� ���ڴ� small
		// ���׿����� ����
		// ���ǽ� ? T�϶� �� : F�϶� ��
		// (T) :_______
		// (F) :_________
//		int large = m > n ? m : n;
//		int small = m < n ? m : n;
//		
//		for(int i = small; i <= large; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

	}

}
