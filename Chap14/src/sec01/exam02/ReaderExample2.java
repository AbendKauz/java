package sec01.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
//		* ReaderExample2 - 클래스
//		  -> FileReader 생성 (매개값 test2.txt 파일) 
//		        ==> Reader 타입의 변수 reader 에 대입
//		  -> read(char[ ] cbuf) 메소드를 이용하여 출력하기 : byte 배열의 길이는 3
//		  
//		< console > 
//		read() 호출 : 1  ||  읽은 바이트 수 : 3
//		자 바   
//		read() 호출 : 2  ||  읽은 바이트 수 : 3
//		안 녕 하 
//		read() 호출 : 3  ||  읽은 바이트 수 : 3
//		세 요 ~ 
//		read() 호출 : 4  ||  읽은 바이트 수 : 1
//		~ 
//		파일로부터 읽어온 데이터 : 자바 안녕하세요~~

		Reader reader = new FileReader("C:/Temp/test2.txt");
		String str = "";
		char[] a = new char[3];
		int cnt = 1;
//		while(true) {
//			int b = reader.read(a);
//			if(b==-1) {
//				break;
//			}
//			System.out.println("read() 호출 : " + cnt++ + "  ||  읽은 바이트 수 :" + b);
//			for (int i = 0; i < b; i++) {
//				System.out.print(a[i]+" ");
//				str += a[i];
//			}
//			System.out.println();
//		}
//		System.out.println("파일로부터 읽어온 데이터 : " + str);

		// String 생성자 사용
		while (true) {
			int b = reader.read(a);
			if (b == -1) {
				break;
			}
			str += new String(a, 0, b);
		}
		System.out.println(str);

		reader.close();
	}

}
