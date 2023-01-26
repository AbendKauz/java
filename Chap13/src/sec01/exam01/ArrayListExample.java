package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// * ArrayListExample - 클래스
		// -> String 객체를 저장하는 ArrayList 생성 // 변수명은 list
		// -> add 메소드 (객체 추가)
		// - Java 추가
		// - JDBC 추가
		// - Python 추가
		// -> get 메소드 (객체 검색)
		// <console>
		// list(0) : Java
		// list(1) : JDBC
		// list(2) : Python

		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Python");

//		System.out.println("객체수 : " + list.size());
		// list.size() : 리스트의 객체의 수 검색

//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list(" + i + ") : " + list.get(i));
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> - 2번째 인덱스에 Database 추가
		// - JSP 추가
		//
		// -> 아래와 같이 출력하기
		// <console>
		// 총 객체수: 5
		// list(0) : Java
		// list(1) : JDBC
		// list(2) : Database
		// list(3) : Python
		// list(4) : JSP

		list.add(2, "Database");
		// list.add(a, b) : a번째 index에 b객체 추가
		list.add("JSP");
		// list.add(a) : a객체 추가

		System.out.println("총 객체수 : " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list(" + i + ") : " + list.get(i));
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> 2, 3번 인덱스, JDBC 객체 삭제
		// -> Java 추가 후 출력
		// <console>
		// list(0) : Java
		// list(1) : Python
		// list(2) : Java

		list.remove(2);
		// list.remove(a) : a index의 객체 삭제
		list.remove(3);
		list.remove("JDBC");
		// list.remove(객체명) : 해당명의 객체 삭제
		list.add("Java");
		// list에는 중복객체 저장 가능

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list(" + i + ") : " + list.get(i));
		}

		System.out.println("=========================================================");
		// =========================================================
		// -> list 안에 저장된 모든 객체를 삭제 후
		// list 가 비어있을 경우 "비어있음"을 출력
		// <console>
		// 비어 있음

		list.clear();
		// list.clear() : 리스트의 모든 객체 삭제

//		if(list.size() == 0) {
//			System.out.println("비어있음");
//		}

		if (list.isEmpty()) {
			System.out.println("비어있음");
		}

	}

}
