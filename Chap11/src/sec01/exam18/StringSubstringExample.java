package sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {

		String ssn = "880815-1234567";

		// substring(a, b) : a부터 b 전까지
		String firstNum = ssn.substring(0, 6); // 0부터 5(6 직전)까지
		System.out.println(firstNum);

		// substring(a) : a부터 끝까지
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
