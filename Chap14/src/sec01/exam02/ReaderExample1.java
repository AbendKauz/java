package sec01.exam02;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		// * ReaderExample1 - Ŭ����
		// -> FileReader ���� (�Ű��� test2.txt ����)
		// ==> Reader Ÿ���� ���� reader �� ����
		// -> read( ) �޼ҵ带 �̿��Ͽ� ����ϱ�
		// < console >
		// �� �� �� �� �� �� �� ~ ~
//		Reader reader = new FileReader("C:/Temp/test.txt");
		Reader reader = new FileReader("C:/Temp/test2.txt", Charset.forName("UTF-8"));
		// -> ������ ������ �� �ѱ��� ���� ���
		int a;
		while ((a = reader.read()) != -1) {
			System.out.print((char) a + " ");
		}

//		while(true) {
//			int a = reader.read();
//			if(a==-1) {
//				break;
//			}
//			System.out.print((char)a+" ");
//		}

		reader.close();
	}

}
