package sec01.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream3 {

	public static void main(String[] args) throws Exception {
//		* FileInputStream3- 클래스
//		  -> FileInputStream 생성 (매개값 test.txt 파일) 
//		        ==> InputStream 타입의 변수 is 에 대입
//		  -> read(byte[ ] b,  int off, int len) 메소드를 이용하여 출력하기
//		      : byte 배열의 길이는 8
//		      (방법1, 방법 2  둘 다 풀어보기)

		InputStream is = new FileInputStream("C:/Temp/test.txt");
		byte[] a = new byte[8];
		int b;
		int cnt = 1;
		String str = "";
//		while((b = is.read(a, 2, 3))!=-1) {
//			System.out.println("read( ) 메소드 호출 "+cnt++);
//			for (int i = 0; i < a.length; i++) {
//				System.out.println("arr["+i+"] : " + a[i]);
//			}
//			
//			System.out.println("============================");
//		}

//		while((b = is.read(a, 0, 3))!=-1) {
//			for (int i = 0; i < b; i++) {
//				if(a[i]!=0) {
//					str += (char)a[i];
//				}
//			}
//		}
//		System.out.println(str);

//		while(true) {
//			b = is.read(a, 2, 3);
//			if(b==-1) {
//				break;
//			}
//			System.out.println("read( ) 메소드 호출 "+cnt++);
//			for (int i = 0; i < a.length; i++) {
//				System.out.println("arr["+i+"] : " + a[i]);
//			}
//			System.out.println("============================");
//		}

		// String 사용하기
		while (true) {
			b = is.read(a, 2, 3);
			if (b == -1) {
				break;
			}
			str += new String(a, 2, b);
		}
		System.out.println(str);
//		< console > 
//		read( ) 메소드 호출 1
//		arr[0] : 0
//		arr[1] : 0
//		arr[2] : 97
//		arr[3] : 98
//		arr[4] : 99
//		arr[5] : 0
//		arr[6] : 0
//		arr[7] : 0
//		============================
//		read( ) 메소드 호출 2
//		arr[0] : 0
//		arr[1] : 0
//		arr[2] : 100
//		arr[3] : 101
//		arr[4] : 99
//		arr[5] : 0
//		arr[6] : 0
//		arr[7] : 0
//		============================
//		-------------------------------------------------------------------------------------
//		Q1) 읽어온 데이터를 String 타입의 data 에 저장해서 출력하기
//		< console > 
//		읽어온 데이터 : abcde

		is.close(); // 입력스트림은 쓰고나면 꼭 닫아주자
	}

}
