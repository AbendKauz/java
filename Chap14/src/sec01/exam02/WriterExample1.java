package sec01.exam02;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample1 {

	public static void main(String[] args) throws Exception {

		// toCharArray() => ���ڿ��� �� ���ھ� �ɰ��� �̸� char Ÿ���� �迭�� �־��ִ� �޼ҵ� (���ϰ��� char)
//		char[] arr = "ȥ�ڰ����ϴ��ڹ�".toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}

//		* WriterExample- Ŭ����
//		  -> FileWriter���� (�Ű��� test.txt ����) 
//		        ==> Writer Ÿ���� ���� writer �� ����
//		  -> char[ ] �迭 data ����� 
//		      :  String.toCharArray( ) �޼ҵ� Ȱ��
//		       -> ���ڿ��� �ѱ��ھ� �ɰ��� char Ÿ���� �迭�� �־��ִ� �޼ҵ�
//		         ex ) "ȫ�浿".toCharArray( );
//		  -> ����ϱ�
//		     1. write( int c ) �޼ҵ带 �̿��Ͽ� ���� ������
//		     2. write( char[ ] cbuf ) �޼ҵ带 �̿��Ͽ� ���� ������
//		     3. write(char[] cbuf, int off, int len) �޼ҵ带 �̿��Ͽ� ���� "�浿" ������

		Writer writer = new FileWriter("C:/Temp/test4.txt");
		// 1.
//		char[] data = "ȫ�浿".toCharArray();
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		// 2.
//		writer.write(data);
		// 3.
//		writer.write(data, 1, 2);

//		* WriterExample- Ŭ����
//		  -> FileWriter���� (�Ű��� test.txt ����) 
//		        ==> Writer Ÿ���� ���� writer �� ����
//		  -> Ű����� �Է¹޾� �Է� ���� �����͸� test.txt ���Ϸ�
//		      ����ض�  ( String.toCharArray( )  �̿�)
//		<console>
//		���� �Է� : �Է��� ���ڸ� test.txt ���Ͽ� ����ض�~~!!!

//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		char[] data = sc.next().toCharArray();
//		// 1.
////		for (int i = 0; i < data.length; i++) {
////			writer.write(data[i]);
////		}
//		// 2.
////		writer.write(data);
//		// 3.
//		writer.write(data, 0, data.length);

		// * writer(String str), write(String str, int off, int len) �޼ҵ�
		// => ���ڿ��� �� �� ���� ������ ���ؼ� �������ִ� �޼ҵ�
		String data = "�ȳ� �ڹ� ���α׷�";
//		writer.write(data);
		writer.write(data, 3, 2);

		writer.flush();
		writer.close();
	}

}
