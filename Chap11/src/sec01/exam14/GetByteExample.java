package sec01.exam14;

import java.util.Arrays;
import java.util.Scanner;

public class GetByteExample {

	public static void main(String[] args) {

		// 단어를 입력하세요 :
		// 반복 출력
		// 배열 출력
		// 디코딩 결과 :

		Scanner s = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String b = s.next();
		byte[] c = b.getBytes();

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " ");
		}

		System.out.println();

		System.out.println(Arrays.toString(c));

		String d = new String(c);
		System.out.println("디코딩 결과 : " + d);

	}

}
