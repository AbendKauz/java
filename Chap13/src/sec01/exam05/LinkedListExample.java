package sec01.exam05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// * ArrayList, LinkedList ���� ���� ��
		// => ArrayList, LinkedList�� 10,000���� Ư�� ��ġ�� �����ϴµ� �ɸ��� �ð��� ���� ��
		// 0�� �ε����� String ��ü�� 10,000�� �߰��ϴ� �ð� �� ===> LinkedList�� �� ���� ������ ����

		// ArrayList ����
		List<String> list1 = new ArrayList<>();

		long startTime; // ������ �ð�
		long endTime; // ���� �ð�

		startTime = System.nanoTime();
		// .nanoTime() : �ð� ��� method
		// -> JVM���� ���Ƿ� ������ �������� ���� ���뼼������ ���� ��ȯ

		// ArrayList�� 0��° �ε����� String ��ü(i)�� 10,000�� �ִ� �ڵ�

		for (int i = 0; i < 10000; i++) {
//			list1.add(0, i + "");
			list1.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();

		System.out.println("ArrayList �ɸ� �ð� : " + (endTime - startTime) + "ns");

		System.out.println("========================");

		// LinkedList ����
		List<String> list2 = new LinkedList<>();

		startTime = System.nanoTime();

		// LinkedList�� 0��° �ε����� String ��ü(i)�� 10,000�� �ִ� �ڵ�
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();

		System.out.println("LinkedList �ɸ� �ð� : " + (endTime - startTime) + "ns");

		// ** Ư���� ��ġ�� �߰�, �����ϴ� ��쿡�� �յ� ��ũ ������ �����ϴ� LinkedList�� �� ����
		// ����������(����������) �߰�, �����ϴ� ���� ArrayList�� ���

	}

}
