package sec01.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

		// -> �л� ���� ���� ���α׷� �����
		// -> ArrayList ����(������ ��ü Ÿ��- Member Ŭ���� Ÿ��)�ؼ� �ֻܼ����� ���� ����� ��������
		// �ڵ带 �ۼ��Ͻÿ�

		List<Member> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("[1]�л����� ����\t[2]��ü�л� ��ȸ\t[3]Ư���л� ��ȸ\t[4]Ư���л� ����\t[5]���α׷� ����");
			String select = s.next();
			if (select.equals("1")) {
				System.out.print("����� �л� �Է�>>");
				String name = s.next();
				System.out.print("����� ���� �Է�>>");
				int age = Integer.parseInt(s.next());
				System.out.print("����� ���� �Է�>>");
				String gender = s.next();
				list.add(new Member(name, age, gender)); // �����ڸ� �̿��� list�� add
			} else if (select.equals("2")) {
				System.out.println("��ü�л� ��ȸ>>");
				int i = 0;
				for (Member member : list) {
					System.out.println(list.get(i++));
				}
			} else if (select.equals("3")) {
				System.out.print("��ȸ�� �л� �̸�>>");
				String userName = s.next();
				int cnt = 0;
				for (Member member : list) {
					if (userName.equals(member.getName())) {
						System.out.println(list.get(cnt));
						break;
					}
					cnt++;
				}
				if (cnt >= list.size()) {
					System.out.println("�ش� �л� ������ �����ϴ�.");
				}
			} else if (select.equals("4")) {
				System.out.print("������ �л� �̸�>>");
				String reName = s.next();
				int cnt = 0;
				for (Member member : list) {
					if (reName.equals(member.getName())) {
						list.remove(cnt);
						System.out.println(reName + "���� ������ �����߽��ϴ�.");
						break;
					}
					cnt++;
				}
				if (cnt >= list.size()) {
					System.out.println("�ش� �л� ������ �����ϴ�.");
				}
			} else if (select.equals("5")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

	}

}
