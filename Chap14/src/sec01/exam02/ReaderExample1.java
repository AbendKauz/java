package sec01.exam02;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		// * ReaderExample1 - 클래스
		// -> FileReader 생성 (매개값 test2.txt 파일)
		// ==> Reader 타입의 변수 reader 에 대입
		// -> read( ) 메소드를 이용하여 출력하기
		// < console >
		// 자 바 안 녕 하 세 요 ~ ~
//		Reader reader = new FileReader("C:/Temp/test.txt");
		Reader reader = new FileReader("C:/Temp/test2.txt", Charset.forName("UTF-8"));
		// -> 파일을 가져올 때 한글이 깨질 경우
		int a;
		while ((a = reader.read()) != -1) {
			System.out.print((char) a + " ");
		}

//		while(true) {
//			int a = reader.read();
//			if(a==-1) {
//				break;
//			}
//			System.out.print((char)a+" ");
//		}

		reader.close();
	}

}
