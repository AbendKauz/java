package sec01.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream3 {

	public static void main(String[] args) throws Exception {
//		* FileInputStream3- Ŭ����
//		  -> FileInputStream ���� (�Ű��� test.txt ����) 
//		        ==> InputStream Ÿ���� ���� is �� ����
//		  -> read(byte[ ] b,  int off, int len) �޼ҵ带 �̿��Ͽ� ����ϱ�
//		      : byte �迭�� ���̴� 8
//		      (���1, ��� 2  �� �� Ǯ���)

		InputStream is = new FileInputStream("C:/Temp/test.txt");
		byte[] a = new byte[8];
		int b;
		int cnt = 1;
		String str = "";
//		while((b = is.read(a, 2, 3))!=-1) {
//			System.out.println("read( ) �޼ҵ� ȣ�� "+cnt++);
//			for (int i = 0; i < a.length; i++) {
//				System.out.println("arr["+i+"] : " + a[i]);
//			}
//			
//			System.out.println("============================");
//		}

//		while((b = is.read(a, 0, 3))!=-1) {
//			for (int i = 0; i < b; i++) {
//				if(a[i]!=0) {
//					str += (char)a[i];
//				}
//			}
//		}
//		System.out.println(str);

//		while(true) {
//			b = is.read(a, 2, 3);
//			if(b==-1) {
//				break;
//			}
//			System.out.println("read( ) �޼ҵ� ȣ�� "+cnt++);
//			for (int i = 0; i < a.length; i++) {
//				System.out.println("arr["+i+"] : " + a[i]);
//			}
//			System.out.println("============================");
//		}

		// String ����ϱ�
		while (true) {
			b = is.read(a, 2, 3);
			if (b == -1) {
				break;
			}
			str += new String(a, 2, b);
		}
		System.out.println(str);
//		< console > 
//		read( ) �޼ҵ� ȣ�� 1
//		arr[0] : 0
//		arr[1] : 0
//		arr[2] : 97
//		arr[3] : 98
//		arr[4] : 99
//		arr[5] : 0
//		arr[6] : 0
//		arr[7] : 0
//		============================
//		read( ) �޼ҵ� ȣ�� 2
//		arr[0] : 0
//		arr[1] : 0
//		arr[2] : 100
//		arr[3] : 101
//		arr[4] : 99
//		arr[5] : 0
//		arr[6] : 0
//		arr[7] : 0
//		============================
//		-------------------------------------------------------------------------------------
//		Q1) �о�� �����͸� String Ÿ���� data �� �����ؼ� ����ϱ�
//		< console > 
//		�о�� ������ : abcde

		is.close(); // �Է½�Ʈ���� ������ �� �ݾ�����
	}

}
