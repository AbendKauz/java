package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream2 {

	public static void main(String[] args) throws Exception {

		// * FileInputStream2- 클래스
		// -> FileInputStream 생성 (매개값 test.txt 파일)
		// ==> InputStream 타입의 변수 is 에 대입
		InputStream is = new FileInputStream("C:/Temp/test.txt");

		// -> read(byte[ ] b) 메소드를 이용하여 출력하기 : byte 배열의 길이는 3
		// (방법1, 방법 2 둘다 풀어보기)
		//
		// < console >
		// read() : 1 || 읽은 바이트 수 : 3
		// a b c
		// read() : 2 || 읽은 바이트 수 : 2
		// d e

		// 방법 1.
		int readByteNo; // read 메소드가 읽은 바이트 수를 저장할 변수
		byte[] readBytes = new byte[3]; // 읽은 데이터를 저장할 바이트 배열(길이 3)
		int cnt = 1;
		String data = ""; // 배열에 들어있는 데이터들을 문자열로 저장할 변수

//		while( (readByteNo = is.read(readBytes)) != -1 ) {
//			System.out.println("read() : " + cnt++ + " || 읽은 바이트 수 :  " + readByteNo);
//			
//			// 1. 읽은 데이터를 출력
////			for(int i = 0; i < readByteNo; i++) {
////				System.out.print((char)readBytes[i] + " ");
////			}
////			System.out.println();
//			
//			// 2. 읽은 데이터를 문자열로 저장 후 출력
//			// String(byte[] bytes, int offset, int length) 생성자 사용
//			//	-> 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
//			
//			data += new String(readBytes, 0, readByteNo);	// 읽은 데이터를 문자열에 저장
//		
//			// * 찾고자 하는 메소드 클릭 -> shift + F2 : API docs 홈페이지 열림
//			// * 찾고자 하는 메소드 클릭 -> F1 : API docs 호출
//		}
//		System.out.println("파일로부터 읽어온 데이터 : " + data);

		// 방법 2.
		while (true) {
			if ((readByteNo = is.read(readBytes)) == -1) {
				break;
			}
			for (int i = 0; i < readByteNo; i++) {
				System.out.print((char) readBytes[i] + " ");
			}
			System.out.println();

		}
	}

}
