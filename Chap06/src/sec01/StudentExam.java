package sec01;

public class StudentExam {

	public static void main(String[] args) {

		// class로부터 객체를 생성
		// -> class명 변수명 = new class명();

		Student stu1 = new Student(); // 학생객체1 생성
		System.out.println(stu1); // 주소값1

		Student stu2 = new Student(); // 학생객체2 생성
		System.out.println(stu2); // 주소값2

		if (stu1 == stu2) { // 주소값1과 주소값2가 같은지 비교
			System.out.println("stu2 변수가 같은 Student 객체를 참조합니다.");
		} else {
			System.out.println("stu2 변수가 다른 Student 객체를 참조합니다.");
		} // false -> 다른 객체를 참조하므로 번지가 다름

	}

}
