package sec05.exam05;

public class Person {

	// * final 필드
	// -> '최종적'
	// -> 초기값이 한번 지정되면 이것이 최종적인 값이 됨
	// -> 프로그램 실행 도중에 수정할 수 없음

	// * final 필드에 초기값을 주는 방법
	// 1. 필드 선언 시 주는 방법
	// : 단순값 -> 필드 선언시에 주는 것이 간단함
	// 2. 생성자에서 주는 방법
	// : 외부에에서 외부데이터로 값을 초기화해야하는 경우

	// ex) 주민번호 -> 각 객체마다 값이 달라야 함 -> 외부데이터로 값을 초기화
	// ----> 생성자에서 초기화 하는 방법 사용

	final String ssn;
	final String nation = "Korea"; // 항상 고정된 값 (수정불가)

	public Person(String ssn) {
		this.ssn = ssn;
	}

}
