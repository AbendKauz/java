package sec01.exam02;

public class Member {

	// -> 필드
	// name : 접근제한 private / String타입 /
	// age : 접근제한 private / int 타입 /
	// gender : 접근제한 private / String타입 /
	// -> 생성자 (이름, 나이, 성별 매개변수 3개)
	// -> getter, setter 메소드
	// - getter 메소드
	// - setter 메소드
	// -> toString 메소드
	// <console>
	// 이름 : 김자바, 나이 : 20, 성별 : 남

	private String name;
	private int age;
	private String gender;

	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender;
	}

}
