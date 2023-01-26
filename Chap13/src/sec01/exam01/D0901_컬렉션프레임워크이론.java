package sec01.exam01;

public class D0901_컬렉션프레임워크이론 {

	public static void main(String[] args) {

		// * 컬렉션 프레임워크
		// : 자료 구조를 사용해서 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 라이브러리
		// : 인터페이스와 구현 클래스를 java.util 패키지에서 제공함
		// => 주요 인터페이스로 List, Set, Map 이 있다.

		// * 자바에서 컬렉션 프레임워크를 제공하는 이유?
		// => 배열의 문제점을 해결하기 위함
		// ex) 배열 선언 시 배열의 크기를 정해야 함 -> 크기 변경 불가
		// 항목을 저장, 삭제, 추가하는 메소드가 없어서 직업 인덱스 번호를 사용해야 함

		// * List - 구현 클래스(ArrayList, Vector, LinkedList)
		// -> 배열과 유사하게 인덱스로 관리
		// 순서를 유지하고, 저장하게 함 // 중복 저장이 가능
		// ex) 0번 index의 객체를 2번 index에 저장 가능

		// * Set - 구현 클래스(HashSet, TreeSet)
		// -> 집합과 유사 // 순서를 유지하지 않고 저장 // 중복 저장 안됨

		// * Map - 구현 클래스(HashMap, HashTable, TreeMap, Properties)
		// -> 키와 값의 쌍으로 저장 // 키는 중복으로 저장 안됨

	}

}
