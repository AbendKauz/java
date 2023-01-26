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

		writeList();	// list를 파일에 저장
		
		// 파일에 저장된 list를 읽기
		List<Board> list = readList();
		
		// Q1) list -> 책번호, 제목, 내용 출력
		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent());
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getBno() + ", " + list.get(i).getTitle() + ", " + list.get(i).getContent());
//		}
		
	}

	private static void writeList() throws Exception {

		// Board 객체 타입 ArrayList 생성 -> list
		List<Board> list = new ArrayList<>();
		
		// list에 Board객체를 추가
		// 1, 제목1, 내용1
		// 2, 제목2, 내용2
		// 3, 제목3, 내용3
		list.add(new Board(1, "제목1", "내용1"));
		list.add(new Board(2, "제목2", "내용2"));
		list.add(new Board(3, "제목3", "내용3"));
		
		// 객체 출력 스트림을 이용해서 -> 프로그램에서 파일로 객체를 출력
		//									(C:/Temp/board.db)
		OutputStream os = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(list);
		
//		for(int i = 0; i < list.size(); i++) {
//			oos.writeObject(list.get(i));
//		}
		
		oos.flush(); oos.close(); os.close();
		
	}
	
	// 객체 입력 보조 스트림을 이용해서 list 읽기 -> 파일에서 프로그램으로 객체를 읽어오기
	private static List<Board> readList() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		// readObject() -> 입력 스트림에서 읽은 바이트를 역직렬화해서 객체로 다시 복원해서 리턴함
		//					( 역직렬화 : 바이트 배열을 다시 객체로 복원하는 것)
		//				=> 리턴 타입은 Object타입 // 원래 타입으로 강제타입변환을 해야 함
		List<Board> list = (List<Board>) ois.readObject();
		ois.close(); is.close();
		
		return list;
	}


}
