package sec01.exam08;

import java.util.Objects;

public class Member {
	// -> 필드
	// name : 접근제한 public / String타입 /
	// age : 접근제한 public / int 타입 /
	// -> 생성자 (이름, 나이 매개변수 2개)
	// -> equals( ) 재정의
	// - 받아온 매개값이 Member 클래스 타입이라면 Member 타입으로 타입 변환 후
	// 이름과 나이가 같을 경우에 true , 아닐경우에 false 를 리턴함.
	//
	// Member 클래스 타입이 아니라면 false 를 리턴함.
	// -> hashCode( ) 재정의
	// - return Objects.hash(name, age);

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
//		if(obj.getClass().equals(this.getClass())) {
		if (obj instanceof Member) {
			Member m = (Member) obj; // 강제타입변환
			if (m.age == this.age && m.name.equals(this.name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age); // 이름과 나이가 같으면 동일한 hashcode 리턴
		// 매개값으로 주어진 값들을 이용해서 해시코드를 생성하는 메소드
		// 여러가지 필드를 가지고 있을 때 => 필드들로부터 해시코드를 생성하면
		// 동일한 필드값을 가진 경우에는 동일한 해시코드를 리턴함
	}

	// * 해시코드란?
	// => 객체를 식별하는 하나의 정수값
	// hashCode() : 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴
	// ==> 객체마다 고유의 다른 값을 가짐

}
