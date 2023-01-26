package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStream1 {

	public static void main(String[] args) throws Exception {

		// * OutputStream -> 바이트 출력 스트림

		// FileOutputStream -> 생성자는 예외를 발생할 수 있는 생성자라서 예외처리가 필요
		// (간단하게 throws Exception으로 예외처리 해줌)
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");

//		String a = "안녕하세요 바이트 배열";	// 1.
//		String a = "안녕하세요 바이트 배열222";	// 2.
		String a = "안녕하세요 바이트 배열3333"; // 3.
		// getBytes() : String(문자열)을 인코딩 -> byte 배열로 변환해주는 메소드
		byte[] data = a.getBytes(); // a문자열을 바이트 배열에 담아둠

		// 1. write(int a) 메소드
		// : 1byte를 출력하는 메소드
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}

		// --> 1번 메소드는 1byte씩 출력하기 때문에 for문이 필요함
		// 2번 메소드는 매개값으로 준 배열을 전부 출력하기 때문에 for문이 필요없음

		// 2. write(byte[]) 메소드
		// : 매개값으로 주어진 배열 b의 모든 바이트를 출력하는 메소드
//		os.write(data);

		// 3. write(byte[] b, int off, int len) 메소드 -> 배열의 일부를 출력함
		// : 매개값으로 주어진 배열 b[off] 부터 len개 까지의 바이트를 출력
		os.write(data, 11, 6);

		// flush() : 출력 버퍼에 잔류하는 모든 바이트를 출력하는 메소드
		// -> write() 메소드를 호출하면 데이터가 바로 출력되는게 아니라
		// 메모리 버퍼에 쌓인 다음 버퍼가 꽉 차게 되면 그때서야 출력이 됨
		// * 메모리 버퍼가 꽉 차지 않을 경우에는 강제적으로 데이터를 출력하도록 flush() 메소드 호출
		// ===> 완전하게 데이터를 전송하기 위함
		os.flush(); // 모든 바이트 출력
		os.close(); // 출력 스트림을 닫는 메소드

	}

}
