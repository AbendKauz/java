package chap11;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// �̸��� �Է��ϼ��� : ��) ȫ�浿
		// �б� �̸��� �Է��ϼ��� : ��) �������б�
		// �� 3����� �̸��� �Է¹ޱ� -> �ݺ��� Ȱ��(���� 6�� Ȱ��)

		// ��) �̸��� ȫ�浿�̰� �������б��̸�
		// ȫ�浿 �л��� ���л��Դϴ�.
		// ��) �̸��� �嵿���̰� ���ְ���б��̸�
		// �嵿�� �л��� ����л��Դϴ�.
		// ��) �̸��� ��ҿ��̰� ���ִ��б��̸�
		// ��ҿ� �л��� ���л��Դϴ�.
		// ��, ��, ���л�

		Scanner s = new Scanner(System.in);
		String[][] strArr = new String[3][2];
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				if (j == 0) {
					System.out.print("�̸��� �Է��ϼ��� : ");
					strArr[i][j] = s.next();
				} else if (j == 1) {
					System.out.print("�б��̸��� �Է��ϼ��� : ");
					strArr[i][j] = s.next();
				}
			}
		}

		System.out.println();

		for (int i = 0; i < strArr.length; i++) {

			switch (strArr[i][1].charAt(2)) {
			case '��':
				System.out.println(strArr[i][0] + "�л��� ���л� �Դϴ�.");
				break;
			case '��':
				System.out.println(strArr[i][0] + "�л��� ����л� �Դϴ�.");
				break;
			case '��':
				System.out.println(strArr[i][0] + "�л��� ���л� �Դϴ�.");
				break;
			}

//			for (int j = 0; j < strArr[i][1].length(); j++) {
//				switch (strArr[i][1].charAt(j)) {
//				case '��':
//					System.out.println(strArr[i][0] + "�л��� ���л� �Դϴ�.");
//					break;
//				case '��':
//					System.out.println(strArr[i][0] + "�л��� ����л� �Դϴ�.");
//					break;
//				case '��':
//					System.out.println(strArr[i][0] + "�л��� ���л� �Դϴ�.");
//					break;
//				default:
//					break;
//				}
//			}

//			switch (strArr[i][1].substring(strArr[i][1].length() - 3, strArr[i][1].length())) {
//			case "���б�":
//				System.out.println(strArr[i][0] + "�л��� ���л� �Դϴ�.");
//				break;
//			case "���б�":
//				System.out.println(strArr[i][0] + "�л��� ����л� �Դϴ�.");
//				break;
//			case "���б�":
//				System.out.println(strArr[i][0] + "�л��� ���л� �Դϴ�.");
//				break;
//			default:
//				break;
//			}

		}

	}

}
