package sec01.exam04;

public class Member {

//	-> 필드
//      name : 접근제한 private / String타입 /
//      age : 접근제한 private / int 타입 /
//      gender : 접근제한 private / String타입 /

	private String name;
	private int age;
	private String gender;

//  -> 생성자 (이름, 나이, 성별 매개변수 3개)

	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

//  -> getter, setter 메소드
//     - getter 메소드
//     - setter 메소드

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

//  -> toString 메소드
//    <console>
//     이름 : 김자바, 나이 : 20, 성별 : 남

	@Override
	public String toString() {
		String str = "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender;
		return str;
	}

}
