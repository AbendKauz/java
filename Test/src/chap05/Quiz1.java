package chap05;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		// �߰��۾�����
		// 1. do-while + switch�� ������ �߰�
		// 2. 1, 2 ���� �� ȸ������, �α��� ���� �߰�

		// ȸ������ �α��� ���α׷�
//		1. ȸ���� ���� �� 3���̴�. 
//		  ->  1 �� Ű����� �Է��ϸ� �� ==== ȸ������ ==== ���� ��µǰ�
//		       ȸ�� ���̵�� ��й�ȣ�� �Է¹޾� �����Ѵ�. 
//		  -> 3����� ������ �ް�, ���� �� 1�� 4�� ���� 4��° ȸ���� ����Ϸ��� �ϸ� 
//		     ��ȸ���� ���� á���ϴ�.�� ��� ������ ����Ѵ�.
//	     2.  Ű����� 2�� �Է��ϸ� �α���
//	     -> �α����� ���̵�� ��й�ȣ�� Ű����� �Է¹޾Ƽ� [1] ȸ���������� ������ ȸ���� ���̵�� 
//	        ��й�ȣ�� ��ġ �� ��� ���α��� ������ �̶�� ���� ���
//	     -> ���̵�� ��й�ȣ�� ��ġ���� ���� ��� ���α��� ���С� ��� ���� ���
//	     3.  Ű����� 3�� �Է��ϸ� ���α׷� ����
//	     -> �����α׷��� ����Ǿ����ϴ١� ������ ��� �� �ݺ��� ����
//	     4. Ű����� �Է��� ���� 1, 2, 3 �� �ƴ� �ٸ� ���� ��� 
//	     -> ������ �߸� �Է��ϼ̽��ϴ١� ������ ����ϱ�

		// ���� ����θ� ���� ���� ����(���� ����鿡 �� ��� ����)
		Scanner sc = new Scanner(System.in);
		String[] id = new String[3]; // id ������ �迭
		String[] pw = new String[3]; // pw ������ �迭
		String select; // �ʱ�ȭ�� ���� �� �Է°� Ȯ�ο�(�����ƴ� �� �޾Ƶ� �۵��ϵ��� String���� ����)
		String joinId = ""; // ȸ������ �� id
		String joinPw = ""; // ȸ������ �� pw
		boolean joinChk; // join �������
		boolean loginChk; // login �������

		// 1. do-while + switch ���

		boolean cycle = true; // ��� �����ų�� �Ǵ��ϴ� �񱳿� ���� ���� ����

		do { // ���� �ݺ�����Ǵ� �κ��̸� �ּ� 1ȸ ���� ����Ǵ� do-while ��� ����
			System.out.print("[1]ȸ������\t[2]�α���\t\t[3]���� >> ");
			select = ""; // ���ƿ��� �� select �ʱ�ȭ
			select = sc.next(); // �ʱ�ȭ�� ���ð���

			switch (select) {
			case "1":
				System.out.println("====ȸ������====");
				joinChk = false; // idChk �ʱ�ȭ(ȸ������ ���� �ٽ� ȸ������ �� check �ʱ�ȭ)
				System.out.print("���̵� �Է� : ");
				joinId = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				joinPw = sc.next();
				for (int i = 0; i < id.length; i++) { // ���� ������ id�� pw�� �ֱ� ���� for�� 1���� ���
					if (id[i] == null) { // id[i]�� null���� ���
						if (pw[i] == null) { // pw[i]�� null���� ���
							id[i] = joinId; // id[i]�� �Է°� ����
							pw[i] = joinPw; // pw[i]�� �Է°� ����
							joinChk = true; // joinChk ����
							break; // for�� ����
						}
					}
				}
				if (!joinChk) { // joinChk�� true(null���� ������ ��� ���� ���� ��)
					System.out.println("ȸ���� ���� á���ϴ�.");
				} else { // joinChk�� false(���� ���� ��)
					System.out.println("ȸ������ ����!"); // id�� pw ���� ��
				}
				// �迭�ȿ� ���� �� ���� ���
//				for (int i = 0; i < id.length; i++) {
//					System.out.println("id[" + i + "] : " + id[i]);
//					System.out.println("pw[" + i + "] : " + pw[i]);
//				}
				break;

			case "2":
				System.out.println("<<�α���>>");
				loginChk = false; // loginChk = login ��� ���� ���� �ʱ�ȭ
				System.out.print("�α��� ���̵� �Է� : ");
				String loginId = sc.next();
				System.out.print("�α��� ��й�ȣ �Է� : ");
				String loginPw = sc.next();
				for (int i = 0; i < id.length; i++) { // ���� ������ id�� pw�� ���ϱ� ���� for�� 1���� ���
					if (id[i] != null) { // id[i]�� null�� �ƴѰ͸� ���
						if (id[i].equals(loginId)) { // id[i]�� �� loginId ���� ��ġ�ϴ� ���� ���� ���
							if (pw[i].equals(loginPw)) { // pw[i]������ ��й�ȣ�� loginPw���� ��ġ�� ���
								loginChk = true; // loginChk�� ����
								break; // for�� ����
							}
						}
					}
				}
				if (loginChk) { // loginChk�� true��
					System.out.println("�α��� ����!");
				} else { // loginChk�� false��
					System.out.println("�α��� ����.");
					continue;
				}
				break;

			case "3":
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				// break; // switch���� break ��� �� -> switch���� �������� -> System.exit(0);�� ���� ����
//				System.exit(0);
				cycle = false; // ȸ������ ������ �� ����
				break; // case 3 ���� �� �� ���� �̵� -> �񱳺��� false -> ����

			default:
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
				continue;

			}
		} while (cycle);

		// 2. while - if-else if ���
