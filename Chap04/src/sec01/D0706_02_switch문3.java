package sec01;

import java.util.Scanner;

public class D0706_02_switch��3 {

	public static void main(String[] args) {

		// string Ÿ���� ���� grade�� �����ϰ� Ű����� ���� �Է¹ޱ�
		// grade�� ���� ������ ����Ͽ� �Ʒ��� ���� ���� ����� ��������
		// ���α׷� �����
		// ��, ���ĺ� ��ҹ��ڿ� ������� �����ϰ� ó���ؾ� ��
		// (switch�� ���)

		// <ȸ�� ���>
		// A��� : ���ȸ���Դϴ�.
		// B��� : �Ϲ�ȸ���Դϴ�.
		// �� �� : �մ��Դϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("��� : ");
		String grade = sc.nextLine();

//		// 1)
//		switch (grade) {
//			case "A" : 
//				System.out.println("��� ȸ���Դϴ�.");
//				break;
//			case "a" :
//				System.out.println("��� ȸ���Դϴ�.");
//				break;
//			case "B" :
//				System.out.println("�Ϲ� ȸ���Դϴ�.");
//				break;
//			case "b" :
//				System.out.println("�Ϲ� ȸ���Դϴ�.");
//				break;
//			default :
//				System.out.println("�մ��Դϴ�.");
//				break;
//		}

//		// 2)
//		switch (grade) {
//			case "A" :
//			case "a" :
//				System.out.println("��� ȸ���Դϴ�.");
//				break;
//			case "B" :
//			case "b" :
//				System.out.println("�Ϲ� ȸ���Դϴ�.");
//				break;
//			default :
//				System.out.println("�մ��Դϴ�.");
//				break;
//		}

		// 3)
		switch (grade) {
		case "A", "a":
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case "B", "b":
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
			break;
		}

	}

}
