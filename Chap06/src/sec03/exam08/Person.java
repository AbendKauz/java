package sec03.exam08;

public class Person {

	// 필드는 private으로 String 타입의 name, int타입의 age
	// default 생성자
	// 2개의 매개변수를 가지는 생성자(객체 생성 시 필드 값을 초기화함)
	// getter메소드, setter메소드 생성(필드 2개 다 만들기)
	// toString() 메소드 생성

	private String name;
	private int age;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
