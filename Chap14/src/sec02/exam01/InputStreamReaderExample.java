package sec02.exam01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {

		
		// System.in : 콘솔로부터 데이터를 얻어옴 -> 문자데이터
		// InputStream -> 바이트 기반 입력 스트림
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);
		// InputStreamReader 보조스트림
		//	: 바이트 기반 스트림을 문자기반 스트림으로 변환
		//	: Reader를 상속받았기 때문에 Reader에 대입이 가능
		
		// read()가 -1을 리턴하는 때
		//	-> 콘솔에서 Ctrl + Z를 누르면 -1을 리턴해서 반복문을 종료함
		int readCharNo;	// 읽은 문자 수를 저장할 변수
		char[] arr = new char[100];	// 읽은 데이터를 저장할 변수
		while( (readCharNo = reader.read(arr)) != -1 ) {
			String data = new String(arr, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();	// 스트림을 닫음
		is.close();
		
	}

}
