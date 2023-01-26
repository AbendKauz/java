package sec03.exam05;

public class Grade {

	// 수학, 과학, 영어 점수를 저장할 필드 만들기
	// 생성자 만들기
	// 모든 필드의 값을 보여주는 toString 만들기(콘솔창과 동일하게 출력)
	// average() -> 평균을 구한 후 평균값을 리턴하는 메소드 만들기

	int math;
	int science;
	int english;

	// 객체 생성

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	// toString() -> override
	// 수학(math), 과학(science), 영어(english)

	@Override
	public String toString() {
//		return "수학(" + math + "), 과학(" + science + "), 영어(" + english + ")";
		String str = "수학(" + math + "), 과학(" + science + "), 영어(" + english + ")";
		return str;
	}

	// 평균을 구한 후 평균값을 리턴하는 메소드 만들기

//	double average(int a, int b, int c) {
//		return (a + b + c) / 3;
//	}

	double average() {
		return (math + science + english) / 3;
	}

}
