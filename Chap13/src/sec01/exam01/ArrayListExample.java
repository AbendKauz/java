package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// * ArrayListExample - Ŭ����
		// -> String ��ü�� �����ϴ� ArrayList ���� // �������� list
		// -> add �޼ҵ� (��ü �߰�)
		// - Java �߰�
		// - JDBC �߰�
		// - Python �߰�
		// -> get �޼ҵ� (��ü �˻�)
		// <console>
		// list(0) : Java
		// list(1) : JDBC
		// list(2) : Python

		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Python");

//		System.out.println("��ü�� : " + list.size());
		// list.size() : ����Ʈ�� ��ü�� �� �˻�

//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list(" + i + ") : " + list.get(i));
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> - 2��° �ε����� Database �߰�
		// - JSP �߰�
		//
		// -> �Ʒ��� ���� ����ϱ�
		// <console>
		// �� ��ü��: 5
		// list(0) : Java
		// list(1) : JDBC
		// list(2) : Database
		// list(3) : Python
		// list(4) : JSP

		list.add(2, "Database");
		// list.add(a, b) : a��° index�� b��ü �߰�
		list.add("JSP");
		// list.add(a) : a��ü �߰�

		System.out.println("�� ��ü�� : " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list(" + i + ") : " + list.get(i));
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> 2, 3�� �ε���, JDBC ��ü ����
		// -> Java �߰� �� ���
		// <console>
		// list(0) : Java
		// list(1) : Python
		// list(2) : Java

		list.remove(2);
		// list.remove(a) : a index�� ��ü ����
		list.remove(3);
		list.remove("JDBC");
		// list.remove(��ü��) : �ش���� ��ü ����
		list.add("Java");
		// list���� �ߺ���ü ���� ����

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list(" + i + ") : " + list.get(i));
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> list �ȿ� ����� ��� ��ü�� ���� ��
		// list �� ������� ��� "�������"�� ���
		// <console>
		// ��� ����

		list.clear();
		// list.clear() : ����Ʈ�� ��� ��ü ����

//		if(list.size() == 0) {
//			System.out.println("�������");
//		}

		if (list.isEmpty()) {
			System.out.println("�������");
		}

	}

}
