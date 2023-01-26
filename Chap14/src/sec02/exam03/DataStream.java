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
		DataOutputStream dos = new DataOutputStream(os);	// ������Ʈ�� ����
		
		dos.writeUTF("ȫ�浿");	// �⺻Ÿ���� �ƴ����� ���ڸ� ����ϰ� �ʹٸ� writeUTF() �޼ҵ� ���
		dos.writeDouble(95.4);
		dos.writeInt(47);
		
		dos.writeUTF("�ڱ浿");
		dos.writeDouble(90.4);
		dos.writeInt(27);
		
		dos.flush();	// ������ �����ϰ� ����
		dos.close(); os.close();
		
		
		////////////////////////////////////////////////////////////////////////////////
		// type.dat�� �� ������ Ȯ���ϱ�
		// <console> ȫ�浿 : 95.4 : 47
		
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
