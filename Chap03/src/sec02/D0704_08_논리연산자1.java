package sec02;

public class D0704_08_논리연산자1 {

	public static void main(String[] args) {

		// 논리연산자
		// AND (논리곱), OR (논리합), XOR(배타적 논리합), NOT(논리부정)

		// 1. AND -> && 또는 &
		// -> 피연산자 모두가 true일때만 결과가 true
//		System.out.println(true && true);	// true
//		System.out.println(true && false);	// false
//		System.out.println(false && true);	// false
//		System.out.println(false && false);	// false

		// 2. OR -> || 또는 |
		// -> 피연산자 중 하나라도 true일 때만 결과가 true
//		System.out.println(true || true);	// true
//		System.out.println(true || false);	// true
//		System.out.println(false || true);	// true
//		System.out.println(false || false);	// false

		// 3. XOR -> ^
		// -> 피연산자 중 하나는 true이고, 다른 하나가 false일 경우에만 true
//		System.out.println(true ^ true);	// false
//		System.out.println(true ^ false);	// true
//		System.out.println(false ^ true);	// true
//		System.out.println(false ^ false);	// false

		// 4. NOT -> !
		// -> 논리값을 바꿈 (true는 false로, false는 true로 변경)
//		System.out.println(!true);	// false
//		System.out.println(!false);	// true

	}

}
