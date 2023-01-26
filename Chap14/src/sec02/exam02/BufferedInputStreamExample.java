package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {

		// * 성능 향상 보조 스트림을 사용한 경우, 사용하지 않은 경우의 실행 시간 차이를 확인
		
		long start = 0;	// 시작한 시간을 저장
		long end = 0;	// 끝난 시간을 저장
		
		// 1. 버퍼를 사용하지 않은 경우
		InputStream is1 = new FileInputStream("C:/Temp/14-2.jpg");	// 이미지 파일
		start = System.currentTimeMillis();	// 데이터를 읽기 전 시작시간 기록
		while(is1.read() != -1) {
			
		}
		end = System.currentTimeMillis();	// 데이터를 읽은 후 끝난 시간 기록
		
		System.out.println("버퍼를 사용하지 않았을 때 : " + (end - start) + "ms");
		
		is1.close();
		
		// 2. 버퍼를 사용한 경우
		InputStream is2 = new FileInputStream("C:/Temp/14-2.jpg");	// 이미지 파일
		BufferedInputStream bis = new BufferedInputStream(is2);
		
		start = System.currentTimeMillis();	// 데이터를 읽기 전 시작시간 기록
		while(bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();	// 데이터를 읽은 후 끝난 시간 기록
		
		System.out.println("버퍼를 사용했을 때 : " + (end - start) + "ms");
		
		bis.close();
		is2.close();
		
		// 버퍼를 사용했을 때 훨씬 빠르게 파일을 읽어오는 것을 볼 수 있
		
	}

}
