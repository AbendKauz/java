package sec02.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {

		// BufferedReader 보조스트림
		//	-> readLine() : 라인 단위로 문자열을 읽는 메소드
		
		InputStream is = System.in;
		Reader rea = new InputStreamReader(is);
		
		// 성능향상을 시켜주는 BufferedReader 보조스트림 연결
		BufferedReader br = new BufferedReader(rea);
		
		System.out.print("입력 : ");
		String lineString = br.readLine();	// 예외처리 필요
		System.out.println("출력 : " + lineString);
		
		br.close(); rea.close(); is.close();
	}

}
