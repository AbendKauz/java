package sec03;

public class D0628_01_실수연산자동타입변환1 {

	public static void main(String[] args) {

//		int x = 1;
//		int y = 2;
//		int result = x / y;		// int 타입에는 소숫점이 들어가지 않는다
//		System.out.println(result);		// 0

		// 수학적 -> 1/2 -> 0.5가 나오지만
		// 자바 -> 1/2 -> 0이 나옴 (정수산술연산 ==> 결과값이 정수)
		// 1/2 = 0.5 -> .5를 버리고 0만 남아서 결과값
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result); // 0.5

		// Q) 1/2가 0.5가 나오게 하려면???
		// x, y 둘 중 하나가 double타입으로 강제 변환 후 연산을 수행
		// --> 실수 / 정수 => 실수

		// 방법 1
//		int x1 = 1;
//		int y1 = 2;
//		double result1 = (double) x1 / y1;
//		System.out.println(result1);

		// 방법 2
//		int x1 = 1;
//		int y1 = 2;
//		double result1 = x1 / (double) y1;
//		System.out.println(result1);

		// 방법 3
		int x1 = 1;
		int y1 = 2;
		double result1 = (double) x1 / (double) y1;
		System.out.println(result1);

	}

}
