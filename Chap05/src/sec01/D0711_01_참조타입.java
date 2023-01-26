package sec01;

public class D0711_01_참조타입 {

	public static void main(String[] args) {

		// 기본타입(정수_byte, short, char, int, long, 실수_float, double, 논리_boolean)
		// : 정수, 실수, 문자, 논리 리터럴 저장 // 실제값을 변수 안에 저장
		// 참조타입(배열타입, 열거타입, 클래스, 인터페이스)
		// : 객체의 번지를 참조하는 타입 // 메모리의 번지를 변수 안에 저장
		// -> 번지를 통해 객체를 참조

		// * 메모리사용영역
		// 1. 메소드영역 : 클래스 코드들이 클래스코드별로 저장
		// 2. 힙 영역 : 객체와 배열이 생성되는 영역
		// 3. JVM 스택영역: 메소드를 호출할 때 프레임을 추가, 종료되면 프레임을 제거함

		// NullPointerException
		// : 참조변수를 사용하면서 가장 많이 발생하는 예외 중 하나
		// : 참조타입 변수가 null 상태에서 존재하지 않는 객체의 데이터나 메소드 사용시 발생
		// -> 해결법 : 해당참조변수가 객체를 참조하도록 수정하여 해결

//		int[] intArr = null;
//		intArr[0] = 10;	// NullPointerException 발생
		// null을 가지고 있는 상태 (참조객체가 없는 상태)
		// -> 가지고 있지 않은 객체의 데이터나 메소드를 사용시 발생

//		String str = null;
//		System.out.println(str.length());	// NullPointerException 발생

//		String str1 = "String";
//		System.out.println(str1.length());	// .length : 문자열의 길이를 return

		String a = "혼공자";
		String b = "혼공자";
		String c = new String("혼공자");

		// == : 번지를 비교
		if (a == b) { // 참조 번지가 같다.
			System.out.println("참조 번지가 같다.");
		} else {
			System.out.println("참조 번지가 다르다.");
		}

		if (a == c) { // 참조 번지가 다르다.
			System.out.println("참조 번지가 같다.");
		} else {
			System.out.println("참조 번지가 다르다.");
		}

		// .equals() : 문자열을 비교
		if (a.equals(c)) { // 문자열이 같다.
			System.out.println("문자열이 같다.");
		} else {
			System.out.println("문자열이 다르다.");
		}

	}

}
