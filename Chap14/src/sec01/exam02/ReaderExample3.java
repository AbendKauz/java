package sec01.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception {
//		* ReaderExample3 - Ŭ����
//		  -> FileReader ���� (�Ű��� test2.txt ����) 
//		        ==> Reader Ÿ���� ���� reader �� ����
//		  -> read(char[ ] cbuf, int off, int len) �޼ҵ带 �̿��Ͽ� ����ϱ� : char �迭�� ���̴� 5
//		  
//		< console >    -> _�� ������ �ǹ�
//		_�ڹ�__
//		-------------------------------------------------------------------------------------
//		Q1) �о�� �����͸� String Ÿ���� data �� �����ؼ� ����ϱ�
//
//		< console > 
//		�о�� ������ : �ڹ� �ȳ��ϼ���~~

		Reader reader = new FileReader("C:/Temp/test2.txt");
		char[] arr = new char[5];
//		int a = reader.read(arr, 1, 2);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}

//		String str = "";
//		while(true) {
//			int a = reader.read(arr);
//			if(a==-1) { break; }
//			str += new String(arr, 0, a);
//		}
//		System.out.println(str);

//		String str = "";
//		int a;
//		while((a=reader.read(arr, 0, arr.length))!=-1) {
//			for (int i = 0; i < a; i++) {
//				str += arr[i];
//			}
//		}
//		System.out.println(str);

		reader.close();

	}

}
