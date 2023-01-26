package sec01.exam10;

public class ByteToStringExample {

	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// h e l l o 공백 j a v a
		String str1 = new String(bytes);
		System.out.println(str1);
		// Hello Java
		// -> 72, 101, 108, 108, 111, 32, 74, 97, 118, 97

		String str2 = new String(bytes, 6, 4);
		// 6, 4 -> 6번째 index부터 4개
		System.out.println(str2);
		// Java
		// -> 74, 97, 118, 97

		// Good evening 출력
		byte[] bytes1 = { 71, 111, 111, 100, 32, 101, 118, 101, 110, 105, 110, 103 };
		// G o o d 공백 e v e n i n g
		String str3 = new String(bytes1);
		System.out.println(str3);

		String str4 = new String(bytes1, 5, 7);
		System.out.println(str4);

	}

}
