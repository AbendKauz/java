package sec01.exam16;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// 가운데 글자 출력
		// ex) 가나다라마바사 -> 라
		// 가나다라마바 -> 다라

		Scanner s = new Scanner(System.in);
		System.out.print("글자 입력 : ");
		String a = s.next();

		// 입력받은 글자의 길이만큼 배열 생성
		String[] strArr = new String[a.length()];
		// 배열안에 글자들을 하나씩 입력
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = Character.toString(a.charAt(i));
		}

		// 2로 나누어짐 : 홀수
		// 2로 나누어지지 않음 : 짝수
		// => 배열의 길이 = length - 1

		if (strArr.length % 2 == 0) {
			System.out.println(strArr[(strArr.length / 2) - 1] + strArr[strArr.length / 2]);
		} else {
			System.out.println(strArr[strArr.length / 2]);
		}

	}

}
