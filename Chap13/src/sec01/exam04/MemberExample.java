package sec01.exam04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

//		  -> �л� ���� ���� ���α׷� �����
//		  -> ArrayList ����(������ ��ü Ÿ��- Member Ŭ���� Ÿ��)�ؼ� �ֻܼ����� ���� ����� �������� 
//		      �ڵ带 �ۼ��Ͻÿ�

		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();

		while (true) {
			System.out.println("[1] �л����� ����\t[2] ��ü�л� ��ȸ\t[3]Ư���л� ��ȸ\t[4]Ư���л� ����\t[5]���α׷� ����");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("����� �л� �̸� �Է�>> ");
				String name = sc.next();
				System.out.print("����� �л� ���� �Է�>> ");
				int age = sc.nextInt();
				System.out.print("����� �л� ���� �Է�>> ");
				String gender = sc.next();

				list.add(new Member(name, age, gender));

			} else if (choice == 2) { // ��ü�л� ��ȸ
				System.out.println("��ü �л� ��ȸ>> ");

				// ��� 1. index �̿�
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i));
//				}

				// ��� 2. ���� for�� �̿� // p.198
				int i = 0;
				for (Member member : list) {
					System.out.println(list.get(i++));
				}
			} else if (choice == 3) { // Ư���л� ��ȸ
				System.out.println("��ȸ�� �л� �̸�>> ");
				String name = sc.next();

//				// ��� 1. index
//				boolean chk = false;
//				for(int i = 0; i < list.size(); i++) {
//					if(list.get(i).getName().equals(name)) {
//						System.out.println(list.get(i));
//						chk = true;
//					}
//				}
//				if(!chk) {
//					System.out.println("�ش� �л� ������ �����ϴ�.");
//				}

				// ��� 2. ���� for��
				int i = 0;
				for (Member member : list) {
					if (member.getName().contains(name)) {
						System.out.println(list.get(i));
						break;
					}
					i++;
				}
				if (i >= list.size()) {
					System.out.println("�ش� �л� ������ �����ϴ�.");
				}

			} else if (choice == 4) { // Ư���л� ����
				System.out.println("������ �л� �̸�>> ");
				String name = sc.next();

				// 1.
				boolean chk = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + "���� ������ �����Ǿ����ϴ�.");
						chk = true;
						break;
					}
				}
				if (!chk) {
					System.out.println("�ش� �л� ������ �����ϴ�.");
				}

				// 2.
//				int i = 0;
//				for (Member member : list) {
////					if(member.getName().contains(name)) {
//					if(name.contains(member.getName())) {
//						list.remove(i);
//						System.out.println(name + "���� ������ �����Ǿ����ϴ�.");
//						break;
//					}
//					i++;
//				}
//				if(i >= list.size()) {
//					System.out.println("�ش� �л� ������ �����ϴ�.");
//				}

			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}

	}

}
