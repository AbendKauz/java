package sec01.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {

		// �ڵ� boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		// ���� �� �ڵ� unboxing
		int value = obj;
		System.out.println("value : " + value);

		// ���� �� �ڵ� unboxing
		int result = obj + 100;
		System.out.println("result : " + result);

	}

}
