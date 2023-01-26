package sec02.exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {

		// * ��ü ����� ���� ��Ʈ��
		// - ObjectInputStream
		//	: ��ü�� ������ȭ�ϴ� ���� -> InputStream�� ������ �ؼ� ��ü�� ���� �� ���
		//		* ������ȭ -> ����Ʈ �迭�� �ٽ� ��ü�� �����ϴ� �� 
		//	: readObject()
		//		-> �Է½�Ʈ������ ���� ����Ʈ�� ������ȭ �ؼ� ��ü�� �ٽ� �����ؼ� ����
		//			* ����Ÿ���� ObjectŸ�� -> �ٽ� ����Ϸ��� ������ Ÿ������ ����Ÿ�Ժ�ȯ �ʿ���
		
		// ObjectInputStream
		//	: ��ü�� ����ȭ�ϴ� ���� -> OutputStream�� ������ �ؼ� ��ü�� ����� �� ���
		//		* ����ȭ -> ��ü�� ����Ʈ �迭�� ����� ��
		//	: writeObject()
		//		-> ��ü�� ����ȭ�ؼ� ��� ��Ʈ������ ����
		
		
		OutputStream os = new FileOutputStream("C:/Temp/Object.dat");
		// ��ü ��� ���� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		// writeObject() => ��ü�� ����ȭ�ؼ� ��� ��Ʈ������ ����
		oos.writeObject(new int[] {1, 2, 3, 4, 5});
		oos.writeObject(new String("�ڹ�"));
		
		oos.flush(); oos.close(); os.close();
		
		///////////////////////////////////////////////////////////////////////////
		// Object.dat�� �� ������ �о����
		// <console>
		// <<< int Ÿ���� �迭 ��ü Ȯ���ϱ� >>>
		// arr[0] : 1
		// arr[1] : 2
		// arr[2] : 3
		// arr[3] : 4
		// arr[4] : 5
		// <<< String ��ü Ȯ���ϱ� >>>
		// �ڹ�
		InputStream is = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		// * ���Ͽ� ��ü�� ������ ���� ������ ���� ���� ������ ���ƾ� ��
		// * readObject() : ����Ÿ���� ObjectŸ��
		//					=> ���� Ÿ������ ����Ÿ�Ժ�ȯ�� �ؾ���
		int[] arr = (int[]) ois.readObject();
		String str = (String)ois.readObject();
		
		ois.close(); is.close();
		
		System.out.println("<<< int Ÿ���� �迭 ��ü Ȯ���ϱ� >>>");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("<<< String ��ü Ȯ���ϱ� >>>");
		System.out.println(str);
		
	}

}
