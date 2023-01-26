package sec02.exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class DataStream {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/type.dat");
		DataOutputStream dos = new DataOutputStream(os);	// 보조스트림 연결
		
		dos.writeUTF("홍길동");	// 기본타입은 아니지만 문자를 출력하고 싶다면 writeUTF() 메소드 사용
		dos.writeDouble(95.4);
		dos.writeInt(47);
		
		dos.writeUTF("박길동");
		dos.writeDouble(90.4);
		dos.writeInt(27);
		
		dos.flush();	// 데이터 완전하게 전송
		dos.close(); os.close();
		
		
		////////////////////////////////////////////////////////////////////////////////
		// type.dat에 들어간 데이터 확인하기
		// <console> 홍길동 : 95.4 : 47
		
		InputStream is = new FileInputStream("C:/Temp/type.dat");
		DataInputStream dis = new DataInputStream(is);
		
//		System.out.println(dis.readUTF() + " : " + dis.readDouble() + " : " + dis.readInt());
		
		for(int i = 0; i < 2; i++) {
			String str = dis.readUTF();
			double dou = dis.readDouble();
			int num = dis.readInt();
			System.out.println(str + " : " + dou + " : " + num);
		}
		
		dis.close(); is.close();
		
	}
	
}
