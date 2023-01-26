package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {

		// * ���� ��� ���� ��Ʈ���� ����� ���, ������� ���� ����� ���� �ð� ���̸� Ȯ��
		
		long start = 0;	// ������ �ð��� ����
		long end = 0;	// ���� �ð��� ����
		
		// 1. ���۸� ������� ���� ���
		InputStream is1 = new FileInputStream("C:/Temp/14-2.jpg");	// �̹��� ����
		start = System.currentTimeMillis();	// �����͸� �б� �� ���۽ð� ���
		while(is1.read() != -1) {
			
		}
		end = System.currentTimeMillis();	// �����͸� ���� �� ���� �ð� ���
		
		System.out.println("���۸� ������� �ʾ��� �� : " + (end - start) + "ms");
		
		is1.close();
		
		// 2. ���۸� ����� ���
		InputStream is2 = new FileInputStream("C:/Temp/14-2.jpg");	// �̹��� ����
		BufferedInputStream bis = new BufferedInputStream(is2);
		
		start = System.currentTimeMillis();	// �����͸� �б� �� ���۽ð� ���
		while(bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();	// �����͸� ���� �� ���� �ð� ���
		
		System.out.println("���۸� ������� �� : " + (end - start) + "ms");
		
		bis.close();
		is2.close();
		
		// ���۸� ������� �� �ξ� ������ ������ �о���� ���� �� �� ��
		
	}

}