//		while(true) {
//			System.out.print("[1]ȸ������\t[2]�α���\t\t[3]���� >> ");
//			select = "";	// ���ƿ��� �� select �ʱ�ȭ
//			select = sc.next();	// �ʱ�ȭ�� ���ð���
//			if(select.equals("1")) {	// ȸ������ ���� ��
//				System.out.println("====ȸ������====");
//				joinChk = false;	// idChk �ʱ�ȭ(ȸ������ ���� �ٽ� ȸ������ �� check �ʱ�ȭ)
//				System.out.print("���̵� �Է� : ");
//				joinId = sc.next();
//				System.out.print("��й�ȣ �Է� : ");
//				joinPw = sc.next();
//				for(int i = 0; i < id.length; i++) {	// ���� ������ id�� pw�� �ֱ� ���� for�� 1���� ���
//					if(id[i] == null) {	// id[i]�� null���� ���
//						if(pw[i] == null) {	// pw[i]�� null���� ���
//							id[i] = joinId;	// id[i]�� �Է°� ����
//							pw[i] = joinPw;	// pw[i]�� �Է°� ����
//							joinChk = true;	// joinChk ����
//							break;
//						}
//					}
//				}
//				if(!joinChk) {	// joinChk�� true(null���� ������ ��� ���� ���� ��)
//					System.out.println("ȸ���� ���� á���ϴ�.");
//				}else {
//					System.out.println("ȸ������ ����!");	// id�� pw ���� ��
//				}
//				// �迭�ȿ� ���� �� ���� ���
////				for (int i = 0; i < id.length; i++) {
////					System.out.println("id[" + i + "] : " + id[i]);
////					System.out.println("pw[" + i + "] : " + pw[i]);
////				}
//			}else if(select.equals("2")) {
//				System.out.println("<<�α���>>");
//				loginChk = false;	// loginChk = login ��� ���� ���� �ʱ�ȭ
//				System.out.print("�α��� ���̵� �Է� : ");
//				String loginId = sc.next();
//				System.out.print("�α��� ��й�ȣ �Է� : ");
//				String loginPw = sc.next();
//				for (int i = 0; i < id.length; i++) {	// ���� ������ id�� pw�� ���ϱ� ���� for�� 1���� ���
//					if(id[i] != null) {	// id[i]�� null�� �ƴѰ͸� ���
//						if(id[i].equals(loginId)) {	// id[i]�� �� loginId ���� ��ġ�ϴ� ���� ���� ���
//							if(pw[i].equals(loginPw)) {	// pw[i]������ ��й�ȣ�� loginPw���� ��ġ�� ���
//								loginChk = true;	// loginChk�� ����
//								break;
//							}
//						}
//					}
//				}
//				if(loginChk) {	// loginChk�� true��
//					System.out.println("�α��� ����!");
//				}else {		// loginChk�� false��
//					System.out.println("�α��� ����.");
//					continue;
//				}
//			}else if(select.equals("3")) {
//				System.out.println("���α׷��� ����Ǿ����ϴ�.");
//				break;
//			}else {
//				System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
//				continue;
//			}
//		}

	}

}
