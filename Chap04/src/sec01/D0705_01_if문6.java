package sec01;

import java.util.Scanner;

public class D0705_01_if��6 {

    public static void main(String[] args) {

	// int Ÿ���� ���� score�� �����ϰ� Ű����� ���� �Է¹�������
	// �Ʒ��� ���� �������� �������� ���α׷��� ��������
	// (if else if- else�� ���)

	// <��ޱ���>
	// 91~100�̸� A���
	// 81~90�̸� B���
	// 71~80�̸� C���
	// 70���ϸ� F���

	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int score = sc.nextInt();

	// 1)
//		if(score >= 91 && score <= 100) {
//			System.out.println("������ 91~100 �Դϴ�.\n����� A�Դϴ�.");
//		}else if(score >= 81) {
//			System.out.println("������ 81~90 �Դϴ�.\n����� B�Դϴ�.");
//		}else if(score >= 71) {
//			System.out.println("������ 71~80 �Դϴ�.\n����� C�Դϴ�.");
//		}else {
//			System.out.println("������ 70���� �Դϴ�.\n����� F�Դϴ�.");
//		}

	// 2)
//		if(score > 90 && score <= 100) {
//			System.out.println("������ 91~100 �Դϴ�.");
//			System.out.println("����� A�Դϴ�.");
//		}else if(score > 80) {
//			System.out.println("������ 81~90 �Դϴ�.");
//			System.out.println("����� B�Դϴ�.");
//		}else if(score > 70) {
//			System.out.println("������ 71~80 �Դϴ�.");
//			System.out.println("����� C�Դϴ�.");
//		}else {
//			System.out.println("������ 70���� �Դϴ�.");
//			System.out.println("����� F�Դϴ�.");
//		}

	// 3)
	if (score <= 100 && score >= 91) {
	    System.out.println("������ 91~100 �Դϴ�.");
	    System.out.println("����� A�Դϴ�.");
	} else if (score <= 90 && score >= 81) {
	    System.out.println("������ 81~90 �Դϴ�.");
	    System.out.println("����� B�Դϴ�.");
	} else if (score <= 80 && score >= 71) {
	    System.out.println("������ 71~80 �Դϴ�.");
	    System.out.println("����� C�Դϴ�.");
	} else if (score <= 70 && score >= 0) {
	    System.out.println("������ 70���� �Դϴ�.");
	    System.out.println("����� F�Դϴ�.");
	} else {
	    System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
	}

	// 4)
//		if(score >= 0 && score <= 100) {
//			if(score >= 91) {
//				System.out.println("������ 91~100 �Դϴ�.");
//				System.out.println("����� A�Դϴ�.");
//			}else if(score >= 81) {
//				System.out.println("������ 81~90 �Դϴ�.");
//				System.out.println("����� B�Դϴ�.");
//			}else if(score >= 71) {
//				System.out.println("������ 71~80 �Դϴ�.");
//				System.out.println("����� C�Դϴ�.");
//			}else{
//				System.out.println("������ 70���� �Դϴ�.");
//				System.out.println("����� F�Դϴ�.");
//			}
//		}else {
//			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
//		}

	// 5) (���׿����� ���)
//		System.out.println((score > 90 && score <= 100) ? "������ 91~100�Դϴ�.\n����� A�Դϴ�." : ((score > 80) ? "������ 81~90�Դϴ�.\n����� B�Դϴ�." : ((score > 70) ? "������ 71~80�Դϴ�.\n����� C�Դϴ�" : "������ 70�����Դϴ�.\n����� F�Դϴ�.")));

    }

}
