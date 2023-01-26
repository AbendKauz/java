package sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		// -> InputStreamReaderExample 의 내용을 복습 차원에서 
		// 안 보고 작성해보기
		// (콘솔로부터 데이터 입력받기)

		InputStream is = System.in;
		Reader re = new InputStreamReader(is);
		
		int no;
		char[] arr = new char[100];
		String data = "";
		while( (no = re.read(arr)) != -1 ) {
			data += new String(arr, 0, no);
			System.out.println(data);
			fileWrite(data);
		}
		re.close();
		is.close();
		
	}
	
	// -> fileWrite(String data) : String 타입의 매개변수가 1개인 메소드를 생성하기
	// - FileOutputStream 생성 (매개값 test.txt 파일) 
	// ==> OutputStream 타입의 변수 os 에 대입
	// - OutputStreamWriter 를 생성할 때 매개값으로 os 를 제공하여 생성한 후
	// Writer 에 대입하기
	// - 위에서 입력 받은 데이터를 test.txt 파일에 출력하기
	
	public static void fileWrite(String data) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os);
		writer.write(data);
		writer.flush();
		writer.close();
		os.close();
	}
}
