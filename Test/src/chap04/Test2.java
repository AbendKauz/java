package chap04;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

//		Q2 ) �ʸ� Ű����� �Է� �޾� totalSecond ������ ���� �����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
//   	 ��� ��� �������� ����ϴ� �ڵ带 �ۼ��ض�.
//    	 ( hour, min, second ���� �����Ͽ� ���)
//  	[console]
// 		 �� �Է� : __________                 �� �Է� : 3723
//  	 ? �� ?�� ?��                         1�� 2�� 3��

//		// 1)
//		int hour = 0;
//		int min = 0;
//		int second = 0;
//		
//		if(totalSecond >= 60) {
//			if(totalSecond >= 3600) {
//				hour = totalSecond / 3600;
//				min = (totalSecond % 3600) / 60;
//				second = (totalSecond % 3600) % 60;
//				System.out.println(hour + "�� " + min + "�� " + second + "��");
//			}else {
//				min = totalSecond / 60;
//				second = totalSecond % 60;
//				System.out.println(min + "�� " + second + "��");
//			}
//		}else {
//			second = totalSecond;
//			System.out.println(second + "��");
//		}

//		// 2)
		int hour = totalSecond / 60 / 60;
		totalSecond = totalSecond % (60 * 60);
		System.out.println(totalSecond);
		int min = totalSecond / 60;
		int sec = totalSecond % 60;
		System.out.println(hour + "�� " + min + "�� " + sec + "��");

	}

}
