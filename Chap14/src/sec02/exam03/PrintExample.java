package sec02.exam03;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintExample {

	public static void main(String[] args) throws Exception {
		
		// * PrintStream, PrintWriter
		// -> println(), print()�޼ҵ带 ������ �ִ� ���� ��Ʈ��
		// ==> System.out(PrintStream Ÿ��)
		
		// * ����
		// - PrintStream : ����Ʈ ��� ��� ��Ʈ���� ����
		// - PrintWriter : ���� ��� ��� ��Ʈ���� ����
		
		// Q1) test.txt ���Ͽ� �Ʒ� 2���� ������ ����Ǵ� �ڵ� �ۼ�
		// [������ ���� ��Ʈ��]
		// �����͸� ����մϴ�.
		
//		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//		PrintStream ps = new PrintStream(os);
//		
//		ps.println("[������ ���� ��Ʈ��]");
//		ps.println("�����͸� ����մϴ�.");
//		
//		ps.flush(); ps.close(); os.close();
		
		Writer wri = new FileWriter("C:/Temp/test.txt");
		PrintWriter pw = new PrintWriter(wri);
		
		pw.print("[������ ���� ��Ʈ��]\n�����͸� ����մϴ�.\nȮ��!!!");
		
		pw.flush(); pw.close(); wri.close();
		
	}

}
