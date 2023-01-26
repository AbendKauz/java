package sec02;

public class D0704_10_삼항연산자1 {

	public static void main(String[] args) {

		// 삼항연산자
		// 조건식 ? 값 또는 연산식 : 값 또는 연산식
		// true : ____________

		// false : ____________

		// 90 초과 -> A등급
		// 90 이하 -> B등급
		int score = 83;
//		System.out.println( (score > 90) ? "A등급" : "B등급" );

//		if(score > 90) {
//			System.out.println("A등급");
//		}else {
//			System.out.println("B등급");
//		}

		// 90 초과 -> A등급
		// 80 초과 -> B등급
		// 80 이하 -> C등급
//		if(score > 90) {
//			System.out.println("A등급");
//		}else if(score > 80) {
//			System.out.println("B등급");
//		}else {
//			System.out.println("C등급");
//		}

		System.out.println((score > 90) ? "A등급" : ((score > 80) ? "B등급" : "C등급"));

	}

}
