package dayTest;

import java.util.Scanner;

public class Test0711_Comment {

	public static void main(String[] args) {

//		// 5. ���������� (���ڷ� ó��)
		// ����(1), ����(2), ��(3) �Է� :
		// ��ǻ�Ͱ� �̰���ϴ�.!!

//		Scanner s = new Scanner(System.in);
//		int total = 0;	// ��ü �õ�Ƚ��
//		int win = 0;	// ����ڰ� �̱� Ƚ��
//		
//		while(true) {
//			int comp = (int)(Math.random() * 3) + 1;
//			int user;
//			while(true) {
//				System.out.print("����(1), ����(2), ��(3) �Է� : ");
//				user = s.nextInt();
//				if(user >= 1 && user <= 3) {
//					break;
//				}
//				System.out.println("���������� �Է��ض�. 1~3������ �Է��� �� �ֽ��ϴ�.");
//			} // end while
//			
////			// 1. ����	2. ����	3. ��
//			int result = comp - user;
//			// comp	user	com win
//			// 1 - 3 = -2
//			// 2 - 1 = 1
//			// 3 - 2 = 1
//			total++;
//			if(result == 0) {
//				System.out.println("�����ϴ�.");
//			}else if(result == -2 || result == 1) {
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�.!!");
//			}else {
//				System.out.println("����ڰ� �̰���ϴ�.!!");
//				win++;
//			}
//
//			// ������ ��� �Ͻðڽ��ϱ�?(y/n) :
//			// n �Ǵ� N�� ������ ���� / �� �̿ܿ��� ��� �ǵ���
//			
//			System.out.print("������ ��� �Ͻðڽ��ϱ�?(y/n) : ");
//			char ch = s.next().charAt(0);
//			
//			if(ch == 'n' || ch == 'N') {
//				break;
//			}
//			
//		} // end while
//		
//		//������� �·��� 00.0%�Դϴ�. ���
////		DecimalFormat df = new DecimalFormat("##.0%");
//		System.out.println("�� ���� Ƚ�� : " + total);
//		System.out.println("����ڰ� �̱� Ƚ�� : " + win);
////		System.out.println("������� �·��� " + df.format((win / (double)total)) + " �Դϴ�.");
//		System.out.printf("������� �·��� %3.1f%% �Դϴ�.\n",(win / (double)total) * 100);
//		System.out.println("������ �����մϴ�.");

//		double n1 = 17/7;		// ���� / ���� = ������ 2�� ���� �Ǽ�Ÿ���� ��(2.0)
//		System.out.println(n1);	// 2.0
//		
//		double n2 = 17/7.;		// .�� �ٿ��� �Ǽ�Ÿ���� ��
//		System.out.println(n2);	// 2.4285714285714284

//		double n = (int)(4/7. * 1000);
//		System.out.println(n);			// 571.0

//		double n = (int)(4/7. * 1000) / 10.;
//		System.out.println(n);			// 57.1

//		double n = (int)(4/(double)7 * 1000) / (double)10;	// .�� ����� double�� ����ȯ ���� �۾��ص� ����
//		System.out.println(n);			// 57.1

//		// 6. ���� ���߱�(1~500������ ��) high low game
//		// ex) ��ǻ�� ���� : 200
//		// ���� �Է� : 300
//		// => �� ���� ���� �Է��ϼ���
//		// ���� �Է� : 150
//		// => �� ū ���� �Է��ϼ���
//		// ���� �Է� : 201
//		// => �� ���� ���� �Է��ϼ���
//		// ���� �Է� : 200
//		// => �����Դϴ�!!!
//		// ����Ƚ���� 3ȸ �Դϴ�.

//		// (int)(Math.random() * ������) + ��;
//		// �� => �ּҰ�, ������ => �ִ밪 - �ּҰ� + 1

//		// 1 ~ 30
//		(int)(Math.random() * 30) + 1;

//		// 5 ~ 15
//		(int)(Math.random() * 11) + 5;

		// 10 ~ 500 ������ ���ڰ� ���߱�

//		Scanner s = new Scanner(System.in);
//		
//		int correct = (int)(Math.random() * 491) + 10;
//		
//		while(true) {
//			System.out.print("10���� 500���� ���� �Է� : ");
//			int userNum = s.nextInt();
//			
//			if(correct == userNum) {
//				System.out.println("������ ������ϴ�.!!");
//				break;
//			}else if(correct > userNum) {
//				System.out.println("�� ū ���� �Է��ϼ���.");
//			}else {
//				System.out.println("�� ���� ���� �Է��ϼ���.");
//			}
//		} // while
//		
//		System.out.println("������ �����մϴ�.");

		// 38 ~ 777
//		int max = 500;
//		int min = 10;
//		
//		max++;		// max�� ���� ����
//		min--;		// min�� ���� ����
//		System.out.println(min + "���� " + max + "���� ���");

//		final int MAX = 500;	// final�� ���̸� ����� �����ϳ� ���� ������ �� ����
//		final int MIN = 10;		// final(���)�� ���� �빮�ڷ� ���
//		
//		MAX++;		// final�� ���̸� �� ���� �Ұ�
//		MIN--;		//           ""
//		System.out.println(MIN + "���� " + MAX + "���� ���");

	}

}
