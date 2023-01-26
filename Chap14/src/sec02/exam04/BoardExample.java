package sec02.exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class BoardExample {

	public static void main(String[] args) throws Exception {

		writeList();	// list�� ���Ͽ� ����
		
		// ���Ͽ� ����� list�� �б�
		List<Board> list = readList();
		
		// Q1) list -> å��ȣ, ����, ���� ���
		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent());
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getBno() + ", " + list.get(i).getTitle() + ", " + list.get(i).getContent());
//		}
		
	}

	private static void writeList() throws Exception {

		// Board ��ü Ÿ�� ArrayList ���� -> list
		List<Board> list = new ArrayList<>();
		
		// list�� Board��ü�� �߰�
		// 1, ����1, ����1
		// 2, ����2, ����2
		// 3, ����3, ����3
		list.add(new Board(1, "����1", "����1"));
		list.add(new Board(2, "����2", "����2"));
		list.add(new Board(3, "����3", "����3"));
		
		// ��ü ��� ��Ʈ���� �̿��ؼ� -> ���α׷����� ���Ϸ� ��ü�� ���
		//									(C:/Temp/board.db)
		OutputStream os = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(list);
		
//		for(int i = 0; i < list.size(); i++) {
//			oos.writeObject(list.get(i));
//		}
		
		oos.flush(); oos.close(); os.close();
		
	}
	
	// ��ü �Է� ���� ��Ʈ���� �̿��ؼ� list �б� -> ���Ͽ��� ���α׷����� ��ü�� �о����
	private static List<Board> readList() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		// readObject() -> �Է� ��Ʈ������ ���� ����Ʈ�� ������ȭ�ؼ� ��ü�� �ٽ� �����ؼ� ������
		//					( ������ȭ : ����Ʈ �迭�� �ٽ� ��ü�� �����ϴ� ��)
		//				=> ���� Ÿ���� ObjectŸ�� // ���� Ÿ������ ����Ÿ�Ժ�ȯ�� �ؾ� ��
		List<Board> list = (List<Board>) ois.readObject();
		ois.close(); is.close();
		
		return list;
	}


}
