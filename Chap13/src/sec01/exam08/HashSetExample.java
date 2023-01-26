package sec01.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// -> Member ��ü�� �����ϴ� HashSet ���� // �������� set
		Set<Member> set = new HashSet<>();

		// -> Member ��ü m1, m2 �����ϱ�
		// (�̸� - ���ڹ�, ���� - 30)
		Member m1 = new Member("���ڹ�", 30);
		Member m2 = new Member("���ڹ�", 30);

		// -> set�� m1, m2 ��ü �߰�
		set.add(m1);
		set.add(m2); // �ߺ� ���� -> ���� X

		// -> set�� �߰��ϱ�
		// 1. �̸� - ȫ�浿, ���� - 30
		// 2. �̸� - ȫ�浿, ���� - 20
		// 3. �̸� - �ڱ浿, ���� - 20
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30)); // �ߺ� ���� -> ���� X
		set.add(new Member("ȫ�浿", 20));
		set.add(new Member("�ڱ浿", 20));

		// -> �Ʒ��� ���� �ֿܼ� ��� (Iterator �ݺ��ڸ� ����ϱ�) - hashCode( ) �޼ҵ� ���
		// <console>
		// <<<< m1 �� m2 hashCode( ) �� >>>>
		// m1�� �ؽ��ڵ� : 1379506075 => m1.hashCode( ) �޼ҵ� ȣ��
		// m2�� �ؽ��ڵ� : 1379506075
		// m1 �� m2 ���� ������ �� : true
		// ========================================
		// �� ��ü�� : 4
		// �̸� : ���ڹ�, ���� : 30
		// �̸� : ȫ�浿, ���� : 20
		// �̸� : �ڱ浿, ���� : 20
		// �̸� : ȫ�浿, ���� : 30

		Iterator<Member> iter = set.iterator();

		System.out.println("<<<< m1 �� m2 hashCode( ) �� >>>>");
		System.out.println("m1�� �ؽ��ڵ� : " + m1.hashCode());
		System.out.println("m2�� �ؽ��ڵ� : " + m2.hashCode());

		System.out.println("m1�� m2 ���� ������ �� : " + m1.equals(m2));

		System.out.println("========================================");

		System.out.println("�� ��ü�� : " + set.size());

		// 1. Iterator �ݺ��� ���
//		while(iter.hasNext()) {
//			System.out.println("�̸� : " + iter.next().name + ", ���� : " + iter.next().age);
//		}

		// 2. ���� for�� ���
		for (Member member : set) {
			System.out.println("�̸� : " + member.name + ", ���� : " + member.age);
		}

	}

}
