package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream1 {

	public static void main(String[] args) throws Exception {

		// FileInputStream�� �̿��ؼ� ���Ϸκ��� �����͸� �о�ð�
		// -> test.txt �������ϵ� InputStream���� ���� �� ����

		// throws Exception ����ó��
		InputStream is = new FileInputStream("C:/Temp/test.txt");

//		// 1. read() �޼ҵ� : 1byte�� �а� ���� ����Ʈ�� �������ִ� �޼ҵ�
//		int data = is.read();
//		System.out.println(data);	// 97 (int type�̶� UniCode�� ���)
//		System.out.println((char) data);	// abcde �� a ���ĺ� 1byte�� �о��
//		
//		data = is.read();
//		System.out.println(data);	// 98
//		System.out.println((char) data);	// abcde�� �� �������� read() �޼ҵ带 5�� ȣ��

		// => read() -> ���̻� �Է� ��Ʈ�����κ��� ����Ʈ�� ���� �� ���ٸ� -1�� ����
		// �̸� �̿��ؼ� ���� �� ���� ������ ����Ʈ���� �ݺ��ϵ��� �ݺ����� �ۼ�

		int readByte;
//		// ��� 1.
//		while( (readByte = is.read()) != -1 ) {
//			// readByte�� ���� ����Ʈ�� �����ϴµ� �� ���� -1�� �ƴ� ��쿡�� ��� �ݺ��ϱ�
//			System.out.println(readByte + " -> (Char) : " + (char)readByte);
//		}											// ���ڷ� ��µǵ��� charŸ������ ����Ÿ�Ժ�ȯ

		// ��� 2.
		while (true) { // ���� �ݺ��ϵ��� true�� ����
			readByte = is.read();
			// ���� readByte�� -1�� �Ǹ� �ݺ����� �����ϵ��� if�� �ۼ�
			if (readByte == -1) {
				break;
			}
			System.out.println(readByte + " -> (Char) : " + (char) readByte);
		}

	}

}
