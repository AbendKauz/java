package dayTest;

import java.util.Scanner;

public class Test0714 {

	public static void main(String[] args) {

		// 0713 ����Ǯ��(�� ��� 1 ~ 4)

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int n = s.nextInt();

		// (1)
		// *****
		// ****
		// ***
		// **
		// *

//		for (int i = 1; i <= n; i++) {				// ��	: n
//			for (int j = 1; j <= n - i + 1; j++) {	// ��	: n - i + 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// (2)
		// *
		// **
		// ***
		// ****
		// *****

//		for (int i = 1; i <= n; i++) {		// ��	: n
//			for (int j = 1; j <= i; j++) {	// ��	: i
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// (3)
		// *****
		// ****
		// ***
		// **
		// *

//		for(int i = 1; i <= n; i++) {				// ��	: n
//			for(int j = 1; j <= i - 1; j++) {		// ����	: i - 1
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= n - i + 1; j++) {	// ��(*)	: n - i + 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// (4)
		// *
		// **
		// ***
		// ****
		// *****

//		for(int i = 1; i <= n; i++) {			// ��	: n
//			for(int j = 1; j <= n - i; j++) {	// ����	: n - i
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) {		// ��(*)	: i
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//--------------------------------------------------------------------------------------------------------------------------

		// n�� 5 �Է¹޾��� �� ���
		// *
		// ***
		// *****
		// *******
		// *********

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int n = s.nextInt();
//		
//		for (int i = 1; i <= n; i++) {				// ��	: n
//			for (int j = 1; j <= n - i; j++) {		// ����	: n - i
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i * 2 - 1; j++) {	// ��(*)	: i * 2 - 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// �� ���� �Է¹޾� �ڸ��� ���

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int n = s.nextInt();	// ���� ����
//		int input = n;			// ���� �ڸ��� ���� �ӽú���
//		int cnt = 0;			// count
//		while(input > 0) {
//				input /= 10;
//				cnt++;
//		}
//		System.out.println(n + "�� �ڸ��� ������ " + cnt + "�� �Դϴ�.");

		// �� ������ �迭 5���� ����� 5 ~ 15 ������ ������ �Է��ϰ� ��� (��¿���) : a[0] = 13

//		int[] a = new int[5];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)((Math.random() * 11) + 5);
//			System.out.println("a[" + i + "] = " + a[i]);
//		}

		// �� ������ �迭 10�� ����� 2~20 ���� ������ �Է�, �迭�� �հ� ���

//		int[] a = new int[10];
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)((Math.random() * 19) + 2);
//			System.out.print(a[i] + " ");		// ������ Ȯ�ο� ���
//			sum += a[i];
//		}
//		System.out.println("�迭�� �հ� : " + sum);

		// �� ������ �Է¹޾� �Է¹��� ����ũ���� �迭�����ϰ� ������ ����, ����� �� �߿���
		// ¦���� ������ �հ� ��� (random�� : 1 ~ 100����)

//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int[] a = new int[s.nextInt()];
//		int sum = 0;
//		int cnt = 0;
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)((Math.random() * 100) + 1);
//			System.out.print(a[i] + " ");		// ������ Ȯ�ο� ���
//			if(a[i] % 2 == 0) {
//				sum += a[i];
//				cnt++;
//			}
//		}
//		System.out.println("¦���� ���� : " + cnt + ", ¦���� �հ� : " + sum);

		// �� 5 ~ 1000 ������ �ڼ��� �迭�� �����ϰ�
		// �迭�� ����� ������ ��� ���

//		boolean tf = true;			// �ڼ� �ƴ� �� ����
//		int cnt = 0;				// �迭 ���� ���� ������ ����
//		
//		for(int i = 5; i <= 1000; i++) {	// 5 ~ 1000 ������ ��
//			for(int j = 2; j < i; j++) {	// �ڼ��Ǻ�
//				if(i % j == 0) {	// �ڼ��� �ƴϸ�
//					tf = false;		// tf = false
//				}
//			}
//			if(tf) {	// tf�� true��
//				cnt++;	// ���� �߰�
//			}
//			tf = true;	// false�� �� ��� �ʱ�ȭ
//		}
//		
//		int[] arr = new int[cnt];	// �ڼ� ������ �迭, cnt�� ũ�� ����
//		
//		for(int i = 0; i <arr.length; i++) {	// arr[] ũ�⸸ŭ
//			for(int j = 5; j <= 1000; j++) {	// 5 ~ 1000 ������ ��
//				for(int k = 2; k < i; k++) {	// �ڼ��Ǻ�
//					if(i % j == 0) {			// �ڼ��� �ƴϸ�
//						tf = false;				// tf = false
//					}
//				}
//				if(tf) {		// tf�� true��
//					arr[i] = i;	// arr[i]�� �� ����
//				}
//				tf = true;	// false�� �� ��� �ʱ�ȭ
//			}
//		}
//		
//		int sum = 0;		// �ڼ� ���� ����
//		double avg = 0;		// ��� �����
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];						// ���տ� arr[i]�� ����
//		}
//		avg = (double)sum / arr.length;			// avg = (double)sum / arr.length
//		System.out.println("arr[]�� ��� : " + avg);

		// �� 10 ~ 200 ������ ���� ���� 10���� �迭�� �����ϰ�,
		// ��ü �迭��Ҹ� ����ϰ� 50�� ���� ����� �� ���

//		int[] arr = new int[10];
//		for(int i = 0; i <= 9; i++) {	// 10 ~ 200 ������ ���� ���� 10���� �迭�� ����
//			arr[i] = (int)((Math.random() * 191) + 10);
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
//		System.out.println();
//		
//		int n = arr[0];		// 50�� ���� ����� �� ����
//		int num1 = 0;		// �ٻ�ġ ���� ����1(�迭��)
//		int num2 = 0;		// �ٻ�ġ ���� ����2(n�� ����� ��)
//		for (int i = 1; i < arr.length; i++) {
//			num1 = (arr[i] - 50 > 0) ? arr[i] - 50 : 50 - arr[i];	// �迭���� 50���� ū�� ������ ���
//			num2 = (n - 50 > 0) ? n - 50 : 50 - n;
//			if(num1 < num2) {
//				n = arr[i];
//			}
//		}
//		System.out.println("50�� ���� ����� �� : " + n);

	}

}
