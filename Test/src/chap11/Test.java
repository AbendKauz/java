package chap11;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 영어 소문자 10개 입력받기
		// ex) abcabcdabc
		// c를 찾아서 c의 위치값을 출력 -> 반복문
		// 결과)
		// c의 위치값은 : 2
		// c의 위치값은 : 5
		// c의 위치값은 : 9
		// 심화) 1번째 c의 위치값은 : 2

		Scanner s = new Scanner(System.in);
		System.out.print("소문자 10개 입력 : ");
		String str = s.next();
		int cnt = 1;
		String b = "c";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'c') {
				System.out.println("c의 위치값은 : " + i);
				System.out.println(cnt++ + "번째 c의 위치값은 : " + i);
			}
			if (b.equals(str.substring(i, i + 1))) {
				System.out.println("c의 위치값은 : " + i);
				System.out.println(cnt++ + "번째 c의 위치값은 : " + i);
			}
//			if(b.equals(str.charAt(i) + "")) {
//				System.out.println("c의 위치값은 : " + i);
//				System.out.println(cnt++ + "번째 c의 위치값은 : " + i);
//			}
		}

	}

}
