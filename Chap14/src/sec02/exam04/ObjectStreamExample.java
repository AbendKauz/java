package sec02.exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {

		// * 객체 입출력 보조 스트림
		// - ObjectInputStream
		//	: 객체를 역직렬화하는 역할 -> InputStream에 연결을 해서 객체를 읽을 때 사용
		//		* 역직렬화 -> 바이트 배열을 다시 객체로 복원하는 것 
		//	: readObject()
		//		-> 입력스트림에서 읽은 바이트를 역직렬화 해서 객체를 다시 복원해서 리턴
		//			* 리턴타입은 Object타입 -> 다시 사용하려면 원래의 타입으로 강제타입변환 필요함
		
		// ObjectInputStream
		//	: 객체를 직렬화하는 역할 -> OutputStream에 연결을 해서 객체를 출력할 때 사용
		//		* 직렬화 -> 객체를 바이트 배열로 만드는 것
		//	: writeObject()
		//		-> 객체를 직렬화해서 출력 스트림으로 보냄
		
		
		OutputStream os = new FileOutputStream("C:/Temp/Object.dat");
		// 객체 출력 보조 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		// writeObject() => 객체를 직렬화해서 출력 스트림으로 보냄
		oos.writeObject(new int[] {1, 2, 3, 4, 5});
		oos.writeObject(new String("자바"));
		
		oos.flush(); oos.close(); os.close();
		
		///////////////////////////////////////////////////////////////////////////
		// Object.dat에 들어간 데이터 읽어오기
		// <console>
		// <<< int 타입의 배열 객체 확인하기 >>>
		// arr[0] : 1
		// arr[1] : 2
		// arr[2] : 3
		// arr[3] : 4
		// arr[4] : 5
		// <<< String 객체 확인하기 >>>
		// 자바
		InputStream is = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		// * 파일에 객체를 저장할 때의 순서와 읽을 때의 순서는 같아야 함
		// * readObject() : 리턴타입이 Object타입
		//					=> 원래 타입으로 강제타입변환을 해야함
		int[] arr = (int[]) ois.readObject();
		String str = (String)ois.readObject();
		
		ois.close(); is.close();
		
		System.out.println("<<< int 타입의 배열 객체 확인하기 >>>");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("<<< String 객체 확인하기 >>>");
		System.out.println(str);
		
	}

}
