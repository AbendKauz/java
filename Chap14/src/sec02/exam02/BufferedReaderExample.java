package sec02.exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {

		// BufferedReader ������Ʈ��
		//	-> readLine() : ���� ������ ���ڿ��� �д� �޼ҵ�
		
		InputStream is = System.in;
		Reader rea = new InputStreamReader(is);
		
		// ��������� �����ִ� BufferedReader ������Ʈ�� ����
		BufferedReader br = new BufferedReader(rea);
		
		System.out.print("�Է� : ");
		String lineString = br.readLine();	// ����ó�� �ʿ�
		System.out.println("��� : " + lineString);
		
		br.close(); rea.close(); is.close();
	}

}
