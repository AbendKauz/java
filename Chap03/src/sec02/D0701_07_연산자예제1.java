package sec02;

import java.util.Scanner;

public class D0701_07_�����ڿ���1 {

	public static void main(String[] args) {

		// ������ �ϳ� Ű����� �Է¹޾�
		// int Ÿ���� num �̶�� ������ ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		// b��� ������ num�� ¦������(true), Ȧ������(false)
		// ���� �����ؼ� b�� ���� ����Ͻÿ�
		// ex)
		// 20 21
		// [console]
		// true false
		// ���������

//		boolean b = (num % 2) == 0;
//		System.out.println(b);

		// num�� ���� ¦����� -> num�� ¦���Դϴ�.
		// num�� ���� Ȧ����� -> num�� Ȧ���Դϴ�.

//		if(b) {
//			System.out.println(num + "��(��) ¦���Դϴ�.");
//		}
//		if(!b){
//			System.out.println(num + "��(��) Ȧ���Դϴ�.");
//		}

//		if(b) {
//			System.out.println(num + "��(��) ¦���Դϴ�.");
//		}else {
//			System.out.println(num + "��(��) Ȧ���Դϴ�.");
//		}

	}

}
