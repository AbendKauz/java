package chap04;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		// ���� ��� ���α׷�
		// 1. ������ �ϳ� Ű����� �Է¹޾� ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		// 2. 1���� �Է¹��� ���ڱ��� �Ʒ��� ���� ������ ����ϴ� �ڵ� �ۼ�
		// ¦���� �տ� -

		// 1. (for, if)
//		for(int i = 1; i <= a; i++) {
//			if(i % 2 == 0) {
//				System.out.print("-" + i + " ");
//			}else {
//				System.out.print(i + " ");
//			}
//		}

		int i = 1;
		// 2. (while, ���׿����)
//		while(i <= a) {
//			System.out.print( (i % 2 == 0) ? "-" + i + " " : i + " " );
//			i++;
//		}

		// 3. (for, switch)
//		for(int i = 1; i <= a; i++) {
//			switch (i % 2) {
//			case 0: {
//				System.out.print("-" + i + " ");
//				break;
//			}
//			default:
//				System.out.print(i + " ");
//			}
//		}

		// 4. (do-while, if)
		do {
			if (i % 2 == 0) {
				System.out.print("-" + i + " ");
			} else {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= a);

	}

}
