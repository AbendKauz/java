package sec01.exam06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// * HashSetExample - 실행 클래스
		// -> String 객체를 저장하는 HashSet 생성 // 변수명은 set
		// -> set에 객체 추가
		// - Java 추가
		// - JDBC 추가
		// - Python 추가
		// - Java 추가
		// - JSP 추가
		// -> 아래와 같이 콘솔에 출력 (Iterator 반복자를 사용하기)
		// <console>
		// 총 객체수: 4
		// Java
		// JSP
		// JDBC
		// Python

		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Python");
		set.add("Java");
		set.add("JSP");

		System.out.println("총 객체 수 : " + set.size());

		Iterator<String> iterator = set.iterator();

		// * Set 컬렉션에서 객체들을 반복해서 하나씩 가져오는 방법
		// 1. Iterator 반복자 사용
		while (iterator.hasNext()) {
			// hasNext() : 가져올 객체가 있다면 true 리턴
			System.out.println(iterator.next());
			// next() : 컬렉션에서 하나의 객체를 가져옴
		}
		// * Java 객체는 동일한 이름이 존재하므로 4번째의 Java는 추가되지 않음

		System.out.println("============================================");
		// ============================================
		// -> 객체 삭제
		// - JDBC 삭제
		// - JSP 삭제
		// -> 아래와 같이 콘솔에 출력 (향상된 for 문 사용하기)
		// <console>
		// 총 객체수: 2
		// Java
		// Python

		set.remove("JDBC");
		// remove(a) : a객체를 제거
		// 위에 HashSet으로 선언된 set안에 객체들이 담겨있으므로 set.remove()
		set.remove("JSP");

		System.out.println("총 객체 수 : " + set.size());

		// 2. 향상된 for문 사용
		for (String string : set) {
			System.out.println(string);
			// string 객체에는 set이 String타입으로 담겨있음
		}

		System.out.println("============================================");
		// ============================================
		// -> set 안에 있는 모든 객체를 제거하기
		// -> set 이 비어있을 경우에만 "비어 있음"을 출력하기
		// <console>
		// 비어 있음

		set.clear();
		// clear() : set 안에 있는 모든 객체를 제거

		if (set.isEmpty()) {
			// isEmpty() : 비어있을 경우 true 리턴
			System.out.println("비어 있음");
		}

	}

}
