package sec02;

public class D0701_05_문자열결합연산자 {

	public static void main(String[] args) {

		// 문자열 결합 연산자 ( + )
		// : 문자열을 서로 결합해주는 연산자
		// 피연산자 중 한쪽이 문자열이면 + 연산자는 문자열 결합 연산자로
		// 사용되어 다른 피연산자를 문자열로 변환 후 서로 결합

		String str1 = "JDK" + 6.0;
		System.out.println(str1); // JDK6.0

		String str2 = str1 + " 특징";
		System.out.println(str2); // JDK6.0 특징

		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";

		System.out.println(str3); // JDK33.0
		System.out.println(str4); // 6.0JDK

	}

}
