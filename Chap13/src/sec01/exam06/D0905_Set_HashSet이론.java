package sec01.exam06;

public class D0905_Set_HashSet이론 {

	public static void main(String[] args) {

		// * Set 컬렉션
		// : 수학의 집합과 비슷
		// : 구슬 주머니와 비슷한 구조(저장 순서가 유지되지 않음, 객체 중복저장 불가능, 하나의 null만 저장 가능)
		// => 구현 클래스 (HashSet, LinkedHashSet, TreeSet)

		// * List 컬렉션에 있던 index로 객체를 리턴해주는 메소드 get()
		// => Set 컬렉션은 순서가 유지되지 않기 때문에 index를 통해 객체를 리턴해주는 메소드가 없음
		// Set 안에 있는 객체들 중 특정 객체를 하나씩만 가져와서 이용을 할 수 없음

		// *** 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자 Iterator를 제공 ***
		// 반복자 : Iterator 인터페이스를 구현한 객체를 말함, iterator() 메소드를 호출하여 얻음

		// Set<String> set = ....;
		// Iterator<String> iterator = set.iterator();
		// => Iterator<String> 타입의 String 을 적는 이유???
		// : 반복해서 가져올 객체 타입이 String이기 때문

		// * Iterator 인터페이스 메소드
		// 1. hasNext() : 가져올 객체가 있으면 true 리턴
		// 2. next() : 컬렉션에서 하나의 객체를 가져옴
		// 3. remove() : Set 컬렉션에서 객체를 제거

		// * HashSet 특징
		// Set<E> 변수명 = new HashSet<E>();
		// : 객체들을 순서 없이 저장하고, 동일한 객체를 중복저장하지 않음
		// (동일객체, 동등객체 중복저장 X)

		// * 동일성 vs 동등성
		// - 동일성 : 두개의 객체가 완전히 같은 경우 (주소 값 까지 같음)
		// - 동등성 : 두개의 객체가 같은 정보를 갖는 경우
		// : 변수가 참조하는 객체의 주소는 서로 다르더라도, 내용만 같으면 동등하다 함

		String str1 = new String("AAA");
		String str2 = new String("AAA");
		System.out.println(str1 == str2); // == : 주소값 비교 (false)
		System.out.println(str1.equals(str2)); // .equals() : 내용을 비교 (true)
		// = str1과 str2는 동등객체

		// * 문자열을 HashSet에 저장할 경우 같은 문자열을 갖는 String 객체는 동등객체로 간주함
		// 다른 문자열을 갖는 String객체는 다른 객체로 간주함
		// => String 클래스 안에 hashCode(), equals() 메소드를 재정의해서
		// 같은 문자열일 경우 hashCode() 의 리턴값은 같게,
		// equals() 리턴값은 true가 나오도록 재정의 되어있음

	}

}
