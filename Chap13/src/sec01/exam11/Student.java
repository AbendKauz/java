package sec01.exam11;

import java.util.Objects;

public class Student {
	// -> 필드
	// sno : 접근제한 public / int 타입 / -> 학번
	// name : 접근제한 public / String타입 / -> 이름

	public int sno;
	public String name;

	// -> 생성자 (학번, 이름 매개변수 2개)

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// -> toString 메소드
	// <console>
	// 학번 ( 20120410 ), 이름 ( 김자바 )

	@Override
	public String toString() {
		return "학번 ( " + sno + " ), 이름 ( " + name + " )";
	}

	// 중복제거시엔 hashCode(), equals() 재정의 해줘야 함

	// -> equals( ) 재정의
	// - 받아온 매개값이 Student 클래스 타입이라면 Student 타입으로 타입 변환 후
	// 학번과 이름이 같을 경우에 true , 아닐경우에 false 를 리턴함.
	//
	// Student 클래스 타입이 아니라면 false 를 리턴함.

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return (stu.sno == sno) && (stu.name.equals(name));
		}
		return false;
	}

	// -> hashCode( ) 재정의
	// - return Objects.hash(sno, name);

	@Override
	public int hashCode() {
		return Objects.hash(sno, name);
	}

}
