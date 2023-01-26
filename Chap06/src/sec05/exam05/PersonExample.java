package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-4567890");
		System.out.println(p1.ssn);

		// * final 필드 -> 생성자에서 외부데이터로 초기화
		// -> 초기화한 값이 최종적인 데이터로 인식
		// -> 수정 시 error
//		p1.ssn = "147852-1478523";	// final 필드는 수정 불가
//		p1.nation = "aaa";	// error

	}

}
