package sec02.exam02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample1 {

	public static void main(String[] args) throws Exception {

		// -> FileInputStream ���� (�Ű��� test.txt ����)   
		// ==> InputStream Ÿ���� ���� is �� ����
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		// - InputStreamReader �� ������ �� �Ű������� is �� �����Ͽ� ������ ��
		//		Reader�� �����ϱ�
		Reader rea = new InputStreamReader(is);
		
		// - BufferedReader �� readLine( ) �޼ҵ带 �̿��Ͽ�
		// ���� ������ ���ڿ��� �Ʒ��� ���� ����ϱ� 
		// <console>
		// ��� 1: ���� ��� ���� ��Ʈ�� �߿�
		// ��� 2: BufferedReader �� �ִ� readLine( ) �޼ҵ�
		// ��� 3: => ���� ������ ���ڿ��� �д� �ſ� ���� �޼ҵ�
		// ��� 4: => Enter Ű ������ ��� ���ڿ��� �а� �����ϴ� �޼ҵ�
		BufferedReader br = new BufferedReader(rea);
		
		int cnt = 1;
		
		// 1.
		String data = "";
		
		while(true) {
			data = br.readLine();
			if(data == null) {
				break;
			}
			System.out.println("��� " + cnt++ + ": " + data);
		}
		
		// 2.
//		while(br.ready()) {	
//		// ready() : ���۰� ����ִ��� Ȯ���ϴ� �޼ҵ�
////			data = br.readLine();
////			System.out.println("��� " + cnt++ + ": " + data);
//			System.out.println("��� " + cnt++ + ": " + br.readLine());
//		}
		
		br.close(); rea.close(); is.close();
		
	}

}
