package sec01.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// * HashMapExample - 실행 클래스
		// -> 키는 string 타입(이름을 저장), 값은 Integer 타입(점수를 저장) 의
		// 객체를 저장하는 HashMap 생성
		// // 변수명은 map

		Map<String, Integer> map = new HashMap<>(); // import 단축키 (ctrl + shift + o)

		// -> map에 객체 추가
		// - 키 : 신용권, 값 : 85
		// - 키 : 홍길동, 값 : 90
		// - 키 : 동장군, 값 : 80
		// - 키 : 홍길동, 값 : 95

		map.put("신용권", 85);
		map.put("홍길동", 90); // 출력안됨 => 키값이 겹치는 객체가 있어 기존의 내용이 삭제됨
		map.put("동장군", 80);
		map.put("홍길동", 95); // 만약 기존에 저장된 키와 동일한 키로 저장을 하면
		// => 기존의 값은 없어지고 95라는 새로운 값으로 대체됨

		// -> 아래와 같이 콘솔에 출력 (방법1. keySet( ) 메소드 이용
		// 1.1. Iterator / 1.2. 향상된 for문)
		// <console>
		// 총 Entry 수: 3
		// 홍길동 : 95
		// 신용권 : 85
		// 동장군 : 80
		System.out.println("총 Entry 수 : " + map.size());

		// 방법 1. keySet() 메소드 이용
		// => 모든 키를 Set 컬렉션으로 얻은 뒤 반복자를 통해 키를 하나씩 얻고, get()메소드를 통해 값을 얻음

		// 1-1. Iterator // Set안의 반복자를 사용해서 객체를 출력

//		Set<String> keySet = map.keySet();	// 모든 키를 Set 객체에 담아서 리턴
//		Iterator<String> keyIter = keySet.iterator();	// Set의 iterator() -> 반복자 호출
//		
//		while(keyIter.hasNext()) {
//			String key = keyIter.next();
//			int value = map.get(key);
//			System.out.println(key + " : " + value);
//		}

		// 1.2. 향상된 for문

		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.println("=======================================================");
		// =======================================================
		// -> - 객체 검색하기
		// : 홍길동의 점수 검색
		System.out.println("홍길동 점수 찾기 : " + map.get("홍길동"));
		// -> - 객체 삭제하기
		// : 홍길동 삭제하기
		System.out.println("홍길동 삭제하기");
		map.remove("홍길동");

		System.out.println("총 Entry 수 : " + map.size());

		// -> 아래와 같이 콘솔에 출력 (방법 2. entrySet( ) 메소드 이용
		// 2-1. Iterator / 2.2. 향상된 for문)

		// <console>
		// 홍길동 점수 찾기: 95
		// 홍길동 삭제하기
		// 총 Entry 수: 2
		// 신용권 : 85
		// 동장군 : 80

		// 2-1. Iterator
		// entrySet() : 모든 Map.Entry 객체를 Set 컬렉션으로 얻은 뒤 담아서 리턴
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// -> 반복자(Iterator)를 사용하기 위해 Set컬렉션을 부르고 entrySet()으로 모든 키와 객체를 넣음
//		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();	// entrySet()으로 넣은 데이터를 반복자에 대입
//		while(entryIter.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIter.next();
////			String key = entry.getKey();	// 키 얻기
////			int value = entry.getValue();	// 값 얻기
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

		// 2.2. 향상된 for문

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> 객체 전체 삭제 후 컬렉션이 비어 있을 경우 "비어있음" 을 출력
		// <console>
		// 총 Entry 수: 0
		// 비어있음

		map.clear();
		System.out.println("총 Entry 수 : " + map.size());

		if (map.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
