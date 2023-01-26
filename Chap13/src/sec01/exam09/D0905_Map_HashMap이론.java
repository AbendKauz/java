package sec01.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D0905_Map_HashMap�̷� {

	public static void main(String[] args) {

		// * Map �÷��� - ���� Ŭ���� : HashMap, Hashtable, LinkedHashMap ....
		// - Ư¡ : Ű(key), ��(value) �� ������ ������ Map.Entry ��ü�� �����ϴ� ����
		// Entry -> Map �������̽� ���ο� ����� ��ø �������̽�
		// -> Map�� ����� key�� value�� �ٷ�� ���� �����ص� �������̽�

		// * Key, Value => ��� ��ü
		// key�� �ߺ� ����� �� ������ value�� �ߺ� ������ ������
		// -> key�� �ݵ�� �ٸ� key ��ü�� �����ؾ� ��
		// ���� key���� ������ ����� key�� ������ ���̶�� => ������ ���� ��������, ���ο� ������ ��ü��

		// * �ַ� Ű Ÿ�� String�� ���� �����
		// -> String�� ���ڿ��� ���� ��� ���� ��ü�� �� �� �ֵ��� hashCode(), equals()�� ������ �Ǿ� ����

		// * Ű�� ����� ���� Ŭ������ �����, ���ü�� �ߺ����� ���� �ʵ��� �ϱ� ���ؼ�
		// => hashCode(), equals() ������ �ʿ�
		// hashCode()�� ���ϰ��� ����, equals()�� true�� �����ؾ� ��

		// * put(K key, V value) : �־��� Ű�� ���� ����
		// * get(Object key) : �־��� Ű�� �ִ� ���� ����
		// * entrySet() : Map.Entry ��ü (Ű�� ���� ������ ������ ��ü)�� �̾Ƽ� Set �÷������� ������ִ� �޼ҵ�
		// * keySet() : ��� Ű�� Set �÷��ǿ� ��Ƽ� �������ִ� �޼ҵ�

		// * HashMap
		// -> Ű�� �� Ÿ������ �ְ� �⺻ ������ ȣ��
		// Map<K, V> ������ = new HashMap<K, V>();

		// Ű�� ���ڿ�(String), ���� ����(Integer)
		Map<String, Integer> map = new HashMap<>();
		map.put("ȫ�浿", 45); // ��ü �߰�
		map.put("�ڱ浿", 50); // ��ü �߰�
		map.put("��浿", 60); // ��ü �߰�
		System.out.println(map.get("ȫ�浿")); // ��ü�� �� ã��(Ű���� �̿�)

		// Map �÷��ǿ��� ����� ��ü ��ü���� �ݺ��ؼ� �������� �ڵ�
		// ��� 1. keySet() �޼ҵ� -> ��� Ű�� Set �÷��ǿ� ��Ƽ� �������ִ� �޼ҵ�

//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIter = keySet.iterator();
//		
//		while(keyIter.hasNext()) {
//			String key = keyIter.next();	// key ����
//			int value = map.get(key);		// key�� �������� value�� ȣ��
//			System.out.println("Key(�̸�) : " + key + ", Value(����) : " + value);
//		}

		// ��� 2. EntrySet() �޼ҵ� -> Map.Entry ��ü (Ű�� ���� ������ ������ ��ü)�� �̾Ƽ� Set �÷������� ������ִ�
		// �޼ҵ�
		// ��� 2-1. Iterator �ݺ��� ���
//		Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
//		while(entryIter.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIter.next();
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println("Key(�̸�) : " + key + ", Value(����) : " + value);
//		}

		// ��� 2-2. ���� for�� ���
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key(�̸�) : " + entry.getKey() + ", Value(����) : " + entry.getValue());
		}

	}

}
