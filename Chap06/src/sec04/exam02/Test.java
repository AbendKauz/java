package sec04.exam02;

public class Test {

	// * 매개변수의 개수를 모를 경우

	// 1. 매개 변수를 배열 타입으로 선언
	// 2. 배열을 생성하지 않고 값의 목록만 넘겨주는 방식

	// 1. 매개 변수를 배열 타입으로 선언
	// sum1()

	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// -> 1번의 방법은 메소드를 호출하기 전에 배열을 생성해야 하는 불편함이 있음
	// 그래서 배열을 생성하지 않는 방법 2.

	// 2. 배열을 생성하지 않고 값의 목록만 넘겨주는 방식
	// sum2() -> 매개변수를 ... 를 사용해서 선언함
	// => 메소드 호출 시 넘겨준 값의 수에 따라서 자동으로 배열이 생성되고 매개값으로 사용이 됨
	// 매개값 넘길 때 : , (쉼표)로 구분해서 나열함
	// ex) a.sum2(1, 2, 4, 5);

	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
