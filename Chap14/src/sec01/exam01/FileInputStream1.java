package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream1 {

	public static void main(String[] args) throws Exception {

		// FileInputStream을 이용해서 파일로부터 데이터를 읽어올것
		// -> test.txt 문자파일도 InputStream으로 읽을 수 있음

		// throws Exception 예외처리
		InputStream is = new FileInputStream("C:/Temp/test.txt");

//		// 1. read() 메소드 : 1byte를 읽고 읽은 바이트를 리턴해주는 메소드
//		int data = is.read();
//		System.out.println(data);	// 97 (int type이라 UniCode로 출력)
//		System.out.println((char) data);	// abcde 중 a 알파벳 1byte만 읽어옴
//		
//		data = is.read();
//		System.out.println(data);	// 98
//		System.out.println((char) data);	// abcde를 다 읽으려면 read() 메소드를 5번 호출

		// => read() -> 더이상 입력 스트림으로부터 바이트를 읽을 수 없다면 -1을 리턴
		// 이를 이용해서 읽을 수 없는 마지막 바이트까지 반복하도록 반복문을 작성

		int readByte;
//		// 방법 1.
//		while( (readByte = is.read()) != -1 ) {
//			// readByte에 읽은 바이트를 리턴하는데 이 값이 -1이 아닐 경우에만 계속 반복하기
//			System.out.println(readByte + " -> (Char) : " + (char)readByte);
//		}											// 문자로 출력되도록 char타입으로 강제타입변환

		// 방법 2.
		while (true) { // 무한 반복하도록 true로 설정
			readByte = is.read();
			// 만약 readByte가 -1이 되면 반복문을 종료하도록 if문 작성
			if (readByte == -1) {
				break;
			}
			System.out.println(readByte + " -> (Char) : " + (char) readByte);
		}

	}

}
