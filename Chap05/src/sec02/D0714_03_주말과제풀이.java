package sec02;

import java.util.Scanner;

public class D0714_03_�ָ�����Ǯ�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Q1)
		// ���̾�Ʈ ���α׷� �����

//		System.out.print("���� ������ : ");
//		int weight1 = sc.nextInt();
//		System.out.print("��ǥ ������ : ");
//		int weight2 = sc.nextInt();
//		
//		int week = 1;
//		// �ݺ���
//		while(true) {
//			System.out.print(week + "���� ���� ������ : ");
//			int weight3 = sc.nextInt();
//			weight1 -= weight3;
//			if(weight1 <= weight2) {
//				System.out.println(weight1 + "kg ��ǥ �޼�!! ���̾�Ʈ ����");
//				break;
//			}
//			week++;
//		}

		// Q2)
		// �ֹε�Ϲ�ȣ �Ǻ��ϱ�
		// 120101-3123456 -> 7��° index�� �ִ� ���� �����;� ��
		// charAt();

//		System.out.println("����� �ֹι�ȣ�� �Է��ϼ��� : ");
//		String a = sc.nextLine();
//		char gender = a.charAt(7);

		// 1. switch
//		switch(gender) {
//			case '1':
//				System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
//				break;
//			
//			case '2':
//				System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
//				break;
//			
//			case '3':
//				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
//				break;
//			
//			case '4':
//				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
//				break;
//				
//			default:
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}

		// 2. if��
//		if(gender == '1') {
//			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
//		}else if(gender == '2') {
//			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
//		}else if(gender == '3') {
//			System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
//		}else if(gender == '4') {
//			System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
//		}else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}

		// 3. ����if��
//		if(gender == '1' || gender == '2') {
//			System.out.print("����� 2000�� ������ ����� ");
//			if(gender == '1') {
//				System.out.println("�����Դϴ�.");
//			}else {
//				System.out.println("�����Դϴ�.");
//			}
//		}else if(gender == '3' || gender == '4') {
//			System.out.print("����� 2000�� ���Ŀ� ����� ");
//			if(gender == '3') {
//				System.out.println("�����Դϴ�.");
//			}else {
//				System.out.println("�����Դϴ�.");
//			}
//		}else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}

		// Q3)
		// 369 ���� ���α׷� �����

//		System.out.print("���� �Է� : ");
//		int num = sc.nextInt();

		// 1. if��
//		
//		for(int i = 1; i <= num; i++) {
//			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.println("�ڼ�");
//			}else if(i % 10 == 5 ) {
//				System.out.println("����");
//			}else {
//				System.out.println(i);
//			}
//		}

		// 2. switch��
		// 2.1 char
//		for(int i = 1; i <= num; i++) {
//			// �Է¹��� ���ڸ� ���ڷ� ��ȯ, 10 �̻��̸� ���ڸ��� ������
//			char a = (i > 10) ? String.valueOf(i).charAt(1) : String.valueOf(i).charAt(0);
//			switch (a) {
//				case '3', '6', '9':
//					System.out.println("�ڼ�");
//					continue;
//				case '5':
//					System.out.println("����");
//					continue;
//				default:
//					System.out.println(i);
//			}
//		}

		// 2.2 int
//		for(int i = 1; i <= num; i++) {
//			switch (i % 10) {
//			case 3, 6, 9:
//				System.out.println("�ڼ�");
//			continue;
//			case 5:
//				System.out.println("����");
//				continue;
//			default:
//				System.out.println(i);
//			}
//		}

		// Q4)
		// ���� ��� ���α׷�

		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();

		// 1. if��
//		for(int i = 1; i <= num; i++) {
//			if(i % 2 == 0) {
//				System.out.print("-" + i + " ");
//			}else {
//				System.out.print(i + " ");
//			}
//		}

		// 2. switch��
//		for(int i = 1; i <= num; i++) {
//			switch(i % 2) {
//			case 1 :
//				System.out.print(i + " ");
//				break;
//			default :
//				System.out.print("-" + i + " ");
//			}
//		}

		// 3. while��
//		int i = 1;
//		while(i <= num) {
//			System.out.print( (i % 2 == 0) ? "-" + i + " " : i + " " );
//			i++;
//		}

	}

}
