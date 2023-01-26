package sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		// -> InputStreamReaderExample �� ������ ���� �������� 
		// �� ���� �ۼ��غ���
		// (�ַܼκ��� ������ �Է¹ޱ�)

		InputStream is = System.in;
		Reader re = new InputStreamReader(is);
		
		int no;
		char[] arr = new char[100];
		String data = "";
		while( (no = re.read(arr)) != -1 ) {
			data += new String(arr, 0, no);
			System.out.println(data);
			fileWrite(data);
		}
		re.close();
		is.close();
		
	}
	
	// -> fileWrite(String data) : String Ÿ���� �Ű������� 1���� �޼ҵ带 �����ϱ�
	// - FileOutputStream ���� (�Ű��� test.txt ����) 
	// ==> OutputStream Ÿ���� ���� os �� ����
	// - OutputStreamWriter �� ������ �� �Ű������� os �� �����Ͽ� ������ ��
	// Writer �� �����ϱ�
	// - ������ �Է� ���� �����͸� test.txt ���Ͽ� ����ϱ�
	
	public static void fileWrite(String data) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os);
		writer.write(data);
		writer.flush();
		writer.close();
		os.close();
	}
}
