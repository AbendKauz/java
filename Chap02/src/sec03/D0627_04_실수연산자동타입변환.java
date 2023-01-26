package sec03;

public class D0627_04_실수연산자동타입변환 {

	public static void main(String[] args) {

		// int 타입과 double 타입의 연산
		// ---> int타입의 변수가 double타입으로 변환이 되고,
		// double + double 타입의 형식으로 연산을 수행
//		int intValue = 10;
//		double doubleValue = 4.5;
//		double result = intValue + doubleValue;
//		System.out.println(result);		// 14.5

		// 만약에 꼭 int타입으로 연산을 해야한다면???
		// ---> double 타입을 int 타입으로 강제 변환 후 연산
		int intValue = 10;
		double doubleValue = 4.5;
		int result = intValue + (int) doubleValue;
		System.out.println(result); // 14

	}

}
