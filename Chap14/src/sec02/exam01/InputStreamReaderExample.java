package sec02.exam01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {

		
		// System.in : �ַܼκ��� �����͸� ���� -> ���ڵ�����
		// InputStream -> ����Ʈ ��� �Է� ��Ʈ��
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);
		// InputStreamReader ������Ʈ��
		//	: ����Ʈ ��� ��Ʈ���� ���ڱ�� ��Ʈ������ ��ȯ
		//	: Reader�� ��ӹ޾ұ� ������ Reader�� ������ ����
		
		// read()�� -1�� �����ϴ� ��
		//	-> �ֿܼ��� Ctrl + Z�� ������ -1�� �����ؼ� �ݺ����� ������
		int readCharNo;	// ���� ���� ���� ������ ����
		char[] arr = new char[100];	// ���� �����͸� ������ ����
		while( (readCharNo = reader.read(arr)) != -1 ) {
			String data = new String(arr, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();	// ��Ʈ���� ����
		is.close();
		
	}

}
