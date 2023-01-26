package sec01.exam03;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// -> Board 객체를 저장하는 Vector 생성 // 변수명은 list
		// -> list에 객체 추가
		// - "제목1", "내용1", "글쓴이1" 값을 가진 Board 객체 추가
		// - "제목2", "내용2", "글쓴이2" 값을 가진 Board 객체 추가
		// - "제목3", "내용3", "글쓴이3" 값을 가진 Board 객체 추가
		// - "제목4", "내용4", "글쓴이4" 값을 가진 Board 객체 추가
		// - "제목5", "내용5", "글쓴이5" 값을 가진 Board 객체 추가
		// -> 아래와 같이 list 의 모든 객체 출력
		// <console>
		// 제목1 내용1 글쓴이1
		// 제목2 내용2 글쓴이2
		// 제목3 내용3 글쓴이3
		// 제목4 내용4 글쓴이4
		// 제목5 내용5 글쓴이5

		List<Board> list = new Vector<>();
		// 1.
//		list.add(new Board("제목1", "내용1", "글쓴이1"));
//		list.add(new Board("제목2", "내용2", "글쓴이2"));
//		list.add(new Board("제목3", "내용3", "글쓴이3"));
//		list.add(new Board("제목4", "내용4", "글쓴이4"));
//		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// 2.
		for (int i = 0; i < 5; i++) {
			list.add(new Board("제목" + (i + 1), "내용" + (i + 1), "글쓴이" + (i + 1)));
		}

		for (Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

		System.out.println("============================================");
		// ============================================
		// -> 2, 3번 인덱스 객체 삭제 후 출력
		// <console>
		// 제목1 내용1 글쓴이1
		// 제목2 내용2 글쓴이2
		// 제목4 내용4 글쓴이4

		list.remove(2);
		list.remove(3);

		for (Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
