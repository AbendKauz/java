package sec01.exam06;

public class D0816_protected접근제한자 {

	public static void main(String[] args) {

		// 교재 p.325 ~ p.327

		// protected -> public 과 default 접근 제한의 중간쯤에 해당함
		// : 같은 패키지에서는 default 와 같이 접근 제한이 없음
		// 다른 패키지에서는 자식클래스만 접근을 허용함.

		// package1
		// - A 클래스 : protected 멤버 a 선언

		// - B 클래스 : 멤버 a 사용 가능

		// package2
		// - C 클래스 : 멤버 a 사용 불가

		// - D 클래스 (자식클래스) -> A 클래스를 상속
		// : 멤버 a 사용 가능

	}

}
