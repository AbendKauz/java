package sec02.exam03;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintExample {

	public static void main(String[] args) throws Exception {
		
		// * PrintStream, PrintWriter
		// -> println(), print()메소드를 가지고 있는 보조 스트림
		// ==> System.out(PrintStream 타입)
		
		// * 차이
		// - PrintStream : 바이트 기반 출력 스트림과 연결
		// - PrintWriter : 문자 기반 출력 스트림과 연결
		
		// Q1) test.txt 파일에 아래 2줄의 문장이 저장되는 코드 작성
		// [프린터 보조 스트림]
		// 데이터를 출력합니다.
		
//		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//		PrintStream ps = new PrintStream(os);
//		
//		ps.println("[프린터 보조 스트림]");
//		ps.println("데이터를 출력합니다.");
//		
//		ps.flush(); ps.close(); os.close();
		
		Writer wri = new FileWriter("C:/Temp/test.txt");
		PrintWriter pw = new PrintWriter(wri);
		
		pw.print("[프린터 보조 스트림]\n데이터를 출력합니다.\n확인!!!");
		
		pw.flush(); pw.close(); wri.close();
		
	}

}
