package sec02;

public class D0630_03_논리부정연산자 {

	public static void main(String[] args) {

		// 논리 부정 연산자( ! )
		// -> true는 false로, false는 true로 변경
		// -> boolean에서만 사용
		// -> 조건문과 제어문에서 실행의 흐름을 제어할 때 사용하게 됨

		boolean a = true;
		System.out.println(a); // true

		System.out.println(!a); // false
		System.out.println(a); // true

		a = !a;

		System.out.println(a); // false

	}

}
