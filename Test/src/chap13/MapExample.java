package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // �ְ������� ���� ���̵� ����
		int maxScore = 0; // �ְ����� ����
		int totalScore = 0; // ���� �հ� ����

		// �ۼ���ġ
		// 1. entrySet()
		System.out.println("1. entrySet()");
		Set<Entry<String, Integer>> entry = map.entrySet();
		// 1-1 Iterator
		System.out.println("=== 1-1. Iterator ===");
		Iterator<Entry<String, Integer>> iter = entry.iterator();
		while (iter.hasNext()) {
			String user = iter.next().getKey();
			int num = map.get(user);
			totalScore += num;
			if (maxScore < num) {
				maxScore = num;
				name = user;
			}
		}
		System.out.println("������� : " + (totalScore / map.size()) + "\n�ְ����� : " + maxScore + "\n�ְ������� ���� ���̵� : " + name);

		// 1-2 ���� for��
		totalScore = 0;
		System.out.println("=== 1-2. ���� for�� ===");
		for (Entry<String, Integer> entry2 : entry) {
			totalScore += entry2.getValue();
			if (entry2.getValue() > maxScore) {
				name = entry2.getKey();
				maxScore = entry2.getValue();
			}
		}

		System.out.println("������� : " + (totalScore / map.size()) + "\n�ְ����� : " + maxScore + "\n�ְ������� ���� ���̵� : " + name);

		// 2. keySet()
		System.out.println("2. keySet()");
		Set<String> keySet = map.keySet();
		// 2-1. Iterator
		System.out.println("=== 2-1. Iterator ===");
		totalScore = 0;
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String user = keyIter.next();
			int value = map.get(user);
			totalScore += value;
			if (value > maxScore) {
				maxScore = value;
				name = user;
			}
		}
		System.out.println("������� : " + (totalScore / map.size()) + "\n�ְ����� : " + maxScore + "\n�ְ������� ���� ���̵� : " + name);

		// 2-2. ���� for��
		System.out.println("=== 2-2. ���� for�� ===");
		totalScore = 0;
		for (String str : map.keySet()) {
			int value = map.get(str);
			totalScore += value;
			if (value > maxScore) {
				maxScore = value;
				name = str;
			}
		}
		System.out.println("������� : " + (totalScore / map.size()) + "\n�ְ����� : " + maxScore + "\n�ְ������� ���� ���̵� : " + name);
	}

}
