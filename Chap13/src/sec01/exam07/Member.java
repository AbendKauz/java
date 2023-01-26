package sec01.exam07;

public class Member {

	// -> 필드
	// name : 접근제한 public / String타입 /
	// age : 접근제한 public / int 타입 /
	// -> 생성자 (이름, 나이 매개변수 2개)

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
