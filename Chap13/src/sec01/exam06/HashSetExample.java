package sec01.exam06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// * HashSetExample - ���� Ŭ����
		// -> String ��ü�� �����ϴ� HashSet ���� // �������� set
		// -> set�� ��ü �߰�
		// - Java �߰�
		// - JDBC �߰�
		// - Python �߰�
		// - Java �߰�
		// - JSP �߰�
		// -> �Ʒ��� ���� �ֿܼ� ��� (Iterator �ݺ��ڸ� ����ϱ�)
		// <console>
		// �� ��ü��: 4
		// Java
		// JSP
		// JDBC
		// Python

		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Python");
		set.add("Java");
		set.add("JSP");

		System.out.println("�� ��ü �� : " + set.size());

		Iterator<String> iterator = set.iterator();

		// * Set �÷��ǿ��� ��ü���� �ݺ��ؼ� �ϳ��� �������� ���
		// 1. Iterator �ݺ��� ���
		while (iterator.hasNext()) {
			// hasNext() : ������ ��ü�� �ִٸ� true ����
			System.out.println(iterator.next());
			// next() : �÷��ǿ��� �ϳ��� ��ü�� ������
		}
		// * Java ��ü�� ������ �̸��� �����ϹǷ� 4��°�� Java�� �߰����� ����

		System.out.println("============================================");
		// ============================================
		// -> ��ü ����
		// - JDBC ����
		// - JSP ����
		// -> �Ʒ��� ���� �ֿܼ� ��� (���� for �� ����ϱ�)
		// <console>
		// �� ��ü��: 2
		// Java
		// Python

		set.remove("JDBC");
		// remove(a) : a��ü�� ����
		// ���� HashSet���� ����� set�ȿ� ��ü���� ��������Ƿ� set.remove()
		set.remove("JSP");

		System.out.println("�� ��ü �� : " + set.size());

		// 2. ���� for�� ���
		for (String string : set) {
			System.out.println(string);
			// string ��ü���� set�� StringŸ������ �������
		}

		System.out.println("============================================");
		// ============================================
		// -> set �ȿ� �ִ� ��� ��ü�� �����ϱ�
		// -> set �� ������� ��쿡�� "��� ����"�� ����ϱ�
		// <console>
		// ��� ����

		set.clear();
		// clear() : set �ȿ� �ִ� ��� ��ü�� ����

		if (set.isEmpty()) {
			// isEmpty() : ������� ��� true ����
			System.out.println("��� ����");
		}

	}

}
