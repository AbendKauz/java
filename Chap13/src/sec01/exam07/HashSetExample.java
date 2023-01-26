package sec01.exam07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// -> Member ��ü�� �����ϴ� HashSet ���� // �������� set
		//
		// -> Member ��ü m1, m2 �����ϱ�
		// (�̸� - ���ڹ�, ���� - 30)
		//
		// -> set�� m1, m2 ��ü �߰�
		//
		// -> �Ʒ��� ���� �ֿܼ� ��� (Iterator �ݺ��ڸ� ����ϱ�) - hashCode( ) �޼ҵ� ���
		//
		// <console>
		// <<<< m1 �� m2 hashCode( ) �� >>>>
		// m1�� �ؽ��ڵ� : 997110508 => m1.hashCode( ) �޼ҵ� ȣ��
		// m2�� �ؽ��ڵ� : 509886383
		// ========================================
		// �� ��ü�� : 2
		// �̸� : ���ڹ�, ���� : 30
		// �̸� : ���ڹ�, ���� : 30

		Set<Member> set = new HashSet<>();

		Member m1 = new Member("���ڹ�", 30);
		Member m2 = new Member("���ڹ�", 30);

		System.out.println(m1 == m2); // �ּҰ� ��(false)
		System.out.println(m1.hashCode()); // �ؽ��ڵ� �� �ٸ�
		System.out.println(m2.hashCode());

		// �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü�� 1���� �����ϵ��� �Ϸ���
		// -> equals(), hashCode() �޼ҵ带 ������ �ؾ� ��
		// => ���� ���� �� �ߺ����Ÿ� ���� ����

		set.add(m1);
		set.add(m2);

		System.out.println("========================================");

		Iterator<Member> iterator = set.iterator();

		int i = 1;
		while (iterator.hasNext()) {
			System.out.println("m" + i++ + "�� �ؽ��ڵ� : " + iterator.next().hashCode());
		}

		System.out.println("�� ��ü �� : " + set.size());

		for (Member member : set) {
			System.out.println("�̸� : " + member.name + ", ���� : " + member.age);
		}

		// -> equals(), hashCode() �޼ҵ带 ������ �ؾ� ��
		// => ���� ���� �� �ߺ����Ÿ� ���� ����
		// exam08 => �ߺ����� �ǵ��� �޼ҵ带 �������� �ڵ� ����

	}

}
