package dayTest;

import java.util.Scanner;

public class Test0711 {

	public static void main(String[] args) {

//		// 5. ����������
//		Scanner s = new Scanner(System.in);
//		while (true) {
//			System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. >> ");
//			String user = s.nextLine();
//			if(!user.equals("����") && !user.equals("����") && !user.equals("��")) {	// ����,����,�� �̿��� ���� �Է� �� �ٽ��Է�
//				System.out.println("�ٽ� �Է��ϼ���.");
//				continue;
//			}else {
//				int userNum = 0;			// �Էµ� ���� ���ڷ� ����� ����
//				if(user.equals("����")) {		// �Էµ� ���� ���� �� ��� 1
//					userNum = 1;
//				}else if(user.equals("����")) {	// �Էµ� ���� ���� �� ��� 2
//					userNum = 2;
//				}else {							// �Էµ� ���� ���� �� ��� 3
//					userNum = 3;
//				}
//				int comNum = (int)(Math.random() * 3 + 1);	// ��ǻ���� �� ��������
//				String com = "";				// ��¶� ��ǻ���� �� ������ ����
//				if(comNum == 1) {				// ��ǻ�Ͱ� ���� ���� 1�̸� ����
//					com = "����";
//				}else if(comNum == 2) {			// ��ǻ�Ͱ� ���� ���� 2�̸� ����
//					com = "����";
//				}else {							// ��ǻ�Ͱ� ���� ���� 3�̸� ��
//					com = "��";
//				}
//				System.out.println("����ڰ� �� �� : " + user);
//				System.out.println("��ǻ�Ͱ� �� �� : " + com);
//				if((userNum == 1 && comNum == 3) || (userNum == 2 && comNum == 1) || (userNum == 3 && comNum == 2)) {
//					System.out.println("�����ϴ�...");	// ��ǻ�� ��
//				}else if((userNum == 1 && comNum == 2) || (userNum == 2 && comNum == 3) || (userNum == 3 && comNum == 1)) {
//					System.out.println("�̰���ϴ�!!!");	// ����� ��(�̰����� ����)
//					break;
//				}else {
//					System.out.println("�����ϴ�.");		// ����� ��
//				}
//			}
//		}

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

//		Scanner s = new Scanner(System.in);
//		int com = (int)(Math.random() * 500 + 1);
//		int cnt = 0;
//		while(true) {
//			System.out.print("1~500������ ���ڸ� �Է��ϼ���.\n>> ");
//			int num = s.nextInt();
//			if(num <= 500 && num >= 1) {
//				if(num < com) {
//					System.out.println("�� ū ���� �Է��ϼ���.");
//				}else if(num > com) {
//					System.out.println("�� ���� ���� �Է��ϼ���.");
//				}else {
//					System.out.println("�����Դϴ�!");
//					break;
//				}
//			}else {
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//				continue;
//			}
//			cnt++;
//		}
//		System.out.println("�õ�Ƚ���� " + cnt + "�� �Դϴ�.");

	}

}
