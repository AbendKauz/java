package sec01.exam14;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 당신의 이름을 입력하세요 :
		// 이름을 3글자 정상적으로 입력했으면
		// -> 당신의 이름은 OOO입니다.
		// 아닐경우
		// 이름을 다시 입력해주세요. 출력
		// getBytes()
		// length 길이가 6

		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String a = s.next();
		byte[] bytes = a.getBytes(); // 이름을 byte배열로 변환
		if (bytes.length == 6) { // byte배열에선 이름 길이가 6byte
			String str1 = new String(bytes); // byte배열을 다시 문자열로 디코딩
			System.out.println("당신의 이름은 " + str1 + "입니다.");
		} else { // 길이가 6이 아닐 때 == 이름이 3글자가 아닐 때
			System.out.println("이름을 다시 입력해 주세요.");
		}

	}

}
