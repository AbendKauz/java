package sec01.exam02;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample1 {

	public static void main(String[] args) throws Exception {

		// toCharArray() => 문자열을 한 글자씩 쪼개서 이를 char 타입의 배열에 넣어주는 메소드 (리턴값이 char)
//		char[] arr = "혼자공부하는자바".toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}

//		* WriterExample- 클래스
//		  -> FileWriter생성 (매개값 test.txt 파일) 
//		        ==> Writer 타입의 변수 writer 에 대입
//		  -> char[ ] 배열 data 만들기 
//		      :  String.toCharArray( ) 메소드 활용
//		       -> 문자열을 한글자씩 쪼개서 char 타입의 배열에 넣어주는 메소드
//		         ex ) "홍길동".toCharArray( );
//		  -> 출력하기
//		     1. write( int c ) 메소드를 이용하여 문자 보내기
//		     2. write( char[ ] cbuf ) 메소드를 이용하여 문자 보내기
//		     3. write(char[] cbuf, int off, int len) 메소드를 이용하여 문자 "길동" 보내기

		Writer writer = new FileWriter("C:/Temp/test4.txt");
		// 1.
//		char[] data = "홍길동".toCharArray();
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		// 2.
//		writer.write(data);
		// 3.
//		writer.write(data, 1, 2);

//		* WriterExample- 클래스
//		  -> FileWriter생성 (매개값 test.txt 파일) 
//		        ==> Writer 타입의 변수 writer 에 대입
//		  -> 키보드로 입력받아 입력 받은 데이터를 test.txt 파일로
//		      출력해라  ( String.toCharArray( )  이용)
//		<console>
//		문자 입력 : 입력한 문자를 test.txt 파일에 출력해라~~!!!

//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자 입력 : ");
//		char[] data = sc.next().toCharArray();
//		// 1.
////		for (int i = 0; i < data.length; i++) {
////			writer.write(data[i]);
////		}
//		// 2.
////		writer.write(data);
//		// 3.
//		writer.write(data, 0, data.length);

		// * writer(String str), write(String str, int off, int len) 메소드
		// => 문자열을 좀 더 쉽게 보내기 위해서 제공해주는 메소드
		String data = "안녕 자바 프로그램";
//		writer.write(data);
		writer.write(data, 3, 2);

		writer.flush();
		writer.close();
	}

}
