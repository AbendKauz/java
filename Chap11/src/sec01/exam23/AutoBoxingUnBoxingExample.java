package sec01.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {

		// 자동 boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		// 대입 시 자동 unboxing
		int value = obj;
		System.out.println("value : " + value);

		// 연산 시 자동 unboxing
		int result = obj + 100;
		System.out.println("result : " + result);

	}

}
