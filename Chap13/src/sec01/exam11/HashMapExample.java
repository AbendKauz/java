package sec01.exam11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// -> 키는 Student 타입, 값은 Integer 타입(점수를 저장) 의 객체를 저장하는 HashMap 생성
		// // 변수명은 map

		Map<Student, Integer> map = new HashMap<>();

		// -> Student 객체 s1, s2 생성하기
		// (학번- 20120410 , 이름 - 김자바)
		Student s1 = new Student(20120410, "김자바");
		Student s2 = new Student(20120410, "김자바");

		// -> map 에 객체 추가하기
		// key : s1 value : 94
		// key : s2 value : 94

		map.put(s1, 94);
		map.put(s2, 94); // 중복 제거됨

		// key : Stuent 객체 생성(학번 - 20120410, 이름 - 김자바) value : 94
		// key : Stuent 객체 생성(학번 - 20120411, 이름 - 혼자바) value : 94
		// key : Stuent 객체 생성(학번 - 20120410, 이름 - 김자바) value : 70

		map.put(new Student(20120410, "김자바"), 94); // 중복제거됨
		map.put(new Student(20120411, "혼자바"), 94);
		map.put(new Student(20120410, "김자바"), 70); // 기존에 저장한 키와 동일한 키로 저장하게 되면
		// 기존에 저장된 값이 사라지고 새로운 값으로 대체됨

		// -> 아래와 같이 콘솔에 출력
		// - hashCode( ) 메소드 사용
		System.out.println("<<<< s1 과 s2 hashCode( ) 비교 >>>>");

		System.out.println("s1의 해시코드 : " + s1.hashCode());
		System.out.println("s2의 해시코드 : " + s2.hashCode());
		System.out.println("s1과 s2 내부 데이터 비교 : " + s1.equals(s2));
		System.out.println("================================================================");
		System.out.println("총 Entry 수 : " + map.size());

		// - Map 컬렉션에 저장된 전체 객체들을 반복해서 하나씩 가져오는 코드 작성하기
		// 방법 1. keySet() 메소드 사용 (1-1. Iterator 반복자 사용 / 1-2. 향상된 for 문)
		// 방법 2. entrySet( ) 메소드 사용 (2-1. Iterator 반복자 사용 / 2-2. 향상된 for 문)

		// 1. keySet()
		// 1-1. Iterator
		System.out.println("1-1");

		// Iterator를 사용하기 위해 Set 컬렉션에 넣어 사용
		Set<Student> keySet = map.keySet(); // map에서 key의 값만 가져와 Set컬렉션에 대입
		Iterator<Student> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			Student key = keyIter.next(); // keyIter의 객체(key값) 하나씩 가져와 대입
			int value = map.get(key); // key값으로 value값 검색 후 대입
			System.out.println("key[학생] : " + key + "\t||\tvalue[점수] : " + value);
		}

		System.out.println("================================================================");

		// 1-2. 향상된 for문
		System.out.println("1-2");

		for (Student stu : map.keySet()) {
			System.out.println("key[학생] : " + stu + "\t||\tvalue[점수] : " + map.get(stu));
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
			System.out.println("key[학생] : " + stu + "\t||\tvalue[점수] : " + value);
		}

		System.out.println("================================================================");
		// 2-2. 향상된 for문
		System.out.println("2-2");

		for (Map.Entry<Student, Integer> entry : map.entrySet()) {
			System.out.println("key[학생] : " + entry.getKey() + "\t||\tvalue[점수] : " + entry.getValue());
		}

		// <console>
		// <<<< s1 과 s2 hashCode( ) 비교 >>>>
		// s1의 해시코드 : 997110508 -> hashCode( ) 메소드
		// s2의 해시코드 : 509886383
		// ================================================================
		// 총 Entry 수: 2
		// key[학생] : 학번 ( 20120410 ), 이름 ( 김자바 ) || value[점수] : 94
		// key[학생] : 학번 ( 20120410 ), 이름 ( 김자바 ) || value[점수] : 94

	}

}
