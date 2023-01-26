package sec01.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// * HashMapExample - ���� Ŭ����
		// -> Ű�� string Ÿ��(�̸��� ����), ���� Integer Ÿ��(������ ����) ��
		// ��ü�� �����ϴ� HashMap ����
		// // �������� map

		Map<String, Integer> map = new HashMap<>(); // import ����Ű (ctrl + shift + o)

		// -> map�� ��ü �߰�
		// - Ű : �ſ��, �� : 85
		// - Ű : ȫ�浿, �� : 90
		// - Ű : ���屺, �� : 80
		// - Ű : ȫ�浿, �� : 95

		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90); // ��¾ȵ� => Ű���� ��ġ�� ��ü�� �־� ������ ������ ������
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // ���� ������ ����� Ű�� ������ Ű�� ������ �ϸ�
		// => ������ ���� �������� 95��� ���ο� ������ ��ü��

		// -> �Ʒ��� ���� �ֿܼ� ��� (���1. keySet( ) �޼ҵ� �̿�
		// 1.1. Iterator / 1.2. ���� for��)
		// <console>
		// �� Entry ��: 3
		// ȫ�浿 : 95
		// �ſ�� : 85
		// ���屺 : 80
		System.out.println("�� Entry �� : " + map.size());

		// ��� 1. keySet() �޼ҵ� �̿�
		// => ��� Ű�� Set �÷������� ���� �� �ݺ��ڸ� ���� Ű�� �ϳ��� ���, get()�޼ҵ带 ���� ���� ����

		// 1-1. Iterator // Set���� �ݺ��ڸ� ����ؼ� ��ü�� ���

//		Set<String> keySet = map.keySet();	// ��� Ű�� Set ��ü�� ��Ƽ� ����
//		Iterator<String> keyIter = keySet.iterator();	// Set�� iterator() -> �ݺ��� ȣ��
//		
//		while(keyIter.hasNext()) {
//			String key = keyIter.next();
//			int value = map.get(key);
//			System.out.println(key + " : " + value);
//		}

		// 1.2. ���� for��

		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.println("=======================================================");
		// =======================================================
		// -> - ��ü �˻��ϱ�
		// : ȫ�浿�� ���� �˻�
		System.out.println("ȫ�浿 ���� ã�� : " + map.get("ȫ�浿"));
		// -> - ��ü �����ϱ�
		// : ȫ�浿 �����ϱ�
		System.out.println("ȫ�浿 �����ϱ�");
		map.remove("ȫ�浿");

		System.out.println("�� Entry �� : " + map.size());

		// -> �Ʒ��� ���� �ֿܼ� ��� (��� 2. entrySet( ) �޼ҵ� �̿�
		// 2-1. Iterator / 2.2. ���� for��)

		// <console>
		// ȫ�浿 ���� ã��: 95
		// ȫ�浿 �����ϱ�
		// �� Entry ��: 2
		// �ſ�� : 85
		// ���屺 : 80

		// 2-1. Iterator
		// entrySet() : ��� Map.Entry ��ü�� Set �÷������� ���� �� ��Ƽ� ����
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// -> �ݺ���(Iterator)�� ����ϱ� ���� Set�÷����� �θ��� entrySet()���� ��� Ű�� ��ü�� ����
//		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();	// entrySet()���� ���� �����͸� �ݺ��ڿ� ����
//		while(entryIter.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIter.next();
////			String key = entry.getKey();	// Ű ���
////			int value = entry.getValue();	// �� ���
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		// 2.2. ���� for��

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> ��ü ��ü ���� �� �÷����� ��� ���� ��� "�������" �� ���
		// <console>
		// �� Entry ��: 0
		// �������

		map.clear();
		System.out.println("�� Entry �� : " + map.size());

		if (map.isEmpty()) {
			System.out.println("��� ����");
		}

	}

}
