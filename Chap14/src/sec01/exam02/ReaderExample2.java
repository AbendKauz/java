package sec01.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
//		* ReaderExample2 - Ŭ����
//		  -> FileReader ���� (�Ű��� test2.txt ����) 
//		        ==> Reader Ÿ���� ���� reader �� ����
//		  -> read(char[ ] cbuf) �޼ҵ带 �̿��Ͽ� ����ϱ� : byte �迭�� ���̴� 3
//		  
//		< console > 
//		read() ȣ�� : 1  ||  ���� ����Ʈ �� : 3
//		�� ��   
//		read() ȣ�� : 2  ||  ���� ����Ʈ �� : 3
//		�� �� �� 
//		read() ȣ�� : 3  ||  ���� ����Ʈ �� : 3
//		�� �� ~ 
//		read() ȣ�� : 4  ||  ���� ����Ʈ �� : 1
//		~ 
//		���Ϸκ��� �о�� ������ : �ڹ� �ȳ��ϼ���~~

		Reader reader = new FileReader("C:/Temp/test2.txt");
		String str = "";
		char[] a = new char[3];
		int cnt = 1;
//		while(true) {
//			int b = reader.read(a);
//			if(b==-1) {
//				break;
//			}
//			System.out.println("read() ȣ�� : " + cnt++ + "  ||  ���� ����Ʈ �� :" + b);
//			for (int i = 0; i < b; i++) {
//				System.out.print(a[i]+" ");
//				str += a[i];
//			}
//			System.out.println();
//		}
//		System.out.println("���Ϸκ��� �о�� ������ : " + str);

		// String ������ ���
		while (true) {
			int b = reader.read(a);
			if (b == -1) {
				break;
			}
			str += new String(a, 0, b);
		}
		System.out.println(str);

		reader.close();
	}

}
