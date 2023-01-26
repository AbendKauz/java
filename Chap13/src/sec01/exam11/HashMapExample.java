package sec01.exam11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// -> Ű�� Student Ÿ��, ���� Integer Ÿ��(������ ����) �� ��ü�� �����ϴ� HashMap ����
		// // �������� map

		Map<Student, Integer> map = new HashMap<>();

		// -> Student ��ü s1, s2 �����ϱ�
		// (�й�- 20120410 , �̸� - ���ڹ�)
		Student s1 = new Student(20120410, "���ڹ�");
		Student s2 = new Student(20120410, "���ڹ�");

		// -> map �� ��ü �߰��ϱ�
		// key : s1 value : 94
		// key : s2 value : 94

		map.put(s1, 94);
		map.put(s2, 94); // �ߺ� ���ŵ�

		// key : Stuent ��ü ����(�й� - 20120410, �̸� - ���ڹ�) value : 94
		// key : Stuent ��ü ����(�й� - 20120411, �̸� - ȥ�ڹ�) value : 94
		// key : Stuent ��ü ����(�й� - 20120410, �̸� - ���ڹ�) value : 70

		map.put(new Student(20120410, "���ڹ�"), 94); // �ߺ����ŵ�
		map.put(new Student(20120411, "ȥ�ڹ�"), 94);
		map.put(new Student(20120410, "���ڹ�"), 70); // ������ ������ Ű�� ������ Ű�� �����ϰ� �Ǹ�
		// ������ ����� ���� ������� ���ο� ������ ��ü��

		// -> �Ʒ��� ���� �ֿܼ� ���
		// - hashCode( ) �޼ҵ� ���
		System.out.println("<<<< s1 �� s2 hashCode( ) �� >>>>");

		System.out.println("s1�� �ؽ��ڵ� : " + s1.hashCode());
		System.out.println("s2�� �ؽ��ڵ� : " + s2.hashCode());
		System.out.println("s1�� s2 ���� ������ �� : " + s1.equals(s2));
		System.out.println("================================================================");
		System.out.println("�� Entry �� : " + map.size());

		// - Map �÷��ǿ� ����� ��ü ��ü���� �ݺ��ؼ� �ϳ��� �������� �ڵ� �ۼ��ϱ�
		// ��� 1. keySet() �޼ҵ� ��� (1-1. Iterator �ݺ��� ��� / 1-2. ���� for ��)
		// ��� 2. entrySet( ) �޼ҵ� ��� (2-1. Iterator �ݺ��� ��� / 2-2. ���� for ��)

		// 1. keySet()
		// 1-1. Iterator
		System.out.println("1-1");

		// Iterator�� ����ϱ� ���� Set �÷��ǿ� �־� ���
		Set<Student> keySet = map.keySet(); // map���� key�� ���� ������ Set�÷��ǿ� ����
		Iterator<Student> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			Student key = keyIter.next(); // keyIter�� ��ü(key��) �ϳ��� ������ ����
			int value = map.get(key); // key������ value�� �˻� �� ����
			System.out.println("key[�л�] : " + key + "\t||\tvalue[����] : " + value);
		}

		System.out.println("================================================================");

		// 1-2. ���� for��
		System.out.println("1-2");

		for (Student stu : map.keySet()) {
			System.out.println("key[�л�] : " + stu + "\t||\tvalue[����] : " + map.get(stu));
		}

		System.out.println("================================================================");
		// 2. entrySet()
		// 2-1. Iterator
		System.out.println("2-1");

		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Student, Integer>> entryIter = entrySet.iterator();
		while (entryIter.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIter.next();
			Student stu = entry.getKey();
			int value = entry.getValue();
			System.out.println("key[�л�] : " + stu + "\t||\tvalue[����] : " + value);
		}

		System.out.println("================================================================");
		// 2-2. ���� for��
		System.out.println("2-2");

		for (Map.Entry<Student, Integer> entry : map.entrySet()) {
			System.out.println("key[�л�] : " + entry.getKey() + "\t||\tvalue[����] : " + entry.getValue());
		}

		// <console>
		// <<<< s1 �� s2 hashCode( ) �� >>>>
		// s1�� �ؽ��ڵ� : 997110508 -> hashCode( ) �޼ҵ�
		// s2�� �ؽ��ڵ� : 509886383
		// ================================================================
		// �� Entry ��: 2
		// key[�л�] : �й� ( 20120410 ), �̸� ( ���ڹ� ) || value[����] : 94
		// key[�л�] : �й� ( 20120410 ), �̸� ( ���ڹ� ) || value[����] : 94

	}

}
