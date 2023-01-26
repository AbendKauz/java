package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream2 {

	public static void main(String[] args) throws Exception {

		// * FileInputStream2- Ŭ����
		// -> FileInputStream ���� (�Ű��� test.txt ����)
		// ==> InputStream Ÿ���� ���� is �� ����
		InputStream is = new FileInputStream("C:/Temp/test.txt");

		// -> read(byte[ ] b) �޼ҵ带 �̿��Ͽ� ����ϱ� : byte �迭�� ���̴� 3
		// (���1, ��� 2 �Ѵ� Ǯ���)
		//
		// < console >
		// read() : 1 || ���� ����Ʈ �� : 3
		// a b c
		// read() : 2 || ���� ����Ʈ �� : 2
		// d e

		// ��� 1.
		int readByteNo; // read �޼ҵ尡 ���� ����Ʈ ���� ������ ����
		byte[] readBytes = new byte[3]; // ���� �����͸� ������ ����Ʈ �迭(���� 3)
		int cnt = 1;
		String data = ""; // �迭�� ����ִ� �����͵��� ���ڿ��� ������ ����

//		while( (readByteNo = is.read(readBytes)) != -1 ) {
//			System.out.println("read() : " + cnt++ + " || ���� ����Ʈ �� :  " + readByteNo);
//			
//			// 1. ���� �����͸� ���
////			for(int i = 0; i < readByteNo; i++) {
////				System.out.print((char)readBytes[i] + " ");
////			}
////			System.out.println();
//			
//			// 2. ���� �����͸� ���ڿ��� ���� �� ���
//			// String(byte[] bytes, int offset, int length) ������ ���
//			//	-> �迭�� offset �ε��� ��ġ���� length��ŭ String ��ü�� ����
//			
//			data += new String(readBytes, 0, readByteNo);	// ���� �����͸� ���ڿ��� ����
//		
//			// * ã���� �ϴ� �޼ҵ� Ŭ�� -> shift + F2 : API docs Ȩ������ ����
//			// * ã���� �ϴ� �޼ҵ� Ŭ�� -> F1 : API docs ȣ��
//		}
//		System.out.println("���Ϸκ��� �о�� ������ : " + data);

		// ��� 2.
		while (true) {
			if ((readByteNo = is.read(readBytes)) == -1) {
				break;
			}
			for (int i = 0; i < readByteNo; i++) {
				System.out.print((char) readBytes[i] + " ");
			}
			System.out.println();

		}
	}

}
