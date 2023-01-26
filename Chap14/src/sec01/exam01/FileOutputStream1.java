package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStream1 {

	public static void main(String[] args) throws Exception {

		// * OutputStream -> ����Ʈ ��� ��Ʈ��

		// FileOutputStream -> �����ڴ� ���ܸ� �߻��� �� �ִ� �����ڶ� ����ó���� �ʿ�
		// (�����ϰ� throws Exception���� ����ó�� ����)
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");

//		String a = "�ȳ��ϼ��� ����Ʈ �迭";	// 1.
//		String a = "�ȳ��ϼ��� ����Ʈ �迭222";	// 2.
		String a = "�ȳ��ϼ��� ����Ʈ �迭3333"; // 3.
		// getBytes() : String(���ڿ�)�� ���ڵ� -> byte �迭�� ��ȯ���ִ� �޼ҵ�
		byte[] data = a.getBytes(); // a���ڿ��� ����Ʈ �迭�� ��Ƶ�

		// 1. write(int a) �޼ҵ�
		// : 1byte�� ����ϴ� �޼ҵ�
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}

		// --> 1�� �޼ҵ�� 1byte�� ����ϱ� ������ for���� �ʿ���
		// 2�� �޼ҵ�� �Ű������� �� �迭�� ���� ����ϱ� ������ for���� �ʿ����

		// 2. write(byte[]) �޼ҵ�
		// : �Ű������� �־��� �迭 b�� ��� ����Ʈ�� ����ϴ� �޼ҵ�
//		os.write(data);

		// 3. write(byte[] b, int off, int len) �޼ҵ� -> �迭�� �Ϻθ� �����
		// : �Ű������� �־��� �迭 b[off] ���� len�� ������ ����Ʈ�� ���
		os.write(data, 11, 6);

		// flush() : ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ����ϴ� �޼ҵ�
		// -> write() �޼ҵ带 ȣ���ϸ� �����Ͱ� �ٷ� ��µǴ°� �ƴ϶�
		// �޸� ���ۿ� ���� ���� ���۰� �� ���� �Ǹ� �׶����� ����� ��
		// * �޸� ���۰� �� ���� ���� ��쿡�� ���������� �����͸� ����ϵ��� flush() �޼ҵ� ȣ��
		// ===> �����ϰ� �����͸� �����ϱ� ����
		os.flush(); // ��� ����Ʈ ���
		os.close(); // ��� ��Ʈ���� �ݴ� �޼ҵ�

	}

}
