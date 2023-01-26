package sec01.exam07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// -> Member 객체를 저장하는 HashSet 생성 // 변수명은 set
		//
		// -> Member 객체 m1, m2 생성하기
		// (이름 - 김자바, 나이 - 30)
		//
		// -> set에 m1, m2 객체 추가
		//
		// -> 아래와 같이 콘솔에 출력 (Iterator 반복자를 사용하기) - hashCode( ) 메소드 사용
		//
		// <console>
		// <<<< m1 과 m2 hashCode( ) 비교 >>>>
		// m1의 해시코드 : 997110508 => m1.hashCode( ) 메소드 호출
		// m2의 해시코드 : 509886383
		// ========================================
		// 총 객체수 : 2
		// 이름 : 김자바, 나이 : 30
		// 이름 : 김자바, 나이 : 30

		Set<Member> set = new HashSet<>();

		Member m1 = new Member("김자바", 30);
		Member m2 = new Member("김자바", 30);

		System.out.println(m1 == m2); // 주소값 비교(false)
		System.out.println(m1.hashCode()); // 해시코드 값 다름
		System.out.println(m2.hashCode());

		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체를 1개만 저장하도록 하려면
		// -> equals(), hashCode() 메소드를 재정의 해야 함
		// => 하지 않을 시 중복제거를 하지 않음

		set.add(m1);
		set.add(m2);

		System.out.println("========================================");

		Iterator<Member> iterator = set.iterator();

		int i = 1;
		while (iterator.hasNext()) {
			System.out.println("m" + i++ + "의 해시코드 : " + iterator.next().hashCode());
		}

		System.out.println("총 객체 수 : " + set.size());

		for (Member member : set) {
			System.out.println("이름 : " + member.name + ", 나이 : " + member.age);
		}

		// -> equals(), hashCode() 메소드를 재정의 해야 함
		// => 하지 않을 시 중복제거를 하지 않음
		// exam08 => 중복제거 되도록 메소드를 재정의한 코드 정리

	}

}
