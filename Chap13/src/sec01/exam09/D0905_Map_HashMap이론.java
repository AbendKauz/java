package sec01.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D0905_Map_HashMap이론 {

	public static void main(String[] args) {

		// * Map 컬렉션 - 구현 클래스 : HashMap, Hashtable, LinkedHashMap ....
		// - 특징 : 키(key), 값(value) 한 쌍으로 구성된 Map.Entry 객체를 저장하는 구조
		// Entry -> Map 인터페이스 내부에 선언된 중첩 인터페이스
		// -> Map에 저장된 key와 value를 다루기 위해 정의해둔 인터페이스

		// * Key, Value => 모두 객체
		// key는 중복 저장될 수 없으나 value는 중복 저장이 가능함
		// -> key는 반드시 다른 key 객체를 저장해야 함
		// 만약 key값이 기존에 저장된 key와 동일한 값이라면 => 기존의 값은 없어지고, 새로운 값으로 대체됨

		// * 주로 키 타입 String을 많이 사용함
		// -> String은 문자열이 같을 경우 동등 객체가 될 수 있도록 hashCode(), equals()가 재정의 되어 있음

		// * 키를 사용자 정의 클래스로 만들고, 동등객체가 중복저장 되지 않도록 하기 위해서
		// => hashCode(), equals() 재정의 필요
		// hashCode()의 리턴값은 같고, equals()가 true를 리턴해야 함

		// * put(K key, V value) : 주어진 키와 값을 저장
		// * get(Object key) : 주어진 키가 있는 값을 리턴
		// * entrySet() : Map.Entry 객체 (키와 값을 쌍으로 구성한 객체)를 뽑아서 Set 컬렉션으로 만들어주는 메소드
		// * keySet() : 모든 키를 Set 컬렉션에 담아서 리턴해주는 메소드

		// * HashMap
		// -> 키와 값 타입으로 주고 기본 생성자 호출
		// Map<K, V> 변수명 = new HashMap<K, V>();

		// 키는 문자열(String), 값은 숫자(Integer)
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 45); // 객체 추가
		map.put("박길동", 50); // 객체 추가
		map.put("김길동", 60); // 객체 추가
		System.out.println(map.get("홍길동")); // 객체의 값 찾기(키값을 이용)

		// Map 컬렉션에서 저장된 전체 객체들을 반복해서 가져오는 코드
		// 방법 1. keySet() 메소드 -> 모든 키를 Set 컬렉션에 담아서 리턴해주는 메소드

//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIter = keySet.iterator();
//		
//		while(keyIter.hasNext()) {
//			String key = keyIter.next();	// key 저장
//			int value = map.get(key);		// key를 기준으로 value값 호출
//			System.out.println("Key(이름) : " + key + ", Value(점수) : " + value);
//		}

		// 방법 2. EntrySet() 메소드 -> Map.Entry 객체 (키와 값을 쌍으로 구성한 객체)를 뽑아서 Set 컬렉션으로 만들어주는
		// 메소드
		// 방법 2-1. Iterator 반복자 사용
//		Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
//		while(entryIter.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIter.next();
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println("Key(이름) : " + key + ", Value(점수) : " + value);
//		}

		// 방법 2-2. 향상된 for문 사용
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key(이름) : " + entry.getKey() + ", Value(점수) : " + entry.getValue());
		}

	}

}
