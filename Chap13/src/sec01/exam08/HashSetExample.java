package sec01.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// -> Member 객체를 저장하는 HashSet 생성 // 변수명은 set
		Set<Member> set = new HashSet<>();

		// -> Member 객체 m1, m2 생성하기
		// (이름 - 김자바, 나이 - 30)
		Member m1 = new Member("김자바", 30);
		Member m2 = new Member("김자바", 30);

		// -> set에 m1, m2 객체 추가
		set.add(m1);
		set.add(m2); // 중복 제거 -> 저장 X

		// -> set에 추가하기
		// 1. 이름 - 홍길동, 나이 - 30
		// 2. 이름 - 홍길동, 나이 - 20
		// 3. 이름 - 박길동, 나이 - 20
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); // 중복 제거 -> 저장 X
		set.add(new Member("홍길동", 20));
		set.add(new Member("박길동", 20));

		// -> 아래와 같이 콘솔에 출력 (Iterator 반복자를 사용하기) - hashCode( ) 메소드 사용
		// <console>
		// <<<< m1 과 m2 hashCode( ) 비교 >>>>
		// m1의 해시코드 : 1379506075 => m1.hashCode( ) 메소드 호출
		// m2의 해시코드 : 1379506075
		// m1 과 m2 내부 데이터 비교 : true
		// ========================================
		// 총 객체수 : 4
		// 이름 : 김자바, 나이 : 30
		// 이름 : 홍길동, 나이 : 20
		// 이름 : 박길동, 나이 : 20
		// 이름 : 홍길동, 나이 : 30

		Iterator<Member> iter = set.iterator();

		System.out.println("<<<< m1 과 m2 hashCode( ) 비교 >>>>");
		System.out.println("m1의 해시코드 : " + m1.hashCode());
		System.out.println("m2의 해시코드 : " + m2.hashCode());

		System.out.println("m1과 m2 내부 데이터 비교 : " + m1.equals(m2));

		System.out.println("========================================");

		System.out.println("총 객체수 : " + set.size());

		// 1. Iterator 반복자 사용
//		while(iter.hasNext()) {
//			System.out.println("이름 : " + iter.next().name + ", 나이 : " + iter.next().age);
//		}

		// 2. 향상된 for문 사용
		for (Member member : set) {
			System.out.println("이름 : " + member.name + ", 나이 : " + member.age);
		}

	}

}
