package chap04;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

//		Q1) �ڹ�, ���̽�, ������ ���̽� ������ Ű����� �Է¹޾�
//	    java, python, database  ��� ������ ���� �����ϱ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA ���� �Է� : ");
		int java = sc.nextInt();
		System.out.print("Python ���� �Է� : ");
		int python = sc.nextInt();
		System.out.print("�����ͺ��̽� ���� �Է� : ");
		int database = sc.nextInt();

//	    3 ������ �հ�� ����� ����ض�.
		int sum = java + python + database;
		System.out.println("�հ� : " + sum);
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);

//	    +  3 ���� �߿� 1 �����̶� 40�� ���϶�� --> ������� ������. �� ����ض�
//	   [console]
//	   Java ���� �Է� : _______                   	10
//	   Python ���� �Է� : _______                 	10
//	   �����ͺ��̽� ���� �Է� : _______          		12
//	   �հ� : ( 3 ������ ��)                           32
//	   ��� : ( 3 ������ ���)                        	10.66666666666
//	   �� ��� : ( )                                ������� ������.
		if (java <= 40 || python <= 40 || database <= 40) {
			System.out.println("������� ������.");
		} else {
			if (avg >= 100 && avg <= 91) {
				System.out.println("�� ��� : A���");
			} else if (avg >= 90 && avg <= 81) {
				System.out.println("�� ��� : B���");
			} else if (avg >= 80 && avg <= 71) {
				System.out.println("�� ��� : C���");
			} else {
				System.out.println("�� ��� : F���");
			}
		}

	}

}
