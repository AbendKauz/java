package sec01.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception {
//		* ReaderExample3 - 클래스
//		  -> FileReader 생성 (매개값 test2.txt 파일) 
//		        ==> Reader 타입의 변수 reader 에 대입
//		  -> read(char[ ] cbuf, int off, int len) 메소드를 이용하여 출력하기 : char 배열의 길이는 5
//		  
//		< console >    -> _는 공백을 의미
//		_자바__
//		-------------------------------------------------------------------------------------
//		Q1) 읽어온 데이터를 String 타입의 data 에 저장해서 출력하기
//
//		< console > 
//		읽어온 데이터 : 자바 안녕하세요~~

		Reader reader = new FileReader("C:/Temp/test2.txt");
		char[] arr = new char[5];
//		int a = reader.read(arr, 1, 2);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}

//		String str = "";
//		while(true) {
//			int a = reader.read(arr);
//			if(a==-1) { break; }
//			str += new String(arr, 0, a);
//		}
//		System.out.println(str);

//		String str = "";
//		int a;
//		while((a=reader.read(arr, 0, arr.length))!=-1) {
//			for (int i = 0; i < a; i++) {
//				str += arr[i];
//			}
//		}
//		System.out.println(str);

		reader.close();

	}

}
