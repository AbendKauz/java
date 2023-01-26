package sec01.exam10;

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

}
