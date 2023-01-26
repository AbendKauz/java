package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {

		String filePath = "src/chap14/AddLineNumberExample.java";

		FileReader fr = new FileReader(filePath); // 예외처리
		// BufferedReader -> 성능향상 보조 스트림
		// -> 프로그램의 실행 성능을 향상시켜줌
		// -> readLine() : 라인단위로 문자열을 읽어오는 메소드

		BufferedReader br = new BufferedReader(fr);

		int cnt = 1;
		String str = "";
		while (true) {
			str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(cnt++ + ": " + str);
		}
		br.close();
		fr.close();

	}

}
