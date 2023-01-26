package sec02;

public class Test2Example {

	public static void main(String[] args) {

		// 필드 값 읽기
		// 1. 객체 생성 -> 도트연산자 활용해서 읽기

		Test2 test = new Test2();
		// 각 필드값의 초기값 출력
		System.out.println(test.byteField); // 0
		System.out.println(test.shortField); // 0
		System.out.println(test.intField); // 0
		System.out.println(test.longField); // 0

		System.out.println();
		System.out.println(test.charField); // false
		System.out.println(test.booleanField); // (공백)

		System.out.println();
		System.out.println(test.floatField); // 0.0
		System.out.println(test.doubleField); // 0.0

		System.out.println();
		System.out.println(test.arrField); // null
		System.out.println(test.strField); // null

	}

}
