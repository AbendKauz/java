package sec03;

public class D0628_03_문자열강제타입변환 {

	public static void main(String[] args) {

		// * 기본타입(8개)
		// 정수 (5개) : byte, short, char, int, long
		// 실수 (2개) : float, double
		// 논리 (1개) : boolean
		// char 제외하고 강제 변환 가능

//		String str = "10";
//		byte a = Byte.parseByte(str);			// String -> byte
//		short a = Short.parseShort(str);		// String -> short
//		int a = Integer.parseInt(str);			// String -> int
//		long a = Long.parseLong(str);			// String -> long
//		float a = Float.parseFloat(str);		// String -> float
//		double a = Double.parseDouble(str);		// String -> double
//		System.out.println(str);
		String b = "true";
		boolean b1 = Boolean.parseBoolean(b); // String -> boolean

		System.out.println(b1);

		// 문자열이 숫자가 아닌 알파벳이나 특수문자, 한글 등 포함할 경우
		// -> 숫자타입으로 변환 시도 시 숫자형식제외(NumberFormatException)발생
//		String str1 = "10a";
//		int value = Integer.parseInt(str1);
//		System.out.println(value);	// 에러 발생

		// 반대로 기본타입(byte, short, char, int, long, float, double, boolean)
		// 의 값을 문자열로 변경할 때는???

		// String.valueOf() 메소드를 사용
		int a = 3;
		System.out.println(a + 3); // 6 -> 숫자
		String str2 = String.valueOf(a);
		System.out.println(str2 + 3); // 33 -> 문자열

	}

}
