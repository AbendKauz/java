package sec04.exam02;

public class TestExample {

	public static void main(String[] args) {

		Test a = new Test();

		// 1. 매개 변수를 배열 타입으로 선언

		int[] arr = { 1, 2, 3 };
//		System.out.println(a.sum1(arr));
		int result = a.sum1(arr);
		System.out.println("result의 값 : " + result);

		int result2 = a.sum1(new int[] { 4, 5, 6 });
		System.out.println("result2의 값 : " + result2);

		// 2. 배열을 생성하지 않고 값의 목록만 넘겨주는 방식

		int result3 = a.sum2(1, 2, 4, 5);
		System.out.println("result3의 값 : " + result3);

		int result4 = a.sum2(1, 2, 4, 5, 1, 2, 4, 5, 1, 2, 4, 5);
		System.out.println("result4의 값 : " + result4);

	}

}
