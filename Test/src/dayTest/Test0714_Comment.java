package dayTest;

import java.util.Scanner;

public class Test0714_Comment {

	public static void main(String[] args) {

		// �� ���� �Է¹޾� �ڸ��� ���

		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int n = s.nextInt();	// ���� ����
//		int input = n;			// ���� �ڸ��� ���� �ӽú���
//		int cnt = 0;			// count
//		while(input > 0) {
//				input /= 10;
//				cnt++;
//		}
//		System.out.println(n + "�� �ڸ��� ������ " + cnt + "�� �Դϴ�.");	

		// �� ������ �迭 5���� ����� 5 ~ 15 ������ ������ �Է��ϰ� ���
		// (��¿���) : a[0] = 13

//		int[] a = new int[5];	// �迭 ����
//		// 5 ~ 15
//		for (int i = 0; i < a.length; i++) {
//			int n = (int)(Math.random() * 11) + 5;
//			a[i] = n;
//			System.out.println("a[" + i + "] = " + a[i]);
//		}

		// �� ������ �迭 10�� ����� 2~20 ���� ������ �Է�, �迭�� �հ� ���

//		int[] a = new int[10];	// �迭 ����(memory�� �ø�), new : �������� ����
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {		// . => ���������� ����� �� �ִ� ���� or method ȣ��
//			a[i] = (int)(Math.random() * 19) + 2;	// .random() : method�� ��ȣ()�� �ڿ� ��
//			sum += a[i];
//			System.out.println("a[" + i + "] = " + a[i]);
//		}
//		System.out.println("�迭 �հ� : " + sum);

		// �� ������ �Է¹޾� �Է¹��� ����ũ���� �迭�����ϰ� ������ ����, ����� �� �߿���
		// ¦���� ������ �հ� ��� (random�� : 1 ~ 100����)

//		Scanner s = new Scanner(System.in);
//		System.out.print("�迭 ũ�� �Է� : ");
//		int n = s.nextInt();
//		int cnt = 0, sum = 0;	// ����, �հ�
//		int[] a = new int[n];
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 100) + 1;
//			if(a[i] % 2 == 0) {
//				sum += a[i];
//				cnt++;
//				System.out.println("a[" + i + "] = " + a[i]);	// ¦���� �迭�� �� ���
//			}
//		}
//		System.out.println("¦���� ���� : " + cnt + ", ¦���� �� : " + sum);

		// �� 5 ~ 1000 ������ �ڼ��� �迭�� �����ϰ�
		// �迭�� ����� ������ ��� ���

//		int[] a = new int[200];		// ���Ƿ� ���� 200�̶� ����
//		int idx = 0;	// index ���� ����
//		int start = 5;
//		int end = 1000;
//		int j;
//		for(int i = start; i <= end; i++) {	// �ڼ����� �Ǻ��� ��			// i = 5	,	6
//			for(j = 2; j < i; j++) {	// ������ �� (2 ~ (�ڽ� - 1))	// j = 2 ~ 4,	2 ~ 5
//				if(i % j == 0) {
//					break;
//				}
//			}
//			if(i == j) {
//				a[idx] = i;
//				idx++;
////				a[idx++];	//a[idx]�� i�� �ְ� 1 ����
//			}
//		}
//		System.out.println("** �ڼ� ��� **");
//		
//		for (j = 0; j < a.length; j++) {
//			System.out.println("a[" + j + "] " + a[j]);
//		}
//		
//		// ��� ��� (����)
//		int sum = 0;		// �ڼ� ���� ����
//		int cnt = 0
//		double avg = 0;		// ��� ����� ����
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] > 0){
//				sum += arr[i];						// ���տ� arr[i]�� ����
//				cnt++;
//			}		
//		}
//		avg = (double)sum / cnt;			// avg = (double)sum / cnt
//		System.out.println("arr[]�� ��� : " + avg);

		// �� 10 ~ 200 ������ ���� ���� 10���� �迭�� �����ϰ�,
		// ��ü �迭��Ҹ� ����ϰ� 50�� ���� ����� �� ���

//		int a = 100;
//		int b = -50;
//		b= Math.abs(b);	// .abs : ���밪�� ���ϴ� method
//									-> �������� ������ ǥ����
//		System.out.println(a + ", " + b);
//		int[] a = new int[10];
//		int cha = 200;
//		int c = 0;	// ���̰� ���� ���� �� ����� ����
//		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)(Math.random() * 191) + 10;
//			System.out.print(a[i] + ", ");	// ��ü �迭��� ���
//			int k = Math.abs(50-a[i]);	// k = 50 - a[i]������ ���밪
//			if(cha > k) {
//				c = a[i];	// �ٻ簪 ����
//				cha = k;	// cha�� �ٻ�ġ ����
//			}
//		}
//		System.out.println();
//		System.out.println("50�� ���� ����� �� : " + c);

	}

}
