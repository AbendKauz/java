package sec02.exam02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample1 {

	public static void main(String[] args) throws Exception {

		// -> FileInputStream 생성 (매개값 test.txt 파일)   
		// ==> InputStream 타입의 변수 is 에 대입
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		// - InputStreamReader 를 생성할 때 매개값으로 is 를 제공하여 생성한 후
		//		Reader에 대입하기
		Reader rea = new InputStreamReader(is);
		
		// - BufferedReader 의 readLine( ) 메소드를 이용하여
		// 라인 단위로 문자열을 아래와 같이 출력하기 
		// <console>
		// 출력 1: 성능 향상 보조 스트림 중에
		// 출력 2: BufferedReader 에 있는 readLine( ) 메소드
		// 출력 3: => 라인 단위로 문자열을 읽는 매우 편리한 메소드
		// 출력 4: => Enter 키 이전의 모든 문자열을 읽고 리턴하는 메소드
		BufferedReader br = new BufferedReader(rea);
		
		int cnt = 1;
		
		// 1.
		String data = "";
		
		while(true) {
			data = br.readLine();
			if(data == null) {
				break;
			}
			System.out.println("출력 " + cnt++ + ": " + data);
		}
		
		// 2.
//		while(br.ready()) {	
//		// ready() : 버퍼가 비어있는지 확인하는 메소드
////			data = br.readLine();
////			System.out.println("출력 " + cnt++ + ": " + data);
//			System.out.println("출력 " + cnt++ + ": " + br.readLine());
//		}
		
		br.close(); rea.close(); is.close();
		
	}

}
